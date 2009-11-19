/*
 * Thibaut Colar Aug 18, 2009
 */
package net.colar.netbeans.fan.completion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.swing.text.JTextComponent;
import net.colar.netbeans.fan.indexer.FanIndexHelper;
import net.colar.netbeans.fan.indexer.FanIndexer;
import net.colar.netbeans.fan.indexer.FanPodIndexer;
import net.colar.netbeans.fan.structure.FanDummyElementHandle;
import org.netbeans.api.java.classpath.GlobalPathRegistry;
import org.netbeans.modules.csl.api.CodeCompletionContext;
import org.netbeans.modules.csl.api.CodeCompletionHandler;
import org.netbeans.modules.csl.api.CodeCompletionResult;
import org.netbeans.modules.csl.api.CompletionProposal;
import org.netbeans.modules.csl.api.ElementHandle;
import org.netbeans.modules.csl.api.ParameterInfo;
import org.netbeans.modules.csl.spi.DefaultCompletionResult;
import org.netbeans.modules.csl.spi.ParserResult;
import org.netbeans.modules.parsing.spi.indexing.support.IndexResult;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;

/**
 * Code Completion
 * @author thibautc
 */
public class FanCompletionHandler implements CodeCompletionHandler
{

	private static enum DocTypes
	{

		NA,
		POD,
		POD_TYPE,
		TYPE,
	};
	DocTypes docType = DocTypes.NA;
	String preamble = "";
	public static final String[] ROOT_ITEMS =
	{
		"class", "mixin", "enum", "public", "internal", "abstract", "final", "const", "using"
	};

	@Override
	public CodeCompletionResult complete(CodeCompletionContext context)
	{
		FileObject fo = context.getParserResult().getSnapshot().getSource().getFileObject();
		String prefix = context.getPrefix();
		if (prefix == null)
		{
			prefix = "";
		}

		FanCompletionContext cpl = new FanCompletionContext(context);
		ArrayList<CompletionProposal> proposals = new ArrayList();
		int anchor = context.getCaretOffset();
		preamble = cpl.getPreamble();

		switch (cpl.getCompletionType())
		{
			case ROOT_LEVEL:
				proposeRootItems(proposals, anchor, prefix.toLowerCase());
				break;
			case IMPORT_POD:
				if (preamble.contains("::"))
				{
					String pod = preamble.substring(0, preamble.indexOf("::"));
					proposeTypes(pod, proposals, anchor, prefix.toLowerCase());
				} else
				{
					// Propose [java] then all pods
					FanImportProposal prop = new FanImportProposal("[java]", anchor, true);
					prop.setSortPrio(1);
					proposals.add(prop);
					proposePods(proposals, anchor, prefix.toLowerCase());
				}
				break;
			case IMPORT_FFI_JAVA:
				//TODO
				break;
			case BASE_TYPE:
				if (preamble.contains("."))
				{
					//TODO
					String type = "Actor";
					String pod = "Sys";
					proposeSlots(pod, type, proposals, anchor, prefix.toLowerCase());
					//docType = DocTypes.TYPE;
				}
				else
				{
					proposeTypes(null, proposals, anchor, prefix.toLowerCase());
					docType = DocTypes.TYPE;
				}
				/*if (preamble.contains("."))
				{
					// propose fields 
					// propose methods
					// TODO: this is not right
					String type = preamble.substring(0, preamble.lastIndexOf("."));
					//proposeTypes(pod, proposals, anchor, prefix.toLowerCase());
				} else
				{
					addtoTypeProposals(proposals, FanIndexHelper.findRootTypes(fo, prefix));
					docType = DocTypes.TYPE;
				}*/
				break;
		}

		DefaultCompletionResult completionResult = new DefaultCompletionResult(proposals, false);
		return completionResult;
	}

	/*private void addtoTypeProposals(ArrayList<CompletionProposal> proposals, Collection<? extends IndexResult> findRootTypes)
	{
		Iterator it = findRootTypes.iterator();
		while (it.hasNext())
		{
			IndexResult result = (IndexResult) it.next();
			String txt = result.getValue(FanIndexer.INDEX_CLASS);
			System.out.println("Prop: " + txt);
			if (txt != null)
			{
				String type = txt.substring(0, txt.indexOf(';')).trim();
				String pod = findPod(result.getFile());
				
				proposals.add(new FanTypeProposal(type, 0, pod));
			}
		}
	}*/

	@Override
	public String document(ParserResult result, ElementHandle handle)
	{
		String doc = "";
		String pod = "";
		switch (docType)
		{
			case POD:
				doc = FanPodIndexer.getInstance().getPodDoc(handle.getName());
				break;
			case TYPE:
				pod = ((FanDummyElementHandle) handle).getCustomParams().get(FanDummyElementHandle.params.POD);
				if (pod != null)
				{
					doc = FanPodIndexer.getInstance().getPodTypeDoc(pod, handle.getName());
				}
				break;
			case POD_TYPE:
				pod = preamble.substring(0, preamble.indexOf("::"));
				doc = FanPodIndexer.getInstance().getPodTypeDoc(pod, handle.getName());
				break;
		}
		return doc;
	}

	public String findPod(FileObject file)
	{
		Set<FileObject> fos = GlobalPathRegistry.getDefault().getSourceRoots();
		for (FileObject fo : fos)
		{
			// It will return the "fan" or "test" subfolder, so we want the parent.
			if (FileUtil.isParentOf(fo, file))
			{
				return fo.getParent().getName();
			}
		}
		return null;
	}

	@Override
	public ElementHandle resolveLink(String link, ElementHandle handle)
	{
		//TODO: resolve links
		/*System.out.println("Resolve link: "+link);
		link="sys.File";
		return new ElementHandle.UrlHandle(link);*/
		return null;
	}

	@Override
	public String getPrefix(ParserResult result, int arg1, boolean arg2)
	{
		return null;
	}

	@Override
	public QueryType getAutoQuery(JTextComponent comp, String arg1)
	{
		return QueryType.NONE;
	}

	@Override
	public String resolveTemplateVariable(String arg0, ParserResult result, int arg2, String arg3, Map arg4)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public Set<String> getApplicableTemplates(ParserResult result, int arg1, int arg2)
	{
		return (Set<String>) Collections.EMPTY_SET;
	}

	@Override
	public ParameterInfo parameters(ParserResult result, int arg1, CompletionProposal proposal)
	{
		return ParameterInfo.NONE;
	}

	/**
	Root level (outside class/mixin/enum)
	propose slot begining keywords (class,enum,mixin , public, abstract and so on)
	also propose imports items (if within "using ...")
	proposeImports(proposals);
	 */
	private void proposeRootItems(ArrayList<CompletionProposal> proposals, int anchor, String prefix)
	{
		for (String item : ROOT_ITEMS)
		{
			//if (item.toLowerCase().startsWith(prefix))
			{
				proposals.add(new FanKeywordProposal(item.substring(prefix.length()), anchor));
			}
		}
	}

	/**
	 * Complete imports (using)
	 * If not in an import do nothing and return false
	 * Forms of imports:
	 * using id('. id)* eos    // whole pod
	 * using id('. id)* '::' id eos   // Particular type
	 * using ([id])? id('.' id)* '::' id eos  // FFI
	 * using ([id])? id('.' id)* '::' (id | '$') as id eos  // with 'as'
	 * @param proposals
	 * @param anchor
	 * @return
	 */
	private void proposePods(ArrayList<CompletionProposal> proposals, int anchor, String prefix)
	{
		Set<String> names = FanPodIndexer.getInstance().getAllPodNames();
		for (String name : names)
		{
			if (name.toLowerCase().startsWith(prefix))
			{
				proposals.add(new FanImportProposal(name, anchor, false));
				docType = DocTypes.POD;
			}
		}
	}

	private void proposeTypes(String podName, ArrayList<CompletionProposal> proposals, int anchor, String prefix)
	{
		Set<String> types;
		if(podName ==null)
			types = FanPodIndexer.getInstance().getAllTypes();
		else
			types = FanPodIndexer.getInstance().getImportTypes(podName);
		for (String name : types)
		{
			if (name.toLowerCase().startsWith(prefix))
			{
				proposals.add(new FanImportProposal(name, anchor, false));
				docType = DocTypes.POD_TYPE;
			}
		}
		//docType = DocTypes.POD
	}

	private void proposeSlots(String pod, String type, ArrayList<CompletionProposal> proposals, int anchor, String prefix)
	{
		Set<String> slots = FanPodIndexer.getInstance().getSlots(pod, type);
		for (String slot : slots)
		{
			if (slot.toLowerCase().startsWith(prefix))
			{
				//TODO: FanSlotProposal
				proposals.add(new FanKeywordProposal(slot, anchor));
				docType = DocTypes.POD_TYPE; // TODO
			}
		}
	}

}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.parboiled;

import java.util.ArrayList;
import java.util.List;
import javax.swing.text.Document;
import net.colar.netbeans.fan.FanTokenID;
import net.colar.netbeans.fan.FanUtilities;
import net.colar.netbeans.fan.parboiled.FantomLexerTokens.TokenName;
import net.colar.netbeans.fan.parboiled.pred.NodeLabelPredicate;
import org.netbeans.api.lexer.Token;
import org.netbeans.api.lexer.TokenHierarchy;
import org.netbeans.api.lexer.TokenId;
import org.netbeans.api.lexer.TokenSequence;
import org.netbeans.modules.csl.api.OffsetRange;
import org.parboiled.Node;
import org.parboiled.google.base.Predicate;
import org.parboiled.support.InputBuffer;

/**
 * Utilities for lexer / parser / ast trees
 * @author tcolar
 */
public class FanLexAstUtils
{

	/**
	 * Return the Actual token at the given caret position in the document.
	 * @param doc
	 * @param caretIndex
	 * @return
	 */
	public static Token<? extends FanTokenID> getFanTokenAt(Document doc, int caretIndex)
	{
		TokenSequence ts = getFanTokenSequence(doc);
		ts.move(caretIndex);
		ts.moveNext();
		Token<? extends FanTokenID> token = ts.token();
		return token;
	}

	/**
	 * Returns the tokensequence from adoc
	 * @param doc
	 * @return
	 */
	public static TokenSequence<? extends FanTokenID> getFanTokenSequence(Document doc, int offset)
	{
		//System.err.println("doc:" + doc);
		TokenHierarchy<Document> th = TokenHierarchy.get(doc);
		//System.err.println("hierarchy: " + th);
		return getFanTokenSequence(th, offset);
	}

	public static TokenSequence<? extends FanTokenID> getFanTokenSequence(Document doc)
	{
		return getFanTokenSequence(doc, 0);
	}

	/**
	 * Returns the tokensequence from th tokenhierarchy
	 * @param th
	 * @return
	 */
	public static TokenSequence<? extends FanTokenID> getFanTokenSequence(TokenHierarchy<?> th, int offset)
	{
		TokenSequence<? extends FanTokenID> ts = th.tokenSequence(FanTokenID.language());
		if (offset != 0)
		{
			ts = ts.subSequence(offset);
		}
		return ts;
	}

	/**
	 * Find the closing token matching the opening one (balanced) and return the range between the two
	 * @param doc
	 * @param ts
	 * @param opening
	 * @param closing
	 * @return
	 */
	public static OffsetRange findRangeFromOpening(Document doc, TokenSequence<? extends FanTokenID> ts, TokenName openingToken, TokenName closingToken)
	{
		return findRange(doc, ts, openingToken, closingToken, true);
	}

	public static boolean matchType(TokenId token, TokenName[] array)
	{
		for (TokenName t : array)
		{
			//System.out.println("Matching type: "+t+" VS "+type);
			if (token.name().equals(t.name()))
			{
				return true;
			}
		}
		return false;
	}

	/**
	 * Find (backward) the opening token matching the closing one (balanced) and return the range between the two
	 * @param doc
	 * @param ts
	 * @param opening
	 * @param closing
	 * @return
	 */
	public static OffsetRange findRangeFromClosing(Document doc, TokenSequence<? extends FanTokenID> ts, TokenName openingToken, TokenName closingToken)
	{
		return findRange(doc, ts, openingToken, closingToken, false);
	}

	/**
	 * Looking for matching(balanced) opening/closing token
	 * @param doc
	 * @param ts
	 * @param openingID
	 * @param closingID
	 * @param lookForClosing (false=lookForOpening  - backward)
	 * @return
	 */
	private static OffsetRange findRange(Document doc, TokenSequence<? extends FanTokenID> ts, TokenName opening, TokenName closing, boolean lookForClosing)
	{
		int balance = 0;

		while (move(ts, lookForClosing))
		{
			Token<? extends FanTokenID> token = ts.token();
			FanTokenID id = token.id();

			if (id.matches(opening))
			{
				if ((!lookForClosing) && balance == 0)
				{
					return new OffsetRange(ts.offset(), ts.offset() + token.length());
				}
				balance++;
			} else if (id.matches(closing))
			{
				if (lookForClosing && balance == 0)
				{
					return new OffsetRange(ts.offset(), ts.offset() + token.length());
				}
				balance--;
			}
		}

		return OffsetRange.NONE;
	}

	private static boolean move(TokenSequence ts, boolean forward)
	{
		if (forward)
		{
			return ts.moveNext();
		} else
		{
			return ts.movePrevious();
		}
	}

	public static OffsetRange getNodeRange(AstNode node)
	{
		return new OffsetRange(node.getStartLocation().getIndex(), node.getEndLocation().getIndex());
	}

	public static AstNode getScopeNode(AstNode node)
	{
		AstNode nd = node;
		while (nd != null)
		{
			if (nd.isScopeNode())
			{
				return nd;
			}
			nd = nd.getParent();
		}
		return null;
	}

	/**
	 * Check whether the parentNode is a direct wrapper of the given nodeKind
	 * @param parentNode
	 * @param pred
	 * @return
	 */
	public static boolean isWrappingNode(AstNode parentNode, Predicate pred)
	{
		if(pred.apply(parentNode))
			return true;
		if(parentNode.getChildren().size()==1)
		{
			return isWrappingNode(parentNode.getChildren().get(0), pred);
		}
		return false;
	}

	public static AstNode getFirstChildRecursive(AstNode parentNode, Predicate pred)
	{
		AstNode nd = getFirstChild(parentNode, pred);
		if(nd!=null)
			return nd;
		for(AstNode subNode : parentNode.getChildren())
		{
			return getFirstChildRecursive(subNode, pred);
		}
		return null;
	}

	public static AstNode getFirstChild(AstNode parentNode, Predicate pred)
	{
		if (parentNode != null)
		{
			for (AstNode child : parentNode.getChildren())
			{
				if (pred.apply(child))
				{
					return child;
				}
			}
		}
		return null;
	}

	public static List<AstNode> getChildren(AstNode parentNode, Predicate pred)
	{
		List<AstNode> nodes = new ArrayList<AstNode>();
		if (parentNode != null)
		{
			for (AstNode child : parentNode.getChildren())
			{
				if (pred.apply(child))
				{
					nodes.add(child);
				}
			}
		}
		return nodes;
	}

	public static String getFirstChildText(AstNode parentNode, Predicate pred)
	{
		AstNode node = getFirstChild(parentNode, pred);
		return node == null ? null : node.getNodeText(true);
	}

	public static String getNodeText(Node<AstNode> node, InputBuffer inputBuffer)
	{
		int start = node.getStartLocation().getIndex();
		int end = node.getEndLocation().getIndex();
		return inputBuffer.extract(start, end);
	}

	public static OffsetRange getNodeRange(Node<AstNode> node)
	{
		return new OffsetRange(node.getStartLocation().getIndex(), node.getEndLocation().getIndex());
	}

	public static Node getFirstChild(Node<AstNode> parentNode, NodeLabelPredicate pred)
	{
		if (parentNode != null)
		{
			for (Node<AstNode> child : parentNode.getChildren())
			{
				if (pred.apply(child))
				{
					return child;
				}
			}
		}
		return null;
	}

	public static AstNode findASTNodeAt(AstNode node, int offset)
	{
		if (node != null
			&& offset >= node.getStartLocation().getIndex()
			&& offset <= node.getEndLocation().getIndex())
		{
			for (AstNode child : node.getChildren())
			{
				AstNode found = findASTNodeAt(child, offset);
				if (found != null)
				{
					return found;
				}
			}
			return node;
		}
		return null;
	}

	public static AstNode findParentNode(final AstNode theNode, AstKind parentType)
	{
		return findParentNodeWithin(theNode, parentType, theNode.getRoot());
	}
	
	public static AstNode findParentNodeWithin(final AstNode theNode, AstKind parentType, AstNode within)
	{
		// don't want to mess with the original node.
		AstNode node = theNode;
		if (node.getKind() == parentType)
		{
			return node;
		}
		while (node != null && node != within)
		{
			//System.out.println(""+node.getType()+" VS "+parentType+" "+node.toStringTree());
			if (node.getKind() == parentType)
			{
				return node;
			}
			node = node.getParent();
		}
		// not found
		return null;
	}

	public static void dumpTree(AstNode node, int indent)
	{
		StringBuffer sb = new StringBuffer(indent);
		for (int i = 0; i < indent; i++)
		{
			sb = sb.append("  ");
		}
		for (AstNode child : node.getChildren())
		{
			FanUtilities.GENERIC_LOGGER.info(sb.toString() + child.toString());
			dumpTree(child, indent + 1);
		}
	}
	// find the parsenode at the given doc index
	/*public static void findNodeAt(FanParserTask result, int offset)
	{
	Node nd = result.getParseNodeTree();
	}*/

	/*
	public static OffsetRange getNodeRange(FanParserTask result, CommonTree node)
	{
	if (node == null)
	{
	return null;
	}
	int start = getTokenStart(node);
	int end = getTokenStop(node);
	//System.out.println("Start: " + start + " End:" + end + " ");
	// Cant figure why this happens, something must be wrong but no clue so far.
	if (start > end)
	{
	int tmp = start;
	start = end;
	end = tmp;
	}
	if (start == -1)
	{
	return OffsetRange.NONE;
	}
	CommonTokenStream tokenStream = null;//result.getTokenStream();
	CommonToken startToken = (CommonToken) tokenStream.get(start);
	CommonToken endToken = (CommonToken) tokenStream.get(end);
	OffsetRange range = new OffsetRange(startToken.getStartIndex(), endToken.getStopIndex() + 1);
	return range;
	}

	public static CommonTree findASTNodeAt(FanParserTask pResult, int tokenIndex)
	{
	//System.out.println("AstNode token: "+pResult.getTokenStream().get(index).toString());
	//System.out.println("AstNode token type: "+pResult.getTokenStream().get(index).getType());
	//System.out.println("AstNode token text: '"+pResult.getTokenStream().get(index).getText()+"'");
	CommonTree node = findASTNodeAt(pResult, null, tokenIndex);
	// If not found, return the root
	if (node == null)
	{
	node = null;//pResult.getRootScope().getAstNode();
	}
	return node;
	}

	private static CommonTree findASTNodeAt(FanParserTask pResult, CommonTree node, int tokenIndex)
	{
	CommonTree result = null;
	int start = getTokenStart(node);
	int stop = getTokenStop(node);
	//System.out.println("li:" + tokenIndex + " start:" + start + " stop:" + stop + " " + node.getType() + " " + getNodeContent(pResult, node));
	// <= >= ??
	if (start <= tokenIndex && stop >= tokenIndex)
	{
	result = node;
	List<CommonTree> children = node.getChildren();
	if (children != null)
	{
	Iterator<CommonTree> it = children.iterator();
	while (it.hasNext())
	{
	CommonTree subNode = it.next();
	CommonTree nextNode = findASTNodeAt(pResult, subNode, tokenIndex);
	if (nextNode != null)
	{
	return nextNode;
	}
	}
	}
	}
	//System.out.println("Result: " + result);

	return result;
	}

	public static int getLineEndOffset(TokenSequence seq, int offset, boolean semiIsNL)
	{
	//System.out.println(">gleo " + offset);
	int result = -1;
	seq.move(offset);
	// check if mve failed -> =~ end of stream
	if (!seq.moveNext() || seq.offset() < offset)
	{
	return -1;
	}
	do
	{
	//System.out.println("seq: "+seq.offset());
	// If this happens, we reached end of stream
	int tokenType = seq.token().id().ordinal();
	if (tokenType == FanLexer.LB || (semiIsNL && tokenType == FanLexer.SP_SEMI))
	{
	result = seq.offset();
	break;
	}
	} while (seq.moveNext());
	// put it back where it was.
	seq.move(offset);
	//System.out.println("<gleo "+result);
	return result;
	}

	public static int getLineBeginOffset(TokenSequence seq, int offset, boolean semiIsNL)
	{
	seq.move(offset);
	while (seq.movePrevious())
	{
	//System.out.println("seq2: "+seq.offset());
	int tokenType = seq.token().id().ordinal();
	if (tokenType == FanLexer.LB || (semiIsNL && tokenType == FanLexer.SP_SEMI))
	{
	break;
	}
	}
	int result = seq.offset() + 1;
	// put it back where it was.
	seq.move(offset);
	return result;
	}

	public static boolean moveToNextNonWSToken(TokenSequence seq, int fromOfset, int maxOffset)
	{
	if (fromOfset > maxOffset || fromOfset > seq.tokenCount())
	{
	return false;
	}
	seq.move(fromOfset);
	while (seq.moveNext() && seq.offset() <= maxOffset)
	{
	int tokenType = seq.token().id().ordinal();
	if (!matchType(tokenType, FanGrammarHelper.WS_TOKENS))
	{
	return true;
	}
	}
	return false;
	}

	public static boolean moveToPrevNonWsToken(TokenSequence seq, int fromOfset, int minOffset)
	{
	if (fromOfset < minOffset || fromOfset < 0)
	{
	return false;
	}
	seq.move(fromOfset);
	while (seq.movePrevious() && seq.offset() >= minOffset)
	{
	Token tk = seq.token();
	//System.out.println("nws: "+tk.id().name());
	//System.out.println("nws type: "+tk.id().ordinal());
	int tokenType = seq.token().id().ordinal();
	if (!matchType(tokenType, FanGrammarHelper.WS_TOKENS))
	{
	return true;
	}
	}
	return false;
	}

	public static boolean moveToNextSignificantToken(TokenSequence seq, int fromOfset, int maxOffset)
	{
	if (fromOfset > maxOffset || fromOfset > seq.tokenCount())
	{
	return false;
	}
	while (seq.offset() <= maxOffset && seq.moveNext() && seq.offset() <= maxOffset)
	{
	int tokenType = seq.token().id().ordinal();
	if (!matchType(tokenType, FanGrammarHelper.INSIGNIFICANT_TOKENS))
	{
	return true;
	}
	}
	return false;
	}

	public static boolean matchType(int type, int[] array)
	{
	for (int t : array)
	{
	//System.out.println("Matching type: "+t+" VS "+type);
	if (t == type)
	{
	return true;
	}
	}
	return false;
	}

	public static int nextLineStartOffset(TokenSequence seq, int offset, int maxOffset)
	{
	//System.out.println(">nlso");
	int of = getLineEndOffset(seq, offset, false);
	if (of > -1)
	{
	of += 1;
	}
	//System.out.println("of: "+of);
	return of;
	}

	public static int getPrevLineOffset(Document document, int startOfLine)
	{
	int result = -1;
	TokenSequence seq = getFanTokenSequence(document);
	seq.move(startOfLine);
	while (seq.movePrevious())
	{
	FanUtilities.GENERIC_LOGGER.debug("seq3: " + seq.offset());

	if (seq.token().id().ordinal() == FanLexer.LB)
	{
	break;
	}
	}
	result = seq.offset();
	return result;
	}

	public static CommonTree findParentNodeWithin(final CommonTree theNode, int parentType, CommonTree within)
	{
	// don't want to mess with the original node.
	CommonTree node = theNode;
	if (node.getType() == parentType)
	{
	return node;
	}
	while (node != null && node != within)
	{
	//System.out.println(""+node.getType()+" VS "+parentType+" "+node.toStringTree());
	if (node.getType() == parentType)
	{
	return node;
	}
	node = (CommonTree) node.getParent();
	}
	// not found
	return null;
	}

	public static String getNodeContent(FanParserTask result, Tree node)
	{
	if (node == null)
	{
	return "";
	}
	OffsetRange range = getNodeRange(result, (CommonTree) node);
	String text = "";
	try
	{
	if (range != null)
	{
	text = result.getDocument().getText(range.getStart(), range.getLength());
	}
	} catch (Exception e)
	{
	e.printStackTrace();
	}
	return text;
	}

	public static List<CommonTree> getAllChildrenWithType(CommonTree node, int type)
	{
	return getAllChildrenWithType(node, type, false);
	}

	public static CommonTree getFirstChildrenWithType(CommonTree node, int type)
	{
	List<CommonTree> children = getAllChildrenWithType(node, type, true);
	return children.size() == 0 ? null : children.get(0);
	}

	private static List<CommonTree> getAllChildrenWithType(CommonTree node, int type, boolean returnFirst)
	{
	List<CommonTree> children = new ArrayList<CommonTree>();
	for (CommonTree child : (List<CommonTree>) node.getChildren())
	{
	if (child.getType() == type)
	{
	children.add(child);
	if (returnFirst)
	{
	return children;
	}
	}
	}
	return children;
	}

	public static void dumpTree(CommonTree t, int indent)
	{
	if (t != null)
	{
	StringBuffer sb = new StringBuffer(indent);
	for (int i = 0; i < indent; i++)
	{
	sb = sb.append("  ");
	}
	for (int i = 0; i < t.getChildCount(); i++)
	{
	FanUtilities.GENERIC_LOGGER.info(sb.toString() + t.getChild(i).toString());
	dumpTree((CommonTree) t.getChild(i), indent + 1);
	}
	}
	}

	public static boolean isParentNodeOf(CommonTree parent, CommonTree node)
	{
	if (node == null)
	// we went back to the root and it did not match
	{
	return false;
	}
	if (node == parent)
	// match
	{
	return true;
	} else
	// recurse to keep looking in uper levels
	{
	return isParentNodeOf(parent, (CommonTree) node.getParent());
	}
	}

	public static String getChildTextByType(FanParserTask result, CommonTree node)
	{
	return getChildTextByType(result, node, -1);
	}

	public static String getChildTextByType(FanParserTask result, CommonTree node, int itemIndex)
	{
	String text = "";
	if (node != null)
	{
	if (itemIndex != -1 && itemIndex < node.getChildCount())
	{
	// return a specific child content (by index)
	CommonTree node2 = (CommonTree) node.getChild(itemIndex);
	if (node2 != null)
	{
	text = getNodeContent(result, node2);
	}
	} else
	{
	// return whole node content
	text = getNodeContent(result, node);
	}
	}
	if (text == null)
	{
	text = "";
	}
	return text;
	}

	public static String getSubChildTextByType(FanParserTask result, CommonTree node, int astType)
	{
	return getSubChildTextByType(result, node, astType, -1);
	}

	public static String getSubChildTextByType(FanParserTask result, CommonTree node, int astType, int itemIndex)
	{
	String text = "";
	if (node != null)
	{
	CommonTree node2 = (CommonTree) node.getFirstChildWithType(astType);
	text = getChildTextByType(result, node2, itemIndex);
	}
	return text;
	}

	public static int findLastTokenIndexByType(FanParserTask result, CommonTree node, int type)
	{
	int last = node.getTokenStopIndex();
	return findPrevTokenByType(result, node, last, type);
	}

	public static int getTokenStart(CommonTree node)
	{
	int index = node.getTokenStartIndex();
	if (node.getChildCount() > 0)
	{
	for (CommonTree child : (List<CommonTree>) node.getChildren())
	{
	int index2 = getTokenStart(child);
	if (index2 != -1 && (index == -1 || index2 < index))
	{
	index = index2;
	}
	}
	}
	return index;
	}

	public static int getTokenStop(CommonTree node)
	{
	int index = node.getTokenStopIndex();
	if (node.getChildCount() > 0)
	{
	List<CommonTree> children = (List<CommonTree>) node.getChildren();
	for (int i = children.size() - 1; i >= 0; i--)
	{
	CommonTree child = children.get(i);
	int index2 = getTokenStop(child);
	if (index2 != -1 && (index == -1 || index2 > index))
	{
	index = index2;
	}
	}
	}
	return index;
	}

	public static String getTokenStreamSlice(CommonTokenStream tokenStream, int start, int stop)
	{
	List<CommonToken> tokens = (List<CommonToken>) tokenStream.getTokens(start, stop);
	StringBuffer text = new StringBuffer();
	for (CommonToken tk : tokens)
	{
	text.append(tk.getText());
	}
	return text.toString();
	}

	public static int offsetToTokenIndex(FanParserTask pResult, int index)
	{
	TokenSequence ts = getFanTokenSequence(pResult.getDocument());
	int saved = ts.index();
	ts.move(index);
	ts.moveNext();
	int result = ts.index();
	// restore
	ts.move(saved);
	return result;
	}

	public static int tokenIndexToOffset(FanParserTask pResult, int index)
	{
	TokenSequence ts = getFanTokenSequence(pResult.getDocument());
	int saved = ts.index();
	ts.moveIndex(index);
	ts.moveNext();
	int result = ts.offset();
	// restore
	ts.move(saved);
	return result;
	}

	public static CommonTree findParentNode(CommonTree node, int AST_INC_DOTCALL)
	{
	return findParentNodeWithin(node, AST_INC_DOTCALL, getRootNode(node));
	}

	public static CommonTree getRootNode(CommonTree node)
	{
	CommonTree result = null;
	while (node != null)
	{
	result = node;
	node = (CommonTree) node.getParent();
	}
	return result;
	}

	public static int findPrevTokenByType(FanParserTask result, CommonTree node, int startOffset, int type)
	{
	int first = node.getTokenStartIndex();
	int last = node.getTokenStopIndex();
	if (startOffset < last)
	{
	last = startOffset;
	}
	CommonTokenStream ts = null;//result.getTokenStream();
	for (int i = last; i >= first; i--)
	{
	if (ts.get(i).getType() == type)
	{
	return i;
	} else
	{
	//System.out.println("Skipping token:" + ts.get(i).getText());
	}
	}
	return -1;
	}
	 */
}

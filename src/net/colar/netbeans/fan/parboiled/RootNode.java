/*
 * Thibaut Colar Mar 2, 2010
 */

package net.colar.netbeans.fan.parboiled;

import net.colar.netbeans.fan.FanParserTask;
import org.parboiled.Node;

/**
 *
 * @author thibautc
 */
public class RootNode extends AstNode
{
	/** Reference to the ParserTask that created this node - Only mantained on the root node*/
	private final FanParserTask task;

	public RootNode(AstKind kind, String path, Node<AstNode> parseNode, FanParserTask task)
	{
		super(kind, path, parseNode, "ROOT");
		this.task = task;
	}

	public FanParserTask getParserTask()
	{
		return task;
	}

	public String getPod()
	{
		return getParserTask().getPod();
	}
}

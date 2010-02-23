/*
 * Thibaut Colar Feb 5, 2010
 */

package net.colar.netbeans.fan.parboiled;

import java.util.List;
import org.parboiled.BaseActions;
import org.parboiled.Node;

/**
 *
 * @author thibautc
 */
public class FantomParserActions extends BaseActions<AstNode>
{
	public AstNode createAst(String name, String value) {
        return new AstNode(name, value);
    }
	public AstNode createAst(String name) {
        return new AstNode(name, (String)null);
    }

	/*public AstNode createAst(List<AstNode> list) {
        return new AstNode("Root", list);
    }*/

	public AstNode createAst(String name, List<AstNode> list) {
        return new AstNode("Root", list);
    }
}

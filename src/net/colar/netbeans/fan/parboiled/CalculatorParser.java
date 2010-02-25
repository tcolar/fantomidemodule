/*
 * Thibaut Colar Feb 24, 2010
 */
package net.colar.netbeans.fan.parboiled;

import com.sun.istack.internal.NotNull;
import org.parboiled.BaseParser;
import org.parboiled.Parboiled;
import org.parboiled.Rule;
import org.parboiled.common.StringUtils;
import org.parboiled.common.ToStringFormatter;
import org.parboiled.support.ParseTreeUtils;
import org.parboiled.support.ParsingResult;
import org.parboiled.trees.GraphUtils;
import org.parboiled.trees.ImmutableBinaryTreeNode;

/**
 *
 * @author thibautc
 */
public class CalculatorParser extends BaseParser<CalculatorParser.CalcNode>
{

	final CalculatorActions actions = new CalculatorActions();


	public static void main(String[] args) {
		String input = "2+3*5/8";
        CalculatorParser parser = Parboiled.createParser(CalculatorParser.class);

            ParsingResult<CalcNode> result = parser.parse(parser.inputLine(), input);

            CalcNode astRoot = result.parseTreeRoot.getValue();
            System.out.println(input + " = " + astRoot.getValue() + '\n');

            System.out.println("Parse Tree:\n" + ParseTreeUtils.printNodeTree(result) + '\n');

            System.out.println("Abstract Syntax Tree:\n" +
                    GraphUtils.printTree(result.parseTreeRoot.getValue(), new ToStringFormatter<CalculatorParser.CalcNode>(null)) + '\n');

            if (result.hasErrors()) {
                System.out.println(StringUtils.join(result.parseErrors, "---\n"));
            }
    }


	public Rule inputLine()
	{
		return enforcedSequence(
			expression(),
			eoi());
	}

	public Rule expression()
	{
		return sequence(
			term(), SET(), // the SET() sets the value of the "expression" to the value of the "term"
			zeroOrMore(
			enforcedSequence(
			firstOf('+', '-'),
			term(),
			UP(UP(SET(actions.createAst(DOWN(DOWN(CHAR("firstOf"))), VALUE(), LAST_VALUE())))) // this creates a new AST node and sets it as the value of the "expression",
			// the node contains the operator ('+' or '-'), the old "expression" value as left
			// child and the value of the "term" following the operator as right child
			)));
	}

	public Rule term()
	{
		return sequence(
			factor(), SET(),
			zeroOrMore(
			enforcedSequence(
			firstOf('*', '/'),
			factor(),
			UP(UP(SET(actions.createAst(DOWN(DOWN(CHAR("firstOf"))), VALUE(), LAST_VALUE())))))));
	}

	public Rule factor()
	{
		return sequence(
			atom(), SET(),
			zeroOrMore(
			enforcedSequence(
			'^',
			atom(),
			UP(UP(SET(actions.createAst('^', VALUE(), LAST_VALUE())))))));
	}

	public Rule atom()
	{
		return firstOf(
			number(),
			squareRoot(),
			parens());
	}

	public Rule squareRoot()
	{
		return enforcedSequence(
			"SQRT",
			parens(),
			SET(actions.createAst('R', VALUE(), VALUE())));
	}

	public Rule parens()
	{
		return enforcedSequence('(', expression(), ')');
	}

	public Rule number()
	{
		return sequence(
			sequence(
			optional(ch('-')),
			oneOrMore(digit()),
			optional(sequence(ch('.'), oneOrMore(digit())))),
			SET(actions.createAst(Double.parseDouble(LAST_TEXT()))),
			whiteSpace());
	}

	public Rule digit()
	{
		return charRange('0', '9');
	}

	public Rule whiteSpace()
	{
		return zeroOrMore(firstOf(ch(' '), ch('\t'), ch('\f'), newline()));
	}

	public Rule newline()
	{
		return firstOf(string("\r\n"), ch('\r'), ch('\n'));
	}

	@Override
	protected Rule fromCharLiteral(char c)
	{
		// we redefine the rule creation for character literals to also match trailing whitespace
		// this way we don't have to insert extra whitespace() rules after each character literal
		// however, we now have to wrap character matching rules we don't want to be "space swallowing"
		// with the ch(...) rule creator
		return sequence(ch(c), whiteSpace());
	}

	@Override
	protected Rule fromStringLiteral(@NotNull String string)
	{
		// same thing for string literals
		return sequence(string(string), whiteSpace());
	}

	class CalculatorActions
	{

		public CalcNode createAst(Double value)
		{
			return new CalcNode(value);
		}

		public CalcNode createAst(Character type, CalcNode left, CalcNode right)
		{
			return new CalcNode(type, left, right);
		}
	}

	class CalcNode extends ImmutableBinaryTreeNode<CalcNode>
	{

		private double value;
		private Character operator;

		public CalcNode(double value)
		{
			super(null, null);
			this.value = value;
		}

		public CalcNode(Character operator, CalcNode left, CalcNode right)
		{
			super(left, right);
			this.operator = operator;
		}

		public double getValue()
		{
			if (operator == null)
			{
				return value;
			}
			if (left() == null || right() == null)
			{
				return Double.NaN;
			}

			switch (operator)
			{
				case '+':
					return left().getValue() + right().getValue();
				case '-':
					return left().getValue() - right().getValue();
				case '*':
					return left().getValue() * right().getValue();
				case '/':
					return left().getValue() / right().getValue();
				case '^':
					return Math.pow(left().getValue(), right().getValue());
				case 'R':
					return Math.sqrt(left().getValue());
				default:
					throw new IllegalStateException();
			}
		}

		@Override
		public String toString()
		{
			return operator == null
				? "Value " + value
				: "Operator '" + operator + '\'';
		}
	}
}

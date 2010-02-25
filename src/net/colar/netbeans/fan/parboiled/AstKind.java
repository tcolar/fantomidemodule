/*
 * Thibaut Colar Feb 25, 2010
 */
package net.colar.netbeans.fan.parboiled;

/**
 * AST Nodes names
 * @author thibautc
 */
public enum AstKind
{
	// specific items
	AST_COMP_UNIT, AST_USING, AST_USING_FFI, AST_USING_AS,
	AST_TYPE_DEF, AST_FIELD_DEF, AST_METHOD_DEF, AST_CTOR_DEF,
	AST_LOCAL_DEF,
	// incomplete/error items
	AST_INC_USING, AST_INC_DOTCALL, AST_SAFEDOTCALL,
	// More generic items
	AST_BLOCK, AST_ID, AST_MODIFIER, AST_INHERITANCE, AST_PARAM, AST_TYPE, AST_CHILD
}

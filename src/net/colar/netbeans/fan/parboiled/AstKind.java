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
	AST_COMP_UNIT, AST_USING, AST_USING_FFI, AST_USING_AS, //compUnit
	AST_TYPE_DEF, AST_CLASS, AST_ENUM, AST_MIXIN, AST_FACET,  // Types
	AST_SLOT_DEF, AST_FIELD_DEF, AST_METHOD_DEF, AST_CTOR_DEF, //Slots
	AST_CLOSURE,
	AST_LOCAL_DEF, // Vars
	AST_DOC, AST_ML_COMMENT,// doc & comments
	//expr
	AST_LITTERAL_BASE, AST_EXPR, AST_CAST, AST_CALL,
	// More generic items
	AST_BLOCK, AST_ID, AST_TYPE_AND_ID, AST_MODIFIER,
	AST_INHERITANCE, AST_PARAM, AST_TYPE, AST_FORMAL, AST_CHILD,
	AST_IT_BLOCK,
	// incomplete/error items
	AST_INC_USING, AST_INC_CALL, AST_ARG,
	// Labels
	LBL_CLASS, LBL_ENUM, LBL_MIXIN, LBL_FACET
}

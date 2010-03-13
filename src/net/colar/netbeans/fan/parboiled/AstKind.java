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
	AST_LOCAL_DEF, // Vars
	// incomplete/error items
	AST_INC_USING, AST_INC_DOTCALL, AST_SAFEDOTCALL,
	// More generic items
	AST_BLOCK, AST_ID, AST_TYPE_AND_ID, AST_MODIFIER, AST_INHERITANCE, AST_PARAM, AST_TYPE, AST_CHILD,
	// doc & comments
	AST_DOC, AST_ML_COMMENT,
	AST_LITTERAL_BASE, AST_EXPR, AST_CAST, 
	// Labels
	LBL_CLASS, LBL_ENUM, LBL_MIXIN, LBL_FACET
}

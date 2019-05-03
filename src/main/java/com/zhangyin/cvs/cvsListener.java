// Generated from cvs.g4 by ANTLR 4.7.2

package com.zhangyin.cvs;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link cvsParser}.
 */
public interface cvsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link cvsParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(cvsParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link cvsParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(cvsParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link cvsParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(cvsParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link cvsParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(cvsParser.RowContext ctx);
	/**
	 * Enter a parse tree produced by {@link cvsParser#lastrow}.
	 * @param ctx the parse tree
	 */
	void enterLastrow(cvsParser.LastrowContext ctx);
	/**
	 * Exit a parse tree produced by {@link cvsParser#lastrow}.
	 * @param ctx the parse tree
	 */
	void exitLastrow(cvsParser.LastrowContext ctx);
	/**
	 * Enter a parse tree produced by {@link cvsParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(cvsParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link cvsParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(cvsParser.FieldContext ctx);
}
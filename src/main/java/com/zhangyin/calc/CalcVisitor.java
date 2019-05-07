// Generated from Calc.g4 by ANTLR 4.7.2

package com.zhangyin.calc;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;


/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalcParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalcVisitor<T extends Object> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code ognl}
	 * labeled alternative in {@link CalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOgnl(CalcParser.OgnlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code replaceNumber}
	 * labeled alternative in {@link CalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReplaceNumber(CalcParser.ReplaceNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code replaceVariable}
	 * labeled alternative in {@link CalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReplaceVariable(CalcParser.ReplaceVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addsub}
	 * labeled alternative in {@link CalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddsub(CalcParser.AddsubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code priority}
	 * labeled alternative in {@link CalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPriority(CalcParser.PriorityContext ctx);
	/**
	 * Visit a parse tree produced by the {@code invokeFunction}
	 * labeled alternative in {@link CalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvokeFunction(CalcParser.InvokeFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code muldiv}
	 * labeled alternative in {@link CalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMuldiv(CalcParser.MuldivContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamList(CalcParser.ParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(CalcParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(CalcParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(CalcParser.NumberContext ctx);
}
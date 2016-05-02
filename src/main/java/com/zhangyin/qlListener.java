package com.zhangyin;

// Generated from ql.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link qlParser}.
 */
public interface qlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link qlParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(qlParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link qlParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(qlParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeDecl}
	 * labeled alternative in {@link qlParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterTypeDecl(qlParser.TypeDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeDecl}
	 * labeled alternative in {@link qlParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitTypeDecl(qlParser.TypeDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarDecl}
	 * labeled alternative in {@link qlParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(qlParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarDecl}
	 * labeled alternative in {@link qlParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(qlParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defFunction}
	 * labeled alternative in {@link qlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDefFunction(qlParser.DefFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defFunction}
	 * labeled alternative in {@link qlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDefFunction(qlParser.DefFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignVar}
	 * labeled alternative in {@link qlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAssignVar(qlParser.AssignVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignVar}
	 * labeled alternative in {@link qlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAssignVar(qlParser.AssignVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newVar}
	 * labeled alternative in {@link qlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNewVar(qlParser.NewVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newVar}
	 * labeled alternative in {@link qlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNewVar(qlParser.NewVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code invokeFunction}
	 * labeled alternative in {@link qlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInvokeFunction(qlParser.InvokeFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code invokeFunction}
	 * labeled alternative in {@link qlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInvokeFunction(qlParser.InvokeFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PriorityExpr}
	 * labeled alternative in {@link qlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPriorityExpr(qlParser.PriorityExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PriorityExpr}
	 * labeled alternative in {@link qlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPriorityExpr(qlParser.PriorityExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PriorityType}
	 * labeled alternative in {@link qlParser#type}.
	 * @param ctx the parse tree
	 */
	void enterPriorityType(qlParser.PriorityTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PriorityType}
	 * labeled alternative in {@link qlParser#type}.
	 * @param ctx the parse tree
	 */
	void exitPriorityType(qlParser.PriorityTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignType}
	 * labeled alternative in {@link qlParser#type}.
	 * @param ctx the parse tree
	 */
	void enterAssignType(qlParser.AssignTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignType}
	 * labeled alternative in {@link qlParser#type}.
	 * @param ctx the parse tree
	 */
	void exitAssignType(qlParser.AssignTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionType}
	 * labeled alternative in {@link qlParser#type}.
	 * @param ctx the parse tree
	 */
	void enterFunctionType(qlParser.FunctionTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionType}
	 * labeled alternative in {@link qlParser#type}.
	 * @param ctx the parse tree
	 */
	void exitFunctionType(qlParser.FunctionTypeContext ctx);
}
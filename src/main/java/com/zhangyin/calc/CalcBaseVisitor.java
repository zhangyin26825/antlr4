// Generated from Calc.g4 by ANTLR 4.7.2

package com.zhangyin.calc;

import com.zhangyin.calc.function.Function;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/**
 * This class provides an empty implementation of {@link CalcVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class CalcBaseVisitor<T extends Object> extends AbstractParseTreeVisitor<Object> implements CalcVisitor<Object> {


	private Map<String,BigDecimal> variableMap;

	private Map<String, Function> functionMap;

	public CalcBaseVisitor(Map<String, BigDecimal> variableMap, Map<String, Function> functionMap) {
		this.variableMap = variableMap;
		this.functionMap = functionMap;
	}





	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitOgnl(CalcParser.OgnlContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitReplaceNumber(CalcParser.ReplaceNumberContext ctx) { return (BigDecimal)visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitReplaceVariable(CalcParser.ReplaceVariableContext ctx) { return (BigDecimal)visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitAddsub(CalcParser.AddsubContext ctx) {

		BigDecimal first = (BigDecimal) ctx.expr(0).accept(this);

		BigDecimal second = (BigDecimal)ctx.expr(1).accept(this);

		if (ctx.ADD()!=null) {
			return  first.add(second);
		}else {
			return first.subtract(second);
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitPriority(CalcParser.PriorityContext ctx) {
		return(BigDecimal) ctx.expr().accept(this);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitInvokeFunction(CalcParser.InvokeFunctionContext ctx) {
		String functionName = ctx.function().getText();
		List<CalcParser.ExprContext> expr = ctx.paramList().expr();
		List<BigDecimal> param=new ArrayList<>(expr.size());
		for (CalcParser.ExprContext exprContext : expr) {
			BigDecimal accept = (BigDecimal)exprContext.accept(this);
			param.add(accept);
		}
		Function function = functionMap.get(functionName);
		return function.invoke(param);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitMuldiv(CalcParser.MuldivContext ctx) {
		BigDecimal first = (BigDecimal)ctx.expr(0).accept(this);

		BigDecimal second = (BigDecimal)ctx.expr(1).accept(this);

		if (ctx.MUL()!=null) {
			return  first.multiply(second);
		}else {
			return first.divide(second,2, RoundingMode.HALF_UP);
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitParamList(CalcParser.ParamListContext ctx) {
		List<CalcParser.ExprContext> expr = ctx.expr();
		List<BigDecimal> param=new ArrayList<>(expr.size());
		for (CalcParser.ExprContext exprContext : expr) {
			BigDecimal accept =(BigDecimal) exprContext.accept(this);
			param.add(accept);
		}
		return param;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitFunction(CalcParser.FunctionContext ctx) { return (BigDecimal)visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitVariable(CalcParser.VariableContext ctx) {
		String variableName = ctx.ID().getText();
		BigDecimal bigDecimal = variableMap.get(variableName);
		if (bigDecimal == null) {
			throw new RuntimeException("没有找到变量"+variableName+"的值");
		}
		return bigDecimal;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitNumber(CalcParser.NumberContext ctx) {
		String num = ctx.NUM().getText();
		return new BigDecimal(num);
	}


}
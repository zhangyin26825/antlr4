package com.zhangyin;

import com.zhangyin.calc.CalcBaseVisitor;
import com.zhangyin.calc.CalcLexer;
import com.zhangyin.calc.CalcParser;
import com.zhangyin.calc.CalcVisitor;
import com.zhangyin.calc.function.Function;
import com.zhangyin.calc.function.Functions;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangyin
 * @create 2019-05-06 18:44
 **/
public class CalcTest {

    public static void main(String[] args) {

        String filepath = "min(-5,negate(max(a+3,-5)))";
        CharStream charStream = CharStreams.fromString(filepath);
        CalcLexer lexer = new CalcLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CalcParser parser = new  CalcParser(tokens);
        ParseTree tree = parser.expr();
        Map<String,BigDecimal> variableMap=new HashMap<>();
        variableMap.put("a",BigDecimal.ONE);
        Map<String, Function> functionMap = Functions.getFunctionMap();
        CalcVisitor calcVisitor=new CalcBaseVisitor(variableMap,functionMap);
        Object visit = calcVisitor.visit(tree);
        System.out.println(visit);

    }
}

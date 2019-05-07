package com.zhangyin;


import com.zhangyin.java.javaBaseListener;
import com.zhangyin.java.javaLexer;
import com.zhangyin.java.javaParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @author zhangyin
 * @create 2019-05-06 10:55
 **/
public class JavaTest {

    public static void main(String[] args) {
        try {
            String filepath = "/Users/zhangyin/IdeaProjects/antlr4/src/main/java/com/zhangyin/Test.java";

            CharStream charStream = CharStreams.fromFileName(filepath, StandardCharsets.UTF_8);
            javaLexer lexer = new javaLexer(charStream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            javaParser parser = new javaParser(tokens);
            ParseTree tree = parser.compilationUnit();
            ParseTreeWalker walker = new ParseTreeWalker();
            javaBaseListener qlisten = new javaBaseListener();
            walker.walk(qlisten, tree);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

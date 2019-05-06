package com.zhangyin;

import java.nio.charset.StandardCharsets;

import com.zhangyin.cvs.cvsBaseListener;
import com.zhangyin.cvs.cvsLexer;
import com.zhangyin.cvs.cvsParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Test {

    public static void main(String[] args) throws Exception {
        String filepath = "/Users/zhangyin/Desktop/test.csv";

        CharStream charStream = CharStreams.fromFileName(filepath, StandardCharsets.UTF_8);
        cvsLexer lexer = new cvsLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        cvsParser parser = new cvsParser(tokens);
        ParseTree tree = parser.file();
        ParseTreeWalker walker = new ParseTreeWalker();
        cvsBaseListener qlisten = new cvsBaseListener();
        walker.walk(qlisten, tree);
    }
}

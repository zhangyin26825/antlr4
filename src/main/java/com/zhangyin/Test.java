package com.zhangyin;

import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Test {
	
	public static void main(String[] args) throws Exception {
			String filepath="C:\\Users\\zhangyin\\Downloads\\type.txt";
	        ANTLRFileStream f=new ANTLRFileStream(filepath,"utf-8"); 
	        qlLexer lexer=new qlLexer(f);
	        CommonTokenStream tokens = new CommonTokenStream(lexer);
	        qlParser parser = new qlParser(tokens);
	        ParseTree tree  = parser.file();
	        ParseTreeWalker walker = new ParseTreeWalker();
	        qlBaseListener qlisten=new qlBaseListener();
	        walker.walk(qlisten, tree);   
	}
}

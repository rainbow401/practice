package com.rainbow.practice.antlr4test;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

/**
 * @Author: yzh
 * @Date: 2024/5/7
 * @Description:
 */
public class Test {
    public static void main(String[] args) throws IOException {

        long start = System.currentTimeMillis();
        String sql= "select * from user";
        CodePointCharStream input = CharStreams.fromString(sql);
        MySqlLexer lexer = new MySqlLexer(input);  //词法分析
        CommonTokenStream tokens = new CommonTokenStream(lexer);  //转成token流
        MySqlParser parser = new MySqlParser(tokens); // 语法分析
        MySqlParser.DdlStatementContext ddlStatementContext = parser.ddlStatement();//获取某一个规则树，这里获取的是最外层的规则，也可以通过sql()获取sql规则树......
        System.out.println(ddlStatementContext.toStringTree(parser)); //打印规则数

        long end = System.currentTimeMillis();

        System.out.println("(end - start) = " + (end - start));
    }
}

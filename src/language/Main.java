/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package language;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import language.lib.Varibales;
import parser.Lexer;
import parser.Token;
import parser.ast.Expression;
import parser.Parser;
import parser.ast.Statement;

/**
 *
 * @author Vladimir
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        //final String input1 = "s = 2 + 2\n p = PI + s\n a = PI + p\n print a";
        final String input = new String(Files.readAllBytes(Paths.get("program.txt")), "UTF-8");
        final List<Token> tokens = new Lexer(input).tokenize();
        for (Token token : tokens) {
            System.out.println(token);
        }
        
        //final List<Statement> statements = new Parser(tokens).parse();
        final List<Statement> statements = new Parser(tokens).parse();
        for (Statement statement : statements) {
            System.out.println(statement);
        }
        for (Statement statement : statements) {
            statement.execute();
        }
    }
}

package behavioral.interpreter.examples;

import behavioral.interpreter.examples.lexer.Token;
import behavioral.interpreter.examples.parser.Element;

import java.util.List;

import static behavioral.interpreter.examples.lexer.Lexer.lex;
import static behavioral.interpreter.examples.parser.Parser.parse;

public class Demo {
    public static void main(String[] args) {
        String input = "(13+4)-(12+1)";
        List<Token> tokens = lex(input);
        System.out.println(tokens);

        Element parsed = parse(tokens);
        System.out.println(input + " = " + parsed.eval());
    }
}

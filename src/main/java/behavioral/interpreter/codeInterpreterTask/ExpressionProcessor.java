package behavioral.interpreter.codeInterpreterTask;


import behavioral.interpreter.codeInterpreterTask.lexer.Lexer;
import behavioral.interpreter.codeInterpreterTask.lexer.Token;
import behavioral.interpreter.codeInterpreterTask.parser.Parser;
import behavioral.interpreter.codeInterpreterTask.parser.element.Element;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExpressionProcessor
{
    public Map<Character, java.lang.Integer> variables = new HashMap<>();

    public int calculate(String expression)
    {
        List<Token> tokens = Lexer.lex(expression);
        Element parsed = Parser.parse(tokens, variables);
        return parsed.eval();
    }
}

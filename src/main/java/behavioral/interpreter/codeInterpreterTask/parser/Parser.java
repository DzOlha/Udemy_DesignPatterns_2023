package behavioral.interpreter.codeInterpreterTask.parser;

import behavioral.interpreter.codeInterpreterTask.lexer.Token;
import behavioral.interpreter.codeInterpreterTask.parser.element.Element;
import behavioral.interpreter.codeInterpreterTask.parser.element.impl.BinaryOperation;
import behavioral.interpreter.codeInterpreterTask.parser.element.impl.IntegerElement;
import behavioral.interpreter.codeInterpreterTask.parser.element.impl.Zero;

import java.util.List;
import java.util.Map;

public class Parser {
    public static Element parse(List<Token> tokens, Map<Character, java.lang.Integer> variables)
    {
        BinaryOperation result = new BinaryOperation();
        int midResult = 0;
        boolean haveLHS = false;
        Token token;
        boolean hasPairToCalculate = false;
        int size = tokens.size();
        for (int i = 0; i < size; i++) {
            token = tokens.get(i);
            switch (token.type) {
                case INTEGER:
                    IntegerElement integer = new IntegerElement(Integer.parseInt(token.text));
                    if (!haveLHS) {
                        result.left = integer;
                        haveLHS = true;
                    } else {
                        result.right = integer;
                        hasPairToCalculate = true;
                    }
                    break;
                case PLUS:
                    if (hasPairToCalculate) {
                        midResult = result.eval();
                        result.left = new IntegerElement(midResult);
                        result.right = null;
                        haveLHS = true;
                    }
                    result.type = BinaryOperation.OperationType.ADDITION;
                    break;
                case MINUS:
                    if (hasPairToCalculate) {
                        midResult = result.eval();
                        result.left = new IntegerElement(midResult);
                        result.right = null;
                        haveLHS = true;
                    }
                    result.type = BinaryOperation.OperationType.SUBTRACTION;
                    break;
                case VARIABLE:
                    if (variables.containsKey(token.text.charAt(0))) {
                        Integer value = variables.get(token.text.charAt(0));
                        IntegerElement varValue = new IntegerElement(value);

                        if (!haveLHS) {
                            result.left = varValue;
                            haveLHS = true;
                        } else {
                            result.right = varValue;
                        }
                        break;
                    } else {
                        return new Zero();
                    }
                case STRING:
                    return new Zero();

            }
        }
        return result;
    }
}

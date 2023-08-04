package behavioral.interpreter.examples.parser;

import behavioral.interpreter.examples.lexer.Token;
import behavioral.interpreter.examples.lexer.Type;
import behavioral.interpreter.examples.parser.impl.BinaryOperation;
import behavioral.interpreter.examples.parser.impl.Integer;

import java.util.List;
import java.util.stream.Collectors;

public class Parser {
    public static Element parse(List<Token> tokens) {
        BinaryOperation result = new BinaryOperation();
        boolean haveLHS = false;
        Token token;
        int size = tokens.size();
        for (int i = 0; i < size; i++) {
            token = tokens.get(i);
            switch (token.type) {
                case INTEGER:
                    Integer integer = new Integer(java.lang.Integer.parseInt(token.text));
                    if(!haveLHS) {
                        result.left = integer;
                        haveLHS = true;
                    } else {
                        result.right = integer;
                    }
                    break;
                case PLUS:
                    result.type = OperationType.ADDITION;
                    break;
                case MINUS:
                    result.type = OperationType.SUBTRACTION;
                    break;
                case LPARENT:
                   //i - location of the left parent, j - location of right parent
                    int j = i;
                    for (; j < size; j++) {
                        if(tokens.get(j).type == Type.RPARENT) {
                            break;
                        }
                    }

                    System.out.println("i = " + i);
                    System.out.println("j = " + j);
                    List<Token> subexpression = tokens.stream()
                            .skip(i + 1)
                            .limit(j - i - 1)
                            .toList();

                    Element element = parse(subexpression);
                    if(!haveLHS) {
                        result.left = element;
                        haveLHS = true;
                    } else {
                        result.right = element;
                    }
                    i = j;
                    break;
            }
        }
        return result;
    }
}

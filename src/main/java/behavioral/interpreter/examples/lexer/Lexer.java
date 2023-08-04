package behavioral.interpreter.examples.lexer;

import java.util.ArrayList;
import java.util.List;

public class Lexer {
    public static List<Token> lex(String input) {
        ArrayList<Token> result = new ArrayList<>();
        int size = input.length();
        for (int i = 0; i < size; i++) {
            Character ch = input.charAt(i);
            switch (ch) {
                case '+':
                    result.add(new Token(Type.PLUS, "+"));
                    break;
                case '-':
                    result.add(new Token(Type.MINUS, "-"));
                    break;
                case '(':
                    result.add(new Token(Type.LPARENT, "("));
                    break;
                case ')':
                    result.add(new Token(Type.RPARENT, ")"));
                    break;
                default:
                    if (Character.isDigit(ch)) {
                        StringBuilder sb = new StringBuilder("" + ch);
                        Character chNext;
                        for (int j = i + 1; j < size; j++) {
                            chNext = input.charAt(j);
                            if (Character.isDigit(chNext)) {
                                sb.append(chNext);
                                ++i;
                            } else {
                                result.add(new Token(Type.INTEGER, sb.toString()));
                                break;
                            }
                        }
                    }
                    break;
            }
        }
        return result;
    }
}

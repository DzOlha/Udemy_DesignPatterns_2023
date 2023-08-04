package behavioral.interpreter.codeInterpreterTask.lexer;

import java.util.ArrayList;
import java.util.List;

public class Lexer {
    public static List<Token> lex(String input) {
        ArrayList<Token> result = new ArrayList<>();
        int size = input.length();

        for (int i = 0; i < size; i++) {
            Character ch = input.charAt(i);
            if (ch == '+') {
                result.add(new Token(Token.Type.PLUS, "+"));
            }
            if (ch == '-') {
                result.add(new Token(Token.Type.MINUS, "-"));
            }
            if (Character.isDigit(ch)) {
                StringBuilder sb = new StringBuilder("" + ch);
                Character chNext;
                for (int j = i + 1; j < size; j++) {
                    chNext = input.charAt(j);

                    //if the following chars are also digits
                    if (Character.isDigit(chNext)) {
                        sb.append(chNext);
                        i++;
                    } else {
                        result.add(new Token(Token.Type.INTEGER, sb.toString()));
                        break;
                    }
                }
                if (i + 1 == size) {
                    result.add(new Token(Token.Type.INTEGER, sb.toString()));
                }
            }
            if (Character.isLetter(ch)) {
                StringBuilder sb = new StringBuilder("" + ch);
                Character chNext;
                for (int j = i + 1; j < size; j++) {
                    chNext = input.charAt(j);
                    //if the following chars are letters
                    if (Character.isLetter(chNext)) {
                        sb.append(chNext);
                        ++i;
                    } else {
                        //if the following characters are not letters
                        String res = sb.toString();
                        if (res.length() > 1)
                            result.add(new Token(Token.Type.STRING, sb.toString()));
                        else
                            result.add(new Token(Token.Type.VARIABLE, sb.toString()));
                        break;
                    }
                }
                if (i + 1 == size) {
                    //if the following characters are not letters
                    String res = sb.toString();
                    if (res.length() > 1)
                        result.add(new Token(Token.Type.STRING, sb.toString()));
                    else
                        result.add(new Token(Token.Type.VARIABLE, sb.toString()));
                }
            }
        }
        return result;
    }
}

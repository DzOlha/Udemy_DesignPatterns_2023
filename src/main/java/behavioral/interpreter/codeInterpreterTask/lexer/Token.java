package behavioral.interpreter.codeInterpreterTask.lexer;

public class Token {
    public enum Type {
        INTEGER,
        PLUS,
        MINUS,
        VARIABLE,
        STRING
    }

    public Token.Type type;
    public String text;

    public Token(Token.Type type, String text) {
        this.type = type;
        this.text = text;
    }

    @Override
    public String toString() {
        return "`" + text + "`";
    }
}

package behavioral.memento.codeMementoTask.model;

public class Token {
    public int value = 0;

    public Token(int value) {
        this.value = value;
    }

    public Token(Token other) {
        this.value = other.value;
    }

    @Override
    public String toString() {
        return "Token{" +
                "value=" + value +
                '}';
    }
}

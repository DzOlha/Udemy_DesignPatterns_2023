package behavioral.memento.codeMementoTask.model;

import behavioral.memento.codeMementoTask.memento.Memento;

import java.util.ArrayList;
import java.util.List;

public class TokenMachine {
    public List<Token> tokens = new ArrayList<>();

    public Memento addToken(int value) {
        Token token = new Token(value);
        tokens.add(token);
        Memento m = new Memento();
        addAllTokensToMemento(m);
        return m;
    }

    private void addAllTokensToMemento(Memento m) {
        List<Token> list = new ArrayList<>();
        for (Token t : tokens) {
            m.tokens.add(t);
        }
    }

    public Memento addToken(Token token) {
        Token t = new Token(token);
        tokens.add(t);
        Memento m = new Memento();
        addAllTokensToMemento(m);
        return m;
    }

    public void revert(Memento m) {
        List<Token> tokens = new ArrayList<>();

        for (Token token : m.tokens) {
            tokens.add(token);
        }
        this.tokens = tokens;
    }

    @Override
    public String toString() {
        return "TokenMachine{" +
                "tokens=" + tokens +
                '}';
    }
}

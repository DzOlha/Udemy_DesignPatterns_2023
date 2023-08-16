package behavioral.memento.codeMementoTask.memento;

import behavioral.memento.codeMementoTask.model.Token;

import java.util.ArrayList;
import java.util.List;

public class Memento {
    public List<Token> tokens = new ArrayList<>();

    @Override
    public String toString() {
        return "Memento{" +
                "tokens=" + tokens +
                '}';
    }
}

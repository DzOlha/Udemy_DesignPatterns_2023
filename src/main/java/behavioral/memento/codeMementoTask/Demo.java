package behavioral.memento.codeMementoTask;

import behavioral.memento.codeMementoTask.memento.Memento;
import behavioral.memento.codeMementoTask.model.Token;
import behavioral.memento.codeMementoTask.model.TokenMachine;

public class Demo {
    public static void main(String[] args) {
        TokenMachine tm = new TokenMachine();
        Memento m1 = tm.addToken(10);
        Memento m2 = tm.addToken(new Token(5));
        System.out.println(tm.tokens);


        System.out.println(m1);
        System.out.println(m2);

        tm.revert(m1);
        System.out.println(tm.tokens);

        tm.revert(m2);
        System.out.println(tm.tokens);
    }


}

package behavioral.chainOfResponsibility.examples.brokerChain.model;

import behavioral.chainOfResponsibility.examples.brokerChain.query.Argument;
import behavioral.chainOfResponsibility.examples.brokerChain.query.Query;

public class Creature {
    private Game game;
    public String name;
    private int baseAttack, baseDefense;

    public Creature(Game game, String name,
                    int baseAttack, int baseDefense) {
        this.game = game;
        this.baseAttack = baseAttack;
        this.baseDefense = baseDefense;
        this.name = name;
    }

    int getAttack() {
        Query q = new Query(name, Argument.ATTACK, baseAttack);
        game.queries.fire(q);
        return q.result;
    }

    int getDefense() {
        Query q = new Query(name, Argument.DEFENSE, baseDefense);
        game.queries.fire(q);
        return q.result;
    }

    @Override
    public String toString() // avoid printing Game
    {
        return "Creature{" +
                "name='" + name + '\'' +
                ", attack=" + getAttack() + // !!!
                ", defense=" + getDefense() +
                '}';
    }
}

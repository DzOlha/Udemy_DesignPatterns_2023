package behavioral.chainOfResponsibility.codeCorTask.model.impl;

import behavioral.chainOfResponsibility.codeCorTask.model.Creature;
import behavioral.chainOfResponsibility.codeCorTask.model.mediator.Game;

public class Goblin extends Creature {
    protected Game game;

    public Goblin() {
    }

    public Goblin(Game game) {
        this.game = game;
        this.baseDefense = this.baseAttack = 1;
    }

    @Override
    public int getAttack() {
        int me = 0;
        if (this instanceof GoblinKing) {
            me = 1;
        }
        return baseAttack + findAllGoblinKings() - me;
    }

    @Override
    public int getDefense() {
        return baseDefense + findAllGoblins() - 1;
    }

    private int findAllGoblins() {
        int counter = 0;
        for (Creature creature : game.creatures) {
            if (creature instanceof Goblin) {
                counter += 1;
            }
        }
        return counter;
    }

    private int findAllGoblinKings() {
        int counter = 0;
        for (Creature creature : game.creatures) {
            if (creature instanceof GoblinKing) {
                counter += 1;
            }
        }
        return counter;
    }
}

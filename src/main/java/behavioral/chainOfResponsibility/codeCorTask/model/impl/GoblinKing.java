package behavioral.chainOfResponsibility.codeCorTask.model.impl;

import behavioral.chainOfResponsibility.codeCorTask.model.mediator.Game;

public class GoblinKing extends Goblin {
    public GoblinKing(Game game) {
        this.game = game;
        this.baseDefense = this.baseAttack = 3;
    }
}

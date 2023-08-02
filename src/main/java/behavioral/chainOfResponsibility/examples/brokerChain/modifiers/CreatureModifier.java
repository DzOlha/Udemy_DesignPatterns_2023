package behavioral.chainOfResponsibility.examples.brokerChain.modifiers;

import behavioral.chainOfResponsibility.examples.brokerChain.model.Game;
import behavioral.chainOfResponsibility.examples.brokerChain.model.Creature;

public class CreatureModifier { // protected, not private!
    protected Game game;
    protected Creature creature;

    public CreatureModifier(Game game, Creature creature) {
        this.game = game;
        this.creature = creature;
    }
}

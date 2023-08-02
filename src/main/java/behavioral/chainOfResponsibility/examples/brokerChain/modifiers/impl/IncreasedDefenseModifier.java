package behavioral.chainOfResponsibility.examples.brokerChain.modifiers.impl;

import behavioral.chainOfResponsibility.examples.brokerChain.query.Argument;
import behavioral.chainOfResponsibility.examples.brokerChain.model.Game;
import behavioral.chainOfResponsibility.examples.brokerChain.model.Creature;
import behavioral.chainOfResponsibility.examples.brokerChain.modifiers.CreatureModifier;

public class IncreasedDefenseModifier
        extends CreatureModifier {

    public IncreasedDefenseModifier(Game game, Creature creature) {
        super(game, creature);

        game.queries.subscribe(q -> {
            if (q.creatureName.equals(creature.name)
                    && q.argument == Argument.DEFENSE) {
                q.result += 3;
            }
        });
    }
}

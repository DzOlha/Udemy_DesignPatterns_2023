package behavioral.chainOfResponsibility.examples.brokerChain.modifiers.impl;

import behavioral.chainOfResponsibility.examples.brokerChain.query.Argument;
import behavioral.chainOfResponsibility.examples.brokerChain.model.Game;
import behavioral.chainOfResponsibility.examples.brokerChain.model.Creature;
import behavioral.chainOfResponsibility.examples.brokerChain.modifiers.CreatureModifier;

public class DoubleAttackModifier
        extends CreatureModifier
        implements AutoCloseable {
    private int token;

    public DoubleAttackModifier(Game game, Creature creature) {
        super(game, creature);

        token = game.queries.subscribe(q -> {
            if (q.creatureName.equals(creature.name)
                    && q.argument == Argument.ATTACK) {
                q.result *= 2;
            }
        });
    }

    @Override // commented out exception
    public void close() /*throws Exception*/ {
        game.queries.unsubscribe(token);
    }
}

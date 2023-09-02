package behavioral.template.codeTemplateTask.template.impl;

import behavioral.template.codeTemplateTask.model.Creature;
import behavioral.template.codeTemplateTask.template.CardGame;

public class TemporaryCardDamageGame extends CardGame {
    public TemporaryCardDamageGame(Creature[] creatures) {
        super(creatures);
    }

    @Override
    protected void hit(Creature attacker, Creature other) {
        attacker.attack++;
        other.health--;

        if (other.health != 0) {
            other.health++;
        }
    }
}

package behavioral.chainOfResponsibility.examples.methodChain.modifiers.impl;

import behavioral.chainOfResponsibility.examples.methodChain.Creature;
import behavioral.chainOfResponsibility.examples.methodChain.modifiers.CreatureModifier;

public class NoBonusesModifier extends CreatureModifier
{
    public NoBonusesModifier(Creature creature) {
        super(creature);
    }

    @Override
    public void handle() {
        //we do actually nothing!
        System.out.println("No bonuses for you!");
    }
}

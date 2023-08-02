package behavioral.chainOfResponsibility.examples.methodChain.modifiers.impl;

import behavioral.chainOfResponsibility.examples.methodChain.Creature;
import behavioral.chainOfResponsibility.examples.methodChain.modifiers.CreatureModifier;

public class IncreaseDefenseModifier extends CreatureModifier
{
    public IncreaseDefenseModifier(Creature creature) {
        super(creature);
    }

    @Override
    public void handle() {
        System.out.println("Increasing " + creature.name + " 's defense!");
        creature.defense += 3;
        super.handle();
    }
}

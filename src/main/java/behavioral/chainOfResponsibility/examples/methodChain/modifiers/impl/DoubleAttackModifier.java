package behavioral.chainOfResponsibility.examples.methodChain.modifiers.impl;

import behavioral.chainOfResponsibility.examples.methodChain.Creature;
import behavioral.chainOfResponsibility.examples.methodChain.modifiers.CreatureModifier;

public class DoubleAttackModifier extends CreatureModifier
{
    public DoubleAttackModifier(Creature creature) {
        super(creature);
    }

    @Override
    public void handle() {
        System.out.println("Doubling " + creature.name + " 's attack!");
        creature.attack *= 2;
        super.handle();
    }
}

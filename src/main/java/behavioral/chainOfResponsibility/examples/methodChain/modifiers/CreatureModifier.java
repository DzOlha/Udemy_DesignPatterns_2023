package behavioral.chainOfResponsibility.examples.methodChain.modifiers;

import behavioral.chainOfResponsibility.examples.methodChain.Creature;

public class CreatureModifier {
    protected Creature creature;
    protected  CreatureModifier next;

    public CreatureModifier(Creature creature) {
        this.creature = creature;
    }
    public void add(CreatureModifier creatureModifier) {
        if(next != null) {
            next.add(creatureModifier);
        } else {
            next = creatureModifier;
        }
    }
    public void handle() {
        if(next != null) {
            next.handle();
        }
    }
}

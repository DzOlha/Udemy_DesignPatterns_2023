package behavioral.chainOfResponsibility.examples.methodChain;

import behavioral.chainOfResponsibility.examples.methodChain.modifiers.CreatureModifier;
import behavioral.chainOfResponsibility.examples.methodChain.modifiers.impl.DoubleAttackModifier;
import behavioral.chainOfResponsibility.examples.methodChain.modifiers.impl.IncreaseDefenseModifier;

public class Demo {
    public static void main(String[] args) {
        Creature goblin = new Creature("Goblin", 2, 2);
        System.out.println(goblin);

        CreatureModifier root = new CreatureModifier(goblin);

        //root.add(new NoBonusesModifier(goblin));

        System.out.println("Let's double goblin's attack....");
        root.add(new DoubleAttackModifier(goblin));

        System.out.println("Let's increase goblin's defense....");
        root.add(new IncreaseDefenseModifier(goblin));

        root.handle();
        System.out.println(goblin);
    }
}

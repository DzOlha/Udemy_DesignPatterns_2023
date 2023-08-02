package behavioral.chainOfResponsibility.examples.brokerChain;

import behavioral.chainOfResponsibility.examples.brokerChain.model.Creature;
import behavioral.chainOfResponsibility.examples.brokerChain.model.Game;
import behavioral.chainOfResponsibility.examples.brokerChain.modifiers.impl.DoubleAttackModifier;
import behavioral.chainOfResponsibility.examples.brokerChain.modifiers.impl.IncreasedDefenseModifier;

/**
 * in this example we would use the following patterns' combination:
 *      1) Chain Of Responsibility (all modifiers)
 *      2) Observer (Event<TArgs>)
 *      3) Mediator (Game)
 *      4) Memento (tokens)
 */
public class Demo
{
    public static void main(String[] args)
    {
        Game game = new Game();
        Creature goblin = new Creature(game, "Strong Goblin", 2, 2);

        System.out.println(goblin);

        // modifiers can be piled up
        IncreasedDefenseModifier icm = new IncreasedDefenseModifier(game, goblin);

        try (DoubleAttackModifier dam
                     = new DoubleAttackModifier(game, goblin))
        {
            System.out.println(goblin);
        }

        System.out.println(goblin);
    }
}

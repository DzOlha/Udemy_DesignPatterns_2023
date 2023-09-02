package behavioral.template.codeTemplateTask;

import behavioral.template.codeTemplateTask.model.Creature;
import behavioral.template.codeTemplateTask.template.impl.PermanentCardDamageGame;
import behavioral.template.codeTemplateTask.template.impl.TemporaryCardDamageGame;

public class Demo {
    public static void main(String[] args) {
        Creature [] players1 = {new Creature(1, 2), new Creature(1, 3)};
        TemporaryCardDamageGame tmpGame1 = new TemporaryCardDamageGame(players1);
        System.out.println("1/2 and 1/3 in temporary game!");
        System.out.println(tmpGame1.combat(0, 1));
        System.out.println(tmpGame1.combat(0, 1));
        System.out.println(tmpGame1.combat(0, 1));
        System.out.println(tmpGame1.combat(0, 1));
        System.out.println(tmpGame1.combat(0, 1));
        System.out.println(tmpGame1.combat(0, 1));

        PermanentCardDamageGame permGame1 = new PermanentCardDamageGame(players1);
        System.out.println("1/2 and 1/3 in permanent game!");
        System.out.println(permGame1.combat(0, 1));
        System.out.println(permGame1.combat(0, 1));
        System.out.println(permGame1.combat(0, 1));


        Creature [] players2 = {new Creature(2, 2), new Creature(2, 2)};
        TemporaryCardDamageGame tmpGame2 = new TemporaryCardDamageGame(players2);
        System.out.println("2/2 and 2/2 in temporary game!");
        System.out.println(tmpGame2.combat(0, 1));
        System.out.println(tmpGame2.combat(0, 1));
        System.out.println(tmpGame2.combat(0, 1));

        PermanentCardDamageGame permGame2 = new PermanentCardDamageGame(players2);
        System.out.println("2/2 and 2/2 in permanent game!");
        System.out.println(permGame2.combat(0, 1));
        System.out.println(permGame2.combat(0, 1));
        System.out.println(permGame2.combat(0, 1));

    }
}

package behavioral.chainOfResponsibility.codeCorTask;

import behavioral.chainOfResponsibility.codeCorTask.model.Creature;
import behavioral.chainOfResponsibility.codeCorTask.model.mediator.Game;
import behavioral.chainOfResponsibility.codeCorTask.model.impl.Goblin;
import behavioral.chainOfResponsibility.codeCorTask.model.impl.GoblinKing;

public class Demo {
    public static void main(String[] args) {
        Game game = new Game();
        Creature goblin1 = new Goblin(game);
        Creature goblin2 = new Goblin(game);
        Creature goblin3 = new Goblin(game);

        Creature goblinKing = new GoblinKing(game);
        game.creatures.add(goblinKing);

        game.creatures.add(goblin1);
        game.creatures.add(goblin2);
        game.creatures.add(goblin3);

        System.out.println(goblinKing.getAttack());
        System.out.println(goblinKing.getDefense());

        System.out.println("---------------------");

        System.out.println(goblin1.getAttack());
        System.out.println(goblin1.getDefense());

        System.out.println("---------------------");

        System.out.println(goblin2.getAttack());
        System.out.println(goblin2.getDefense());

        System.out.println("---------------------");

        System.out.println(goblin3.getAttack());
        System.out.println(goblin3.getDefense());



    }
}

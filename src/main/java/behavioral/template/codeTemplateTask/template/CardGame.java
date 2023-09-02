package behavioral.template.codeTemplateTask.template;

import behavioral.template.codeTemplateTask.model.Creature;

public abstract class CardGame {
    public Creature[] creatures;

    public CardGame(Creature[] creatures) {
        this.creatures = creatures;
    }

    // returns -1 if no clear winner (both alive or both dead)
    public int combat(int creature1, int creature2) {
        Creature first = creatures[creature1];
        Creature second = creatures[creature2];
        hit(first, second);
        hit(second, first);

        if ((first.health > 0 && second.health > 0) || first.health == 0 && second.health == 0) {
            return -1;
        }
        return first.health > 0 ? creature1 : creature2;
    }

    // attacker hits other creature
    protected abstract void hit(Creature attacker, Creature other);
}

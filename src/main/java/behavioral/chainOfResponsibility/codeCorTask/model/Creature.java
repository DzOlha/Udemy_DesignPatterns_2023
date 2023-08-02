package behavioral.chainOfResponsibility.codeCorTask.model;

public abstract class Creature {
    protected int baseAttack;
    protected int baseDefense;

    public abstract int getAttack();

    public abstract int getDefense();
}

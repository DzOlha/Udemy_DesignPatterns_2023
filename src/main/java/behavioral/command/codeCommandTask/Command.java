package behavioral.command.codeCommandTask;

public class Command {
    public Action action;
    public int amount;
    public boolean success;

    public Command(Action action, int amount) {
        this.action = action;
        this.amount = amount;
    }
}

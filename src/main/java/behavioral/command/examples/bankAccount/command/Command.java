package behavioral.command.examples.bankAccount.command;

public interface Command {
    void call();
    void undo();
}

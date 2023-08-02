package behavioral.command.examples.bankAccount.command.impl;

import behavioral.command.examples.bankAccount.Action;
import behavioral.command.examples.bankAccount.BankAccount;
import behavioral.command.examples.bankAccount.command.Command;


public class BankAccountCommand implements Command
{
    private BankAccount account;
    private Action action;
    private int amount;
    private boolean succeeded;

    public BankAccountCommand(BankAccount account, Action action, int amount) {
        this.account = account;
        this.action = action;
        this.amount = amount;
    }

    @Override
    public void call() {
        switch (action) {
            case DEPOSIT:
                succeeded = true;
                account.deposit(amount);
                break;
            case WITHDRAW:
                succeeded = account.withdraw(amount);
                break;
        }
    }

    @Override
    public void undo() {
        if(!succeeded) return;
        switch (action) {
            case DEPOSIT:
                account.withdraw(amount);
                break;
            case WITHDRAW:
                account.deposit(amount);
                break;
        }
    }
}

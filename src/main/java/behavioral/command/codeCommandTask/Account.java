package behavioral.command.codeCommandTask;

public class Account {
    public int balance;

    public void process(Command c) {
        c.success = true;
        switch (c.action) {
            case DEPOSIT:
                balance += c.amount;
                break;

            case WITHDRAW:
                if (balance >= c.amount) {
                    balance -= c.amount;
                } else {
                    c.success = false;
                }
                break;
        }
    }
}

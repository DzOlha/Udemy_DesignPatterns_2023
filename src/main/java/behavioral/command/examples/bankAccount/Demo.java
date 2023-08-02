package behavioral.command.examples.bankAccount;

import behavioral.command.examples.bankAccount.command.Command;
import behavioral.command.examples.bankAccount.command.impl.BankAccountCommand;
import com.google.common.collect.Lists;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        System.out.println(ba);

        List<BankAccountCommand> commands = List.of(
                new BankAccountCommand(ba, Action.DEPOSIT, 100),
                new BankAccountCommand(ba, Action.WITHDRAW, 1000)
        );
        for(Command c: commands) {
            c.call();
            System.out.println(ba);
        }
        for(Command c: Lists.reverse(commands)) {
            c.undo();
            System.out.println(ba);
        }
    }
}

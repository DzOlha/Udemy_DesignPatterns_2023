package behavioral.nullObject.examples.bankAccount.model.impl;

import behavioral.nullObject.examples.bankAccount.model.Log;

public class ConsoleLog implements Log {

    @Override
    public void info(String msg) {
        System.out.println(msg);
    }

    @Override
    public void warn(String msg) {
        System.out.println("WARNING: " + msg);
    }
}

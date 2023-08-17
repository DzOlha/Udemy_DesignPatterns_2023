package behavioral.nullObject.codeNullObjectTask;

import behavioral.nullObject.codeNullObjectTask.model.Account;
import behavioral.nullObject.codeNullObjectTask.model.log.Log;
import behavioral.nullObject.codeNullObjectTask.model.log.NullLog;

public class Demo {
    public static void main(String[] args) {
        Log log = new NullLog();
        Account account = new Account(log);
        try{
            account.someOperation();
            System.out.println("There is NO exception!");
        } catch(Exception e) {
            System.out.println("There is exception!");
        }

    }
}

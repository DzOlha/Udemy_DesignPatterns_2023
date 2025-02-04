package behavioral.command.examples.bankAccount;

public class BankAccount {
    public int balance;
    public int overdraftLimit = -500;

    public void deposit(int amount)
    {
        balance += amount;
        System.out.println("Deposited " + amount + ", balance is " + balance);
    }

    public boolean withdraw(int amount)
    {
        if(balance - amount >= overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrew " + amount + ", balance is " + balance);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                '}';
    }
}

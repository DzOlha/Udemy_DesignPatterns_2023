package behavioral.memento.examples;

class Demo
{
    public static void main(String[] args)
    {
        BankAccount ba = new BankAccount(100);
        Memento m1 = ba.deposit(50); // 150
        Memento m2 = ba.deposit(25); // 175
        System.out.println(ba);

        // restore to m1
        ba.restore(m1);
        System.out.println(ba);

        // restore to m2
        ba.restore(m2);
        System.out.println(ba);
    }
}
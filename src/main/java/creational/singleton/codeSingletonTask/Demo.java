package creational.singleton.codeSingletonTask;

import java.util.function.Supplier;

class SingletonTester
{
    public static boolean isSingleton(Supplier<Object> func)
    {
        int one = func.get().hashCode();
        return one == func.get().hashCode();
    }
}
public class Demo {
    public static void main(String[] args) {
        System.out.println();
    }
}

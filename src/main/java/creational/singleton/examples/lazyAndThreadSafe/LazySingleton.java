package creational.singleton.examples.lazyAndThreadSafe;

public class LazySingleton {
    private static LazySingleton instance;
    private LazySingleton() {
        System.out.println("Singleton is initializing");
    }

    //"double-checked locking" approach for thread safety here
    // this is a little a bit "old-fashion" method.
    public static LazySingleton getInstance() {
        if (instance == null)
        {
            synchronized (LazySingleton.class)
            {
                if (instance == null)
                {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}

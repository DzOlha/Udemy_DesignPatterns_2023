package creational.singleton.examples.innerStaticSingleton;

//this approach with the inner static private class that contains the instance of the singleton
//ensures us the threads safety in all possible cases

//this is the best way to guarantee the threads safety
public class InnerStaticSingleton
{
    private InnerStaticSingleton(){};

    private static class Impl {
        private static final InnerStaticSingleton INSTANCE = new InnerStaticSingleton();
    }
    public InnerStaticSingleton getInstance() {
        return Impl.INSTANCE;
    }
}

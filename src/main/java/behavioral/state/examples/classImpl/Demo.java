package behavioral.state.examples.classImpl;

public class Demo {
    public static void main(String[] args) {
        LightSwitch ls = new LightSwitch();
        ls.on();
        ls.off();
        ls.off();
    }
}

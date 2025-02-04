package structural.facade.examples;

public class Demo {
    public static void main(String[] args) {
        Buffer buffer = new Buffer(30, 20);
        Viewport viewport = new Viewport(buffer, 30, 20, 0, 0);
        Console console = new Console(30, 20);
        console.addViewport(viewport);
        console.render();

        //facade
        Console console2 = Console.newConsole(30, 20);
        console2.render();
    }
}

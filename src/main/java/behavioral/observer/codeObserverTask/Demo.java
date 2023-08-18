package behavioral.observer.codeObserverTask;

public class Demo {
    public static void main(String[] args) {
        Game game = new Game();
        Rat rat1 = new Rat(game);
        Rat rat2 = new Rat(game);

        Rat rat3 = new Rat(game);
        try {
            rat2.close();
        } catch(Exception e) {}
        System.out.println(game);

    }
}

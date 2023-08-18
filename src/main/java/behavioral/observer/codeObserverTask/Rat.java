package behavioral.observer.codeObserverTask;

import java.io.Closeable;
import java.io.IOException;

public class Rat implements Closeable {
    public Game game;
    public int attack = 1;
    public int ratKeyInGame = 1;
    public int index;

    public Rat(Game game) {
        this.game = game;
        index = this.game.countOfRats;
        ratKeyInGame = index++;
        this.game.setCountOfRats(index);
        this.attack = ratKeyInGame + 1;
        this.game.rats.put(ratKeyInGame, this);
    }

    @Override
    public void close() throws IOException {
        int count = game.countOfRats - 1;
        game.setCountOfRats(count);
        if (count > 0) {
            try {
                game.rats.remove(ratKeyInGame);
            } catch (Exception e) {
                System.out.println("Something went from in close()");
            }
        }
    }


    @Override
    public String toString() {
        return "Rat{" +
                "attack=" + attack +
                '}';
    }
}

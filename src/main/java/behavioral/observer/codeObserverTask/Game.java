package behavioral.observer.codeObserverTask;

import java.util.HashMap;
import java.util.Map;

public class Game {
    public int countOfRats = 0;
    public Map<Integer, Rat> rats = new HashMap<>();

    public void setCountOfRats(int rats) {
        if (countOfRats == rats) return;
        countOfRats = rats;
        updateAttackValueInAllRats();
    }

    public void updateAttackValueInAllRats() {
        for (Rat rat : rats.values()) {
            rat.attack = countOfRats;
        }
    }

    @Override
    public String toString() {
        return "Game{" +
                "rats=" + rats +
                '}';
    }
}

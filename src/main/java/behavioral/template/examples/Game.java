package behavioral.template.examples;

abstract public class Game {
    protected int currentPlayer;
    protected final int numberOfPlayers;

    public Game(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }
    public void run() {
        start();
        while(!haveWinner()) {
            takeTurn();
            System.out.println("Player " + getWinningPlayer() + " wins!");
        }
    }
    protected abstract int getWinningPlayer();
    protected abstract void start();
    protected abstract void takeTurn();
    protected abstract boolean haveWinner();
}

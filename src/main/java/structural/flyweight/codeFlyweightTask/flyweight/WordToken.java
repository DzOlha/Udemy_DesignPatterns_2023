package structural.flyweight.codeFlyweightTask.flyweight;

public class WordToken {
    private int indexPosition;
    public String word;
    public boolean capitalize;

    public WordToken(String word, int indexPosition) {
        this.word = word;
        this.indexPosition = indexPosition;
    }
}

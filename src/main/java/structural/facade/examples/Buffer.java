package structural.facade.examples;

public class Buffer {
    private char[] characters;
    private int lineWidth;

    public Buffer(int lineWidth, int lineHeight) {
        this.lineWidth = lineWidth;
        characters = new char[lineHeight * lineWidth];
    }

    public char charAt(int x, int y) {
        return characters[y * lineWidth + x];
    }
}

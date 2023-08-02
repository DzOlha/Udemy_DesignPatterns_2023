package structural.flyweight.codeFlyweightTask;

public class Demo {
    public static void main(String[] args) {
        var sentence = new Sentence("hello world");
        sentence.getWord(1).capitalize = true;
        System.out.println(sentence); // writes "hello WORLD"
    }
}

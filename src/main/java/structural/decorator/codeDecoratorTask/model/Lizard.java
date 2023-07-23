package structural.decorator.codeDecoratorTask.model;

public class Lizard {
    public int age;

    public String crawl() {
        return (age > 1) ? "crawling" : "too young";
    }
}

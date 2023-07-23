package structural.decorator.codeDecoratorTask.decorator;

import structural.decorator.codeDecoratorTask.model.Bird;
import structural.decorator.codeDecoratorTask.model.Lizard;

public class Dragon {
    private Bird bird;
    private Lizard lizard;

    private int age;

    public void setAge(int age) {
        if (age > 1 && age < 10) {
            this.age = age;
        }
    }

    public String fly() {
        return bird.fly();
    }

    public String crawl() {
        return lizard.crawl();
    }
}

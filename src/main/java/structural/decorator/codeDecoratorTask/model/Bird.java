package structural.decorator.codeDecoratorTask.model;

public class Bird {
    public int age;

    public String fly() {
        return age < 10 ? "flying" : "too old";
    }
}

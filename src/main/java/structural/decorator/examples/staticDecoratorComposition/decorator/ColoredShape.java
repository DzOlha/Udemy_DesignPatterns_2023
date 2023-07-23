package structural.decorator.examples.staticDecoratorComposition.decorator;

import structural.decorator.examples.dynamicDecoratorComposition.shape.Shape;

import java.util.function.Supplier;

public class ColoredShape<T extends Shape> implements Shape {
    private Shape shape;
    private String color;

    public ColoredShape(Supplier<? extends T> ctor, String color) {
        shape = ctor.get();
        this.color = color;
    }

    @Override
    public String info() {
        return shape + " has the color " + color;
    }
}

package structural.decorator.examples.dynamicDecoratorComposition.decorator;

import structural.decorator.examples.dynamicDecoratorComposition.shape.Shape;

public class ColoredShape implements Shape {
    private Shape shape;
    private String color;

    public ColoredShape(Shape shape, String color) {
        this.shape = shape;
        this.color = color;
    }

    @Override
    public String info() {
        return shape.info() + " has the color " + color;
    }
}

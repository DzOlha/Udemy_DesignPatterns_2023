package structural.decorator.examples.dynamicDecoratorComposition.shape.impl;

import structural.decorator.examples.dynamicDecoratorComposition.shape.Shape;

public class Circle implements Shape {
    private float radius;

    Circle() {
    }

    public Circle(float radius) {
        this.radius = radius;
    }

    void resize(float factor) {
        radius *= factor;
    }

    @Override
    public String info() {
        return "A circle of radius " + radius;
    }
}

package structural.composite.examples.geometricShapes.model.children;

import structural.composite.examples.geometricShapes.model.GraphicObject;

public class Circle extends GraphicObject {
    public Circle(String color) {
        name = "Circle";
        this.color = color;
    }
}

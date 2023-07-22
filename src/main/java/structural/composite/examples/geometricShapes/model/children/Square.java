package structural.composite.examples.geometricShapes.model.children;

import structural.composite.examples.geometricShapes.model.GraphicObject;

public class Square extends GraphicObject {
    public Square(String color) {
        name = "Square";
        this.color = color;
    }
}

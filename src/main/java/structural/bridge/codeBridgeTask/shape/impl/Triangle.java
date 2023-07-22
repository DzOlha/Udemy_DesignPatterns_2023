package structural.bridge.codeBridgeTask.shape.impl;

import structural.bridge.codeBridgeTask.renderer.Renderer;
import structural.bridge.codeBridgeTask.shape.Shape;

public class Triangle extends Shape {
    public Triangle(Renderer renderer) {
        super(renderer);
    }

    @Override
    public String getName() {
        return "Triangle";
    }
}

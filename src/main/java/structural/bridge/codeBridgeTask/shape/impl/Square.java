package structural.bridge.codeBridgeTask.shape.impl;

import structural.bridge.codeBridgeTask.renderer.Renderer;
import structural.bridge.codeBridgeTask.shape.Shape;

public class Square extends Shape {
    public Square(Renderer renderer) {
        super(renderer);
    }

    @Override
    public String getName() {
        return "Square";
    }
}

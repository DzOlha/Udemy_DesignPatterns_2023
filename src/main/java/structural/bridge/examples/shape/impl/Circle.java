package structural.bridge.examples.shape.impl;

import com.google.inject.Inject;
import structural.bridge.examples.renderer.Renderer;
import structural.bridge.examples.shape.Shape;

public class Circle extends Shape {
    public float radius;

    @Inject
    public Circle(Renderer renderer) {
        super(renderer);
    }

    public Circle(Renderer renderer, float radius) {
        super(renderer);
        this.radius = radius;
    }

    @Override
    public void draw() {
        renderer.renderCircle(radius);
    }

    @Override
    public void resize(float factor) {
        radius *= factor;
    }
}

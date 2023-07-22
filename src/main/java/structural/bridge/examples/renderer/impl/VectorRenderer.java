package structural.bridge.examples.renderer.impl;

import structural.bridge.examples.renderer.Renderer;

public class VectorRenderer implements Renderer {
    @Override
    public void renderCircle(float radius) {
        System.out.println("Drawing a circle of radius " + radius);
    }
}

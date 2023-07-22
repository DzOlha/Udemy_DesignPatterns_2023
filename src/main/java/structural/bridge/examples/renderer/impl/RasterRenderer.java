package structural.bridge.examples.renderer.impl;

import structural.bridge.examples.renderer.Renderer;

public class RasterRenderer implements Renderer {
    @Override
    public void renderCircle(float radius) {
        System.out.println("Drawing pixels for a circle of radius " + radius);
    }
}

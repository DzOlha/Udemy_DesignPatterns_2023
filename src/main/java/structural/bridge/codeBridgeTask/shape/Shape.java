package structural.bridge.codeBridgeTask.shape;

import structural.bridge.codeBridgeTask.renderer.Renderer;

public abstract class Shape {
    protected Renderer renderer;

    public abstract String getName();

    public Shape(Renderer renderer) {
        this.renderer = renderer;
    }

    @Override
    public String toString() {
        return String.format("Drawing %s as %s", getName(), renderer.whatToRenderAs());
    }
}

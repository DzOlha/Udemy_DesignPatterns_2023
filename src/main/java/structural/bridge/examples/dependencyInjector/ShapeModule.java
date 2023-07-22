package structural.bridge.examples.dependencyInjector;

import com.google.inject.AbstractModule;
import structural.bridge.examples.renderer.Renderer;
import structural.bridge.examples.renderer.impl.VectorRenderer;

public class ShapeModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Renderer.class).to(VectorRenderer.class);
    }
}

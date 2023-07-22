package structural.bridge.codeBridgeTask;

import structural.bridge.codeBridgeTask.renderer.impl.RasterRenderer;
import structural.bridge.codeBridgeTask.shape.impl.Triangle;

public class Demo {
    public static void main(String[] args) {
        System.out.println(new Triangle(new RasterRenderer()));
    }
}

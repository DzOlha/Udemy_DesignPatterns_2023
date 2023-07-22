package structural.bridge.codeBridgeTask.renderer.impl;

import structural.bridge.codeBridgeTask.renderer.Renderer;

public class RasterRenderer implements Renderer {
    @Override
    public String whatToRenderAs() {
        return "pixels";
    }
}

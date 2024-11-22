package foko.cookout.renderers;

import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;

import static foko.cookout.registries.CookOutBlockEntities.VIAL_RACK_ENTITY;

public class Renderers {

    public static void registerRenderers() {
        BlockEntityRendererFactories.register(VIAL_RACK_ENTITY, VialRackEntityRenderer::new);
    }
}

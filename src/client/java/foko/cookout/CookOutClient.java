package foko.cookout;

import foko.cookout.blocks.ModBlocks;
import foko.cookout.registries.CookOutBlocks;
import foko.cookout.renderers.Renderers;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class CookOutClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.
		Renderers.registerRenderers();
		BlockRenderLayerMap.INSTANCE.putBlock(CookOutBlocks.VIAL_RACK, RenderLayer.getCutout());
		// Here we will put client-only registration code (thabks toast)
	}
}
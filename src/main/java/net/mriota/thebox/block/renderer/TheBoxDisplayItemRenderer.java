package net.mriota.thebox.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.mriota.thebox.block.model.TheBoxDisplayModel;
import net.mriota.thebox.block.display.TheBoxDisplayItem;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

public class TheBoxDisplayItemRenderer extends GeoItemRenderer<TheBoxDisplayItem> {
	public TheBoxDisplayItemRenderer() {
		super(new TheBoxDisplayModel());
	}

	@Override
	public RenderType getRenderType(TheBoxDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

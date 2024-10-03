package net.mriota.thebox.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.mriota.thebox.block.model.TheBoxBlockModel;
import net.mriota.thebox.block.entity.TheBoxTileEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

public class TheBoxTileRenderer extends GeoBlockRenderer<TheBoxTileEntity> {
	public TheBoxTileRenderer() {
		super(new TheBoxBlockModel());
	}

	@Override
	public RenderType getRenderType(TheBoxTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

package net.mriota.thebox.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.mriota.thebox.block.entity.TheBoxTileEntity;

import net.minecraft.resources.ResourceLocation;

public class TheBoxBlockModel extends GeoModel<TheBoxTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(TheBoxTileEntity animatable) {
		return new ResourceLocation("the_box", "animations/mainbox.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TheBoxTileEntity animatable) {
		return new ResourceLocation("the_box", "geo/mainbox.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TheBoxTileEntity animatable) {
		return new ResourceLocation("the_box", "textures/block/boxtexture.png");
	}
}

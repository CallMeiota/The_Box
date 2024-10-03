package net.mriota.thebox.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.mriota.thebox.block.display.TheBoxDisplayItem;

import net.minecraft.resources.ResourceLocation;

public class TheBoxDisplayModel extends GeoModel<TheBoxDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(TheBoxDisplayItem animatable) {
		return new ResourceLocation("the_box", "animations/mainbox.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TheBoxDisplayItem animatable) {
		return new ResourceLocation("the_box", "geo/mainbox.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TheBoxDisplayItem entity) {
		return new ResourceLocation("the_box", "textures/block/boxtexture.png");
	}
}

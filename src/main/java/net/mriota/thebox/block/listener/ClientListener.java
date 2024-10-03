package net.mriota.thebox.block.listener;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.mriota.thebox.init.TheBoxModBlockEntities;
import net.mriota.thebox.block.renderer.TheBoxTileRenderer;
import net.mriota.thebox.block.entity.TheBoxTileEntity;
import net.mriota.thebox.TheBoxMod;

import net.minecraft.world.level.block.entity.BlockEntityType;

@EventBusSubscriber(modid = TheBoxMod.MODID, value = Dist.CLIENT, bus = EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer((BlockEntityType<TheBoxTileEntity>) TheBoxModBlockEntities.THE_BOX.get(), context -> new TheBoxTileRenderer());
	}
}

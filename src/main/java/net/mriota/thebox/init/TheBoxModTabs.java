
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mriota.thebox.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.mriota.thebox.TheBoxMod;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

public class TheBoxModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TheBoxMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> THE_ESSENTIAL_BOX = REGISTRY.register("the_essential_box",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.the_box.the_essential_box")).icon(() -> new ItemStack(TheBoxModItems.CARD_BOARD_PIECE_WITH_PRINT.get())).displayItems((parameters, tabData) -> {
				tabData.accept(TheBoxModBlocks.THE_BOX.get().asItem());
				tabData.accept(TheBoxModItems.CARD_BOARD_PIECE_WITHOUT.get());
				tabData.accept(TheBoxModItems.CARD_BOARD_PIECE_WITH_PRINT.get());
			})

					.build());
}

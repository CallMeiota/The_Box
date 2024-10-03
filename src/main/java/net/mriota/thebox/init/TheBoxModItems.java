
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mriota.thebox.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.mriota.thebox.item.TapeItem;
import net.mriota.thebox.item.CardBoardPieceWithoutItem;
import net.mriota.thebox.item.CardBoardPieceWithPrintItem;
import net.mriota.thebox.block.display.TheBoxDisplayItem;
import net.mriota.thebox.TheBoxMod;

import net.minecraft.world.item.Item;
import net.minecraft.core.registries.BuiltInRegistries;

public class TheBoxModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(BuiltInRegistries.ITEM, TheBoxMod.MODID);
	public static final DeferredHolder<Item, Item> THE_BOX = REGISTRY.register(TheBoxModBlocks.THE_BOX.getId().getPath(), () -> new TheBoxDisplayItem(TheBoxModBlocks.THE_BOX.get(), new Item.Properties()));
	public static final DeferredHolder<Item, Item> CARD_BOARD_PIECE_WITHOUT = REGISTRY.register("card_board_piece_without", CardBoardPieceWithoutItem::new);
	public static final DeferredHolder<Item, Item> CARD_BOARD_PIECE_WITH_PRINT = REGISTRY.register("card_board_piece_with_print", CardBoardPieceWithPrintItem::new);
	public static final DeferredHolder<Item, Item> TAPE = REGISTRY.register("tape", TapeItem::new);
	// Start of user code block custom items
	// End of user code block custom items
}

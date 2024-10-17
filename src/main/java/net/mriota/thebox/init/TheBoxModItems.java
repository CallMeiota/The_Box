
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mriota.thebox.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.mriota.thebox.item.CardBoardPieceWithoutItem;
import net.mriota.thebox.item.CardBoardPieceWithPrintItem;
import net.mriota.thebox.block.display.TheBoxDisplayItem;
import net.mriota.thebox.TheBoxMod;

import net.minecraft.world.item.Item;

public class TheBoxModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(TheBoxMod.MODID);
	public static final DeferredItem<Item> THE_BOX = REGISTRY.register(TheBoxModBlocks.THE_BOX.getId().getPath(), () -> new TheBoxDisplayItem(TheBoxModBlocks.THE_BOX.get(), new Item.Properties()));
	public static final DeferredItem<Item> CARD_BOARD_PIECE_WITHOUT = REGISTRY.register("card_board_piece_without", CardBoardPieceWithoutItem::new);
	public static final DeferredItem<Item> CARD_BOARD_PIECE_WITH_PRINT = REGISTRY.register("card_board_piece_with_print", CardBoardPieceWithPrintItem::new);
	// Start of user code block custom items
	// End of user code block custom items
}

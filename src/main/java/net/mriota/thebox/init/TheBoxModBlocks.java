
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mriota.thebox.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.mriota.thebox.block.TheBoxBlock;
import net.mriota.thebox.TheBoxMod;

import net.minecraft.world.level.block.Block;

public class TheBoxModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(TheBoxMod.MODID);
	public static final DeferredBlock<Block> THE_BOX = REGISTRY.register("the_box", TheBoxBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}


/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mriota.thebox.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.mriota.thebox.TheBoxMod;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class TheBoxModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, TheBoxMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> BOX_OPENING = REGISTRY.register("box-opening", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("the_box", "box-opening")));
	public static final DeferredHolder<SoundEvent, SoundEvent> BOX_CLOSING = REGISTRY.register("box_closing", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("the_box", "box_closing")));
}

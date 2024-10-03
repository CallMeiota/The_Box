
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mriota.thebox.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.mriota.thebox.world.inventory.TheBoxGuiMenu;
import net.mriota.thebox.TheBoxMod;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

public class TheBoxModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, TheBoxMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<TheBoxGuiMenu>> THE_BOX_GUI = REGISTRY.register("the_box_gui", () -> IMenuTypeExtension.create(TheBoxGuiMenu::new));
}


package net.mriota.thebox.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class TapeItem extends Item {
	public TapeItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}


package net.mcreator.thelotrmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class HeatedMithrilItem extends Item {
	public HeatedMithrilItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}
}
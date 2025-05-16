
package io.github.projectfumo.fumo.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class FumoRotateIconItem extends Item {
	public FumoRotateIconItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}

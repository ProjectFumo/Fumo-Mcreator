
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package io.github.projectfumo.fumo.init;

import net.neoforged.neoforge.event.village.WandererTradesEvent;
import net.neoforged.neoforge.common.BasicItemListing;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

@EventBusSubscriber
public class FumoModTrades {
	@SubscribeEvent
	public static void registerWanderingTrades(WandererTradesEvent event) {
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.MUSIC_DISC_13), new ItemStack(Items.MUSIC_DISC_CAT), new ItemStack(FumoModItems.REIMU_ITEM.get()), 10, 5, 0.05f));
	}
}

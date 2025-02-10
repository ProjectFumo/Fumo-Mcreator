
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.fumo.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class FumoModTrades {
	@SubscribeEvent
	public static void registerWanderingTrades(WandererTradesEvent event) {
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.MUSIC_DISC_13), new ItemStack(Items.MUSIC_DISC_CAT), new ItemStack(FumoModItems.REIMU_ITEM.get()), 10, 5, 0.05f));
	}
}

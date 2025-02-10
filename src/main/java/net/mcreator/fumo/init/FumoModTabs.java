
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fumo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.fumo.FumoMod;

public class FumoModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FumoMod.MODID);
	public static final RegistryObject<CreativeModeTab> FUMO_TAB = REGISTRY.register("fumo_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.fumo.fumo_tab")).icon(() -> new ItemStack(FumoModItems.CREATIVE_TAB_ICON.get())).displayItems((parameters, tabData) -> {
				tabData.accept(FumoModItems.FUMOITEM.get());
				tabData.accept(FumoModItems.MARISA_HAT_ITEM.get());
				tabData.accept(FumoModItems.EIKI_ITEM.get());
				tabData.accept(FumoModItems.REIMU_ITEM.get());
				tabData.accept(FumoModItems.MARISA_ITEM.get());
				tabData.accept(FumoModItems.CIRNO_ITEM.get());
				tabData.accept(FumoModItems.TAN_CIRNO_ITEM.get());
				tabData.accept(FumoModItems.CHEN_ITEM.get());
				tabData.accept(FumoModItems.NEW_REIMU_ITEM.get());
				tabData.accept(FumoModItems.BLUE_REIMU_ITEM.get());
				tabData.accept(FumoModItems.KOISHI_ITEM.get());
				tabData.accept(FumoModItems.FLANDRE_ITEM.get());
				tabData.accept(FumoModItems.MEILING_ITEM.get());
				tabData.accept(FumoModItems.YOUMU_ITEM.get());
				tabData.accept(FumoModItems.YUYUKO_ITEM.get());
				tabData.accept(FumoModItems.PATCHOULI_ITEM.get());
				tabData.accept(FumoModItems.NITORI_ITEM.get());
				tabData.accept(FumoModItems.TEWI_ITEM.get());
				tabData.accept(FumoModItems.NAZRIN_ITEM.get());
				tabData.accept(FumoModItems.SUNNY_MILK_ITEM.get());
				tabData.accept(FumoModItems.ALICE_ITEM.get());
			}).withSearchBar().build());
}

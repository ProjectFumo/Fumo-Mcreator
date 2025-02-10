
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fumo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.fumo.FumoMod;

public class FumoModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, FumoMod.MODID);
	public static final RegistryObject<SoundEvent> FUMO_SCREAM = REGISTRY.register("fumo_scream", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("fumo", "fumo_scream")));
}

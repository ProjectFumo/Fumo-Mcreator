
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fumo.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.fumo.FumoMod;

public class FumoModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, FumoMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> FUMO_SCREAM = REGISTRY.register("fumo_scream", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("fumo", "fumo_scream")));
}

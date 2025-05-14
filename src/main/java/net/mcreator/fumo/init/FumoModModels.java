
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fumo.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.fumo.client.model.ModelNitori;
import net.mcreator.fumo.client.model.ModelMarisaHat;
import net.mcreator.fumo.client.model.ModelFumo;
import net.mcreator.fumo.client.model.ModelEiki;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class FumoModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelNitori.LAYER_LOCATION, ModelNitori::createBodyLayer);
		event.registerLayerDefinition(ModelEiki.LAYER_LOCATION, ModelEiki::createBodyLayer);
		event.registerLayerDefinition(ModelFumo.LAYER_LOCATION, ModelFumo::createBodyLayer);
		event.registerLayerDefinition(ModelMarisaHat.LAYER_LOCATION, ModelMarisaHat::createBodyLayer);
	}
}

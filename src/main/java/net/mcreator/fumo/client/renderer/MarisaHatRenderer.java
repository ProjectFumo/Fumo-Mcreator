
package net.mcreator.fumo.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fumo.entity.MarisaHatEntity;
import net.mcreator.fumo.client.model.ModelMarisaHat;

public class MarisaHatRenderer extends MobRenderer<MarisaHatEntity, ModelMarisaHat<MarisaHatEntity>> {
	public MarisaHatRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelMarisaHat(context.bakeLayer(ModelMarisaHat.LAYER_LOCATION)), 0.4f);
	}

	@Override
	public ResourceLocation getTextureLocation(MarisaHatEntity entity) {
		return new ResourceLocation("fumo:textures/entities/marisahat.png");
	}
}

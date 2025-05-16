
package io.github.projectfumo.fumo.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import io.github.projectfumo.fumo.entity.MarisaHatEntity;
import io.github.projectfumo.fumo.client.model.ModelMarisaHat;

public class MarisaHatRenderer extends MobRenderer<MarisaHatEntity, ModelMarisaHat<MarisaHatEntity>> {
	public MarisaHatRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelMarisaHat<MarisaHatEntity>(context.bakeLayer(ModelMarisaHat.LAYER_LOCATION)), 0.4f);
	}

	@Override
	public ResourceLocation getTextureLocation(MarisaHatEntity entity) {
		return ResourceLocation.parse("fumo:textures/entities/marisahat.png");
	}
}

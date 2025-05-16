
package io.github.projectfumo.fumo.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import io.github.projectfumo.fumo.entity.BlueReimuEntity;
import io.github.projectfumo.fumo.client.model.ModelFumo;

public class BlueReimuRenderer extends MobRenderer<BlueReimuEntity, ModelFumo<BlueReimuEntity>> {
	public BlueReimuRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFumo<BlueReimuEntity>(context.bakeLayer(ModelFumo.LAYER_LOCATION)), 0.4f);
	}

	@Override
	public ResourceLocation getTextureLocation(BlueReimuEntity entity) {
		return ResourceLocation.parse("fumo:textures/entities/bluereimu.png");
	}
}

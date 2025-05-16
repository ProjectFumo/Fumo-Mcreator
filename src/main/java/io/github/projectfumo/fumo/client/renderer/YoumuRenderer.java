
package io.github.projectfumo.fumo.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import io.github.projectfumo.fumo.entity.YoumuEntity;
import io.github.projectfumo.fumo.client.model.ModelFumo;

public class YoumuRenderer extends MobRenderer<YoumuEntity, ModelFumo<YoumuEntity>> {
	public YoumuRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFumo<YoumuEntity>(context.bakeLayer(ModelFumo.LAYER_LOCATION)), 0.4f);
	}

	@Override
	public ResourceLocation getTextureLocation(YoumuEntity entity) {
		return ResourceLocation.parse("fumo:textures/entities/youmu.png");
	}
}

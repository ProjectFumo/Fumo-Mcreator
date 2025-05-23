
package io.github.projectfumo.fumo.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import io.github.projectfumo.fumo.entity.FlandreEntity;
import io.github.projectfumo.fumo.client.model.ModelFumo;

public class FlandreRenderer extends MobRenderer<FlandreEntity, ModelFumo<FlandreEntity>> {
	public FlandreRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFumo<FlandreEntity>(context.bakeLayer(ModelFumo.LAYER_LOCATION)), 0.4f);
	}

	@Override
	public ResourceLocation getTextureLocation(FlandreEntity entity) {
		return ResourceLocation.parse("fumo:textures/entities/flandre.png");
	}
}

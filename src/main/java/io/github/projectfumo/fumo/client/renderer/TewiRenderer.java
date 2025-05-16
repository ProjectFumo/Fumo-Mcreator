
package io.github.projectfumo.fumo.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import io.github.projectfumo.fumo.entity.TewiEntity;
import io.github.projectfumo.fumo.client.model.ModelFumo;

public class TewiRenderer extends MobRenderer<TewiEntity, ModelFumo<TewiEntity>> {
	public TewiRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFumo<TewiEntity>(context.bakeLayer(ModelFumo.LAYER_LOCATION)), 0.4f);
	}

	@Override
	public ResourceLocation getTextureLocation(TewiEntity entity) {
		return ResourceLocation.parse("fumo:textures/entities/tewi.png");
	}
}

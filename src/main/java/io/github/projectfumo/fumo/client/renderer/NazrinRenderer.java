
package io.github.projectfumo.fumo.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import io.github.projectfumo.fumo.entity.NazrinEntity;
import io.github.projectfumo.fumo.client.model.ModelFumo;

public class NazrinRenderer extends MobRenderer<NazrinEntity, ModelFumo<NazrinEntity>> {
	public NazrinRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFumo<NazrinEntity>(context.bakeLayer(ModelFumo.LAYER_LOCATION)), 0.4f);
	}

	@Override
	public ResourceLocation getTextureLocation(NazrinEntity entity) {
		return ResourceLocation.parse("fumo:textures/entities/nazrin.png");
	}
}

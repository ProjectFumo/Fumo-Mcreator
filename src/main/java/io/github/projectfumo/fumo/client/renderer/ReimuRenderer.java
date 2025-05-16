
package io.github.projectfumo.fumo.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import io.github.projectfumo.fumo.entity.ReimuEntity;
import io.github.projectfumo.fumo.client.model.ModelFumo;

public class ReimuRenderer extends MobRenderer<ReimuEntity, ModelFumo<ReimuEntity>> {
	public ReimuRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFumo<ReimuEntity>(context.bakeLayer(ModelFumo.LAYER_LOCATION)), 0.4f);
	}

	@Override
	public ResourceLocation getTextureLocation(ReimuEntity entity) {
		return ResourceLocation.parse("fumo:textures/entities/reimu.png");
	}
}


package io.github.projectfumo.fumo.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import io.github.projectfumo.fumo.entity.NewReimuEntity;
import io.github.projectfumo.fumo.client.model.ModelFumo;

public class NewReimuRenderer extends MobRenderer<NewReimuEntity, ModelFumo<NewReimuEntity>> {
	public NewReimuRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFumo<NewReimuEntity>(context.bakeLayer(ModelFumo.LAYER_LOCATION)), 0.4f);
	}

	@Override
	public ResourceLocation getTextureLocation(NewReimuEntity entity) {
		return ResourceLocation.parse("fumo:textures/entities/newreimu.png");
	}
}

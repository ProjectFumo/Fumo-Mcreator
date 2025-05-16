
package io.github.projectfumo.fumo.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import io.github.projectfumo.fumo.entity.CirnoEntity;
import io.github.projectfumo.fumo.client.model.ModelFumo;

public class CirnoRenderer extends MobRenderer<CirnoEntity, ModelFumo<CirnoEntity>> {
	public CirnoRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFumo<CirnoEntity>(context.bakeLayer(ModelFumo.LAYER_LOCATION)), 0.4f);
	}

	@Override
	public ResourceLocation getTextureLocation(CirnoEntity entity) {
		return ResourceLocation.parse("fumo:textures/entities/cirno.png");
	}
}

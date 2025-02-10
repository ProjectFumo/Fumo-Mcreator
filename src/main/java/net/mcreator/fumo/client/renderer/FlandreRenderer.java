
package net.mcreator.fumo.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fumo.entity.FlandreEntity;
import net.mcreator.fumo.client.model.ModelFumo;

public class FlandreRenderer extends MobRenderer<FlandreEntity, ModelFumo<FlandreEntity>> {
	public FlandreRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFumo(context.bakeLayer(ModelFumo.LAYER_LOCATION)), 0.4f);
	}

	@Override
	public ResourceLocation getTextureLocation(FlandreEntity entity) {
		return new ResourceLocation("fumo:textures/entities/flandre.png");
	}
}


package net.mcreator.fumo.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fumo.entity.YoumuEntity;
import net.mcreator.fumo.client.model.ModelFumo;

public class YoumuRenderer extends MobRenderer<YoumuEntity, ModelFumo<YoumuEntity>> {
	public YoumuRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFumo(context.bakeLayer(ModelFumo.LAYER_LOCATION)), 0.4f);
	}

	@Override
	public ResourceLocation getTextureLocation(YoumuEntity entity) {
		return new ResourceLocation("fumo:textures/entities/youmu.png");
	}
}

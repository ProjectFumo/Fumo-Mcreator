
package net.mcreator.fumo.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fumo.entity.EikiEntity;
import net.mcreator.fumo.client.model.ModelEiki;

public class EikiRenderer extends MobRenderer<EikiEntity, ModelEiki<EikiEntity>> {
	public EikiRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelEiki<EikiEntity>(context.bakeLayer(ModelEiki.LAYER_LOCATION)), 0.4f);
	}

	@Override
	public ResourceLocation getTextureLocation(EikiEntity entity) {
		return ResourceLocation.parse("fumo:textures/entities/eiki.png");
	}
}

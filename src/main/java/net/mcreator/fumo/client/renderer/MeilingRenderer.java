
package net.mcreator.fumo.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fumo.entity.MeilingEntity;
import net.mcreator.fumo.client.model.ModelFumo;

public class MeilingRenderer extends MobRenderer<MeilingEntity, ModelFumo<MeilingEntity>> {
	public MeilingRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFumo<MeilingEntity>(context.bakeLayer(ModelFumo.LAYER_LOCATION)), 0.4f);
	}

	@Override
	public ResourceLocation getTextureLocation(MeilingEntity entity) {
		return ResourceLocation.parse("fumo:textures/entities/meiling.png");
	}
}

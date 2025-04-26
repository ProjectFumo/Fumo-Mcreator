
package net.mcreator.fumo.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fumo.entity.DebugFumoEntity;
import net.mcreator.fumo.client.model.ModelFumo;

public class DebugFumoRenderer extends MobRenderer<DebugFumoEntity, ModelFumo<DebugFumoEntity>> {
	public DebugFumoRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFumo<DebugFumoEntity>(context.bakeLayer(ModelFumo.LAYER_LOCATION)), 0.4f);
	}

	@Override
	public ResourceLocation getTextureLocation(DebugFumoEntity entity) {
		return ResourceLocation.parse("fumo:textures/entities/debugfumo.png");
	}
}


package io.github.projectfumo.fumo.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import io.github.projectfumo.fumo.entity.NitoriEntity;
import io.github.projectfumo.fumo.client.model.ModelNitori;

public class NitoriRenderer extends MobRenderer<NitoriEntity, ModelNitori<NitoriEntity>> {
	public NitoriRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelNitori<NitoriEntity>(context.bakeLayer(ModelNitori.LAYER_LOCATION)), 0.4f);
	}

	@Override
	public ResourceLocation getTextureLocation(NitoriEntity entity) {
		return ResourceLocation.parse("fumo:textures/entities/nitori.png");
	}
}

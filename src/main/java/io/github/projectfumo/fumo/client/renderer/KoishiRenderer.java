
package io.github.projectfumo.fumo.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import io.github.projectfumo.fumo.entity.KoishiEntity;
import io.github.projectfumo.fumo.client.model.ModelFumo;

public class KoishiRenderer extends MobRenderer<KoishiEntity, ModelFumo<KoishiEntity>> {
	public KoishiRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFumo<KoishiEntity>(context.bakeLayer(ModelFumo.LAYER_LOCATION)), 0.4f);
	}

	@Override
	public ResourceLocation getTextureLocation(KoishiEntity entity) {
		return ResourceLocation.parse("fumo:textures/entities/koishi.png");
	}
}

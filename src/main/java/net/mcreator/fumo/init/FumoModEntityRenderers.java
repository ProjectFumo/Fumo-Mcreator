
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fumo.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.fumo.client.renderer.YuyukoRenderer;
import net.mcreator.fumo.client.renderer.YoumuRenderer;
import net.mcreator.fumo.client.renderer.TewiRenderer;
import net.mcreator.fumo.client.renderer.TanCirnoRenderer;
import net.mcreator.fumo.client.renderer.SunnyMilkRenderer;
import net.mcreator.fumo.client.renderer.ReimuRenderer;
import net.mcreator.fumo.client.renderer.PatchouliRenderer;
import net.mcreator.fumo.client.renderer.NitoriRenderer;
import net.mcreator.fumo.client.renderer.NewReimuRenderer;
import net.mcreator.fumo.client.renderer.NazrinRenderer;
import net.mcreator.fumo.client.renderer.MeilingRenderer;
import net.mcreator.fumo.client.renderer.MarisaRenderer;
import net.mcreator.fumo.client.renderer.MarisaHatRenderer;
import net.mcreator.fumo.client.renderer.KoishiRenderer;
import net.mcreator.fumo.client.renderer.FlandreRenderer;
import net.mcreator.fumo.client.renderer.EikiRenderer;
import net.mcreator.fumo.client.renderer.DebugFumoRenderer;
import net.mcreator.fumo.client.renderer.CirnoRenderer;
import net.mcreator.fumo.client.renderer.ChenRenderer;
import net.mcreator.fumo.client.renderer.BlueReimuRenderer;
import net.mcreator.fumo.client.renderer.AliceRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class FumoModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(FumoModEntities.REIMU.get(), ReimuRenderer::new);
		event.registerEntityRenderer(FumoModEntities.MARISA.get(), MarisaRenderer::new);
		event.registerEntityRenderer(FumoModEntities.MARISA_HAT.get(), MarisaHatRenderer::new);
		event.registerEntityRenderer(FumoModEntities.EIKI.get(), EikiRenderer::new);
		event.registerEntityRenderer(FumoModEntities.CIRNO.get(), CirnoRenderer::new);
		event.registerEntityRenderer(FumoModEntities.TAN_CIRNO.get(), TanCirnoRenderer::new);
		event.registerEntityRenderer(FumoModEntities.DEBUG_FUMO.get(), DebugFumoRenderer::new);
		event.registerEntityRenderer(FumoModEntities.CHEN.get(), ChenRenderer::new);
		event.registerEntityRenderer(FumoModEntities.NEW_REIMU.get(), NewReimuRenderer::new);
		event.registerEntityRenderer(FumoModEntities.BLUE_REIMU.get(), BlueReimuRenderer::new);
		event.registerEntityRenderer(FumoModEntities.KOISHI.get(), KoishiRenderer::new);
		event.registerEntityRenderer(FumoModEntities.FLANDRE.get(), FlandreRenderer::new);
		event.registerEntityRenderer(FumoModEntities.MEILING.get(), MeilingRenderer::new);
		event.registerEntityRenderer(FumoModEntities.YOUMU.get(), YoumuRenderer::new);
		event.registerEntityRenderer(FumoModEntities.YUYUKO.get(), YuyukoRenderer::new);
		event.registerEntityRenderer(FumoModEntities.PATCHOULI.get(), PatchouliRenderer::new);
		event.registerEntityRenderer(FumoModEntities.NITORI.get(), NitoriRenderer::new);
		event.registerEntityRenderer(FumoModEntities.TEWI.get(), TewiRenderer::new);
		event.registerEntityRenderer(FumoModEntities.NAZRIN.get(), NazrinRenderer::new);
		event.registerEntityRenderer(FumoModEntities.SUNNY_MILK.get(), SunnyMilkRenderer::new);
		event.registerEntityRenderer(FumoModEntities.ALICE.get(), AliceRenderer::new);
	}
}

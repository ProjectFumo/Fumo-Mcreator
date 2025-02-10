
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fumo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.fumo.entity.YuyukoEntity;
import net.mcreator.fumo.entity.YoumuEntity;
import net.mcreator.fumo.entity.TewiEntity;
import net.mcreator.fumo.entity.TanCirnoEntity;
import net.mcreator.fumo.entity.SunnyMilkEntity;
import net.mcreator.fumo.entity.ReimuEntity;
import net.mcreator.fumo.entity.PatchouliEntity;
import net.mcreator.fumo.entity.NitoriEntity;
import net.mcreator.fumo.entity.NewReimuEntity;
import net.mcreator.fumo.entity.NazrinEntity;
import net.mcreator.fumo.entity.MeilingEntity;
import net.mcreator.fumo.entity.MarisaHatEntity;
import net.mcreator.fumo.entity.MarisaEntity;
import net.mcreator.fumo.entity.KoishiEntity;
import net.mcreator.fumo.entity.FlandreEntity;
import net.mcreator.fumo.entity.EikiEntity;
import net.mcreator.fumo.entity.DebugFumoEntity;
import net.mcreator.fumo.entity.CirnoEntity;
import net.mcreator.fumo.entity.ChenEntity;
import net.mcreator.fumo.entity.BlueReimuEntity;
import net.mcreator.fumo.entity.AliceEntity;
import net.mcreator.fumo.FumoMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FumoModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, FumoMod.MODID);
	public static final RegistryObject<EntityType<ReimuEntity>> REIMU = register("reimu",
			EntityType.Builder.<ReimuEntity>of(ReimuEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ReimuEntity::new).fireImmune().sized(0.5f, 1f));
	public static final RegistryObject<EntityType<MarisaEntity>> MARISA = register("marisa",
			EntityType.Builder.<MarisaEntity>of(MarisaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MarisaEntity::new).fireImmune().sized(0.5f, 1f));
	public static final RegistryObject<EntityType<MarisaHatEntity>> MARISA_HAT = register("marisa_hat",
			EntityType.Builder.<MarisaHatEntity>of(MarisaHatEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MarisaHatEntity::new).fireImmune().sized(0.5f, 1f));
	public static final RegistryObject<EntityType<EikiEntity>> EIKI = register("eiki",
			EntityType.Builder.<EikiEntity>of(EikiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EikiEntity::new).fireImmune().sized(0.5f, 1f));
	public static final RegistryObject<EntityType<CirnoEntity>> CIRNO = register("cirno",
			EntityType.Builder.<CirnoEntity>of(CirnoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CirnoEntity::new).fireImmune().sized(0.5f, 1f));
	public static final RegistryObject<EntityType<TanCirnoEntity>> TAN_CIRNO = register("tan_cirno",
			EntityType.Builder.<TanCirnoEntity>of(TanCirnoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TanCirnoEntity::new).fireImmune().sized(0.5f, 1f));
	public static final RegistryObject<EntityType<DebugFumoEntity>> DEBUG_FUMO = register("debug_fumo",
			EntityType.Builder.<DebugFumoEntity>of(DebugFumoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DebugFumoEntity::new).fireImmune().sized(0.5f, 1f));
	public static final RegistryObject<EntityType<ChenEntity>> CHEN = register("chen",
			EntityType.Builder.<ChenEntity>of(ChenEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ChenEntity::new).fireImmune().sized(0.5f, 1f));
	public static final RegistryObject<EntityType<NewReimuEntity>> NEW_REIMU = register("new_reimu",
			EntityType.Builder.<NewReimuEntity>of(NewReimuEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NewReimuEntity::new).fireImmune().sized(0.5f, 1f));
	public static final RegistryObject<EntityType<BlueReimuEntity>> BLUE_REIMU = register("blue_reimu",
			EntityType.Builder.<BlueReimuEntity>of(BlueReimuEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BlueReimuEntity::new).fireImmune().sized(0.5f, 1f));
	public static final RegistryObject<EntityType<KoishiEntity>> KOISHI = register("koishi",
			EntityType.Builder.<KoishiEntity>of(KoishiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KoishiEntity::new).fireImmune().sized(0.5f, 1f));
	public static final RegistryObject<EntityType<FlandreEntity>> FLANDRE = register("flandre",
			EntityType.Builder.<FlandreEntity>of(FlandreEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FlandreEntity::new).fireImmune().sized(0.5f, 1f));
	public static final RegistryObject<EntityType<MeilingEntity>> MEILING = register("meiling",
			EntityType.Builder.<MeilingEntity>of(MeilingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MeilingEntity::new).fireImmune().sized(0.5f, 1f));
	public static final RegistryObject<EntityType<YoumuEntity>> YOUMU = register("youmu",
			EntityType.Builder.<YoumuEntity>of(YoumuEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(YoumuEntity::new).fireImmune().sized(0.5f, 1f));
	public static final RegistryObject<EntityType<YuyukoEntity>> YUYUKO = register("yuyuko",
			EntityType.Builder.<YuyukoEntity>of(YuyukoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(YuyukoEntity::new).fireImmune().sized(0.5f, 1f));
	public static final RegistryObject<EntityType<PatchouliEntity>> PATCHOULI = register("patchouli",
			EntityType.Builder.<PatchouliEntity>of(PatchouliEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PatchouliEntity::new).fireImmune().sized(0.5f, 1f));
	public static final RegistryObject<EntityType<NitoriEntity>> NITORI = register("nitori",
			EntityType.Builder.<NitoriEntity>of(NitoriEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NitoriEntity::new).fireImmune().sized(0.5f, 1f));
	public static final RegistryObject<EntityType<TewiEntity>> TEWI = register("tewi",
			EntityType.Builder.<TewiEntity>of(TewiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TewiEntity::new).fireImmune().sized(0.5f, 1f));
	public static final RegistryObject<EntityType<NazrinEntity>> NAZRIN = register("nazrin",
			EntityType.Builder.<NazrinEntity>of(NazrinEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NazrinEntity::new).fireImmune().sized(0.5f, 1f));
	public static final RegistryObject<EntityType<SunnyMilkEntity>> SUNNY_MILK = register("sunny_milk",
			EntityType.Builder.<SunnyMilkEntity>of(SunnyMilkEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SunnyMilkEntity::new).fireImmune().sized(0.5f, 1f));
	public static final RegistryObject<EntityType<AliceEntity>> ALICE = register("alice",
			EntityType.Builder.<AliceEntity>of(AliceEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AliceEntity::new).fireImmune().sized(0.5f, 1f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			ReimuEntity.init();
			MarisaEntity.init();
			MarisaHatEntity.init();
			EikiEntity.init();
			CirnoEntity.init();
			TanCirnoEntity.init();
			DebugFumoEntity.init();
			ChenEntity.init();
			NewReimuEntity.init();
			BlueReimuEntity.init();
			KoishiEntity.init();
			FlandreEntity.init();
			MeilingEntity.init();
			YoumuEntity.init();
			YuyukoEntity.init();
			PatchouliEntity.init();
			NitoriEntity.init();
			TewiEntity.init();
			NazrinEntity.init();
			SunnyMilkEntity.init();
			AliceEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(REIMU.get(), ReimuEntity.createAttributes().build());
		event.put(MARISA.get(), MarisaEntity.createAttributes().build());
		event.put(MARISA_HAT.get(), MarisaHatEntity.createAttributes().build());
		event.put(EIKI.get(), EikiEntity.createAttributes().build());
		event.put(CIRNO.get(), CirnoEntity.createAttributes().build());
		event.put(TAN_CIRNO.get(), TanCirnoEntity.createAttributes().build());
		event.put(DEBUG_FUMO.get(), DebugFumoEntity.createAttributes().build());
		event.put(CHEN.get(), ChenEntity.createAttributes().build());
		event.put(NEW_REIMU.get(), NewReimuEntity.createAttributes().build());
		event.put(BLUE_REIMU.get(), BlueReimuEntity.createAttributes().build());
		event.put(KOISHI.get(), KoishiEntity.createAttributes().build());
		event.put(FLANDRE.get(), FlandreEntity.createAttributes().build());
		event.put(MEILING.get(), MeilingEntity.createAttributes().build());
		event.put(YOUMU.get(), YoumuEntity.createAttributes().build());
		event.put(YUYUKO.get(), YuyukoEntity.createAttributes().build());
		event.put(PATCHOULI.get(), PatchouliEntity.createAttributes().build());
		event.put(NITORI.get(), NitoriEntity.createAttributes().build());
		event.put(TEWI.get(), TewiEntity.createAttributes().build());
		event.put(NAZRIN.get(), NazrinEntity.createAttributes().build());
		event.put(SUNNY_MILK.get(), SunnyMilkEntity.createAttributes().build());
		event.put(ALICE.get(), AliceEntity.createAttributes().build());
	}
}

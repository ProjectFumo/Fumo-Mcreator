
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.projectfumo.fumo.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.registries.Registries;

import io.github.projectfumo.fumo.entity.YuyukoEntity;
import io.github.projectfumo.fumo.entity.YoumuEntity;
import io.github.projectfumo.fumo.entity.TewiEntity;
import io.github.projectfumo.fumo.entity.TanCirnoEntity;
import io.github.projectfumo.fumo.entity.SunnyMilkEntity;
import io.github.projectfumo.fumo.entity.ReimuEntity;
import io.github.projectfumo.fumo.entity.PatchouliEntity;
import io.github.projectfumo.fumo.entity.NitoriEntity;
import io.github.projectfumo.fumo.entity.NewReimuEntity;
import io.github.projectfumo.fumo.entity.NazrinEntity;
import io.github.projectfumo.fumo.entity.MeilingEntity;
import io.github.projectfumo.fumo.entity.MarisaHatEntity;
import io.github.projectfumo.fumo.entity.MarisaEntity;
import io.github.projectfumo.fumo.entity.KoishiEntity;
import io.github.projectfumo.fumo.entity.FlandreEntity;
import io.github.projectfumo.fumo.entity.EikiEntity;
import io.github.projectfumo.fumo.entity.DebugFumoEntity;
import io.github.projectfumo.fumo.entity.CirnoEntity;
import io.github.projectfumo.fumo.entity.ChenEntity;
import io.github.projectfumo.fumo.entity.BlueReimuEntity;
import io.github.projectfumo.fumo.entity.AliceEntity;
import io.github.projectfumo.fumo.FumoMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class FumoModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, FumoMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<ReimuEntity>> REIMU = register("reimu",
			EntityType.Builder.<ReimuEntity>of(ReimuEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.5f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<MarisaEntity>> MARISA = register("marisa",
			EntityType.Builder.<MarisaEntity>of(MarisaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.5f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<MarisaHatEntity>> MARISA_HAT = register("marisa_hat",
			EntityType.Builder.<MarisaHatEntity>of(MarisaHatEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.5f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<EikiEntity>> EIKI = register("eiki",
			EntityType.Builder.<EikiEntity>of(EikiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.5f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<CirnoEntity>> CIRNO = register("cirno",
			EntityType.Builder.<CirnoEntity>of(CirnoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.5f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<TanCirnoEntity>> TAN_CIRNO = register("tan_cirno",
			EntityType.Builder.<TanCirnoEntity>of(TanCirnoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.5f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<DebugFumoEntity>> DEBUG_FUMO = register("debug_fumo",
			EntityType.Builder.<DebugFumoEntity>of(DebugFumoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.5f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<ChenEntity>> CHEN = register("chen",
			EntityType.Builder.<ChenEntity>of(ChenEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.5f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<NewReimuEntity>> NEW_REIMU = register("new_reimu",
			EntityType.Builder.<NewReimuEntity>of(NewReimuEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.5f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<BlueReimuEntity>> BLUE_REIMU = register("blue_reimu",
			EntityType.Builder.<BlueReimuEntity>of(BlueReimuEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.5f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<KoishiEntity>> KOISHI = register("koishi",
			EntityType.Builder.<KoishiEntity>of(KoishiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.5f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<FlandreEntity>> FLANDRE = register("flandre",
			EntityType.Builder.<FlandreEntity>of(FlandreEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.5f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<MeilingEntity>> MEILING = register("meiling",
			EntityType.Builder.<MeilingEntity>of(MeilingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.5f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<YoumuEntity>> YOUMU = register("youmu",
			EntityType.Builder.<YoumuEntity>of(YoumuEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.5f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<YuyukoEntity>> YUYUKO = register("yuyuko",
			EntityType.Builder.<YuyukoEntity>of(YuyukoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.5f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<PatchouliEntity>> PATCHOULI = register("patchouli",
			EntityType.Builder.<PatchouliEntity>of(PatchouliEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.5f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<NitoriEntity>> NITORI = register("nitori",
			EntityType.Builder.<NitoriEntity>of(NitoriEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.5f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<TewiEntity>> TEWI = register("tewi",
			EntityType.Builder.<TewiEntity>of(TewiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.5f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<NazrinEntity>> NAZRIN = register("nazrin",
			EntityType.Builder.<NazrinEntity>of(NazrinEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.5f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<SunnyMilkEntity>> SUNNY_MILK = register("sunny_milk",
			EntityType.Builder.<SunnyMilkEntity>of(SunnyMilkEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.5f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<AliceEntity>> ALICE = register("alice",
			EntityType.Builder.<AliceEntity>of(AliceEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.5f, 1f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		ReimuEntity.init(event);
		MarisaEntity.init(event);
		MarisaHatEntity.init(event);
		EikiEntity.init(event);
		CirnoEntity.init(event);
		TanCirnoEntity.init(event);
		DebugFumoEntity.init(event);
		ChenEntity.init(event);
		NewReimuEntity.init(event);
		BlueReimuEntity.init(event);
		KoishiEntity.init(event);
		FlandreEntity.init(event);
		MeilingEntity.init(event);
		YoumuEntity.init(event);
		YuyukoEntity.init(event);
		PatchouliEntity.init(event);
		NitoriEntity.init(event);
		TewiEntity.init(event);
		NazrinEntity.init(event);
		SunnyMilkEntity.init(event);
		AliceEntity.init(event);
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


package net.mcreator.fumo.entity;

import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.common.NeoForgeMod;

import net.minecraft.world.level.pathfinder.PathType;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ThrownPotion;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.ai.navigation.WaterBoundPathNavigation;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.ai.control.MoveControl;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.AreaEffectCloud;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.fumo.procedures.FumoDespawnProcedure;
import net.mcreator.fumo.init.FumoModItems;
import net.mcreator.fumo.init.FumoModEntities;

public class SunnyMilkEntity extends Animal {
	public SunnyMilkEntity(EntityType<SunnyMilkEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);
		setPersistenceRequired();
		this.setPathfindingMalus(PathType.WATER, 0);
		this.moveControl = new MoveControl(this) {
			@Override
			public void tick() {
				if (SunnyMilkEntity.this.isInWater())
					SunnyMilkEntity.this.setDeltaMovement(SunnyMilkEntity.this.getDeltaMovement().add(0, 0.005, 0));
				if (this.operation == MoveControl.Operation.MOVE_TO && !SunnyMilkEntity.this.getNavigation().isDone()) {
					double dx = this.wantedX - SunnyMilkEntity.this.getX();
					double dy = this.wantedY - SunnyMilkEntity.this.getY();
					double dz = this.wantedZ - SunnyMilkEntity.this.getZ();
					float f = (float) (Mth.atan2(dz, dx) * (double) (180 / Math.PI)) - 90;
					float f1 = (float) (this.speedModifier * SunnyMilkEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
					SunnyMilkEntity.this.setYRot(this.rotlerp(SunnyMilkEntity.this.getYRot(), f, 10));
					SunnyMilkEntity.this.yBodyRot = SunnyMilkEntity.this.getYRot();
					SunnyMilkEntity.this.yHeadRot = SunnyMilkEntity.this.getYRot();
					if (SunnyMilkEntity.this.isInWater()) {
						SunnyMilkEntity.this.setSpeed((float) SunnyMilkEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
						float f2 = -(float) (Mth.atan2(dy, (float) Math.sqrt(dx * dx + dz * dz)) * (180 / Math.PI));
						f2 = Mth.clamp(Mth.wrapDegrees(f2), -85, 85);
						SunnyMilkEntity.this.setXRot(this.rotlerp(SunnyMilkEntity.this.getXRot(), f2, 5));
						float f3 = Mth.cos(SunnyMilkEntity.this.getXRot() * (float) (Math.PI / 180.0));
						SunnyMilkEntity.this.setZza(f3 * f1);
						SunnyMilkEntity.this.setYya((float) (f1 * dy));
					} else {
						SunnyMilkEntity.this.setSpeed(f1 * 0.05F);
					}
				} else {
					SunnyMilkEntity.this.setSpeed(0);
					SunnyMilkEntity.this.setYya(0);
					SunnyMilkEntity.this.setZza(0);
				}
			}
		};
	}

	@Override
	protected PathNavigation createNavigation(Level world) {
		return new WaterBoundPathNavigation(this, world);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();

	}

	@Override
	public boolean removeWhenFarAway(double distanceToClosestPlayer) {
		return false;
	}

	protected void dropCustomDeathLoot(ServerLevel serverLevel, DamageSource source, boolean recentlyHitIn) {
		super.dropCustomDeathLoot(serverLevel, source, recentlyHitIn);
		this.spawnAtLocation(new ItemStack(FumoModItems.SUNNY_MILK_ITEM.get()));
	}

	@Override
	public SoundEvent getDeathSound() {
		return BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.wool.break"));
	}

	@Override
	public boolean hurt(DamageSource damagesource, float amount) {
		if (damagesource.is(DamageTypes.IN_FIRE))
			return false;
		if (damagesource.getDirectEntity() instanceof AbstractArrow)
			return false;
		if (damagesource.getDirectEntity() instanceof Player)
			return false;
		if (damagesource.getDirectEntity() instanceof ThrownPotion || damagesource.getDirectEntity() instanceof AreaEffectCloud || damagesource.typeHolder().is(NeoForgeMod.POISON_DAMAGE))
			return false;
		if (damagesource.is(DamageTypes.FALL))
			return false;
		if (damagesource.is(DamageTypes.CACTUS))
			return false;
		if (damagesource.is(DamageTypes.DROWN))
			return false;
		if (damagesource.is(DamageTypes.LIGHTNING_BOLT))
			return false;
		if (damagesource.is(DamageTypes.EXPLOSION) || damagesource.is(DamageTypes.PLAYER_EXPLOSION))
			return false;
		if (damagesource.is(DamageTypes.TRIDENT))
			return false;
		if (damagesource.is(DamageTypes.FALLING_ANVIL))
			return false;
		if (damagesource.is(DamageTypes.DRAGON_BREATH))
			return false;
		if (damagesource.is(DamageTypes.WITHER) || damagesource.is(DamageTypes.WITHER_SKULL))
			return false;
		return super.hurt(damagesource, amount);
	}

	@Override
	public boolean ignoreExplosion(Explosion explosion) {
		return true;
	}

	@Override
	public boolean fireImmune() {
		return true;
	}

	@Override
	public InteractionResult mobInteract(Player sourceentity, InteractionHand hand) {
		ItemStack itemstack = sourceentity.getItemInHand(hand);
		InteractionResult retval = InteractionResult.sidedSuccess(this.level().isClientSide());
		super.mobInteract(sourceentity, hand);
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Entity entity = this;
		Level world = this.level();

		FumoDespawnProcedure.execute(world, entity, sourceentity);
		return retval;
	}

	@Override
	public AgeableMob getBreedOffspring(ServerLevel serverWorld, AgeableMob ageable) {
		SunnyMilkEntity retval = FumoModEntities.SUNNY_MILK.get().create(serverWorld);
		retval.finalizeSpawn(serverWorld, serverWorld.getCurrentDifficultyAt(retval.blockPosition()), MobSpawnType.BREEDING, null);
		return retval;
	}

	@Override
	public boolean isFood(ItemStack stack) {
		return Ingredient.of(new ItemStack(Items.MILK_BUCKET), new ItemStack(Items.COOKIE), new ItemStack(Blocks.CAKE), new ItemStack(Items.COOKED_COD), new ItemStack(Items.COOKED_SALMON), new ItemStack(Items.COOKED_PORKCHOP),
				new ItemStack(Items.COOKED_BEEF), new ItemStack(Items.COOKED_CHICKEN), new ItemStack(Items.COOKED_RABBIT), new ItemStack(Items.COOKED_MUTTON), new ItemStack(Items.COD), new ItemStack(Items.SALMON), new ItemStack(Items.CHICKEN),
				new ItemStack(Items.BEEF), new ItemStack(Items.PORKCHOP), new ItemStack(Items.RABBIT), new ItemStack(Items.MUSHROOM_STEW), new ItemStack(Items.SUSPICIOUS_STEW), new ItemStack(Items.RABBIT_STEW), new ItemStack(Items.APPLE),
				new ItemStack(Items.GOLDEN_APPLE), new ItemStack(Items.ENCHANTED_GOLDEN_APPLE), new ItemStack(Items.BAKED_POTATO), new ItemStack(Items.POTATO), new ItemStack(Blocks.WHEAT), new ItemStack(Items.WHEAT), new ItemStack(Items.BEETROOT),
				new ItemStack(Items.BEETROOT_SOUP), new ItemStack(Items.CARROT), new ItemStack(Items.GOLDEN_CARROT), new ItemStack(Items.CAKE), new ItemStack(Items.EGG), new ItemStack(Items.ZOMBIE_HEAD), new ItemStack(Items.BREAD),
				new ItemStack(Items.HONEY_BOTTLE)).test(stack);
	}

	@Override
	public boolean checkSpawnObstruction(LevelReader world) {
		return world.isUnobstructed(this);
	}

	@Override
	public boolean canDrownInFluidType(FluidType type) {
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Level world = this.level();
		Entity entity = this;
		return false;
	}

	public static void init(RegisterSpawnPlacementsEvent event) {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 2);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		builder = builder.add(Attributes.STEP_HEIGHT, 0.6);
		builder = builder.add(NeoForgeMod.SWIM_SPEED, 0.3);
		return builder;
	}
}

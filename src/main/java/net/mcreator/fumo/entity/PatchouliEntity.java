
package net.mcreator.fumo.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.common.ForgeMod;

import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
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
import net.minecraft.world.entity.MobType;
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
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;

import net.mcreator.fumo.procedures.FumoDespawnProcedure;
import net.mcreator.fumo.init.FumoModItems;
import net.mcreator.fumo.init.FumoModEntities;

import java.util.List;

public class PatchouliEntity extends Animal {
	public PatchouliEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(FumoModEntities.PATCHOULI.get(), world);
	}

	public PatchouliEntity(EntityType<PatchouliEntity> type, Level world) {
		super(type, world);
		setMaxUpStep(0.6f);
		xpReward = 0;
		setNoAi(false);
		setPersistenceRequired();
		this.setPathfindingMalus(BlockPathTypes.WATER, 0);
		this.moveControl = new MoveControl(this) {
			@Override
			public void tick() {
				if (PatchouliEntity.this.isInWater())
					PatchouliEntity.this.setDeltaMovement(PatchouliEntity.this.getDeltaMovement().add(0, 0.005, 0));
				if (this.operation == MoveControl.Operation.MOVE_TO && !PatchouliEntity.this.getNavigation().isDone()) {
					double dx = this.wantedX - PatchouliEntity.this.getX();
					double dy = this.wantedY - PatchouliEntity.this.getY();
					double dz = this.wantedZ - PatchouliEntity.this.getZ();
					float f = (float) (Mth.atan2(dz, dx) * (double) (180 / Math.PI)) - 90;
					float f1 = (float) (this.speedModifier * PatchouliEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
					PatchouliEntity.this.setYRot(this.rotlerp(PatchouliEntity.this.getYRot(), f, 10));
					PatchouliEntity.this.yBodyRot = PatchouliEntity.this.getYRot();
					PatchouliEntity.this.yHeadRot = PatchouliEntity.this.getYRot();
					if (PatchouliEntity.this.isInWater()) {
						PatchouliEntity.this.setSpeed((float) PatchouliEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
						float f2 = -(float) (Mth.atan2(dy, (float) Math.sqrt(dx * dx + dz * dz)) * (180 / Math.PI));
						f2 = Mth.clamp(Mth.wrapDegrees(f2), -85, 85);
						PatchouliEntity.this.setXRot(this.rotlerp(PatchouliEntity.this.getXRot(), f2, 5));
						float f3 = Mth.cos(PatchouliEntity.this.getXRot() * (float) (Math.PI / 180.0));
						PatchouliEntity.this.setZza(f3 * f1);
						PatchouliEntity.this.setYya((float) (f1 * dy));
					} else {
						PatchouliEntity.this.setSpeed(f1 * 0.05F);
					}
				} else {
					PatchouliEntity.this.setSpeed(0);
					PatchouliEntity.this.setYya(0);
					PatchouliEntity.this.setZza(0);
				}
			}
		};
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
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
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	@Override
	public boolean removeWhenFarAway(double distanceToClosestPlayer) {
		return false;
	}

	protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
		super.dropCustomDeathLoot(source, looting, recentlyHitIn);
		this.spawnAtLocation(new ItemStack(FumoModItems.PATCHOULI_ITEM.get()));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wool.break"));
	}

	@Override
	public boolean hurt(DamageSource source, float amount) {
		if (source.is(DamageTypes.IN_FIRE))
			return false;
		if (source.getDirectEntity() instanceof AbstractArrow)
			return false;
		if (source.getDirectEntity() instanceof Player)
			return false;
		if (source.getDirectEntity() instanceof ThrownPotion || source.getDirectEntity() instanceof AreaEffectCloud)
			return false;
		if (source.is(DamageTypes.FALL))
			return false;
		if (source.is(DamageTypes.CACTUS))
			return false;
		if (source.is(DamageTypes.DROWN))
			return false;
		if (source.is(DamageTypes.LIGHTNING_BOLT))
			return false;
		if (source.is(DamageTypes.EXPLOSION))
			return false;
		if (source.is(DamageTypes.TRIDENT))
			return false;
		if (source.is(DamageTypes.FALLING_ANVIL))
			return false;
		if (source.is(DamageTypes.DRAGON_BREATH))
			return false;
		if (source.is(DamageTypes.WITHER))
			return false;
		if (source.is(DamageTypes.WITHER_SKULL))
			return false;
		return super.hurt(source, amount);
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
		PatchouliEntity retval = FumoModEntities.PATCHOULI.get().create(serverWorld);
		retval.finalizeSpawn(serverWorld, serverWorld.getCurrentDifficultyAt(retval.blockPosition()), MobSpawnType.BREEDING, null, null);
		return retval;
	}

	@Override
	public boolean isFood(ItemStack stack) {
		return List.of(Items.MILK_BUCKET, Items.COOKIE, Blocks.CAKE.asItem(), Items.COOKED_COD, Items.COOKED_SALMON, Items.COOKED_PORKCHOP, Items.COOKED_BEEF, Items.COOKED_CHICKEN, Items.COOKED_RABBIT, Items.COOKED_MUTTON, Items.COD, Items.SALMON,
				Items.CHICKEN, Items.BEEF, Items.PORKCHOP, Items.RABBIT, Items.MUSHROOM_STEW, Items.SUSPICIOUS_STEW, Items.RABBIT_STEW, Items.APPLE, Items.GOLDEN_APPLE, Items.ENCHANTED_GOLDEN_APPLE, Items.BAKED_POTATO, Items.POTATO,
				Blocks.WHEAT.asItem(), Items.WHEAT, Items.BEETROOT, Items.BEETROOT_SOUP, Items.CARROT, Items.GOLDEN_CARROT, Items.CAKE, Items.EGG, Items.ZOMBIE_HEAD, Items.BREAD, Items.HONEY_BOTTLE).contains(stack.getItem());
	}

	@Override
	public boolean canBreatheUnderwater() {
		return true;
	}

	@Override
	public boolean checkSpawnObstruction(LevelReader world) {
		return world.isUnobstructed(this);
	}

	@Override
	public boolean isPushedByFluid() {
		return false;
	}

	public static void init() {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 2);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		builder = builder.add(ForgeMod.SWIM_SPEED.get(), 0.3);
		return builder;
	}
}

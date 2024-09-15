package io.github.tnejk.turorial_mod.enchantments.effects;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.enchantment.EnchantmentEffectContext;
import net.minecraft.enchantment.EnchantmentLevelBasedValue;
import net.minecraft.enchantment.effect.EnchantmentEntityEffect;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

public record LightningEnchantmentEffect(EnchantmentLevelBasedValue level) implements EnchantmentEntityEffect {
    public static final MapCodec<LightningEnchantmentEffect> CODEC = RecordCodecBuilder.mapCodec(
            instance -> instance.group(
                    EnchantmentLevelBasedValue.CODEC.fieldOf("level").forGetter(LightningEnchantmentEffect::level)
            ).apply(instance, LightningEnchantmentEffect::new)
    );

    @Override
    public void apply(ServerWorld world, int level, EnchantmentEffectContext context, Entity target, Vec3d pos) {
        if(target instanceof LivingEntity living && context.owner() instanceof PlayerEntity player) {
            float numOfStrikes = this.level.getValue(level);

            BlockPos targetPos = living.getBlockPos();
            for (int i = 0; i < numOfStrikes; i++) {
                EntityType.LIGHTNING_BOLT.spawn(world, targetPos, SpawnReason.TRIGGERED);
            }
        }

    }

    @Override
    public MapCodec<? extends EnchantmentEntityEffect> getCodec() {
        return CODEC;
    }
}

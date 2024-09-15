package io.github.tnejk.turorial_mod.list;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class FoodList {
    public static final FoodComponent BANANA = new FoodComponent.Builder()
            .nutrition(3)
            .saturationModifier(0.5F)
            .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING,20*10,1), 0.5F)
            .build();

    public static final FoodComponent INSTANT_NOODLES_PACKED = new FoodComponent.Builder()
            .nutrition(0)
            .saturationModifier(0)
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 20*60, 1), 1.0F)
            .build();
    public static final FoodComponent INSTANT_NOODLES_UNPACKED = new FoodComponent.Builder()
            .nutrition(1)
            .saturationModifier(0.1F)
            //.statusEffect(new StatusEffectInstance(StatusEffects.POISON, 20*60, 1), 1.0F)
            .build();
    public static final FoodComponent INSTANT_NOODLES_SPICER = new FoodComponent.Builder()
            .nutrition(0)
            .saturationModifier(0)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 5, 1), 1.0F)
            .build();
    public static final FoodComponent INSTANT_NOODLES_SPICER_BLOCK = new FoodComponent.Builder()
            .nutrition(0)
            .saturationModifier(0)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 5, 1), 1.0F)
            .build();
    public static final FoodComponent WET_INSTANT_NOODLES = new FoodComponent.Builder()
            .nutrition(2)
            .saturationModifier(0.5F)
            .build();
    public static final FoodComponent NORMAL_INSTANT_NOODLES = new FoodComponent.Builder()
            .nutrition(5)
            .saturationModifier(1.0F)
            .build();
    public static final FoodComponent FINE_INSTANT_NOODLES = new FoodComponent.Builder()
            .nutrition(7)
            .saturationModifier(1.5F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 20*5, 1), 0.05F)
            .build();
    public static final FoodComponent ULTRA_FINE_INSTANT_NOODLES = new FoodComponent.Builder()
            .nutrition(70)
            .saturationModifier(3.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 20*5, 1), 0.25F)
            .build();

}

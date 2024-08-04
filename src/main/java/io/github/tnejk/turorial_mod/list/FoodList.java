package io.github.tnejk.turorial_mod.list;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class FoodList {
    public static final FoodComponent BANANA = new FoodComponent.Builder()
            .nutrition(3)
            .saturationModifier(0.3F)
            .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING,20*10,1), 0.5F)
            .build();
}

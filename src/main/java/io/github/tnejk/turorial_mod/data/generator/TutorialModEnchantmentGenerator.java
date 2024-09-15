package io.github.tnejk.turorial_mod.data.generator;

import io.github.tnejk.turorial_mod.enchantments.effects.LightningEnchantmentEffect;
import io.github.tnejk.turorial_mod.init.EnchantmentInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition;
import net.minecraft.component.EnchantmentEffectComponentTypes;
import net.minecraft.component.type.AttributeModifierSlot;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentLevelBasedValue;
import net.minecraft.enchantment.effect.EnchantmentEffectTarget;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class TutorialModEnchantmentGenerator extends FabricDynamicRegistryProvider {
    public TutorialModEnchantmentGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup registries, Entries entries) {
        RegistryWrapper<Item> itemLookup = registries.getWrapperOrThrow(RegistryKeys.ITEM);

        register(entries, EnchantmentInit.THUNDERING_KEY, Enchantment.builder(
                Enchantment.definition(
                        itemLookup.getOrThrow(ItemTags.WEAPON_ENCHANTABLE),
                        10, //probability of showing up
                        5, // level
                        Enchantment.leveledCost(1,10), //cost per level base
                        Enchantment.leveledCost(1,15), //cost per level max
                        7, //anvil cost
                        AttributeModifierSlot.HAND
                )).addEffect(EnchantmentEffectComponentTypes.POST_ATTACK,
                EnchantmentEffectTarget.ATTACKER,
                EnchantmentEffectTarget.VICTIM,
                new LightningEnchantmentEffect(EnchantmentLevelBasedValue.linear(0.5F, 0.15F)))
        );
    }

    private static void register(Entries entries, RegistryKey<Enchantment> key, Enchantment.Builder builder, ResourceCondition... resourceConditionse){
        entries.add(key, builder.build(key.getValue()), resourceConditionse);
    }

    @Override
    public String getName() {
        return "Enchantment Generator";
    }
}

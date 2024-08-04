package io.github.tnejk.turorial_mod.init;

import io.github.tnejk.turorial_mod.TutorialMod;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class ArmorMaterialInit {

    public static final RegistryEntry<ArmorMaterial> RUBY = register("ruby",
            Map.of(ArmorItem.Type.HELMET, 4,
                    ArmorItem.Type.CHESTPLATE, 9,
                    ArmorItem.Type.LEGGINGS, 7,
                    ArmorItem.Type.BOOTS, 4),
            15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ItemInit.RUBY),
            2.0F, 5.0F,false
    );

    public static RegistryEntry<ArmorMaterial> register(String name, Map<ArmorItem.Type, Integer> defensePoints,
                                                        int enchantability, RegistryEntry<SoundEvent> equipSound,
                                                        Supplier<Ingredient> repairMaterial, float toughness,
                                                        float knockbackResistance, boolean dyable) {
        List<ArmorMaterial.Layer> layers = List.of(
                new ArmorMaterial.Layer(TutorialMod.id(name), "", dyable)
        );

        var material = new ArmorMaterial(defensePoints, enchantability, equipSound, repairMaterial, layers, toughness, knockbackResistance);

        material = Registry.register(Registries.ARMOR_MATERIAL, TutorialMod.id(name), material);

        return RegistryEntry.of(material);
    };

    public static void init() {}
}

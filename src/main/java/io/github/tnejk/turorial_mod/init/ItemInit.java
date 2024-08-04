package io.github.tnejk.turorial_mod.init;

import io.github.tnejk.turorial_mod.TutorialMod;
import io.github.tnejk.turorial_mod.list.FoodList;
import io.github.tnejk.turorial_mod.list.enums.TutorialModToolMaterials;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ItemInit {

    public static final Item BANANA = register("banana",
            new Item(new Item.Settings().food(FoodList.BANANA).maxCount(16)));
    public static final Item RUBY = register("ruby",
            new Item(new Item.Settings()));
    public static final Item RUBY_CHUNK_STONE = register("ruby_chunk_stone",
            new Item(new Item.Settings()));
    public static final Item RUBY_CHUNK_DEEPSLATE = register("ruby_chunk_deepslate",
            new Item(new Item.Settings()));
    public static final Item RUBY_CHUNK_NETHER = register("ruby_chunk_nether",
            new Item(new Item.Settings()));
    public static final Item RUBY_CHUNK_END = register("ruby_chunk_end",
            new Item(new Item.Settings()));
    public static final BowItem WOOD_BOW = register("wood_bow",
            new BowItem(new Item.Settings()));
    public static final SwordItem RUBY_SWORD = register("ruby_sword",
            new SwordItem(TutorialModToolMaterials.RUBY, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(
                            TutorialModToolMaterials.RUBY,
                            6,
                    -2.0F))));
    public static final PickaxeItem RUBY_PICKAXE = register("ruby_pickaxe",
            new PickaxeItem(TutorialModToolMaterials.RUBY, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(
                            TutorialModToolMaterials.RUBY,
                            1,-2.4F))));
    public static final AxeItem RUBY_AXE = register("ruby_axe",
            new AxeItem(TutorialModToolMaterials.RUBY, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(
                            TutorialModToolMaterials.RUBY,
                            7,
                            -3.0F))));
    public static final ShovelItem RUBY_SHOVEL = register("ruby_shovel",
            new ShovelItem(TutorialModToolMaterials.RUBY, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(
                            TutorialModToolMaterials.RUBY,
                            1,
                            -2.4F))));
    public static final HoeItem RUBY_HOE = register("ruby_hoe",
            new HoeItem(TutorialModToolMaterials.RUBY, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(
                            TutorialModToolMaterials.RUBY,
                            1,
                            -2.4F))));
    public static final ArmorItem RUBY_HELMET = register("ruby_helmet",
            new ArmorItem(ArmorMaterialInit.RUBY, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(45))));
    public static final ArmorItem RUBY_CHESTPLATE = register("ruby_chestplate",
            new ArmorItem(ArmorMaterialInit.RUBY, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(45))));
    public static final ArmorItem RUBY_LEGGINGS = register("ruby_leggings",
            new ArmorItem(ArmorMaterialInit.RUBY, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(45))));
    public static final ArmorItem RUBY_BOOTS = register("ruby_boots",
            new ArmorItem(ArmorMaterialInit.RUBY, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(45))));


    public static <T extends Item> T register(String name, T item) {
        return Registry.register(Registries.ITEM, TutorialMod.id(name), item);
    }

    public static void init() {}
}

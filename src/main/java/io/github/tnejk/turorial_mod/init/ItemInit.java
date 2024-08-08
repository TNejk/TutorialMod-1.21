package io.github.tnejk.turorial_mod.init;

import com.terraformersmc.terraform.boat.api.TerraformBoatType;
import com.terraformersmc.terraform.boat.api.client.TerraformBoatClientHelper;
import com.terraformersmc.terraform.boat.api.item.TerraformBoatItemHelper;
import com.terraformersmc.terraform.boat.impl.TerraformBoatInitializer;
import io.github.tnejk.turorial_mod.TutorialMod;
import io.github.tnejk.turorial_mod.data.custom.item.MetalDetectorItem;
import io.github.tnejk.turorial_mod.list.FoodList;
import io.github.tnejk.turorial_mod.list.enums.TutorialModToolMaterials;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;

public class ItemInit {

    public static final Item BANANA = register("banana",
            new Item(new Item.Settings().food(FoodList.BANANA).maxCount(16)));
    public static final Item RUBY = register("ruby",
            new MetalDetectorItem(new Item.Settings()));
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

    public static final SignItem OSAGE_ORANGE_SIGN = register("osage_orange_sign",
            new SignItem(new Item.Settings().maxCount(16), BlockInit.OSAGE_ORANGE_SIGN, BlockInit.OSAGE_ORANGE_WALL_SIGN));

    public static final HangingSignItem OSAGE_ORANGE_HANGING_SIGN = register("osage_orange_hanging_sign",
            new HangingSignItem(BlockInit.OSAGE_ORANGE_HANGING_SIGN, BlockInit.OSAGE_ORANGE_WALL_HANGING_SIGN, new Item.Settings().maxCount(16)));

    public static final Item OSAGE_ORANGE_STICK = register("osage_orange_stick",
            new Item(new Item.Settings()));

    private static RegistryKey<TerraformBoatType> BoatInit_OSAGE_ORANGE_BOAT_KEY;
    public static final Item OSAGE_ORANGE_BOAT = TerraformBoatItemHelper.registerBoatItem(BoatInit.OSAGE_ORANGE_BOAT_ID, BoatInit_OSAGE_ORANGE_BOAT_KEY, false);
    public static final Item OSAGE_ORANGE_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(BoatInit.OSAGE_ORANGE_CHEST_BOAT_ID, BoatInit_OSAGE_ORANGE_BOAT_KEY, true);

    public static <T extends Item> T register(String name, T item) {
        return Registry.register(Registries.ITEM, TutorialMod.id(name), item);
    }

    public static void init() {}
}

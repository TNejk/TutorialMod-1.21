package io.github.tnejk.turorial_mod.data.provider;

import io.github.tnejk.turorial_mod.init.BlockInit;
import io.github.tnejk.turorial_mod.init.ItemInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.data.server.recipe.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.SpecialCraftingRecipe;
import net.minecraft.recipe.SuspiciousStewRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class TutorialModRecipeProvider extends FabricRecipeProvider {
    public TutorialModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockInit.RUBY_BLOCK)
                .input('E', ItemInit.RUBY)
                .pattern("EEE")
                .pattern("EEE")
                .pattern("EEE")
                .criterion(hasItem(ItemInit.RUBY), conditionsFromItem(ItemInit.RUBY))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ItemInit.RUBY, 9)
                .input(BlockInit.RUBY_BLOCK)
                .criterion(hasItem(BlockInit.RUBY_BLOCK), conditionsFromItem(BlockInit.RUBY_BLOCK))
                .offerTo(exporter);

        List<ItemConvertible> modOres = List.of(ItemInit.RUBY_CHUNK_STONE,ItemInit.RUBY_CHUNK_DEEPSLATE,ItemInit.RUBY_CHUNK_NETHER,ItemInit.RUBY_CHUNK_END);

        RecipeProvider.offerBlasting(exporter,modOres,RecipeCategory.MISC,ItemInit.RUBY,0.5F,100,"example");

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ItemInit.RUBY_SWORD)
                .input('E', ItemInit.RUBY)
                .input('S', ConventionalItemTags.WOODEN_RODS)
                .pattern("E")
                .pattern("E")
                .pattern("S")
                .criterion(hasItem(ItemInit.RUBY), conditionsFromItem(ItemInit.RUBY))
                .criterion(hasTag(ConventionalItemTags.WOODEN_RODS), conditionsFromTag(ConventionalItemTags.WOODEN_RODS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ItemInit.RUBY_AXE)
                .input('E', ItemInit.RUBY)
                .input('S', ConventionalItemTags.WOODEN_RODS)
                .pattern("EE")
                .pattern("ES")
                .pattern(" S")
                .criterion(hasItem(ItemInit.RUBY), conditionsFromItem(ItemInit.RUBY))
                .criterion(hasTag(ConventionalItemTags.WOODEN_RODS), conditionsFromTag(ConventionalItemTags.WOODEN_RODS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ItemInit.RUBY_HOE)
                .input('E', ItemInit.RUBY)
                .input('S', ConventionalItemTags.WOODEN_RODS)
                .pattern("EE")
                .pattern("S ")
                .pattern("S ")
                .criterion(hasItem(ItemInit.RUBY), conditionsFromItem(ItemInit.RUBY))
                .criterion(hasTag(ConventionalItemTags.WOODEN_RODS), conditionsFromTag(ConventionalItemTags.WOODEN_RODS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ItemInit.RUBY_SHOVEL)
                .input('E', ItemInit.RUBY)
                .input('S', ConventionalItemTags.WOODEN_RODS)
                .pattern("E")
                .pattern("S")
                .pattern("S")
                .criterion(hasItem(ItemInit.RUBY), conditionsFromItem(ItemInit.RUBY))
                .criterion(hasTag(ConventionalItemTags.WOODEN_RODS), conditionsFromTag(ConventionalItemTags.WOODEN_RODS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ItemInit.RUBY_PICKAXE)
                .input('E', ItemInit.RUBY)
                .input('S', ConventionalItemTags.WOODEN_RODS)
                .pattern("EEE")
                .pattern(" S ")
                .pattern(" S ")
                .criterion(hasItem(ItemInit.RUBY), conditionsFromItem(ItemInit.RUBY))
                .criterion(hasTag(ConventionalItemTags.WOODEN_RODS), conditionsFromTag(ConventionalItemTags.WOODEN_RODS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ItemInit.RUBY_HELMET)
                .input('E', ItemInit.RUBY)
                .input('G', Items.GOLD_INGOT)
                .pattern("GEG")
                .pattern("G G")
                .pattern("   ")
                .criterion(hasItem(ItemInit.RUBY), conditionsFromItem(ItemInit.RUBY))
                .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ItemInit.RUBY_CHESTPLATE)
                .input('E', ItemInit.RUBY)
                .input('D', Items.DIAMOND)
                .pattern("D D")
                .pattern("EDE")
                .pattern("EEE")
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .criterion(hasItem(ItemInit.RUBY), conditionsFromItem(ItemInit.RUBY))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ItemInit.RUBY_LEGGINGS)
                .input('E', ItemInit.RUBY)
                .input('D', Items.DIAMOND)
                .pattern("EEE")
                .pattern("D D")
                .pattern("E E")
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .criterion(hasItem(ItemInit.RUBY), conditionsFromItem(ItemInit.RUBY))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ItemInit.RUBY_BOOTS)
                .input('E', ItemInit.RUBY)
                .input('D', Items.DIAMOND)
                .pattern("EDE")
                .pattern("E E")
                .pattern("   ")
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .criterion(hasItem(ItemInit.RUBY), conditionsFromItem(ItemInit.RUBY))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.RED_DYE, 1)
                .input(BlockInit.ROSE)
                .criterion(hasItem(BlockInit.ROSE), conditionsFromItem(BlockInit.ROSE))
                .offerTo(exporter);

    }

    private static String hasTag(TagKey<Item> tag){
        return "has_" + tag.id().toString();
    }

}

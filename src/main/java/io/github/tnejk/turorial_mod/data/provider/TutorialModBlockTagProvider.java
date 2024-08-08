package io.github.tnejk.turorial_mod.data.provider;

import io.github.tnejk.turorial_mod.init.BlockInit;
import io.github.tnejk.turorial_mod.list.TagList;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class TutorialModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public TutorialModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(BlockInit.RUBY_BLOCK)
                .add(BlockInit.RUBY_ORE_BLOCK_STONE)
                .add(BlockInit.RUBY_ORE_BLOCK_DEEPSLATE)
                .add(BlockInit.RUBY_ORE_BLOCK_NETHER)
                .add(BlockInit.RUBY_ORE_BLOCK_END);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(BlockInit.RUBY_BLOCK)
                .add(BlockInit.RUBY_ORE_BLOCK_STONE)
                .add(BlockInit.RUBY_ORE_BLOCK_DEEPSLATE)
                .add(BlockInit.RUBY_ORE_BLOCK_NETHER)
                .add(BlockInit.RUBY_ORE_BLOCK_END);

        getOrCreateTagBuilder(TagList.Blocks.MOD_TAG)
                .add(BlockInit.RUBY_BLOCK);

        getOrCreateTagBuilder(TagList.Blocks.INCORRECT_FOR_RUBY_TOOL);

        getOrCreateTagBuilder(BlockTags.SMALL_FLOWERS)
                .add(BlockInit.ROSE);

        getOrCreateTagBuilder(BlockTags.FLOWER_POTS)
                .add(BlockInit.ROSE_POT);

        getOrCreateTagBuilder(TagList.Blocks.OSAGE_ORANGE_LOGS)
                .add(BlockInit.OSAGE_ORANGE_LOG)
                .add(BlockInit.STRIPPED_OSAGE_ORANGE_LOG)
                .add(BlockInit.OSAGE_ORANGE_WOOD)
                .add(BlockInit.STRIPPED_OSAGE_ORANGE_WOOD);

        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .addTag(TagList.Blocks.OSAGE_ORANGE_LOGS);

        getOrCreateTagBuilder(BlockTags.SAPLINGS)
            .add(BlockInit.OSAGE_ORANGE_SAPLING);

        getOrCreateTagBuilder(BlockTags.LEAVES)
                .add(BlockInit.OSAGE_ORANGE_LEAVES);

        getOrCreateTagBuilder(BlockTags.WOODEN_SLABS)
            .add(BlockInit.OSAGE_ORANGE_SLAB);

        getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS)
            .add(BlockInit.OSAGE_ORANGE_STAIRS);

        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
            .add(BlockInit.OSAGE_ORANGE_FENCE);

        getOrCreateTagBuilder(BlockTags.WOODEN_DOORS)
                .add(BlockInit.OSAGE_ORANGE_DOOR);

        getOrCreateTagBuilder(BlockTags.WOODEN_TRAPDOORS)
            .add(BlockInit.OSAGE_ORANGE_TRAPDOOR);

        getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS)
            .add(BlockInit.OSAGE_ORANGE_BUTTON);

        getOrCreateTagBuilder(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(BlockInit.OSAGE_ORANGE_PRESSURE_PLATE);

        getOrCreateTagBuilder(BlockTags.STANDING_SIGNS)
            .add(BlockInit.OSAGE_ORANGE_SIGN);

        getOrCreateTagBuilder(BlockTags.WALL_SIGNS)
            .add(BlockInit.OSAGE_ORANGE_WALL_SIGN);

        getOrCreateTagBuilder(BlockTags.CEILING_HANGING_SIGNS)
                .add(BlockInit.OSAGE_ORANGE_HANGING_SIGN);

        getOrCreateTagBuilder(BlockTags.WALL_HANGING_SIGNS)
            .add(BlockInit.OSAGE_ORANGE_WALL_HANGING_SIGN);


    }
}

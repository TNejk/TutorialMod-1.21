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

        getOrCreateTagBuilder(TagList.Blocks.INCORRECT_FOR_RUBY_TOOL);

        getOrCreateTagBuilder(BlockTags.SMALL_FLOWERS)
                .add(BlockInit.ROSE);

        getOrCreateTagBuilder(BlockTags.FLOWER_POTS)
                .add(BlockInit.ROSE_POT);

    }
}

package io.github.tnejk.turorial_mod.data.provider;

import io.github.tnejk.turorial_mod.init.BlockInit;
import io.github.tnejk.turorial_mod.init.ItemInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.math.intprovider.UniformIntProvider;

import java.util.concurrent.CompletableFuture;

public class TutorialModBlockLootTableProvider extends FabricBlockLootTableProvider {
    public TutorialModBlockLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(BlockInit.RUBY_BLOCK);
        addDrop(BlockInit.RUBY_ORE_BLOCK_STONE, ItemInit.RUBY_CHUNK_STONE);
        addDrop(BlockInit.RUBY_ORE_BLOCK_DEEPSLATE, ItemInit.RUBY_CHUNK_DEEPSLATE);
        addDrop(BlockInit.RUBY_ORE_BLOCK_NETHER, ItemInit.RUBY_CHUNK_NETHER);
        addDrop(BlockInit.RUBY_ORE_BLOCK_END, ItemInit.RUBY_CHUNK_END);
        addDrop(BlockInit.ROSE);
        addPottedPlantDrops(BlockInit.ROSE_POT);

        addDrop(BlockInit.OSAGE_ORANGE_LOG);
        addDrop(BlockInit.STRIPPED_OSAGE_ORANGE_LOG);
        addDrop(BlockInit.OSAGE_ORANGE_WOOD);
        addDrop(BlockInit.STRIPPED_OSAGE_ORANGE_WOOD);
        addDrop(Blocks.OAK_LEAVES, block -> this.oakLeavesDrops(block, Blocks.OAK_SAPLING, SAPLING_DROP_CHANCE));
        addDrop(BlockInit.OSAGE_ORANGE_SAPLING);
        addDrop(BlockInit.OSAGE_ORANGE_BUTTON);
        addDrop(BlockInit.OSAGE_ORANGE_DOOR, this::doorDrops);
        addDrop(BlockInit.OSAGE_ORANGE_TRAPDOOR);
        addDrop(BlockInit.OSAGE_ORANGE_FENCE);
        addDrop(BlockInit.OSAGE_ORANGE_FENCE_GATE);
        addDrop(BlockInit.OSAGE_ORANGE_SLAB);
        addDrop(BlockInit.OSAGE_ORANGE_STAIRS);
        addDrop(BlockInit.OSAGE_ORANGE_PLANKS);
        addDrop(BlockInit.OSAGE_ORANGE_PRESSURE_PLATE);
        addDrop(BlockInit.OSAGE_ORANGE_SIGN, ItemInit.OSAGE_ORANGE_SIGN);
        addDrop(BlockInit.OSAGE_ORANGE_WALL_SIGN, ItemInit.OSAGE_ORANGE_SIGN);
        addDrop(BlockInit.OSAGE_ORANGE_HANGING_SIGN, ItemInit.OSAGE_ORANGE_HANGING_SIGN);
        addDrop(BlockInit.OSAGE_ORANGE_WALL_HANGING_SIGN, ItemInit.OSAGE_ORANGE_HANGING_SIGN);



    }

}

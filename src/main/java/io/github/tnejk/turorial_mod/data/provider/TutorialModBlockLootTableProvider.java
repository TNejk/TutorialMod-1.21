package io.github.tnejk.turorial_mod.data.provider;

import io.github.tnejk.turorial_mod.init.BlockInit;
import io.github.tnejk.turorial_mod.init.ItemInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class TutorialModBlockLootTableProvider extends FabricBlockLootTableProvider {
    public TutorialModBlockLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        drops(BlockInit.RUBY_BLOCK);
        addDrop(BlockInit.RUBY_ORE_BLOCK_STONE, ItemInit.RUBY_CHUNK_STONE);
        addDrop(BlockInit.RUBY_ORE_BLOCK_DEEPSLATE, ItemInit.RUBY_CHUNK_DEEPSLATE);
        addDrop(BlockInit.RUBY_ORE_BLOCK_NETHER, ItemInit.RUBY_CHUNK_NETHER);
        addDrop(BlockInit.RUBY_ORE_BLOCK_END, ItemInit.RUBY_CHUNK_END);
        addDrop(BlockInit.ROSE);
        addPottedPlantDrops(BlockInit.ROSE_POT);
    }
}

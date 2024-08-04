package io.github.tnejk.turorial_mod.data.provider;

import io.github.tnejk.turorial_mod.init.BlockInit;
import io.github.tnejk.turorial_mod.init.ItemInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class TutorialModModelProvider extends FabricModelProvider {

    public TutorialModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.RUBY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.RUBY_ORE_BLOCK_STONE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.RUBY_ORE_BLOCK_DEEPSLATE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.RUBY_ORE_BLOCK_NETHER);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.RUBY_ORE_BLOCK_END);
        blockStateModelGenerator.registerFlowerPotPlant(BlockInit.ROSE, BlockInit.ROSE_POT, BlockStateModelGenerator.TintType.NOT_TINTED);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ItemInit.RUBY, Models.GENERATED);
        itemModelGenerator.register(ItemInit.BANANA, Models.GENERATED);
        itemModelGenerator.register(ItemInit.RUBY_CHUNK_STONE, Models.GENERATED);
        itemModelGenerator.register(ItemInit.RUBY_CHUNK_DEEPSLATE, Models.GENERATED);
        itemModelGenerator.register(ItemInit.RUBY_CHUNK_NETHER, Models.GENERATED);
        itemModelGenerator.register(ItemInit.RUBY_CHUNK_END, Models.GENERATED);
        itemModelGenerator.register(ItemInit.RUBY_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.RUBY_AXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.RUBY_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.RUBY_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.RUBY_HOE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.RUBY_HELMET, Models.GENERATED);
        itemModelGenerator.register(ItemInit.RUBY_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ItemInit.RUBY_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ItemInit.RUBY_BOOTS, Models.GENERATED);

    }
}

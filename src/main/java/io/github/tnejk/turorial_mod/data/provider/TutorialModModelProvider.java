package io.github.tnejk.turorial_mod.data.provider;

import io.github.tnejk.turorial_mod.init.BlockInit;
import io.github.tnejk.turorial_mod.init.ItemInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.family.BlockFamily;

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

        blockStateModelGenerator.registerLog(BlockInit.OSAGE_ORANGE_LOG)
                .log(BlockInit.OSAGE_ORANGE_LOG)
                .wood(BlockInit.OSAGE_ORANGE_WOOD);
        blockStateModelGenerator.registerLog(BlockInit.STRIPPED_OSAGE_ORANGE_LOG)
                .log(BlockInit.STRIPPED_OSAGE_ORANGE_LOG)
                .wood(BlockInit.STRIPPED_OSAGE_ORANGE_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.OSAGE_ORANGE_LEAVES);
        blockStateModelGenerator.registerTintableCross(BlockInit.OSAGE_ORANGE_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerHangingSign(BlockInit.STRIPPED_OSAGE_ORANGE_LOG, BlockInit.OSAGE_ORANGE_HANGING_SIGN, BlockInit.OSAGE_ORANGE_WALL_HANGING_SIGN);

        var osageOrangeFamily = new BlockFamily.Builder(BlockInit.OSAGE_ORANGE_PLANKS)
                .button(BlockInit.OSAGE_ORANGE_BUTTON)
                .fence(BlockInit.OSAGE_ORANGE_FENCE)
                .fenceGate(BlockInit.OSAGE_ORANGE_FENCE_GATE)
                .pressurePlate(BlockInit.OSAGE_ORANGE_PRESSURE_PLATE)
                .sign(BlockInit.OSAGE_ORANGE_SIGN, BlockInit.OSAGE_ORANGE_WALL_SIGN)
                .slab(BlockInit.OSAGE_ORANGE_SLAB)
                .stairs(BlockInit.OSAGE_ORANGE_STAIRS)
                .door(BlockInit.OSAGE_ORANGE_DOOR)
                .trapdoor(BlockInit.OSAGE_ORANGE_TRAPDOOR)
                .group("wooden")
                .unlockCriterionName("has_planks")
                .build();

        blockStateModelGenerator.registerCubeAllModelTexturePool(osageOrangeFamily.getBaseBlock()).family(osageOrangeFamily);
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
        itemModelGenerator.register(ItemInit.OSAGE_ORANGE_BOAT, Models.GENERATED);
        itemModelGenerator.register(ItemInit.OSAGE_ORANGE_CHEST_BOAT, Models.GENERATED);
        itemModelGenerator.register(ItemInit.OSAGE_ORANGE_STICK, Models.HANDHELD);

    }


}

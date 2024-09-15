package io.github.tnejk.turorial_mod.init.worldgen;

import io.github.tnejk.turorial_mod.TutorialMod;
import io.github.tnejk.turorial_mod.init.BlockInit;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.util.math.noise.DoublePerlinNoiseSampler;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.AcaciaFoliagePlacer;
import net.minecraft.world.gen.foliage.FoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.stateprovider.NoiseBlockStateProvider;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.trunk.DarkOakTrunkPlacer;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;

public class ConfiguredFeatureInit {
    public static final RegistryKey<ConfiguredFeature<?, ?>> MOD_OVERWORLD_ORE_KEY = registerKey("mod_overworld_ore_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MOD_NETHER_ORE_KEY = registerKey("mod_nether_ore_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MOD_END_ORE_KEY = registerKey("mod_end_ore_key");

    public static final RegistryKey<ConfiguredFeature<?,?>> ROSE_KEY = registerKey("rose_key");
    public static final RegistryKey<ConfiguredFeature<?,?>> ROSE_PATCH_KEY = registerKey("rose_patch_key");

    public static final RegistryKey<ConfiguredFeature<?, ?>> OSAGE_ORANGE_TREE_KEY = registerKey("osage_orange_tree_key");

    public static void bootstrap(Registerable<ConfiguredFeature<? , ?>> context){
        RuleTest modStoneOreReplacables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest modDeepslateOreReplacables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest modNetherOreReplacables = new TagMatchRuleTest(BlockTags.BASE_STONE_NETHER);
        RuleTest modEndOreReplacables = new BlockMatchRuleTest(Blocks.END_STONE);

        List<OreFeatureConfig.Target> modOverworldTargets = List.of(
                OreFeatureConfig.createTarget(modStoneOreReplacables, BlockInit.RUBY_ORE_BLOCK_STONE.getDefaultState()),
                OreFeatureConfig.createTarget(modDeepslateOreReplacables, BlockInit.RUBY_ORE_BLOCK_DEEPSLATE.getDefaultState())
        );

        List<OreFeatureConfig.Target> modNetherTargets = List.of(
                OreFeatureConfig.createTarget(modNetherOreReplacables, BlockInit.RUBY_ORE_BLOCK_NETHER.getDefaultState())
        );

        List<OreFeatureConfig.Target> modEndTargets = List.of(
                OreFeatureConfig.createTarget(modEndOreReplacables, BlockInit.RUBY_ORE_BLOCK_END.getDefaultState())
        );

        register(context, MOD_OVERWORLD_ORE_KEY, Feature.SCATTERED_ORE, new OreFeatureConfig(modOverworldTargets,3));
        register(context, MOD_NETHER_ORE_KEY, Feature.SCATTERED_ORE, new OreFeatureConfig(modNetherTargets,3));
        register(context, MOD_END_ORE_KEY, Feature.SCATTERED_ORE, new OreFeatureConfig(modEndTargets,3));

        RegistryEntryLookup<PlacedFeature> registryLookup = context.getRegistryLookup(RegistryKeys.PLACED_FEATURE);
        register(context, ROSE_KEY, Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(
                new NoiseBlockStateProvider(
                        696969L,
                        new DoublePerlinNoiseSampler.NoiseParameters(0, 1.0),
                        0.020833334F,
                        List.of(BlockInit.ROSE.getDefaultState(),
                                Blocks.POPPY.getDefaultState(),
                                Blocks.RED_TULIP.getDefaultState()
                        ))));
        register(context, ROSE_PATCH_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(
                64,10, 4,registryLookup.getOrThrow(PlacedFeatureInit.ROSE_KEY)
        ));

        register(context, OSAGE_ORANGE_TREE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                SimpleBlockStateProvider.of(BlockInit.OSAGE_ORANGE_LOG),
                new DarkOakTrunkPlacer(8, 6, 16), // base, first random, second random
                SimpleBlockStateProvider.of(BlockInit.OSAGE_ORANGE_LEAVES),
                new AcaciaFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0)),
                new TwoLayersFeatureSize(3, 0, 3))
                .build()
        );

    }

    private static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, TutorialMod.id(name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context, RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC featureConfig) {
        context.register(key, new ConfiguredFeature<>(feature, featureConfig));
    }
}

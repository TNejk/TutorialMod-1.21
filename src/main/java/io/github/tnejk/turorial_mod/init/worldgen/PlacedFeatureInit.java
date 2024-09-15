package io.github.tnejk.turorial_mod.init.worldgen;

import io.github.tnejk.turorial_mod.TutorialMod;
import io.github.tnejk.turorial_mod.init.BlockInit;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.blockpredicate.BlockPredicate;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class PlacedFeatureInit {

    public static final RegistryKey<PlacedFeature> MOD_OVERWORLD_ORE_KEY = registryKey("mod_overworld_ore_key");
    public static final RegistryKey<PlacedFeature> MOD_NETHER_ORE_KEY = registryKey("mod_nether_ore_key");
    public static final RegistryKey<PlacedFeature> MOD_END_ORE_KEY = registryKey("mod_end_ore_key");

    public static final RegistryKey<PlacedFeature> ROSE_KEY = registryKey("rose_key");
    public static final RegistryKey<PlacedFeature> ROSE_PATCH_KEY = registryKey("rose_patch_key");

    public static final RegistryKey<PlacedFeature> OSAGE_ORANGE_TREE_KEY = registryKey("osage_orange_tree_key");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        RegistryEntryLookup<ConfiguredFeature<?,?>> registryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, MOD_OVERWORLD_ORE_KEY, registryLookup.getOrThrow(ConfiguredFeatureInit.MOD_OVERWORLD_ORE_KEY),
                Modifiers.modifiersWithCount(9,HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(64)))
        );
        register(context, MOD_NETHER_ORE_KEY, registryLookup.getOrThrow(ConfiguredFeatureInit.MOD_NETHER_ORE_KEY),
                Modifiers.modifiersWithCount(9,HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(128)))
        );
        register(context, MOD_END_ORE_KEY, registryLookup.getOrThrow(ConfiguredFeatureInit.MOD_END_ORE_KEY),
                Modifiers.modifiersWithCount(9,HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(128)))
        );
        register(context, ROSE_KEY, registryLookup.getOrThrow(ConfiguredFeatureInit.ROSE_KEY), List.of(BlockFilterPlacementModifier.of(BlockPredicate.IS_AIR)));
        register(context, ROSE_PATCH_KEY, registryLookup.getOrThrow(ConfiguredFeatureInit.ROSE_PATCH_KEY), List.of(
                RarityFilterPlacementModifier.of(64),
                SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
                BiomePlacementModifier.of()
        ));
        register(context, OSAGE_ORANGE_TREE_KEY, registryLookup.getOrThrow(ConfiguredFeatureInit.OSAGE_ORANGE_TREE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(1, 0.5F,3),
                        BlockInit.OSAGE_ORANGE_SAPLING
                ));
    }

    private static RegistryKey<PlacedFeature> registryKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, TutorialMod.id(name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> config, List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(config, List.copyOf(modifiers)));
    }

    public static class Modifiers {

        public static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
            return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
        }

        public static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
            return modifiers(CountPlacementModifier.of(count), heightModifier);
        }

        public static List<PlacementModifier> modifiersWithRarity(int chance, PlacementModifier heightModifier) {
            return modifiers(RarityFilterPlacementModifier.of(chance), heightModifier);
        }
    }

}

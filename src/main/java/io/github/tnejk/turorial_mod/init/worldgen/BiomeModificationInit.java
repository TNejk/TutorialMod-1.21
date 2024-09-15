package io.github.tnejk.turorial_mod.init.worldgen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.tag.BiomeTags;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class BiomeModificationInit {
    public static void init(){
        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES,
                PlacedFeatureInit.MOD_OVERWORLD_ORE_KEY
        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInTheNether(),
                GenerationStep.Feature.UNDERGROUND_ORES,
                PlacedFeatureInit.MOD_NETHER_ORE_KEY
        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInTheEnd(),
                GenerationStep.Feature.UNDERGROUND_ORES,
                PlacedFeatureInit.MOD_END_ORE_KEY
        );

        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.VEGETAL_DECORATION,
                PlacedFeatureInit.ROSE_PATCH_KEY
        );

        BiomeModifications.addFeature(
                BiomeSelectors.includeByKey(BiomeKeys.SAVANNA).or(BiomeSelectors.tag(BiomeTags.IS_SAVANNA)),
                GenerationStep.Feature.VEGETAL_DECORATION,
                PlacedFeatureInit.OSAGE_ORANGE_TREE_KEY
        );
    }
}

package io.github.tnejk.turorial_mod;

import io.github.tnejk.turorial_mod.data.generator.TutorialModEnchantmentGenerator;
import io.github.tnejk.turorial_mod.data.generator.TutorialModWorldGenerator;
import io.github.tnejk.turorial_mod.data.provider.*;
import io.github.tnejk.turorial_mod.init.worldgen.ConfiguredFeatureInit;
import io.github.tnejk.turorial_mod.init.worldgen.PlacedFeatureInit;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class TutorialModDataGenerator implements DataGeneratorEntrypoint {

	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {

		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(TutorialModModelProvider::new);
		pack.addProvider(TutorialModEnglishLanguageProvider::new);
		pack.addProvider(TutorialModBlockLootTableProvider::new);
		pack.addProvider(TutorialModBlockTagProvider::new);
		pack.addProvider(TutorialModItemTagProvider::new);
		pack.addProvider(TutorialModWorldGenerator::new);
		pack.addProvider(TutorialModRecipeProvider::new);
		pack.addProvider(TutorialModEnchantmentGenerator::new);


	}

	@Override
	public void buildRegistry(RegistryBuilder regisdtryBuilder){
		regisdtryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, ConfiguredFeatureInit::bootstrap);
		regisdtryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, PlacedFeatureInit::bootstrap);
	}
}

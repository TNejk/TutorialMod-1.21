package io.github.tnejk.turorial_mod;

import io.github.tnejk.turorial_mod.data.generator.TutorialModWorldGenerator;
import io.github.tnejk.turorial_mod.data.provider.*;
import io.github.tnejk.turorial_mod.init.worldgen.ConfiguredFeatureInit;
import io.github.tnejk.turorial_mod.init.worldgen.PlacedFeatureInit;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.BuiltinRegistries;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Util;

import java.util.concurrent.CompletableFuture;

public class TutorialModDataGenerator implements DataGeneratorEntrypoint {

	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {

		CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture = CompletableFuture.supplyAsync(
				BuiltinRegistries::createWrapperLookup, Util.getMainWorkerExecutor()
		);
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();


		pack.addProvider(TutorialModModelProvider::new);
		pack.addProvider(TutorialModEnglishLanguageProvider::new);
		pack.addProvider(TutorialModBlockLootTableProvider::new);
		pack.addProvider(TutorialModWorldGenerator::new);
		pack.addProvider(TutorialModRecipeProvider::new);

		TutorialModBlockTagProvider tagProvider = pack.addProvider(TutorialModBlockTagProvider::new);
		TutorialModItemTagProvider tagProvider1 = pack.addProvider((FabricDataGenerator.Pack.Factory<TutorialModItemTagProvider>) output -> new TutorialModItemTagProvider(output,completableFuture, tagProvider.getTagLookupFuture()));

	}

	@Override
	public void buildRegistry(RegistryBuilder regisdtryBuilder){
		regisdtryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, ConfiguredFeatureInit::bootstrap);
		regisdtryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, PlacedFeatureInit::bootstrap);
	}
}

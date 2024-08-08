package io.github.tnejk.turorial_mod;

import io.github.tnejk.turorial_mod.init.*;
import io.github.tnejk.turorial_mod.init.worldgen.BiomeModificationInit;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("tutorial_mod");
	public static final String MOD_ID = "tutorial_mod";

	@Override
	public void onInitialize() {

		ItemInit.init();
		BlockInit.init();
		ItemGroupInit.init();
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
			entries.addAfter(Items.ENCHANTED_GOLDEN_APPLE, ItemInit.BANANA);
		});
		ArmorMaterialInit.init();
		BiomeModificationInit.init();
		BoatInit.init();

	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID,path);
	}
}
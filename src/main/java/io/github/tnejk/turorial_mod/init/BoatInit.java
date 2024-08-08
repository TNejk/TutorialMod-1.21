package io.github.tnejk.turorial_mod.init;

import com.terraformersmc.terraform.boat.api.TerraformBoatType;
import com.terraformersmc.terraform.boat.api.TerraformBoatTypeRegistry;
import io.github.tnejk.turorial_mod.TutorialMod;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class BoatInit {

    public static final Identifier OSAGE_ORANGE_BOAT_ID = TutorialMod.id("osage_orange_boat");
    public static final Identifier OSAGE_ORANGE_CHEST_BOAT_ID = TutorialMod.id("osage_orange_chest_boat");
    public static final RegistryKey<TerraformBoatType> OSAGE_ORANGE_BOAT_KEY = TerraformBoatTypeRegistry.createKey(OSAGE_ORANGE_BOAT_ID);


    public static final TerraformBoatType OSAGE_ORANGE_TYPE = register(OSAGE_ORANGE_BOAT_KEY, new TerraformBoatType.Builder()
            .item(ItemInit.OSAGE_ORANGE_BOAT)
            .chestItem(ItemInit.OSAGE_ORANGE_CHEST_BOAT)
            .planks(BlockInit.OSAGE_ORANGE_PLANKS.asItem())
            .build()
    );

    public static TerraformBoatType register(RegistryKey<TerraformBoatType> key, TerraformBoatType type) {
        return Registry.register(TerraformBoatTypeRegistry.INSTANCE, key, type);
    }

    public static void init() {}
}

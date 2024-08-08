package io.github.tnejk.turorial_mod;

import com.terraformersmc.terraform.boat.api.client.TerraformBoatClientHelper;
import com.terraformersmc.terraform.boat.api.item.TerraformBoatItemHelper;
import io.github.tnejk.turorial_mod.init.BlockInit;
import io.github.tnejk.turorial_mod.init.BoatInit;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class TutorialModClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {

		// BLock
		BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),
				BlockInit.ROSE, BlockInit.ROSE_POT,
				BlockInit.OSAGE_ORANGE_DOOR, BlockInit.OSAGE_ORANGE_TRAPDOOR,
				BlockInit.OSAGE_ORANGE_SAPLING, BlockInit.OSAGE_ORANGE_LEAVES
		);

		// Model
		TerraformBoatClientHelper.registerModelLayers(BoatInit.OSAGE_ORANGE_BOAT_ID, false);

	}
}
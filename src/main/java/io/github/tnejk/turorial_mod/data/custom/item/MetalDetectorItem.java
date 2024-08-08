package io.github.tnejk.turorial_mod.data.custom.item;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;

public class MetalDetectorItem extends Item {
    public MetalDetectorItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if(!context.getWorld().isClient) {
            BlockPos pos = context.getBlockPos();
            PlayerEntity player = context.getPlayer();
            boolean found = false;


            for(int i = 0; i<= pos.getY() + 64; i++) {
                BlockState state = context.getWorld().getBlockState(pos.down(i));

                if(isValuableBlock(state)) {
                    outputValuableCords(pos.down(i), player, state.getBlock());
                    found = true;

                    break;
                }
            }
            if(!found) {
                player.sendMessage(Text.literal("No Valuable Block Found"), true);
            }
        }



        return ActionResult.SUCCESS;
    }

    private void outputValuableCords(BlockPos blockPos, PlayerEntity player, Block block) {
        player.sendMessage(Text.literal("Found " + block.asItem().getName().getString() + " at (" + blockPos.getX()+","+blockPos.getY()+","+blockPos.getZ()+")"), false);
    }

    private boolean isValuableBlock(BlockState state) {
        return state.isOf(Blocks.IRON_ORE) || state.isOf(Blocks.DEEPSLATE_IRON_ORE) || state.isOf(Blocks.DIAMOND_ORE) || state.isOf(Blocks.DEEPSLATE_DIAMOND_ORE);
    }
}

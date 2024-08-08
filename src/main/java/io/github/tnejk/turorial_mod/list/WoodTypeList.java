package io.github.tnejk.turorial_mod.list;

import io.github.tnejk.turorial_mod.TutorialMod;
import net.minecraft.block.WoodType;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;

public class WoodTypeList {
    public static final WoodType OSAGE_ORANGE = new WoodType(
            TutorialMod.id("osage_orange").toString(),
            BlockSetTypeList.OSAGE_ORANGE,
            BlockSoundGroup.WOOD,
            BlockSoundGroup.HANGING_SIGN,
            SoundEvents.BLOCK_FENCE_GATE_CLOSE,
            SoundEvents.BLOCK_FENCE_GATE_OPEN
    );
}

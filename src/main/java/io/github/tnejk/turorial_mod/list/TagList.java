package io.github.tnejk.turorial_mod.list;

import io.github.tnejk.turorial_mod.TutorialMod;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;

public class TagList {
    public static class Blocks{
        public static final TagKey<Block> INCORRECT_FOR_RUBY_TOOL = TagKey.of(RegistryKeys.BLOCK, TutorialMod.id("incorrect_for_ruby_tool"));
        public static final TagKey<Block> MOD_TAG = TagKey.of(RegistryKeys.BLOCK, TutorialMod.id("mod_tag"));
    }
}

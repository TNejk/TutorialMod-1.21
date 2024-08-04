package io.github.tnejk.turorial_mod.init;

import io.github.tnejk.turorial_mod.TutorialMod;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.component.type.SuspiciousStewEffectsComponent;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;

import java.util.List;

public class BlockInit {

    public static final Block RUBY_BLOCK = registerWithItem("ruby_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(5.0F, 6.0F)
                    .requiresTool()
                    .sounds(BlockSoundGroup.NETHERITE)
            ));
    public static final Block RUBY_ORE_BLOCK_STONE = registerWithItem("ruby_ore_block_stone",
            new Block(AbstractBlock.Settings.create()
                    .strength(4.5F, 3.0F)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)
            ));
    public static final Block RUBY_ORE_BLOCK_DEEPSLATE = registerWithItem("ruby_ore_block_deepslate",
            new Block(AbstractBlock.Settings.create()
                    .strength(5.0F, 4.5F)
                    .requiresTool()
                    .sounds(BlockSoundGroup.DEEPSLATE)
            ));
    public static final Block RUBY_ORE_BLOCK_NETHER = registerWithItem("ruby_ore_block_nether",
            new Block(AbstractBlock.Settings.create()
                    .strength(4.5F, 3.0F)
                    .requiresTool()
                    .sounds(BlockSoundGroup.NETHER_ORE)
            ));
    public static final Block RUBY_ORE_BLOCK_END = registerWithItem("ruby_ore_block_end",
            new Block(AbstractBlock.Settings.create()
                    .strength(7.5F, 10.0F)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final FlowerBlock ROSE = registerWithItem("rose",
            new FlowerBlock(
                    createSusStewEffect(
                            new SuspiciousStewEffectsComponent.StewEffect(StatusEffects.BLINDNESS, 400),
                            new SuspiciousStewEffectsComponent.StewEffect(StatusEffects.LEVITATION, 400)
                    ),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.RED)
                            .noCollision()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.GRASS)
                            .offset(AbstractBlock.OffsetType.XZ)
                            .pistonBehavior(PistonBehavior.DESTROY))
            );

    public static final Block ROSE_POT = register("rose_pot",
            (FlowerPotBlock) Blocks.createFlowerPotBlock(ROSE));

    public static <T extends Block> T register(String name, T block) {
        return Registry.register(Registries.BLOCK, TutorialMod.id(name), block);
    }

    public static <T extends Block> T registerWithItem(String name, T block, Item.Settings settings) {
        T registered = register(name, block);
        ItemInit.register(name, new BlockItem(registered, settings));
        return registered;
    }

    public static <T extends Block> T registerWithItem(String name, T block) {
        return registerWithItem(name, block, new Item.Settings());
    }

    private static SuspiciousStewEffectsComponent createSusStewEffect(SuspiciousStewEffectsComponent.StewEffect... effects) {
        return new SuspiciousStewEffectsComponent(List.of(effects));
    }

    public static void init() {}
}

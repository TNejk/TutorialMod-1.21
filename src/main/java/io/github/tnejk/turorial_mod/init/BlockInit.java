package io.github.tnejk.turorial_mod.init;

import com.terraformersmc.terraform.sign.api.block.TerraformHangingSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformWallHangingSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformWallSignBlock;
import io.github.tnejk.turorial_mod.TutorialMod;
import io.github.tnejk.turorial_mod.list.BlockSetTypeList;
import io.github.tnejk.turorial_mod.list.WoodTypeList;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.component.type.SuspiciousStewEffectsComponent;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.awt.*;
import java.util.List;

import static net.minecraft.block.Blocks.createLeavesBlock;

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

    public static final Block OSAGE_ORANGE_LOG = registerWithItem("osage_orange_log",
            Blocks.createLogBlock(MapColor.YELLOW, MapColor.PALE_YELLOW));

    public static final Block STRIPPED_OSAGE_ORANGE_LOG = registerWithItem("stripped_osage_orange_log",
            Blocks.createLogBlock(MapColor.YELLOW, MapColor.PALE_YELLOW));

    public static final Block OSAGE_ORANGE_WOOD = register("osage_orange_wood",
            new PillarBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.PALE_YELLOW)
                    .instrument(NoteBlockInstrument.BANJO)
                    .strength(3.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));

    public static final Block STRIPPED_OSAGE_ORANGE_WOOD = register("stripped_osage_orange_wood",
            new PillarBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.PALE_YELLOW)
                    .instrument(NoteBlockInstrument.BANJO)
                    .strength(3.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));

    public static final Block OSAGE_ORANGE_LEAVES = registerWithItem("osage_orange_leaves",
            createLeavesBlock(BlockSoundGroup.CHERRY_LEAVES
            ));

    public static final SaplingBlock OSAGE_ORANGE_SAPLING = registerWithItem("osage_orange_sapling",
            new SaplingBlock(
                    null,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_GREEN)
                            .ticksRandomly()
                            .strength(0.0F)
                            .sounds(BlockSoundGroup.CHERRY_SAPLING)
                            .nonOpaque()
                            .allowsSpawning(Blocks::canSpawnOnLeaves)
                            .suffocates(Blocks::never)
                            .blockVision(Blocks::never)
                            .burnable()
                            .pistonBehavior(PistonBehavior.DESTROY)
                            .solidBlock(Blocks::never)
                            .noCollision()));

    public static final Block OSAGE_ORANGE_PLANKS = registerWithItem("osage_orange_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)
                    .mapColor(MapColor.PALE_YELLOW)));

    public static final DoorBlock OSAGE_ORANGE_DOOR = registerWithItem("osage_orange_door",
            new DoorBlock(
                    BlockSetTypeList.OSAGE_ORANGE,
                    AbstractBlock.Settings.create()
                            .mapColor(OSAGE_ORANGE_PLANKS.getDefaultMapColor())
                            .instrument(NoteBlockInstrument.BANJO)
                            .strength(3.0F)
                            .nonOpaque()
                            .burnable()
                            .pistonBehavior(PistonBehavior.NORMAL)));

    public static final FenceBlock OSAGE_ORANGE_FENCE = registerWithItem("osage_orange_fence",
            new FenceBlock(AbstractBlock.Settings.create()
                    .mapColor(OSAGE_ORANGE_PLANKS.getDefaultMapColor())
                    .solid()
                    .instrument(NoteBlockInstrument.BANJO)
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()
            ));

    public static final FenceGateBlock OSAGE_ORANGE_FENCE_GATE = registerWithItem("osage_orange_fence_gate",
            new FenceGateBlock(WoodTypeList.OSAGE_ORANGE,
                    AbstractBlock.Settings.create()
                            .mapColor(OSAGE_ORANGE_PLANKS.getDefaultMapColor())
                            .solid()
                            .instrument(NoteBlockInstrument.BANJO)
                            .strength(2.0F, 3.0F)
                            .sounds(BlockSoundGroup.WOOD)
                            .burnable()
            ));

    public static final StairsBlock OSAGE_ORANGE_STAIRS = registerWithItem("osage_orange_stairs",
            new StairsBlock(OSAGE_ORANGE_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.OAK_STAIRS).mapColor(OSAGE_ORANGE_PLANKS.getDefaultMapColor())));

    public static final SlabBlock OSAGE_ORANGE_SLAB = registerWithItem("osage_orange_slab",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(OSAGE_ORANGE_PLANKS.getDefaultMapColor())
                    .mapColor(MapColor.PALE_YELLOW)
                    .instrument(NoteBlockInstrument.BANJO)
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));

    public static final PressurePlateBlock OSAGE_ORANGE_PRESSURE_PLATE = registerWithItem("osage_orange_pressure_plate",
            new PressurePlateBlock(BlockSetTypeList.OSAGE_ORANGE, AbstractBlock.Settings.create()
                    .mapColor(OSAGE_ORANGE_PLANKS.getDefaultMapColor())
                    .instrument(NoteBlockInstrument.BANJO)
                    .noCollision()
                    .solid()
                    .strength(0.5F)
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block OSAGE_ORANGE_BUTTON = registerWithItem("osage_orange_button",
            Blocks.createWoodenButtonBlock(BlockSetTypeList.OSAGE_ORANGE));

    public static final TrapdoorBlock OSAGE_ORANGE_TRAPDOOR = registerWithItem("osage_orange_trapdoor_block",
            new TrapdoorBlock(BlockSetTypeList.OSAGE_ORANGE,
                    AbstractBlock.Settings.create()
                            .mapColor(OSAGE_ORANGE_PLANKS.getDefaultMapColor())
                            .instrument(NoteBlockInstrument.BANJO)
                            .strength(3.0F)
                            .nonOpaque()
                            .allowsSpawning(Blocks::never)
                            .burnable()));

    private static final Identifier OSAGE_ORANGE_SIGN_TEXTURE = TutorialMod.id("entity/signs/osage_orange");
    private static final Identifier OSAGE_ORANGE_HANGING_SIGN_TEXTURE = TutorialMod.id("entity/signs/hanging/osage_orange");
    private static final Identifier OSAGE_ORANGE_HANGING_SIGN_GUI_TEXTURE = TutorialMod.id("textures/gui/hanging_signs/osage_orange");

    public static final TerraformSignBlock OSAGE_ORANGE_SIGN = register("osage_orange_sign",
            new TerraformSignBlock(OSAGE_ORANGE_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.OAK_SIGN)
                    .mapColor(OSAGE_ORANGE_PLANKS.getDefaultMapColor())
                    .instrument(NoteBlockInstrument.BANJO)
                    .solid()
                    .noCollision()
                    .strength(1.0F)
                    .burnable()
            ));

    public static final TerraformWallSignBlock OSAGE_ORANGE_WALL_SIGN = register("osage_orange_sign",
            new TerraformWallSignBlock(OSAGE_ORANGE_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.OAK_WALL_SIGN)
                    .mapColor(OSAGE_ORANGE_PLANKS.getDefaultMapColor())
                    .instrument(NoteBlockInstrument.BANJO)
            ));

    public static final TerraformHangingSignBlock OSAGE_ORANGE_HANGING_SIGN = register("osage_orange_hanging_sign",
            new TerraformHangingSignBlock(OSAGE_ORANGE_HANGING_SIGN_TEXTURE, OSAGE_ORANGE_HANGING_SIGN_GUI_TEXTURE, AbstractBlock.Settings.copy(Blocks.OAK_HANGING_SIGN)
                    .mapColor(OSAGE_ORANGE_PLANKS.getDefaultMapColor())
                    .instrument(NoteBlockInstrument.BANJO)
                    .solid()
                    .noCollision()
                    .strength(1.0F)
                    .burnable()
            ));

    public static final TerraformWallHangingSignBlock OSAGE_ORANGE_WALL_HANGING_SIGN = register("osage_orange_wall_hanging_sign",
            new TerraformWallHangingSignBlock(OSAGE_ORANGE_HANGING_SIGN_TEXTURE, OSAGE_ORANGE_HANGING_SIGN_GUI_TEXTURE, AbstractBlock.Settings.copy(Blocks.OAK_WALL_HANGING_SIGN)
                    .mapColor(OSAGE_ORANGE_PLANKS.getDefaultMapColor())
                    .instrument(NoteBlockInstrument.BANJO)
                    .solid()
                    .noCollision()
                    .strength(1.0F)
                    .burnable()
            ));


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

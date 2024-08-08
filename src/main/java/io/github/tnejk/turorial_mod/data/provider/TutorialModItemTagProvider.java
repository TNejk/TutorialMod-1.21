package io.github.tnejk.turorial_mod.data.provider;

import io.github.tnejk.turorial_mod.init.BlockInit;
import io.github.tnejk.turorial_mod.init.ItemInit;
import io.github.tnejk.turorial_mod.list.TagList;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class TutorialModItemTagProvider extends FabricTagProvider<Item> {
    public TutorialModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, RegistryKeys.ITEM, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ItemInit.RUBY_SWORD);
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ItemInit.RUBY_PICKAXE);
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ItemInit.RUBY_AXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ItemInit.RUBY_SHOVEL);
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ItemInit.RUBY_HOE);
        getOrCreateTagBuilder(ItemTags.HEAD_ARMOR)
                .add(ItemInit.RUBY_HELMET);
        getOrCreateTagBuilder(ItemTags.CHEST_ARMOR)
                .add(ItemInit.RUBY_CHESTPLATE);
        getOrCreateTagBuilder(ItemTags.LEG_ARMOR)
            .add(ItemInit.RUBY_LEGGINGS);
        getOrCreateTagBuilder(ItemTags.FOOT_ARMOR)
                .add(ItemInit.RUBY_BOOTS);
        getOrCreateTagBuilder(ItemTags.SMALL_FLOWERS)
                .add(BlockInit.ROSE.asItem());

        getOrCreateTagBuilder(TagList.Items.OSAGE_ORANGE_LOGS)
                .add(BlockInit.OSAGE_ORANGE_LOG.asItem())
                .add(BlockInit.STRIPPED_OSAGE_ORANGE_LOG.asItem());

        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .addTag(TagList.Items.OSAGE_ORANGE_LOGS);

        getOrCreateTagBuilder(ItemTags.SAPLINGS)
                .add(BlockInit.OSAGE_ORANGE_SAPLING.asItem());

        getOrCreateTagBuilder(ItemTags.LEAVES)
                .add(BlockInit.OSAGE_ORANGE_LEAVES.asItem());

        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(BlockInit.OSAGE_ORANGE_PLANKS.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_SLABS)
                .add(BlockInit.OSAGE_ORANGE_SLAB.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_STAIRS)
                .add(BlockInit.OSAGE_ORANGE_STAIRS.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_FENCES)
                .add(BlockInit.OSAGE_ORANGE_FENCE.asItem());

        getOrCreateTagBuilder(ItemTags.FENCE_GATES)
                .add(BlockInit.OSAGE_ORANGE_FENCE_GATE.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_DOORS)
                .add(BlockInit.OSAGE_ORANGE_DOOR.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_TRAPDOORS)
                .add(BlockInit.OSAGE_ORANGE_TRAPDOOR.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_BUTTONS)
                .add(BlockInit.OSAGE_ORANGE_BUTTON.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_PRESSURE_PLATES)
                .add(BlockInit.OSAGE_ORANGE_PRESSURE_PLATE.asItem());

        getOrCreateTagBuilder(ItemTags.SIGNS)
                .add(BlockInit.OSAGE_ORANGE_SIGN.asItem());

        getOrCreateTagBuilder(ItemTags.HANGING_SIGNS)
                .add(BlockInit.OSAGE_ORANGE_WALL_HANGING_SIGN.asItem());

        getOrCreateTagBuilder(ItemTags.BOATS)
                .add(ItemInit.OSAGE_ORANGE_BOAT);

        getOrCreateTagBuilder(ItemTags.CHEST_BOATS)
                .add(ItemInit.OSAGE_ORANGE_CHEST_BOAT);

        getOrCreateTagBuilder(ConventionalItemTags.WOODEN_RODS)
                .add(ItemInit.OSAGE_ORANGE_STICK);

    }
}

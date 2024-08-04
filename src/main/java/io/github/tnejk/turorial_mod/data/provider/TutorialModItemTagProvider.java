package io.github.tnejk.turorial_mod.data.provider;

import io.github.tnejk.turorial_mod.init.BlockInit;
import io.github.tnejk.turorial_mod.init.ItemInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
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

    }
}

package io.github.tnejk.turorial_mod.data.provider;

import io.github.tnejk.turorial_mod.TutorialMod;
import io.github.tnejk.turorial_mod.init.BlockInit;
import io.github.tnejk.turorial_mod.init.ItemGroupInit;
import io.github.tnejk.turorial_mod.init.ItemInit;
import io.github.tnejk.turorial_mod.list.TagList;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableTextContent;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class TutorialModEnglishLanguageProvider extends FabricLanguageProvider {

    public TutorialModEnglishLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    private static void addText(@NotNull TranslationBuilder builder, @NotNull Text text, @NotNull String value){
        if(text.getContent() instanceof TranslatableTextContent translatableTextContent){
            builder.add(translatableTextContent.getKey(), value);
        }else {
            TutorialMod.LOGGER.warn("Failed to add translation for text " + text.getString());
        }


    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(ItemInit.RUBY, "Ruby");
        translationBuilder.add(ItemInit.BANANA, "Banana");
        translationBuilder.add(BlockInit.RUBY_BLOCK, "Ruby Block");
        translationBuilder.add(BlockInit.RUBY_ORE_BLOCK_STONE, "Ruby Ore");
        translationBuilder.add(BlockInit.RUBY_ORE_BLOCK_DEEPSLATE, "Deepslate Ruby Ore");
        translationBuilder.add(BlockInit.RUBY_ORE_BLOCK_NETHER, "Netherack Ruby Ore");
        translationBuilder.add(BlockInit.RUBY_ORE_BLOCK_END, "Endstone Ruby Ore");
        translationBuilder.add(ItemInit.RUBY_CHUNK_STONE, "Ruby Chunk");
        translationBuilder.add(ItemInit.RUBY_CHUNK_DEEPSLATE, "Deepslate Ruby Chunk");
        translationBuilder.add(ItemInit.RUBY_CHUNK_NETHER, "Netherrack Ruby Chunk");
        translationBuilder.add(ItemInit.RUBY_CHUNK_END, "Endstone Ruby Chunk");
        translationBuilder.add(ItemInit.RUBY_SWORD, "Ruby Sword");
        translationBuilder.add(ItemInit.RUBY_AXE, "Ruby Axe");
        translationBuilder.add(ItemInit.RUBY_HOE, "Ruby Hoe");
        translationBuilder.add(ItemInit.RUBY_SHOVEL, "Ruby Shovel");
        translationBuilder.add(ItemInit.RUBY_PICKAXE, "Ruby Pickaxe");
        translationBuilder.add(ItemInit.RUBY_LEGGINGS, "Ruby Leggings");
        translationBuilder.add(ItemInit.RUBY_HELMET, "Ruby Crown");
        translationBuilder.add(ItemInit.RUBY_CHESTPLATE, "Ruby Chestplate");
        translationBuilder.add(ItemInit.RUBY_BOOTS, "Ruby Boots");
        translationBuilder.add(BlockInit.ROSE, "Rose");
        translationBuilder.add(BlockInit.ROSE_POT, "Rose Pot");
        translationBuilder.add(BlockInit.OSAGE_ORANGE_LOG, "Osage Orange Log");
        translationBuilder.add(BlockInit.STRIPPED_OSAGE_ORANGE_LOG, "Stripped Osage Orange Log");
        translationBuilder.add(BlockInit.OSAGE_ORANGE_WOOD, "Osage Orange Wood");
        translationBuilder.add(BlockInit.STRIPPED_OSAGE_ORANGE_WOOD, "Stripped Osage Orange Wood");
        translationBuilder.add(BlockInit.OSAGE_ORANGE_LEAVES, "Osage Orange Leaves");
        translationBuilder.add(BlockInit.OSAGE_ORANGE_SAPLING, "Osage Orange Sapling");
        translationBuilder.add(BlockInit.OSAGE_ORANGE_PLANKS, "Osage Orange Planks");
        translationBuilder.add(BlockInit.OSAGE_ORANGE_SLAB, "Osage Orange Slab");
        translationBuilder.add(BlockInit.OSAGE_ORANGE_STAIRS, "Osage Orange Stairs");
        translationBuilder.add(BlockInit.OSAGE_ORANGE_DOOR, "Osage Orange Door");
        translationBuilder.add(BlockInit.OSAGE_ORANGE_TRAPDOOR, "Osage Orange Trapdoor");
        translationBuilder.add(BlockInit.OSAGE_ORANGE_FENCE, "Osage Orange Fence");
        translationBuilder.add(BlockInit.OSAGE_ORANGE_FENCE_GATE, "Osage Orange Fence Gate");
        translationBuilder.add(BlockInit.OSAGE_ORANGE_BUTTON, "Osage Orange Button");
        translationBuilder.add(BlockInit.OSAGE_ORANGE_PRESSURE_PLATE,  "Osage Orange Pressure Plate");
        translationBuilder.add(ItemInit.OSAGE_ORANGE_SIGN, "Osage Orange Sign");
        translationBuilder.add(ItemInit.OSAGE_ORANGE_HANGING_SIGN, "Osage Orange Hanging Sign");
        translationBuilder.add(ItemInit.OSAGE_ORANGE_BOAT, "Osage Orange Boat");
        translationBuilder.add(ItemInit.OSAGE_ORANGE_CHEST_BOAT, "Osage Orange Chest Boat");
        translationBuilder.add(ItemInit.OSAGE_ORANGE_STICK, "Osage Orange Stick");
        translationBuilder.add(TagList.Items.OSAGE_ORANGE_LOGS, "Osage Orange Logs");


        addText(translationBuilder, ItemGroupInit.MOD_GROUP_TITLE, "Tutorial Mod");

    }
}

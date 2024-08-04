package io.github.tnejk.turorial_mod.data.provider;

import io.github.tnejk.turorial_mod.TutorialMod;
import io.github.tnejk.turorial_mod.init.BlockInit;
import io.github.tnejk.turorial_mod.init.ItemGroupInit;
import io.github.tnejk.turorial_mod.init.ItemInit;
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
        addText(translationBuilder, ItemGroupInit.MOD_GROUP_TITLE, "Tutorial Mod");

    }
}

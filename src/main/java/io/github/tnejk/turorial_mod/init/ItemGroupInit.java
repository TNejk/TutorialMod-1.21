package io.github.tnejk.turorial_mod.init;

import io.github.tnejk.turorial_mod.TutorialMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;

import java.util.Optional;

public class ItemGroupInit {

    public static final Text MOD_GROUP_TITLE = Text.translatable("itemGroup." + TutorialMod.MOD_ID + ".mod_group");

    public static final ItemGroup MOD_GROUP = register("example_group", FabricItemGroup.builder()
            .displayName(MOD_GROUP_TITLE)
            .icon(ItemInit.RUBY::getDefaultStack)
            .entries((displayContext, entries) -> {
                Registries.ITEM.getIds()
                        .stream()
                        .filter(key -> key.getNamespace().equals(TutorialMod.MOD_ID))
                        .map(Registries.ITEM::getOrEmpty)
                        .map(Optional::orElseThrow)
                        .forEach(entries::add);
            })
            .build());

    public static <T extends ItemGroup> T register(String name, T itemGroup) {
        return Registry.register(Registries.ITEM_GROUP, TutorialMod.id(name), itemGroup);
    }

    public static void init() {}
}

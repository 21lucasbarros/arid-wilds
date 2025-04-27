package com.lucasbarros.aridwilds.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import com.lucasbarros.aridwilds.AridWilds;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item VAPO = registerItem("vapo", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AridWilds.MOD_ID,"vapo")))));
    public static final Item BAMBOO_STICK = registerItem("bamboo_stick", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AridWilds.MOD_ID,"bamboo_stick")))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(AridWilds.MOD_ID, name), item);
    }

    public static void registerModItems() {
        AridWilds.LOGGER.info("Registering Mod Items for " + AridWilds.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(VAPO);
            entries.add(BAMBOO_STICK);
        });
    }
}

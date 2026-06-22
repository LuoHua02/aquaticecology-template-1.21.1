package com.luohua.aquaticecology.item;

import com.luohua.aquaticecology.AquaticEcology;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class    ModItems {

    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(AquaticEcology.MOD_ID);

    public static final DeferredItem<Item> RAW_CARP =
            ITEMS.register("raw_carp", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
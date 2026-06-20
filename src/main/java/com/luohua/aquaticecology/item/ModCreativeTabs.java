package com.luohua.aquaticecology.item;

import com.luohua.aquaticecology.AquaticEcology;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModCreativeTabs {

    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AquaticEcology.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MAIN_TAB =
            TABS.register("main", () ->
                    CreativeModeTab.builder()
                            .title(Component.translatable("itemGroup.aquaticecology"))
                            .icon(() -> new ItemStack(ModItems.RAW_CARP.get()))
                            .displayItems((parameters, output) -> {

                                output.accept(ModItems.RAW_CARP.get());

                            })
                            .build());

    public static void register(IEventBus bus) {
        TABS.register(bus);
    }
}
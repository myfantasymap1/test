package net.andrew.middleearthmod.item;


import net.andrew.middleearthmod.MiddleearthMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab>CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MiddleearthMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MIDDLEEARTH_TAB = CREATIVE_MODE_TABS.register("middleearth_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Moditems.DWARFIRON.get()))
                    .title(Component.translatable("creativetab.middleearth_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(Moditems.DWARFIRON.get());
                        pOutput.accept(Moditems.RAW_DWARFIRON.get());

                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}

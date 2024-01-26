package net.andrew.middleearthmod.item;

import net.andrew.middleearthmod.MiddleearthMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Moditems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MiddleearthMod.MOD_ID);

    public static final RegistryObject<Item> DWARFIRON = ITEMS.register("dwarfiron",
            ()-> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}

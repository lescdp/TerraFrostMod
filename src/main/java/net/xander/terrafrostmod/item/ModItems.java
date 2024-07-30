package net.xander.terrafrostmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.xander.terrafrostmod.TerraFrostMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TerraFrostMod.MOD_ID);


    public static final RegistryObject<Item> Malachite = ITEMS.register("malachite",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TERRAFROST_TAB)));

    public static final RegistryObject<Item> Raw_Bamide = ITEMS.register("raw_bamide",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TERRAFROST_TAB)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}

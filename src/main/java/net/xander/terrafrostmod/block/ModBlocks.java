package net.xander.terrafrostmod.block;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.xander.terrafrostmod.TerraFrostMod;
import net.xander.terrafrostmod.item.ModCreativeModeTab;
import net.xander.terrafrostmod.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TerraFrostMod.MOD_ID);

    public static final RegistryObject<Block> Bamide_Ore_Block = registerBlock("bamide_ore_block",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(3,7)), ModCreativeModeTab.TERRAFROST_TAB);

    public static final RegistryObject<Block> Raw_Bamide_Block = registerBlock("raw_bamide_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.TERRAFROST_TAB);

    public static final RegistryObject<Block> Bamide_Block = registerBlock("bamide_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.TERRAFROST_TAB);

    public static final RegistryObject<Block> Slush_Block = registerBlock("slush_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.TERRAFROST_TAB);

    public static final RegistryObject<Block> Tundra_Soil_Block = registerBlock("tundra_soil_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.TERRAFROST_TAB);

    public static final RegistryObject<Block> Tundra_Grass_Yellow_Block = registerBlock("tundra_grass_yellow_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.TERRAFROST_TAB);



    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }



    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

package net.John.jammod.block;

import net.John.jammod.JamMod;
import net.John.jammod.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks
{
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, JamMod.MOD_ID);

    public static final RegistryObject<Block> STRAWBERRY_JAM = registerBlock("strawberry_block", () -> new Block(BlockBehaviour.Properties.of()
            .strength(1f)
            .sound(SoundType.SLIME_BLOCK)
            .jumpFactor(.2f)));



    public static final RegistryObject<Block> BISMUTH_ORE = registerBlock("bismuth_ore", () -> new DropExperienceBlock(UniformInt.of(2,4), BlockBehaviour.Properties.of()
            .strength(4f)
            .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CANNER = registerBlock("canner", () -> new Block(BlockBehaviour.Properties.of()
            .strength(4f)
            .requiresCorrectToolForDrops()));





    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block)
    {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block)
    {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }


    public static void  register(IEventBus eventbus)
    {
        BLOCKS.register(eventbus);
    }
}

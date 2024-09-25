package net.John.jammod.item;

import net.John.jammod.JamMod;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, JamMod.MOD_ID);

    public static final RegistryObject<Item> jarofstrawberryjam = ITEMS.register("jarofstrawberryjam", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> jarofapplejam = ITEMS.register("jarofapplejam", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> jarofgoldenapplejam = ITEMS.register("jarofgoldenapplejam", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> jarofglowberryjam = ITEMS.register("jarofglowberryjam", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> jarofchorusfruitjam = ITEMS.register("jarofchorusfruitjam", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> jarofcookiejam = ITEMS.register("jarofcookiejam", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> jarofbreezejam = ITEMS.register("jarofbreezejam", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> jarofwatermelonjam = ITEMS.register("jarofwatermelonjam", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> rawbismuth = ITEMS.register("rawbismuth", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> emptyjar = ITEMS.register("emptyjar", () -> new Item(new Item.Properties()));




    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}

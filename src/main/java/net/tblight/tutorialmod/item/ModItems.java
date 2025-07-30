package net.tblight.tutorialmod.item;

import net.tblight.tutorialmod.TutorialMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.tblight.tutorialmod.item.custom.ChiselItem;
import net.tblight.tutorialmod.item.custom.FuelItem;
import net.tblight.tutorialmod.item.custom.KohlrabiItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> ALEXANDRITE = ITEMS.register("alexandrite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_ALEXANDRITE = ITEMS.register("raw_alexandrite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CHISEL = ITEMS.register("chisel",
            () -> new ChiselItem(new Item.Properties().durability(32)));

    public static final RegistryObject<Item> KOHLRABI = ITEMS.register("kohlrabi",
            () -> new KohlrabiItem(new Item.Properties().food(ModFoodProperties.KOHLRABI)));

    public static final RegistryObject<Item> BEAST_GRASS = ITEMS.register("beast_grass",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BEAST_GRASS)));

    public static final RegistryObject<Item> AURORA_ASHES = ITEMS.register("aurora_ashes",
            () -> new FuelItem(new Item.Properties(),1200));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

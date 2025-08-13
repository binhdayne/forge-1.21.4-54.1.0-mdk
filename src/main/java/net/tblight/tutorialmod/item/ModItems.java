package net.tblight.tutorialmod.item;

import net.minecraftforge.common.ForgeSpawnEggItem;
import net.tblight.tutorialmod.TutorialMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.tblight.tutorialmod.entity.ModEntities;
import net.tblight.tutorialmod.item.custom.*;

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

    public static final RegistryObject<Item> FIRE_HERB = ITEMS.register("fire_herb",
            () -> new Fire_Herb(new Item.Properties().food(ModFoodProperties.FIRE_HERB)));

    public static final RegistryObject<Item> FIRE_BOTTLE = ITEMS.register("fire_bottle",
            () -> new Fire_Bottle(new Item.Properties().food(ModFoodProperties.FIRE_BOTTLE).stacksTo(1)));

    public static final RegistryObject<Item> AURORA_ASHES = ITEMS.register("aurora_ashes",
            () -> new FuelItem(new Item.Properties(),1200));

    public static final RegistryObject<Item> TRICERATOPS_SPAWN_EGG = ITEMS.register("triceratops_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.TRICERATOPS, 0x53524b, 0xdac741, new Item.Properties()));

    public static final RegistryObject<Item> GREATHUNGER_SPAWN_EGG = ITEMS.register("greathunger_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.GREATHUNGER, 0xdddddd, 0x66ff00, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

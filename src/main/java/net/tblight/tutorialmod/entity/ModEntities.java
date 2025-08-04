package net.tblight.tutorialmod.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.tblight.tutorialmod.TutorialMod;
import net.tblight.tutorialmod.entity.custom.SlimEntity;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, TutorialMod.MOD_ID);

    public static final RegistryObject<EntityType<SlimEntity>> SLIM =
            ENTITY_TYPES.register("slim", () -> EntityType.Builder.of(SlimEntity::new, MobCategory.CREATURE)
                    .sized(1.5f, 1.5f).build("slim"));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}

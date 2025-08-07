package net.tblight.tutorialmod.entity;

import net.tblight.tutorialmod.TutorialMod;
import net.tblight.tutorialmod.entity.custom.RuinsGolemEntity;
import net.tblight.tutorialmod.entity.custom.TriceratopsEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, TutorialMod.MOD_ID);

    public static final RegistryObject<EntityType<TriceratopsEntity>> TRICERATOPS =
            ENTITY_TYPES.register("triceratops", () -> EntityType.Builder.of(TriceratopsEntity::new, MobCategory.CREATURE)
                    .sized(1.5f, 1.5f).build("triceratops"));

    public static final RegistryObject<EntityType<RuinsGolemEntity>> RUINSGOLEM =
            ENTITY_TYPES.register("ruinsgolem", () -> EntityType.Builder.of(RuinsGolemEntity::new, MobCategory.CREATURE)
                    .sized(1.4f, 2.8f) // sửa theo kích thước model nếu cần
                    .build("ruinsgolem"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}

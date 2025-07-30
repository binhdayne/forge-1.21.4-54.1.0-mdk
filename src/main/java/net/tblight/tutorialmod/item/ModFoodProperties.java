package net.tblight.tutorialmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;


public class ModFoodProperties {
    public static final FoodProperties KOHLRABI = new FoodProperties.Builder().nutrition(3).saturationModifier(0.25f)
            .effect(new MobEffectInstance(MobEffects.INVISIBILITY, 400), 0.20f).build();

    public static final FoodProperties BEAST_GRASS = new FoodProperties.Builder().nutrition(0).saturationModifier(0f)
            .effect(new MobEffectInstance(MobEffects.HEAL, 1, 0), 1f).alwaysEdible().build();
}
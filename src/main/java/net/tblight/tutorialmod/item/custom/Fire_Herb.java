package net.tblight.tutorialmod.item.custom;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class Fire_Herb extends Item {
    public Fire_Herb(Properties properties) {
        super(properties);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity entity) {
        if (!level.isClientSide()) {
            entity.setRemainingFireTicks(100);
        }

        return super.finishUsingItem(stack, level, entity);
    }
}


package net.tblight.tutorialmod.item.custom;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;

public class Fire_Bottle extends Item {

    public Fire_Bottle(Properties properties) {
        super(properties);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity entity) {
        ItemStack result = super.finishUsingItem(stack, level, entity);
        if (!level.isClientSide) {
            entity.setRemainingFireTicks(600);
        }
        if (entity instanceof Player player) {
            if (!player.getAbilities().instabuild) {
                return new ItemStack(Items.GLASS_BOTTLE);
            }
        }
        return result;
    }

    @Override
    public UseAnim getUseAnimation(ItemStack stack) {
        return UseAnim.DRINK;
    }
}


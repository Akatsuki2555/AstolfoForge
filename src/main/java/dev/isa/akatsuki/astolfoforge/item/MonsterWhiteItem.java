
package dev.isa.akatsuki.astolfoforge.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import dev.isa.akatsuki.astolfoforge.procedures.MonsterWhitePlayerFinishesUsingItemProcedure;

public class MonsterWhiteItem extends Item {
	public MonsterWhiteItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(0).saturationMod(0f).build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		MonsterWhitePlayerFinishesUsingItemProcedure.execute(entity);
		return retval;
	}
}

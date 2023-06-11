package com.lost.mreproject.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemFoodDrinkReturnItemEffect extends ItemFoodDrinkReturnItem {
	
	private PotionEffect foodeffect;
	
	public ItemFoodDrinkReturnItemEffect(int amount, float saturation, String name, Item returnitem, PotionEffect effectin) {
		super(amount, saturation, name, returnitem);
		this.foodeffect = effectin;
	}
	
	@Override
	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving) {
		if (!worldIn.isRemote) {
			entityLiving.addPotionEffect(foodeffect);
		}
		return super.onItemUseFinish(stack, worldIn, entityLiving);
	}
	
	@Override
	public ItemFoodDrinkReturnItemEffect setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}

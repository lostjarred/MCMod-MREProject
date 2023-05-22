package com.lost.mreproject;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemFoodDrinkReturnItem extends ItemFoodDrinkBase {
	
	private Item returnitem;

	public ItemFoodDrinkReturnItem(int amount, float saturation, String name, Item returnitem) {
		super(amount, saturation, name);
		this.setMaxStackSize(1);
		this.returnitem = returnitem;
	}
	
	@Override
	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving) {
		super.onItemUseFinish(stack, worldIn, entityLiving);
		return new ItemStack(returnitem);
	}
	
	@Override
	public ItemFoodDrinkReturnItem setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
}

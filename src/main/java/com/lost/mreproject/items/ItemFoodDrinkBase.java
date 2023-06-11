package com.lost.mreproject.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;

public class ItemFoodDrinkBase extends ItemFoodBase {

	public ItemFoodDrinkBase(int amount, float saturation, String name) {
		super(amount, saturation, false, name);
	}
	
	@Override
	public EnumAction getItemUseAction(ItemStack stack){
		return EnumAction.DRINK;
	}
	
	@Override
	public ItemFoodDrinkBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
}

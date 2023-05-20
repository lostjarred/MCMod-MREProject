package com.lost.mreproject;

import net.minecraft.item.Item;

public class ItemFoodDrinkReturnItem extends ItemFoodDrinkBase {
	
	private Item returnitem;

	public ItemFoodDrinkReturnItem(int amount, float saturation, String name, Item returnitem) {
		super(amount, saturation, name);
		this.setMaxStackSize(1);
		this.returnitem = returnitem;
	}

}

package com.lost.mreproject.items;

import com.lost.mreproject.MreProject;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class ItemFoodBase extends ItemFood {

	protected String name;
	
	public ItemFoodBase(int amount, float saturation, boolean isWolfFood, String name) {
		super(amount, saturation, isWolfFood);
		this.name = name;
		setTranslationKey(name);
		setRegistryName(name);
	}
	
	public void registerItemModel() {
		MreProject.proxy.registerItemRenderer(this, 0, name);
	}
	
	@Override
	public ItemFoodBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}

package com.lost.mreproject;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTabMRE extends CreativeTabs {

	public CreativeTabMRE() {
		super("mrefood");
	}

	@Override
	public ItemStack createIcon() {
		return new ItemStack(ModItems.MREITEMFOOD);
	}

}

package com.lost.mreproject;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {
	public static ItemFoodBase mreItem = new ItemFoodBase(8, 0.8f, false, "mrefooditem").setCreativeTab(CreativeTabs.FOOD);
	public static ItemFoodDrinkBase mredrinkfood = new ItemFoodDrinkBase(8, 0.8f, "mredrinkfooditem").setCreativeTab(CreativeTabs.FOOD);
	public static ItemBase mredrinkitem = new ItemBase("mredrinkitem").setCreativeTab(CreativeTabs.FOOD);
	
	public static void register(IForgeRegistry<Item> registry) {
		registry.register(mreItem);
		registry.register(mredrinkfood);
		registry.register(mredrinkitem);
	}

	public static void registerModels() {
		mreItem.registerItemModel();
		mredrinkfood.registerItemModel();
		mredrinkitem.registerItemModel();
	}

}

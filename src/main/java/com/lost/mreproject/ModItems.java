package com.lost.mreproject;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {
	public static ItemFoodBase MREITEMFOOD = new ItemFoodBase(8, 0.8f, false, "mreitemfood").setCreativeTab(CreativeTabs.FOOD);
	public static ItemFoodDrinkBase MREITEMFOODDRINK = new ItemFoodDrinkBase(8, 0.8f, "mreitemfooddrink").setCreativeTab(CreativeTabs.FOOD);
	public static ItemBase MISC = new ItemBase("misc").setCreativeTab(CreativeTabs.FOOD);
	//temp for testing
	public static ItemFoodDrinkReturnItem COFFEE = new ItemFoodDrinkReturnItem(8, 0.8f, "coffee", Items.GLASS_BOTTLE);
	
	public static void register(IForgeRegistry<Item> registry) {
		registry.register(MREITEMFOOD);
		registry.register(MREITEMFOODDRINK);
		registry.register(MISC);
		registry.register(COFFEE);
	}

	public static void registerModels() {
		MREITEMFOOD.registerItemModel();
		MREITEMFOODDRINK.registerItemModel();
		MISC.registerItemModel();
		COFFEE.registerItemModel();
	}

}

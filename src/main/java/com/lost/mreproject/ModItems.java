package com.lost.mreproject;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {
	public static ItemFoodBase mreItem = new ItemFoodBase(8, 0.8f, false, "mrefooditem").setCreativeTab(CreativeTabs.FOOD);
	
	
	public static void register(IForgeRegistry<Item> registry) {
		registry.register(mreItem);
		
	}

	public static void registerModels() {
		mreItem.registerItemModel();
	}

}

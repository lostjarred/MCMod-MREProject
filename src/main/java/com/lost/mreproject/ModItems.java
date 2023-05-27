package com.lost.mreproject;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {
	public static ItemFoodBase MREITEMFOOD = new ItemFoodBase(8, 0.8f, false, "mreitemfood").setCreativeTab(MreProject.MREFOODS_TAB);
	public static ItemFoodDrinkBase MREDRINK = new ItemFoodDrinkBase(8, 0.8f, "mredrink").setCreativeTab(MreProject.MREFOODS_TAB);
	public static ItemBase MISC = new ItemBase("misc").setCreativeTab(MreProject.MREFOODS_TAB);
	public static ItemFoodDrinkReturnItem MREDRINK2 = new ItemFoodDrinkReturnItem(8, 0.8f, "mredrink2", Items.GLASS_BOTTLE).setCreativeTab(MreProject.MREFOODS_TAB);
	
	public static void register(IForgeRegistry<Item> registry) {
		registry.register(MREITEMFOOD);
		registry.register(MREDRINK);
		registry.register(MISC);
		registry.register(MREDRINK2);
	}

	public static void registerModels() {
		MREITEMFOOD.registerItemModel();
		MREDRINK.registerItemModel();
		MISC.registerItemModel();
		MREDRINK2.registerItemModel();
	}

}

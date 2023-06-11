package com.lost.mreproject;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {
	public static ItemFoodBase MREFOOD = new ItemFoodBase(8, 0.8f, false, "mrefood").setCreativeTab(MreProject.MREFOODS_TAB);
	public static ItemFoodDrinkBase MREDRINK = new ItemFoodDrinkBase(5, 0.8f, "mredrink").setCreativeTab(MreProject.MREFOODS_TAB);
	public static ItemBase MISC = new ItemBase("misc").setCreativeTab(MreProject.MREFOODS_TAB);
	public static ItemFoodDrinkReturnItem MREDRINK2 = new ItemFoodDrinkReturnItem(3, 0.8f, "mredrink2", Items.GLASS_BOTTLE).setCreativeTab(MreProject.MREFOODS_TAB);
	
	public static void register(IForgeRegistry<Item> registry) {
		registry.register(MREFOOD);
		registry.register(MREDRINK);
		registry.register(MISC);
		registry.register(MREDRINK2);
	}

	public static void registerModels() {
		MREFOOD.registerItemModel();
		MREDRINK.registerItemModel();
		MISC.registerItemModel();
		MREDRINK2.registerItemModel();
	}

}

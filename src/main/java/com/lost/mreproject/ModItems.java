package com.lost.mreproject;

import com.lost.mreproject.items.ItemBase;
import com.lost.mreproject.items.ItemFoodBase;
import com.lost.mreproject.items.ItemFoodBaseSub;
import com.lost.mreproject.items.ItemFoodDrinkBase;
import com.lost.mreproject.items.ItemFoodDrinkReturnItemEffect;

import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {
	public static ItemFoodBaseSub MREFOOD = new ItemFoodBaseSub(8, 0.8f, "mrefood").setCreativeTab(MreProject.MREFOODS_TAB);
	public static ItemFoodDrinkBase MREDRINK = new ItemFoodDrinkBase(5, 0.8f, "mredrink").setCreativeTab(MreProject.MREFOODS_TAB);
	public static ItemBase MISC = new ItemBase("misc").setCreativeTab(MreProject.MREFOODS_TAB);
	//20 tic, 1 second
	public static ItemFoodDrinkReturnItemEffect MREDRINK2 = new ItemFoodDrinkReturnItemEffect(3, 0.8f, "mredrink2", Items.GLASS_BOTTLE, new PotionEffect(MobEffects.HASTE, 600)).setCreativeTab(MreProject.MREFOODS_TAB);
	
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

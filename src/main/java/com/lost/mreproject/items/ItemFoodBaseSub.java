package com.lost.mreproject.items;

import com.lost.mreproject.MreProject;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class ItemFoodBaseSub extends ItemFoodBase {

	public ItemFoodBaseSub(int amount, float saturation, String name) {
		super(amount, saturation, false, name);
		this.setHasSubtypes(true);
		this.setMaxDamage(0);
	}
	
	public String getTranslationKey(ItemStack stack) {
		int meta = stack.getMetadata();
		return "item." + name + "." + meta;
	}
	
	@Override
	public int getHealAmount(ItemStack stack)
    {
		int healAmount = 1;
		int meta = stack.getMetadata();
		
		if (meta == 0) {
			healAmount = 8;
		}
		if (meta == 1) {
			healAmount = 5;
		}
        
		return healAmount;
    }
	
	@Override
	public float getSaturationModifier(ItemStack stack)
    {
		float saturationModifier = 1f;
		int meta = stack.getMetadata();
		
		if (meta == 0) {
			saturationModifier = 0.8f;
		}
		if (meta == 1) {
			saturationModifier = 0.6f;
		}
        return saturationModifier;
    }
	
	@Override
	public ItemFoodBaseSub setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
	
	@Override
	public void registerItemModel() {
		MreProject.proxy.registerItemRenderer(this, 0, name + "0");
		MreProject.proxy.registerItemRenderer(this, 1, name + "1");
	}
	
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items) {
		if (this.isInCreativeTab(tab)) {
			items.add(new ItemStack(this, 1, 0));
			items.add(new ItemStack(this, 1, 1));
		}
	}
}

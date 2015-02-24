package com.lithial.magicbooks.Items;

import com.lithial.magicbooks.MagicBooks;
import com.lithial.magicbooks.ModInfo;
import com.lithial.magicbooks.handlers.EffectHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemBookofWithering extends Item{
	public ItemBookofWithering(){
		setUnlocalizedName(ModInfo.MOD_ID + "_" + "book_of_the_withering");
		setTextureName(ModInfo.MOD_ID + ":" + "book_of_the_withering");
		setCreativeTab(CreativeTabs.tabMisc);
	}
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
	{
		EffectHandler.time = player.worldObj.getWorldTime();;	
		if(player.getHeldItem() !=null && player.getHeldItem().getItem().equals(MagicBooks.BookofWithering))
		{
			EffectHandler.WitherActivated = true;
			
		}
			return stack ;
		}

}

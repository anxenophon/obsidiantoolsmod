package net.obsidian.obsidiantoolsmod.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.obsidian.obsidiantoolsmod.ObsidianToolsMod;

public class TabObsidianTools extends CreativeTabs{

	public TabObsidianTools() {
		super(ObsidianToolsMod.OBSIDIAN_TOOLS_TAB_NAME);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ItemStack getTabIconItem() {
		return new ItemStack(ObsidianToolsMod.OBSIDIAN_SWORD);
	}

}

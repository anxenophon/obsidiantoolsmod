package net.obsidian.obsidiantoolsmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockWall;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.obsidian.obsidiantoolsmod.ObsidianToolsMod;

public class BlockObsidianWall extends BlockWall {

	public BlockObsidianWall() {
		super(new Block(Material.IRON));
		this.setRegistryName(ObsidianToolsMod.MODID, ObsidianToolsMod.OBSIDIAN_WALL_NAME);
		this.setCreativeTab(CreativeTabs.DECORATIONS);
		this.setUnlocalizedName(ObsidianToolsMod.OBSIDIAN_WALL_NAME);
		this.setHardness(50.0F);
		this.setResistance(2000.0F);
		this.setHarvestLevel("pickaxe", 3);
		this.setLightLevel(0.0F);
	}

    public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items)
    {
    	items.add(new ItemStack(this));
    }

}

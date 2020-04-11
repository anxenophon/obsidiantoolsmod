package net.obsidian.obsidiantoolsmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.obsidian.obsidiantoolsmod.ObsidianToolsMod;

public class BlockObsidianStair extends BlockStairs {
	public BlockObsidianStair() {
		super(new Block(Material.ROCK).getDefaultState());
		this.setRegistryName(ObsidianToolsMod.MODID, ObsidianToolsMod.OBSIDIAN_STAIR_NAME);
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		this.setUnlocalizedName(ObsidianToolsMod.OBSIDIAN_STAIR_NAME);
		this.setHardness(50.0F);
		this.setResistance(2000.0F);
		this.setHarvestLevel("pickaxe", 3);
		this.setLightLevel(0.0F);
	}

}

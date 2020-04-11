package net.obsidian.obsidiantoolsmod.blocks;

import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.obsidian.obsidiantoolsmod.ObsidianToolsMod;

public class BlockObsidianFence extends BlockFence {
	public BlockObsidianFence() {
		super(Material.ROCK, Material.ROCK.getMaterialMapColor());
		this.setRegistryName(ObsidianToolsMod.MODID, ObsidianToolsMod.OBSIDIAN_FENCE_NAME);
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		this.setUnlocalizedName(ObsidianToolsMod.OBSIDIAN_FENCE_NAME);
		this.setHardness(50.0F);
		this.setResistance(2000.0F);
		this.setHarvestLevel("pickaxe", 3);
		this.setLightLevel(0.0F);
	}

}

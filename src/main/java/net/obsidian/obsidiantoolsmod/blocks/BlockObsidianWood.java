package net.obsidian.obsidiantoolsmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.obsidian.obsidiantoolsmod.ObsidianToolsMod;

public class BlockObsidianWood extends Block {
	public BlockObsidianWood() {
		super(Material.WOOD);
		this.setRegistryName(ObsidianToolsMod.MODID, ObsidianToolsMod.OBSIDIAN_WOOD_NAME);
		this.setCreativeTab(ObsidianToolsMod.OBSIDIAN_TOOLS_TAB);
		this.setUnlocalizedName(ObsidianToolsMod.OBSIDIAN_WOOD_NAME);

		this.setHardness(2.0F);
		this.setResistance(2000.0F);
		this.setHarvestLevel("axe", 0);
		this.setLightLevel(0.0F);
	}
}

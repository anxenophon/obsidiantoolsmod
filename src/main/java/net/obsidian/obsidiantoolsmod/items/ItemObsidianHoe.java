package net.obsidian.obsidiantoolsmod.items;

import net.minecraft.item.ItemHoe;
import net.obsidian.obsidiantoolsmod.ObsidianToolsMod;

public class ItemObsidianHoe extends ItemHoe {
	public ItemObsidianHoe(ToolMaterial material) {
		super(material);
		this.setRegistryName(ObsidianToolsMod.MODID, ObsidianToolsMod.OBSIDIAN_HOE_NAME);
		this.setCreativeTab(ObsidianToolsMod.OBSIDIAN_TOOLS_TAB);
		this.setUnlocalizedName(ObsidianToolsMod.OBSIDIAN_HOE_NAME);
	}
}

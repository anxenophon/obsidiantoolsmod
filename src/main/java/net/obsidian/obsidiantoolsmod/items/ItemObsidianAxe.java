package net.obsidian.obsidiantoolsmod.items;

import net.minecraft.item.ItemAxe;
import net.obsidian.obsidiantoolsmod.ObsidianToolsMod;

public class ItemObsidianAxe extends ItemAxe {
	public ItemObsidianAxe(ToolMaterial material) {
		super(material, 8.0F, -3.1F);
		this.setRegistryName(ObsidianToolsMod.MODID, ObsidianToolsMod.OBSIDIAN_AXE_NAME);
		this.setCreativeTab(ObsidianToolsMod.OBSIDIAN_TOOLS_TAB);
		this.setUnlocalizedName(ObsidianToolsMod.OBSIDIAN_AXE_NAME);
	}
}

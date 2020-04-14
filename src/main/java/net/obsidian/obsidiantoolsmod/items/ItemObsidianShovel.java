package net.obsidian.obsidiantoolsmod.items;

import net.minecraft.item.ItemSpade;
import net.obsidian.obsidiantoolsmod.ObsidianToolsMod;

public class ItemObsidianShovel extends ItemSpade {
	public ItemObsidianShovel(ToolMaterial material) {
		super(material);
		this.setRegistryName(ObsidianToolsMod.MODID, ObsidianToolsMod.OBSIDIAN_SHOVEL_NAME);
		this.setCreativeTab(ObsidianToolsMod.OBSIDIAN_TOOLS_TAB);
		this.setUnlocalizedName(ObsidianToolsMod.OBSIDIAN_SHOVEL_NAME);
	}
}

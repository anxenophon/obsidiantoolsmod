package net.obsidian.obsidiantoolsmod.items;

import net.minecraft.item.ItemPickaxe;
import net.obsidian.obsidiantoolsmod.ObsidianToolsMod;

public class ItemObsidianPickaxe extends ItemPickaxe {
	public ItemObsidianPickaxe(ToolMaterial material) {
		super(material);
		this.setRegistryName(ObsidianToolsMod.MODID, ObsidianToolsMod.OBSIDIAN_PICKAXE_NAME);
		this.setCreativeTab(ObsidianToolsMod.OBSIDIAN_TOOLS_TAB);
		this.setUnlocalizedName(ObsidianToolsMod.OBSIDIAN_PICKAXE_NAME);
	}
}

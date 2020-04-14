package net.obsidian.obsidiantoolsmod.items;

import net.minecraft.item.ItemSword;
import net.obsidian.obsidiantoolsmod.ObsidianToolsMod;

public class ItemObsidianSword extends ItemSword {
	public ItemObsidianSword(ToolMaterial material) {
		super(material);
		this.setRegistryName(ObsidianToolsMod.MODID, ObsidianToolsMod.OBSIDIAN_SWORD_NAME);
		this.setCreativeTab(ObsidianToolsMod.OBSIDIAN_TOOLS_TAB);
		this.setUnlocalizedName(ObsidianToolsMod.OBSIDIAN_SWORD_NAME);
	}
}

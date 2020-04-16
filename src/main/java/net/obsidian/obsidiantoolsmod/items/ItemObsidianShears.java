package net.obsidian.obsidiantoolsmod.items;

import net.minecraft.item.ItemShears;
import net.obsidian.obsidiantoolsmod.ObsidianToolsMod;

public class ItemObsidianShears extends ItemShears {
	public ItemObsidianShears() {
		super();
		this.setRegistryName(ObsidianToolsMod.MODID, ObsidianToolsMod.OBSIDIAN_SHEARS_NAME);
		this.setCreativeTab(ObsidianToolsMod.OBSIDIAN_TOOLS_TAB);
		this.setUnlocalizedName(ObsidianToolsMod.OBSIDIAN_SHEARS_NAME);
        this.setMaxDamage(3000);
	}
}

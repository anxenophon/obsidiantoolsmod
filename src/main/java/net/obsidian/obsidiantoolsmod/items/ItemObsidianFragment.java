package net.obsidian.obsidiantoolsmod.items;

import net.minecraft.item.Item;
import net.obsidian.obsidiantoolsmod.ObsidianToolsMod;

public class ItemObsidianFragment extends Item {

	public ItemObsidianFragment() {
		super();
		this.setRegistryName(ObsidianToolsMod.MODID, ObsidianToolsMod.OBSIDIAN_FRAGMENT_NAME);
		this.setCreativeTab(ObsidianToolsMod.OBSIDIAN_TOOLS_TAB);
		this.setUnlocalizedName(ObsidianToolsMod.OBSIDIAN_FRAGMENT_NAME);
	}
}

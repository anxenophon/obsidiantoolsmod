package net.obsidian.obsidiantoolsmod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import net.obsidian.obsidiantoolsmod.ObsidianToolsMod;

public class ItemObsidianAxe extends ItemAxe {
	public ItemObsidianAxe(ToolMaterial material) {
		super(material, 8.0F, -3.1F);
		//レジストリに保存する名称を登録する。大文字禁止。
		this.setRegistryName(ObsidianToolsMod.MODID, ObsidianToolsMod.OBSIDIAN_AXE_NAME);
		//クリエイティブタブを設定する。
		this.setCreativeTab(CreativeTabs.TOOLS);
		//翻訳名を登録する。大文字非推奨。
		this.setUnlocalizedName(ObsidianToolsMod.OBSIDIAN_AXE_NAME);
	}
}

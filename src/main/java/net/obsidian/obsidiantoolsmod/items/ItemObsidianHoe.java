package net.obsidian.obsidiantoolsmod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;
import net.obsidian.obsidiantoolsmod.ObsidianToolsMod;

public class ItemObsidianHoe extends ItemHoe {
	public ItemObsidianHoe(ToolMaterial material) {
		super(material);
		//レジストリに保存する名称を登録する。大文字禁止。
		this.setRegistryName(ObsidianToolsMod.MODID, ObsidianToolsMod.OBSIDIAN_HOE_NAME);
		//クリエイティブタブを設定する。
		this.setCreativeTab(CreativeTabs.TOOLS);
		//翻訳名を登録する。大文字非推奨。
		this.setUnlocalizedName(ObsidianToolsMod.OBSIDIAN_HOE_NAME);
	}
}

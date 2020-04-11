package net.obsidian.obsidiantoolsmod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;
import net.obsidian.obsidiantoolsmod.ObsidianToolsMod;

public class ItemObsidianPickaxe extends ItemPickaxe {
	public ItemObsidianPickaxe(ToolMaterial material) {
		super(material);
		//レジストリに保存する名称を登録する。大文字禁止。
		this.setRegistryName(ObsidianToolsMod.MODID, ObsidianToolsMod.OBSIDIAN_PICKAXE_NAME);
		//クリエイティブタブを設定する。
		this.setCreativeTab(CreativeTabs.TOOLS);
		//翻訳名を登録する。大文字非推奨。
		this.setUnlocalizedName(ObsidianToolsMod.OBSIDIAN_PICKAXE_NAME);
	}
}

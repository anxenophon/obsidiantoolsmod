package net.obsidian.obsidiantoolsmod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.obsidian.obsidiantoolsmod.ObsidianToolsMod;

public class ItemObsidianFragment extends Item {

	public ItemObsidianFragment() {
		super();
		//レジストリに保存する名称を登録する。大文字禁止。
        this.setRegistryName(ObsidianToolsMod.MODID, ObsidianToolsMod.OBSIDIAN_FRAGMENT_NAME);
        //クリエイティブタブを設定する。
        this.setCreativeTab(CreativeTabs.MATERIALS);
        //翻訳名を登録する。大文字非推奨。
        this.setUnlocalizedName(ObsidianToolsMod.OBSIDIAN_FRAGMENT_NAME);
	}
}

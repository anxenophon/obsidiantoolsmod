package net.obsidian.obsidiantoolsmod;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLConstructionEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.obsidian.obsidiantoolsmod.blocks.BlockObsidianSlab;
import net.obsidian.obsidiantoolsmod.blocks.BlockObsidianWood;
import net.obsidian.obsidiantoolsmod.items.ItemObsidianAxe;
import net.obsidian.obsidiantoolsmod.items.ItemObsidianFragment;
import net.obsidian.obsidiantoolsmod.items.ItemObsidianHoe;
import net.obsidian.obsidiantoolsmod.items.ItemObsidianPickaxe;
import net.obsidian.obsidiantoolsmod.items.ItemObsidianShovel;
import net.obsidian.obsidiantoolsmod.items.ItemObsidianSword;

@Mod(modid = ObsidianToolsMod.MODID, name = ObsidianToolsMod.NAME, version = ObsidianToolsMod.VERSION)
public class ObsidianToolsMod {
	public static final String MODID = "obsidiantoolsmod";
	public static final String NAME = "Obsidian Tools MOD";
	public static final String VERSION = "1.0";

	// 名称(大文字禁止)
	public static final String OBSIDIAN_FRAGMENT_NAME = "obsidian_fragment";
	public static final String OBSIDIAN_WOOD_NAME = "obsidian_wood";
	public static final String OBSIDIAN_MATERIAL_NAME = "obsidian_material";
	public static final String OBSIDIAN_SWORD_NAME = "obsidian_sword";
	public static final String OBSIDIAN_AXE_NAME = "obsidian_axe";
	public static final String OBSIDIAN_PICKAXE_NAME = "obsidian_pickaxe";
	public static final String OBSIDIAN_SHOVEL_NAME = "obsidian_shovel";
	public static final String OBSIDIAN_HOE_NAME = "obsidian_hoe";
	public static final String OBSIDIAN_SLAB_NAME = "obsidian_slab";
	public static final String OBSIDIAN_SLAB_DOUBLE_NAME = "obsidian_slab_double";

	// インスタンス
	public static final Item OBSIDIAN_FRAGMENT = new ItemObsidianFragment();
	public static final Block OBSIDIAN_WOOD = new BlockObsidianWood();
	public static final ToolMaterial OBSIDIAN_MATERIAL = EnumHelper
			.addToolMaterial(OBSIDIAN_MATERIAL_NAME, 3, 2500, 6.0F, 2.0F, 14)
			.setRepairItem(new ItemStack(OBSIDIAN_FRAGMENT));
	public static final Item OBSIDIAN_SWORD = new ItemObsidianSword(OBSIDIAN_MATERIAL);
	public static final Item OBSIDIAN_AXE = new ItemObsidianAxe(OBSIDIAN_MATERIAL);
	public static final Item OBSIDIAN_PICKAXE = new ItemObsidianPickaxe(OBSIDIAN_MATERIAL);
	public static final Item OBSIDIAN_SHOVEL = new ItemObsidianShovel(OBSIDIAN_MATERIAL);
	public static final Item OBSIDIAN_HOE = new ItemObsidianHoe(OBSIDIAN_MATERIAL);
	public static final Block OBSIDIAN_SLAB = new BlockObsidianSlab.Half();
	public static final Block OBSIDIAN_SLAB_DOUBLE = new BlockObsidianSlab.Double();

	@Mod.EventHandler
	//この関数でMODファイル自体をイベントの発火先にする。
	public void construct(FMLConstructionEvent event) {
		MinecraftForge.EVENT_BUS.register(this);
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {

	}

	//アイテムを登録するイベント。旧preinitのタイミングで発火する。
	@SubscribeEvent
	public void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().register(OBSIDIAN_FRAGMENT);
		event.getRegistry().register(new ItemBlock(OBSIDIAN_WOOD).setRegistryName(MODID, OBSIDIAN_WOOD_NAME));
		event.getRegistry().register(OBSIDIAN_SWORD);
		event.getRegistry().register(OBSIDIAN_AXE);
		event.getRegistry().register(OBSIDIAN_PICKAXE);
		event.getRegistry().register(OBSIDIAN_SHOVEL);
		event.getRegistry().register(OBSIDIAN_HOE);
		event.getRegistry().register(new ItemSlab(OBSIDIAN_SLAB, (BlockSlab)OBSIDIAN_SLAB, (BlockSlab)OBSIDIAN_SLAB_DOUBLE).setRegistryName(MODID, OBSIDIAN_SLAB_NAME));
	}

	//ブロックを登録するイベント。 旧preinitのタイミングで発火する。
	@SubscribeEvent
	public void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().register(OBSIDIAN_WOOD);
		event.getRegistry().register(OBSIDIAN_SLAB);
		event.getRegistry().register(OBSIDIAN_SLAB_DOUBLE);
	}

	//モデルを登録するイベント。SideOnlyによってクライアント側のみ呼ばれる。旧preinitのタイミングで発火する。
	@SubscribeEvent
	@SideOnly(Side.CLIENT)
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(OBSIDIAN_FRAGMENT, 0,
				new ModelResourceLocation(new ResourceLocation(MODID, OBSIDIAN_FRAGMENT_NAME), "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(OBSIDIAN_WOOD), 0,
				new ModelResourceLocation(new ResourceLocation(MODID, OBSIDIAN_WOOD_NAME), "inventory"));
		ModelLoader.setCustomModelResourceLocation(OBSIDIAN_SWORD, 0,
				new ModelResourceLocation(new ResourceLocation(MODID, OBSIDIAN_SWORD_NAME), "inventory"));
		ModelLoader.setCustomModelResourceLocation(OBSIDIAN_AXE, 0,
				new ModelResourceLocation(new ResourceLocation(MODID, OBSIDIAN_AXE_NAME), "inventory"));
		ModelLoader.setCustomModelResourceLocation(OBSIDIAN_PICKAXE, 0,
				new ModelResourceLocation(new ResourceLocation(MODID, OBSIDIAN_PICKAXE_NAME), "inventory"));
		ModelLoader.setCustomModelResourceLocation(OBSIDIAN_SHOVEL, 0,
				new ModelResourceLocation(new ResourceLocation(MODID, OBSIDIAN_SHOVEL_NAME), "inventory"));
		ModelLoader.setCustomModelResourceLocation(OBSIDIAN_HOE, 0,
				new ModelResourceLocation(new ResourceLocation(MODID, OBSIDIAN_HOE_NAME), "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(OBSIDIAN_SLAB), 0,
				new ModelResourceLocation(new ResourceLocation(MODID, OBSIDIAN_SLAB_NAME), "inventory"));
	}
}

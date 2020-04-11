package net.obsidian.obsidiantoolsmod;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLConstructionEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.obsidian.obsidiantoolsmod.blocks.BlockObsidianWood;
import net.obsidian.obsidiantoolsmod.items.ItemObsidianFragment;

@Mod(modid = ObsidianToolsMod.MODID, name = ObsidianToolsMod.NAME, version = ObsidianToolsMod.VERSION)
public class ObsidianToolsMod {
	public static final String MODID = "obsidiantoolsmod";
    public static final String NAME = "Obsidian Tools MOD";
    public static final String VERSION = "1.0";

    // アイテム・ブロックのインスタンス生成
    public static final Item OBSIDIAN_FRAGMENT = new ItemObsidianFragment();
    public static final Block OBSIDIAN_WOOD = new BlockObsidianWood();
    //public static final Item OBSIDIAN_SWORD = new Item();

    // アイテム・ブロック名称(大文字禁止)
    public static final String OBSIDIAN_FRAGMENT_NAME = "obsidian_fragment";
    public static final String OBSIDIAN_WOOD_NAME = "obsidian_wood";

    @Mod.EventHandler
    //この関数でMODファイル自体をイベントの発火先にする。
    public void construct(FMLConstructionEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }

    //アイテムを登録するイベント。旧preinitのタイミングで発火する。
    @SubscribeEvent
    public void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(OBSIDIAN_FRAGMENT);
        event.getRegistry().register(new ItemBlock(OBSIDIAN_WOOD).setRegistryName(MODID, OBSIDIAN_WOOD_NAME));
    }

    //ブロックを登録するイベント。 旧preinitのタイミングで発火する。
    @SubscribeEvent
    public void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(OBSIDIAN_WOOD);
    }

    //モデルを登録するイベント。SideOnlyによってクライアント側のみ呼ばれる。旧preinitのタイミングで発火する。
    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(OBSIDIAN_FRAGMENT, 0, new ModelResourceLocation(new ResourceLocation(MODID, OBSIDIAN_FRAGMENT_NAME), "inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(OBSIDIAN_WOOD), 0, new ModelResourceLocation(new ResourceLocation(MODID, OBSIDIAN_WOOD_NAME), "inventory"));
    }

}

package net.obsidian.obsidiantoolsmod.blocks;

import java.util.Random;

import net.minecraft.block.BlockDoor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.obsidian.obsidiantoolsmod.ObsidianToolsMod;

public class BlockObsidianDoor extends BlockDoor {

	public BlockObsidianDoor() {
		super(Material.IRON);
		this.setRegistryName(ObsidianToolsMod.MODID, ObsidianToolsMod.OBSIDIAN_DOOR_NAME);
		this.setCreativeTab(ObsidianToolsMod.OBSIDIAN_TOOLS_TAB);
		this.setUnlocalizedName(ObsidianToolsMod.OBSIDIAN_DOOR_NAME);
		this.setHardness(50.0F);
		this.setResistance(2000.0F);
		this.setHarvestLevel("pickaxe", 3);
		this.setLightLevel(0.0F);
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Item.getItemFromBlock(this);
	}

	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos,
			EntityPlayer player) {
		return new ItemStack(this);
	}
}
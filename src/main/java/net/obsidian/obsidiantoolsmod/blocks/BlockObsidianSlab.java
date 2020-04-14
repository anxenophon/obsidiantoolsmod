package net.obsidian.obsidiantoolsmod.blocks;

import java.util.Random;

import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.obsidian.obsidiantoolsmod.ObsidianToolsMod;

public abstract class BlockObsidianSlab extends BlockSlab {

	public static final PropertyEnum<Variant> VARIANT = PropertyEnum.<Variant> create("variant", Variant.class);

	public BlockObsidianSlab() {
		super(Material.IRON);
		this.setCreativeTab(ObsidianToolsMod.OBSIDIAN_TOOLS_TAB);
		this.setHardness(50.0F);
		this.setResistance(2000.0F);
		this.setHarvestLevel("pickaxe", 3);
		this.setLightLevel(0.0F);

		IBlockState iblockstate = this.blockState.getBaseState().withProperty(VARIANT, Variant.DEFAULT);

		if (!this.isDouble()) {
			iblockstate.withProperty(HALF, BlockSlab.EnumBlockHalf.BOTTOM);
		}

		this.setDefaultState(iblockstate);
		this.useNeighborBrightness = !this.isDouble();
	}

	@Override
	public String getUnlocalizedName(int meta) {
		return super.getUnlocalizedName();
	}

	@Override
	public IProperty<?> getVariantProperty() {
		return VARIANT;
	}

	@Override
	public Comparable<?> getTypeForItem(ItemStack stack) {
		return BlockObsidianSlab.Variant.DEFAULT;
	}

	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Item.getItemFromBlock(this);
	}

	public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state) {
		return new ItemStack(this);
	}

	@Override
	public final IBlockState getStateFromMeta(final int meta) {
		IBlockState blockstate = this.blockState.getBaseState().withProperty(VARIANT, Variant.DEFAULT);

		if (!this.isDouble()) {
			blockstate = blockstate.withProperty(HALF, ((meta & 8) != 0) ? EnumBlockHalf.TOP : EnumBlockHalf.BOTTOM);
		}

		return blockstate;
	}

	public final int getMetaFromState(final IBlockState state) {
		int meta = 0;

		if (!this.isDouble() && state.getValue(HALF) == EnumBlockHalf.TOP) {
			meta |= 8;
		}

		return meta;
	}

	protected BlockStateContainer createBlockState() {
		if (!this.isDouble()) {
			return new BlockStateContainer(this, new IProperty[] { VARIANT, HALF });
		}
		return new BlockStateContainer(this, new IProperty[] { VARIANT });
	}

	public static class Double extends BlockObsidianSlab {
		public Double() {
			super();
			this.setRegistryName(ObsidianToolsMod.MODID, ObsidianToolsMod.OBSIDIAN_SLAB_DOUBLE_NAME);
			this.setUnlocalizedName(ObsidianToolsMod.OBSIDIAN_SLAB_DOUBLE_NAME);
		}
		@Override
		public boolean isDouble() {
			return true;
		}
	}

	public static class Half extends BlockObsidianSlab {
		public Half() {
			this.setRegistryName(ObsidianToolsMod.MODID, ObsidianToolsMod.OBSIDIAN_SLAB_NAME);
			this.setUnlocalizedName(ObsidianToolsMod.OBSIDIAN_SLAB_NAME);
		}
		@Override
		public boolean isDouble() {
			return false;
		}
	}

	public static enum Variant implements IStringSerializable {
		DEFAULT;

		@Override
		public String getName() {
			return "default";
		}
	}
}
package com.github.notjackismercury.xyslabs.block;

import com.github.notjackismercury.xyslabs.state.property.XyProperties;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.Waterloggable;
import net.minecraft.block.enums.SlabType;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.state.property.Property;
import net.minecraft.tag.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Direction.Axis;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;

public class XySlabBlock extends Block implements Waterloggable {
	public static final DirectionProperty FACING = Properties.FACING;

	public static final EnumProperty<SlabType> HALF = XyProperties.SLAB_HALF;

	public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;

	protected static final VoxelShape WEST_SHAPE = Block.createCuboidShape(0.0D, 0.0D, 0.0D, 8.0D, 16.0D, 16.0D);

	protected static final VoxelShape DOWN_SHAPE = Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D);

	protected static final VoxelShape NORTH_SHAPE = Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 8.0D);

	protected static final VoxelShape EAST_SHAPE = Block.createCuboidShape(8.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D);

	protected static final VoxelShape UP_SHAPE = Block.createCuboidShape(0.0D, 8.0D, 0.0D, 16.0D, 16.0D, 16.0D);

	protected static final VoxelShape SOUTH_SHAPE = Block.createCuboidShape(0.0D, 0.0D, 8.0D, 16.0D, 16.0D, 16.0D);

	public XySlabBlock(Settings settings) {
		super(settings);
		setDefaultState(getDefaultState().with(FACING, Direction.UP).with(HALF, SlabType.BOTTOM).with(WATERLOGGED,
			Boolean.valueOf(false)));
	}

	protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
		builder.add(new Property[] { FACING, HALF, WATERLOGGED });
	}

	public boolean canFillWithFluid(BlockView world, BlockPos pos, BlockState state, Fluid fluid) {
		if (state.get(HALF) != SlabType.DOUBLE) return Waterloggable.super.canFillWithFluid(world, pos, state, fluid);
		return false;
	}

	public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
		switch (type) {
			case WATER:
				return world.getFluidState(pos).isIn(FluidTags.WATER);
			default:
				return false;
		}
	}

	public boolean canReplace(BlockState state, ItemPlacementContext context) {
		ItemStack itemStack = context.getStack();
		SlabType slabHalf = state.get(HALF);
		if (slabHalf == SlabType.DOUBLE || itemStack.getItem() != asItem()) return false;
		if (context.canReplaceExisting()) {
			BlockPos blockPos = context.getBlockPos();
			Direction direction = context.getSide();
			Axis directionAxis = direction.getAxis();
			Vec3d hitPos = context.getHitPos();
			if (state.get(HALF) != SlabType.DOUBLE)
				switch ((state.get(HALF) == SlabType.BOTTOM) ? state.get(FACING).getOpposite() : state.get(FACING)) {
				case WEST:
				return direction == Direction.EAST || hitPos.x - blockPos.getX() > 0.5D && directionAxis != Axis.X;
				case DOWN:
				return direction == Direction.UP || hitPos.y - blockPos.getY() > 0.5D && directionAxis != Axis.Y;
				case NORTH:
				return direction == Direction.SOUTH || hitPos.z - blockPos.getZ() > 0.5D && directionAxis != Axis.Z;
				case EAST:
				return direction == Direction.WEST || hitPos.x - blockPos.getX() <= 0.5D && directionAxis != Axis.X;
				case UP:
				return direction == Direction.DOWN || hitPos.y - blockPos.getY() <= 0.5D && directionAxis != Axis.Y;
				case SOUTH:
				return direction == Direction.NORTH || hitPos.z - blockPos.getZ() <= 0.5D && directionAxis != Axis.Z;
				}
		}
		return true;
	}

	public FluidState getFluidState(BlockState state) {
		return (state.get(WATERLOGGED)) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
	}

	public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
		if (state.get(HALF) != SlabType.DOUBLE)
			switch ((state.get(HALF) == SlabType.BOTTOM) ? state.get(FACING).getOpposite() : state.get(FACING)) {
			case WEST:
			return WEST_SHAPE;
			case DOWN:
			return DOWN_SHAPE;
			case NORTH:
			return NORTH_SHAPE;
			case EAST:
			return EAST_SHAPE;
			case UP:
			return UP_SHAPE;
			case SOUTH:
			return SOUTH_SHAPE;
			}
		return VoxelShapes.fullCube();
	}

	public BlockState getPlacementState(ItemPlacementContext ctx) {
		final BlockPos blockPos = ctx.getBlockPos();
		final BlockState blockState = ctx.getWorld().getBlockState(blockPos);
		if (blockState.isOf(this))
			return blockState.with(HALF, SlabType.DOUBLE).with(WATERLOGGED, Boolean.valueOf(false));
		final Direction stateDirection = ctx.getPlayerLookDirection().getOpposite();
		final SlabType stateHalf;
		switch (stateDirection) {
			case WEST:
				stateHalf = ctx.getHitPos().x - blockPos.getX() <= 0.5D ? SlabType.TOP : SlabType.BOTTOM;
				break;
			case DOWN:
				stateHalf = ctx.getHitPos().y - blockPos.getY() <= 0.5D ? SlabType.TOP : SlabType.BOTTOM;
				break;
			case NORTH:
				stateHalf = ctx.getHitPos().z - blockPos.getZ() <= 0.5D ? SlabType.TOP : SlabType.BOTTOM;
				break;
			case EAST:
				stateHalf = ctx.getHitPos().x - blockPos.getX() > 0.5D ? SlabType.TOP : SlabType.BOTTOM;
				break;
			case UP:
				stateHalf = ctx.getHitPos().y - blockPos.getY() > 0.5D ? SlabType.TOP : SlabType.BOTTOM;
				break;
			case SOUTH:
				stateHalf = ctx.getHitPos().z - blockPos.getZ() > 0.5D ? SlabType.TOP : SlabType.BOTTOM;
				break;
			default:
				stateHalf = SlabType.BOTTOM;
				break;
		}
		switch (stateDirection) {
			case WEST:
			case DOWN:
			case NORTH:
			case EAST:
			case UP:
			case SOUTH:
		}
		return getDefaultState().with(FACING, stateDirection).with(HALF, stateHalf).with(WATERLOGGED,
			Boolean.valueOf(ctx.getWorld().getFluidState(blockPos).getFluid() == Fluids.WATER));
	}

	public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState newState,
		WorldAccess world, BlockPos pos, BlockPos posFrom) {
		if (((Boolean) state.get(WATERLOGGED)).booleanValue())
			world.getFluidTickScheduler().schedule(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
		return super.getStateForNeighborUpdate(state, direction, newState, world, pos, posFrom);
	}

	public boolean hasSidedTransparency(BlockState state) { return state.get(HALF) != SlabType.DOUBLE; }

	public boolean tryFillWithFluid(WorldAccess world, BlockPos pos, BlockState state, FluidState fluidState) {
		if (state.get(HALF) != SlabType.DOUBLE)
			return Waterloggable.super.tryFillWithFluid(world, pos, state, fluidState);
		else return false;
	}
}

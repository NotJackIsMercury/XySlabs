package com.github.notjackismercury.xyslabs.block;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;

import com.github.notjackismercury.xyslabs.entry.XySlabsMain;

import net.minecraft.block.AbstractBlock.Settings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public final class XyBlocks {
	private static final Map<Identifier, Block> blocks = new LinkedHashMap<>();

	public static final XySlabBlock OAK_SLAB = register("oak_slab", new XySlabBlock(Settings.copy(Blocks.OAK_SLAB)));

	public static final XySlabBlock SPRUCE_SLAB = register("spruce_slab",
		new XySlabBlock(Settings.copy(Blocks.SPRUCE_SLAB)));

	public static final XySlabBlock BIRCH_SLAB = register("birch_slab",
		new XySlabBlock(Settings.copy(Blocks.BIRCH_SLAB)));

	public static final XySlabBlock JUNGLE_SLAB = register("jungle_slab",
		new XySlabBlock(Settings.copy(Blocks.JUNGLE_SLAB)));

	public static final XySlabBlock ACACIA_SLAB = register("acacia_slab",
		new XySlabBlock(Settings.copy(Blocks.ACACIA_SLAB)));

	public static final XySlabBlock DARK_OAK_SLAB = register("dark_oak_slab",
		new XySlabBlock(Settings.copy(Blocks.DARK_OAK_SLAB)));

	public static final XySlabBlock CRIMSON_SLAB = register("crimson_slab",
		new XySlabBlock(Settings.copy(Blocks.CRIMSON_SLAB)));

	public static final XySlabBlock WARPED_SLAB = register("warped_slab",
		new XySlabBlock(Settings.copy(Blocks.WARPED_SLAB)));

	public static final XySlabBlock STONE_SLAB = register("stone_slab",
		new XySlabBlock(Settings.copy(Blocks.STONE_SLAB)));

	public static final XySlabBlock SMOOTH_STONE_SLAB = register("smooth_stone_slab",
		new XySlabBlock(Settings.copy(Blocks.SMOOTH_STONE_SLAB)));

	public static final XySlabBlock SANDSTONE_SLAB = register("sandstone_slab",
		new XySlabBlock(Settings.copy(Blocks.SANDSTONE_SLAB)));

	public static final XySlabBlock CUT_SANDSTONE_SLAB = register("cut_sandstone_slab",
		new XySlabBlock(Settings.copy(Blocks.CUT_SANDSTONE_SLAB)));

	public static final XySlabBlock PETRIFIED_OAK_SLAB = register("petrified_oak_slab",
		new XySlabBlock(Settings.copy(Blocks.PETRIFIED_OAK_SLAB)));

	public static final XySlabBlock COBBLESTONE_SLAB = register("cobblestone_slab",
		new XySlabBlock(Settings.copy(Blocks.COBBLESTONE_SLAB)));

	public static final XySlabBlock BRICK_SLAB = register("brick_slab",
		new XySlabBlock(Settings.copy(Blocks.BRICK_SLAB)));

	public static final XySlabBlock STONE_BRICK_SLAB = register("stone_brick_slab",
		new XySlabBlock(Settings.copy(Blocks.STONE_BRICK_SLAB)));

	public static final XySlabBlock NETHER_BRICK_SLAB = register("nether_brick_slab",
		new XySlabBlock(Settings.copy(Blocks.NETHER_BRICK_SLAB)));

	public static final XySlabBlock QUARTZ_SLAB = register("quartz_slab",
		new XySlabBlock(Settings.copy(Blocks.QUARTZ_SLAB)));

	public static final XySlabBlock RED_SANDSTONE_SLAB = register("red_sandstone_slab",
		new XySlabBlock(Settings.copy(Blocks.RED_SANDSTONE_SLAB)));

	public static final XySlabBlock CUT_RED_SANDSTONE_SLAB = register("cut_red_sandstone_slab",
		new XySlabBlock(Settings.copy(Blocks.CUT_RED_SANDSTONE_SLAB)));

	public static final XySlabBlock PURPUR_SLAB = register("purpur_slab",
		new XySlabBlock(Settings.copy(Blocks.PURPUR_SLAB)));

	public static final XySlabBlock PRISMARINE_SLAB = register("prismarine_slab",
		new XySlabBlock(Settings.copy(Blocks.PRISMARINE_SLAB)));

	public static final XySlabBlock PRISMARINE_BRICK_SLAB = register("prismarine_brick_slab",
		new XySlabBlock(Settings.copy(Blocks.PRISMARINE_BRICK_SLAB)));

	public static final XySlabBlock DARK_PRISMARINE_SLAB = register("dark_prismarine_slab",
		new XySlabBlock(Settings.copy(Blocks.DARK_PRISMARINE_SLAB)));

	public static final XySlabBlock POLISHED_GRANITE_SLAB = register("polished_granite_slab",
		new XySlabBlock(Settings.copy(Blocks.POLISHED_GRANITE_SLAB)));

	public static final XySlabBlock SMOOTH_RED_SANDSTONE_SLAB = register("smooth_red_sandstone_slab",
		new XySlabBlock(Settings.copy(Blocks.SMOOTH_RED_SANDSTONE_SLAB)));

	public static final XySlabBlock MOSSY_STONE_BRICK_SLAB = register("mossy_stone_brick_slab",
		new XySlabBlock(Settings.copy(Blocks.MOSSY_STONE_BRICK_SLAB)));

	public static final XySlabBlock POLISHED_DIORITE_SLAB = register("polished_diorite_slab",
		new XySlabBlock(Settings.copy(Blocks.POLISHED_DIORITE_SLAB)));

	public static final XySlabBlock MOSSY_COBBLESTONE_SLAB = register("mossy_cobblestone_slab",
		new XySlabBlock(Settings.copy(Blocks.MOSSY_COBBLESTONE_SLAB)));

	public static final XySlabBlock END_STONE_BRICK_SLAB = register("end_stone_brick_slab",
		new XySlabBlock(Settings.copy(Blocks.END_STONE_BRICK_SLAB)));

	public static final XySlabBlock SMOOTH_SANDSTONE_SLAB = register("smooth_sandstone_slab",
		new XySlabBlock(Settings.copy(Blocks.SMOOTH_SANDSTONE_SLAB)));

	public static final XySlabBlock SMOOTH_QUARTZ_SLAB = register("smooth_quartz_slab",
		new XySlabBlock(Settings.copy(Blocks.SMOOTH_QUARTZ_SLAB)));

	public static final XySlabBlock GRANITE_SLAB = register("granite_slab",
		new XySlabBlock(Settings.copy(Blocks.GRANITE_SLAB)));

	public static final XySlabBlock ANDESITE_SLAB = register("andesite_slab",
		new XySlabBlock(Settings.copy(Blocks.ANDESITE_SLAB)));

	public static final XySlabBlock RED_NETHER_BRICK_SLAB = register("red_nether_brick_slab",
		new XySlabBlock(Settings.copy(Blocks.RED_NETHER_BRICK_SLAB)));

	public static final XySlabBlock POLISHED_ANDESITE_SLAB = register("polished_andesite_slab",
		new XySlabBlock(Settings.copy(Blocks.POLISHED_ANDESITE_SLAB)));

	public static final XySlabBlock DIORITE_SLAB = register("diorite_slab",
		new XySlabBlock(Settings.copy(Blocks.DIORITE_SLAB)));

	public static final XySlabBlock BLACKSTONE_SLAB = register("blackstone_slab",
		new XySlabBlock(Settings.copy(Blocks.BLACKSTONE_SLAB)));

	public static final XySlabBlock POLISHED_BLACKSTONE_SLAB = register("polished_blackstone_slab",
		new XySlabBlock(Settings.copy(Blocks.POLISHED_BLACKSTONE_SLAB)));

	public static final XySlabBlock POLISHED_BLACKSTONE_BRICK_SLAB = register("polished_blackstone_brick_slab",
		new XySlabBlock(Settings.copy(Blocks.POLISHED_BLACKSTONE_BRICK_SLAB)));

	public static void foreach(BiConsumer<Identifier, Block> action) { blocks.forEach(action); }

	private static <T extends Block> T register(String namespace, T block) {
		blocks.put(XySlabsMain.id(namespace), block);
		return block;
	}

	public static final void register() {
		// blocks.forEach((id, block) -> Registry.register(Registry.BLOCK, id,
		// block));
		for (Map.Entry<Identifier, Block> entry : blocks.entrySet())
			Registry.register(Registry.BLOCK, entry.getKey(), entry.getValue());
	}
}

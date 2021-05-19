package com.github.notjackismercury.xyslabs.item;

import java.util.LinkedHashMap;
import java.util.Map;

import com.github.notjackismercury.xyslabs.block.XyBlocks;
import com.github.notjackismercury.xyslabs.entry.XySlabsMain;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class XyItems {
	private static final Map<Identifier, Item> items = new LinkedHashMap<>();

	public static final Item OAK_SLAB = register("oak_slab", XyBlocks.OAK_SLAB, ItemGroup.BUILDING_BLOCKS);

	public static final Item SPRUCE_SLAB = register("spruce_slab", XyBlocks.SPRUCE_SLAB, ItemGroup.BUILDING_BLOCKS);

	public static final Item BIRCH_SLAB = register("birch_slab", XyBlocks.BIRCH_SLAB, ItemGroup.BUILDING_BLOCKS);

	public static final Item JUNGLE_SLAB = register("jungle_slab", XyBlocks.JUNGLE_SLAB, ItemGroup.BUILDING_BLOCKS);

	public static final Item ACACIA_SLAB = register("acacia_slab", XyBlocks.ACACIA_SLAB, ItemGroup.BUILDING_BLOCKS);

	public static final Item DARK_OAK_SLAB = register("dark_oak_slab", XyBlocks.DARK_OAK_SLAB,
		ItemGroup.BUILDING_BLOCKS);

	public static final Item CRIMSON_SLAB = register("crimson_slab", XyBlocks.CRIMSON_SLAB, ItemGroup.BUILDING_BLOCKS);

	public static final Item WARPED_SLAB = register("warped_slab", XyBlocks.WARPED_SLAB, ItemGroup.BUILDING_BLOCKS);

	public static final Item STONE_SLAB = register("stone_slab", XyBlocks.STONE_SLAB, ItemGroup.BUILDING_BLOCKS);

	public static final Item SMOOTH_STONE_SLAB = register("smooth_stone_slab", XyBlocks.SMOOTH_STONE_SLAB,
		ItemGroup.BUILDING_BLOCKS);

	public static final Item SANDSTONE_SLAB = register("sandstone_slab", XyBlocks.SANDSTONE_SLAB,
		ItemGroup.BUILDING_BLOCKS);

	public static final Item CUT_SANDSTONE_SLAB = register("cut_sandstone_slab", XyBlocks.CUT_SANDSTONE_SLAB,
		ItemGroup.BUILDING_BLOCKS);

	public static final Item PETRIFIED_OAK_SLAB = register("petrified_oak_slab", XyBlocks.PETRIFIED_OAK_SLAB,
		ItemGroup.BUILDING_BLOCKS);

	public static final Item COBBLESTONE_SLAB = register("cobblestone_slab", XyBlocks.COBBLESTONE_SLAB,
		ItemGroup.BUILDING_BLOCKS);

	public static final Item BRICK_SLAB = register("brick_slab", XyBlocks.BRICK_SLAB, ItemGroup.BUILDING_BLOCKS);

	public static final Item STONE_BRICK_SLAB = register("stone_brick_slab", XyBlocks.STONE_BRICK_SLAB,
		ItemGroup.BUILDING_BLOCKS);

	public static final Item NETHER_BRICK_SLAB = register("nether_brick_slab", XyBlocks.NETHER_BRICK_SLAB,
		ItemGroup.BUILDING_BLOCKS);

	public static final Item QUARTZ_SLAB = register("quartz_slab", XyBlocks.QUARTZ_SLAB, ItemGroup.BUILDING_BLOCKS);

	public static final Item RED_SANDSTONE_SLAB = register("red_sandstone_slab", XyBlocks.RED_SANDSTONE_SLAB,
		ItemGroup.BUILDING_BLOCKS);

	public static final Item CUT_RED_SANDSTONE_SLAB = register("cut_red_sandstone_slab",
		XyBlocks.CUT_RED_SANDSTONE_SLAB, ItemGroup.BUILDING_BLOCKS);

	public static final Item PURPUR_SLAB = register("purpur_slab", XyBlocks.PURPUR_SLAB, ItemGroup.BUILDING_BLOCKS);

	public static final Item PRISMARINE_SLAB = register("prismarine_slab", XyBlocks.PRISMARINE_SLAB,
		ItemGroup.BUILDING_BLOCKS);

	public static final Item PRISMARINE_BRICK_SLAB = register("prismarine_brick_slab", XyBlocks.PRISMARINE_BRICK_SLAB,
		ItemGroup.BUILDING_BLOCKS);

	public static final Item DARK_PRISMARINE_SLAB = register("dark_prismarine_slab", XyBlocks.DARK_PRISMARINE_SLAB,
		ItemGroup.BUILDING_BLOCKS);

	public static final Item POLISHED_GRANITE_SLAB = register("polished_granite_slab", XyBlocks.POLISHED_GRANITE_SLAB,
		ItemGroup.BUILDING_BLOCKS);

	public static final Item SMOOTH_RED_SANDSTONE_SLAB = register("smooth_red_sandstone_slab",
		XyBlocks.SMOOTH_RED_SANDSTONE_SLAB, ItemGroup.BUILDING_BLOCKS);

	public static final Item MOSSY_STONE_BRICK_SLAB = register("mossy_stone_brick_slab",
		XyBlocks.MOSSY_STONE_BRICK_SLAB, ItemGroup.BUILDING_BLOCKS);

	public static final Item POLISHED_DIORITE_SLAB = register("polished_diorite_slab", XyBlocks.POLISHED_DIORITE_SLAB,
		ItemGroup.BUILDING_BLOCKS);

	public static final Item MOSSY_COBBLESTONE_SLAB = register("mossy_cobblestone_slab",
		XyBlocks.MOSSY_COBBLESTONE_SLAB, ItemGroup.BUILDING_BLOCKS);

	public static final Item END_STONE_BRICK_SLAB = register("end_stone_brick_slab", XyBlocks.END_STONE_BRICK_SLAB,
		ItemGroup.BUILDING_BLOCKS);

	public static final Item SMOOTH_SANDSTONE_SLAB = register("smooth_sandstone_slab", XyBlocks.SMOOTH_SANDSTONE_SLAB,
		ItemGroup.BUILDING_BLOCKS);

	public static final Item SMOOTH_QUARTZ_SLAB = register("smooth_quartz_slab", XyBlocks.SMOOTH_QUARTZ_SLAB,
		ItemGroup.BUILDING_BLOCKS);

	public static final Item GRANITE_SLAB = register("granite_slab", XyBlocks.GRANITE_SLAB, ItemGroup.BUILDING_BLOCKS);

	public static final Item ANDESITE_SLAB = register("andesite_slab", XyBlocks.ANDESITE_SLAB,
		ItemGroup.BUILDING_BLOCKS);

	public static final Item RED_NETHER_BRICK_SLAB = register("red_nether_brick_slab", XyBlocks.RED_NETHER_BRICK_SLAB,
		ItemGroup.BUILDING_BLOCKS);

	public static final Item POLISHED_ANDESITE_SLAB = register("polished_andesite_slab",
		XyBlocks.POLISHED_ANDESITE_SLAB, ItemGroup.BUILDING_BLOCKS);

	public static final Item DIORITE_SLAB = register("diorite_slab", XyBlocks.DIORITE_SLAB, ItemGroup.BUILDING_BLOCKS);

	public static final Item BLACKSTONE_SLAB = register("blackstone_slab", XyBlocks.BLACKSTONE_SLAB,
		ItemGroup.BUILDING_BLOCKS);

	public static final Item POLISHED_BLACKSTONE_SLAB = register("polished_blackstone_slab",
		XyBlocks.POLISHED_BLACKSTONE_SLAB, ItemGroup.BUILDING_BLOCKS);

	public static final Item POLISHED_BLACKSTONE_BRICK_SLAB = register("polished_blackstone_brick_slab",
		XyBlocks.POLISHED_BLACKSTONE_BRICK_SLAB, ItemGroup.BUILDING_BLOCKS);

	public static final void register() {
		// items.forEach((id, item) -> Registry.register(Registry.ITEM, id,
		// item));
		for (Map.Entry<Identifier, Item> entry : items.entrySet())
			Registry.register(Registry.ITEM, entry.getKey(), entry.getValue());
	}

	public static Item register(Identifier id, Block block, ItemGroup group) {
		return register(id, new BlockItem(block, (new Item.Settings()).group(group)));
	}

	private static Item register(Identifier id, Item item) {
		if (item instanceof BlockItem) ((BlockItem) item).appendBlocks(Item.BLOCK_ITEMS, item);
		items.put(id, item);
		return item;
	}

	public static Item register(String namespace, Block block, ItemGroup group) {
		return register(namespace, new BlockItem(block, (new Item.Settings()).group(group)));
	}

	private static Item register(String namespace, Item item) { return register(XySlabsMain.id(namespace), item); }
}

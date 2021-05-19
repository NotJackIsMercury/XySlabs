package com.github.notjackismercury.xyslabs.entry;

import com.github.notjackismercury.xyslabs.block.XyBlocks;
import com.github.notjackismercury.xyslabs.item.XyItems;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;

public class XySlabsMain implements ModInitializer {
	public static final Identifier id(String namespace) {
		return new Identifier("xyslabs", namespace);
	}

	public void onInitialize() {
		XyBlocks.register();
		XyItems.register();
	}
}

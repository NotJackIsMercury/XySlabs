package com.github.notjackismercury.xyslabs.state.property;

import net.minecraft.block.enums.SlabType;
import net.minecraft.state.property.EnumProperty;

public class XyProperties {
	public static final EnumProperty<SlabType> SLAB_HALF = EnumProperty.of("half", SlabType.class);
}

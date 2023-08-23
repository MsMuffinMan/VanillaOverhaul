package com.tool_stats;

import net.minecraft.nbt.Tag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public abstract class ModdedTiers {

    public static final ForgeTier WOOD = new ForgeTier(0, 59, 2.0F, 0.0F, 15,
            BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ItemTags.PLANKS));
    public static final ForgeTier STONE = new ForgeTier(1, 1500, 4.0F, 1.0F, 5,
            BlockTags.STONE_BRICKS, () -> Ingredient.of(ItemTags.STONE_TOOL_MATERIALS));
    public static final ForgeTier COPPER = new ForgeTier(1, 250, 5.0F, 1.0F, 14,
            BlockTags.COPPER_ORES, () -> Ingredient.of(Items.COPPER_INGOT));
    public static final ForgeTier GOLD = new ForgeTier(2, 32, 12.0F, 0.0F, 22,
            BlockTags.GOLD_ORES, () -> Ingredient.of(Items.GOLD_INGOT));
    public static final ForgeTier IRON = new ForgeTier(2, 500, 6.0F, 2.0F, 14,
            BlockTags.IRON_ORES, () -> Ingredient.of(Items.IRON_INGOT));
    public static final ForgeTier DIAMOND = new ForgeTier(3, 1000, 8.0F, 3.0F, 10,
            BlockTags.DIAMOND_ORES, () -> Ingredient.of(Items.DIAMOND));
    public static final ForgeTier NETHERITE = new ForgeTier(4, 2000, 10.0F, 4.0F, 15,
            BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(Items.NETHERITE_INGOT));




    public static void registerAllTiers() {
        TierSortingRegistry.registerTier(WOOD, new ResourceLocation("modded_tiers:new_wood"),
                List.of(),
                List.of());
        TierSortingRegistry.registerTier(STONE, new ResourceLocation("modded_tiers:new_stone"),
                List.of(WOOD),
                List.of());
        TierSortingRegistry.registerTier(COPPER, new ResourceLocation("modded_tiers:new_copper"),
                List.of(STONE),
                List.of());
        TierSortingRegistry.registerTier(GOLD, new ResourceLocation("modded_tiers:new_gold"),
                List.of(COPPER),
                List.of());
        TierSortingRegistry.registerTier(IRON, new ResourceLocation("modded_tiers:new_iron"),
                List.of(GOLD),
                List.of());
        TierSortingRegistry.registerTier(DIAMOND, new ResourceLocation("modded_tiers:new_diamond"),
                List.of(IRON),
                List.of());
        TierSortingRegistry.registerTier(NETHERITE, new ResourceLocation("modded_tiers:new_netherite"),
                List.of(DIAMOND),
                List.of());
    }

}

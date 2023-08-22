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

    public static final ForgeTier wood = new ForgeTier(0, 59, 2.0F, 0.0F, 15,
            BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ItemTags.PLANKS));
    public static final ForgeTier stone = new ForgeTier(1, 1500, 4.0F, 1.0F, 5,
            BlockTags.STONE_BRICKS, () -> Ingredient.of(ItemTags.STONE_TOOL_MATERIALS));
    public static final ForgeTier copper = new ForgeTier(1, 250, 5.0F, 1.0F, 14,
            BlockTags.COPPER_ORES, () -> Ingredient.of(Items.COPPER_INGOT));
    public static final ForgeTier gold = new ForgeTier(2, 32, 12.0F, 0.0F, 22,
            BlockTags.GOLD_ORES, () -> Ingredient.of(Items.GOLD_INGOT));
    public static final ForgeTier iron = new ForgeTier(2, 500, 6.0F, 2.0F, 14,
            BlockTags.IRON_ORES, () -> Ingredient.of(Items.IRON_INGOT));
    public static final ForgeTier diamond = new ForgeTier(3, 1000, 8.0F, 3.0F, 10,
            BlockTags.DIAMOND_ORES, () -> Ingredient.of(Items.DIAMOND));
    public static final ForgeTier netherite = new ForgeTier(4, 2000, 10.0F, 4.0F, 15,
            BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(Items.NETHERITE_INGOT));




    public static void registerAllTiers() {
        TierSortingRegistry.registerTier(wood, new ResourceLocation("modded_tiers:new_wood"),
                List.of(),
                List.of());
        TierSortingRegistry.registerTier(stone, new ResourceLocation("modded_tiers:new_stone"),
                List.of(wood),
                List.of());
        TierSortingRegistry.registerTier(copper, new ResourceLocation("modded_tiers:new_copper"),
                List.of(stone),
                List.of());
        TierSortingRegistry.registerTier(gold, new ResourceLocation("modded_tiers:new_gold"),
                List.of(copper),
                List.of());
        TierSortingRegistry.registerTier(iron, new ResourceLocation("modded_tiers:new_iron"),
                List.of(gold),
                List.of());
        TierSortingRegistry.registerTier(diamond, new ResourceLocation("modded_tiers:new_diamond"),
                List.of(iron),
                List.of());
        TierSortingRegistry.registerTier(netherite, new ResourceLocation("modded_tiers:new_netherite"),
                List.of(diamond),
                List.of());
    }

}

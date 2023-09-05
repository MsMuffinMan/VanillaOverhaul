package com.villagers;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.entity.npc.VillagerTrades.ItemListing;

public enum BiomeMarkers {

    OVERWORLD(0, VillagerTrades.WANDERING_TRADER_TRADES, 10),
    NETHER(1, ModdedVillagerTrades.NETHER_WANDERING_TRADER_TRADES, 10),
    END(2, null, 10);

    private final int biomeIndex;
    private final Int2ObjectMap<ItemListing[]> biomeSpecificTrades;
    private final int weight;

    private BiomeMarkers(int biomeIndex, Int2ObjectMap<ItemListing[]> biomeSpecificTrades, int weight) {
        this.biomeIndex = biomeIndex;
        this.biomeSpecificTrades = biomeSpecificTrades;
        this.weight = weight;
    }

    public int getBiomeIndex() {
        return biomeIndex;
    }

    public Int2ObjectMap<ItemListing[]> getBiomeSpecificTrades() {
        return biomeSpecificTrades;
    }

    public int getWeight() {
        return weight;
    }
}

package com.villagers;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.DefaultAttributes;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.entity.npc.WanderingTrader;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraft.world.item.trading.MerchantOffers;
import net.minecraft.world.level.Level;

public class BiomeWanderingTrader extends WanderingTrader {

    private final BiomeMarkers biomeMarker;

    public BiomeWanderingTrader(EntityType<? extends BiomeWanderingTrader> p_35843_, Level p_35844_) {
        super(EntityType.WANDERING_TRADER, p_35844_);
        this.biomeMarker = BiomeMarkers.NETHER;

        DefaultAttributes.validate();
        // Randomly set a biome on the villager
    }
    public static AttributeSupplier.Builder createAttributes() {
        return LivingEntity.createLivingAttributes().add(Attributes.MAX_HEALTH, 1.0);
    }

    public BiomeMarkers getBiomeMarker() {
        return biomeMarker;
    }

    @Override
    protected void updateTrades() {
        VillagerTrades.ItemListing[] villagerTradesSetOne = biomeMarker.getBiomeSpecificTrades().get(1);
        VillagerTrades.ItemListing[] villagerTradesSetTwo = biomeMarker.getBiomeSpecificTrades().get(2);
        if (villagerTradesSetOne != null && villagerTradesSetTwo != null) {
            MerchantOffers merchantoffers = this.getOffers();
            this.addOffersFromItemListings(merchantoffers, villagerTradesSetOne, 5);
            int i = this.random.nextInt(villagerTradesSetTwo.length);
            VillagerTrades.ItemListing villagertrades$itemlisting = villagerTradesSetTwo[i];
            MerchantOffer merchantoffer = villagertrades$itemlisting.getOffer(this, this.random);
            if (merchantoffer != null) {
                merchantoffers.add(merchantoffer);
            }
        }
    }




}

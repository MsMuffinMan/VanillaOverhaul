package com.eventhandlers;

import com.tool_stats.TiersMod;
import com.villagers.BiomeWanderingTrader;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.entity.EntityAttributeModificationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class LivingEntityHandler {

    /*
    @SubscribeEvent
    public static void newEntityAttributes(EntityAttributeCreationEvent event) {
        event.put(TiersMod.BIOME_WANDERING_TRADER.get(), BiomeWanderingTrader.createAttributes().build());
    }

    @SubscribeEvent
    public static void existingEntityAttributes(EntityAttributeModificationEvent event) {
        if (!event.has(TiersMod.BIOME_WANDERING_TRADER.get(), Attributes.LUCK)) {
            event.add(TiersMod.BIOME_WANDERING_TRADER.get(),
                Attributes.LUCK // Applies new attribute to creeper
            );
        }
    }

     */
}

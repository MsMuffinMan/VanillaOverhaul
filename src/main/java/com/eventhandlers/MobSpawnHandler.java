package com.eventhandlers;

import com.tool_stats.TiersMod;
import com.villagers.BiomeWanderingTrader;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.npc.WanderingTrader;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraftforge.event.entity.living.MobSpawnEvent.FinalizeSpawn;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class MobSpawnHandler {

    @SubscribeEvent
    public void modSpawn(FinalizeSpawn event) {
        if (event.getEntity() instanceof WanderingTrader && !(event.getEntity() instanceof BiomeWanderingTrader)) {
            //Convert to one of my custom types and cancel the original event.
            BiomeWanderingTrader biomeWanderer = new BiomeWanderingTrader(TiersMod.BIOME_WANDERING_TRADER.get(), (Level) event.getLevel());
            event.setCanceled(true);
            ForgeEventFactory.onFinalizeSpawn(biomeWanderer, event.getLevel(), event.getDifficulty(), event.getSpawnType(), event.getSpawnData(), event.getSpawnTag());

        }
    }
}

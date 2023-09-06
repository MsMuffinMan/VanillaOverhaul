package com.registries;

import com.villagers.BiomeWanderingTrader;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.tool_stats.TiersMod.MODID;

public class TiersModEntityRegister {

    // Create a Deferred Register to hold new Entity Types which will all be registered under the "tiersMod" namespace
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MODID);


    public static final RegistryObject<EntityType<BiomeWanderingTrader>> BIOME_WANDERING_TRADER = ENTITY_TYPES.register("biome_wandering_trader",
            () -> EntityType.Builder.of(BiomeWanderingTrader::new, MobCategory.CREATURE).sized(0.6F, 1.95F).clientTrackingRange(10)
                    .build(new ResourceLocation(MODID, "biome_wandering_trader").toString()));

}

package com.registries;

import com.tool_stats.ModdedTiers;
import com.tools.UpgradeablePickaxeItem;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.tool_stats.TiersMod.MODID;

public class TiersModItemsRegister {

    // Create a Deferred Register to hold Items which will all be registered under the "tiersMod" namespace
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);


    // Creates a new food item with the id "tiersMod:example_id", nutrition 1 and saturation 2
    public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register("example_item",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .alwaysEat().nutrition(1).saturationMod(2f).build())));

    public static final RegistryObject<Item> MODDED_IRON_PICKAXE = ITEMS.register("modded_iron_pickaxe",
            () -> new UpgradeablePickaxeItem(ModdedTiers.IRON, 1, -2.8F, new Item.Properties()));

    public static final RegistryObject<Item> NETHER_WANDERING_TRADER_EGG = ITEMS.register("nether_wandering_trader_egg",
            () -> new ForgeSpawnEggItem(TiersModEntityRegister.BIOME_WANDERING_TRADER, 4547222, 15377456, new Item.Properties()));


    public static final RegistryObject<Item> EXAMPLE_BLOCK_ITEM = ITEMS.register("example_block", () -> new BlockItem(TiersModBlocksRegister.EXAMPLE_BLOCK.get(), new Item.Properties()));
}

package com.fishing;

import com.registries.TiersModItemsRegister;
import com.tool_stats.TiersMod;
import com.tool_stats.VanillaItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.RegistryObject;

public class LootCrateRegister {


    public static final RegistryObject<Item> COMMON_LOOT_CRATE = TiersModItemsRegister.ITEMS.register("common_loot_crate",
        () -> new LootCrate(Rarity.COMMON));
    public static final RegistryObject<Item> UNCOMMON_LOOT_CRATE = TiersModItemsRegister.ITEMS.register("uncommon_loot_crate",
        () -> new LootCrate(Rarity.UNCOMMON));
    public static final RegistryObject<Item> RARE_LOOT_CRATE = TiersModItemsRegister.ITEMS.register("rare_loot_crate",
        () -> new LootCrate(Rarity.RARE));
    public static final RegistryObject<Item> EPIC_LOOT_CRATE = TiersModItemsRegister.ITEMS.register("epic_loot_crate",
        () -> new LootCrate(Rarity.EPIC));


    public static final RegistryObject<CreativeModeTab> CRATE_TAB = TiersMod.CREATIVE_MODE_TABS.register("tiers_mod", () -> CreativeModeTab.builder()
        .withTabsBefore(CreativeModeTabs.COMBAT)
        .icon(() -> VanillaItems.GOLDEN_AXE.get().getDefaultInstance())
        .displayItems((parameters, output) -> {
            output.accept(COMMON_LOOT_CRATE.get());
            output.accept(UNCOMMON_LOOT_CRATE.get());
            output.accept(RARE_LOOT_CRATE.get());
            output.accept(EPIC_LOOT_CRATE.get()); // Add the example item to the tab. For your own tabs, this method is preferred over the event
        }).build());
}

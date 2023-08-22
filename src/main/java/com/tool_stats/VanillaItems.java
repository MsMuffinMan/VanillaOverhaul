package com.tool_stats;

import net.minecraft.world.item.*;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;



public final class VanillaItems {

    public static final DeferredRegister<Item> VANILLA_TOOLS = DeferredRegister.create(ForgeRegistries.ITEMS, "minecraft");

    // Wood
    public static final RegistryObject<Item> WOODEN_SWORD = VANILLA_TOOLS.register("wooden_sword", () -> new SwordItem(ModdedTiers.wood, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> WOODEN_SHOVEL = VANILLA_TOOLS.register("wooden_shovel", () -> new ShovelItem(ModdedTiers.wood, 1.5F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> WOODEN_PICKAXE = VANILLA_TOOLS.register("wooden_pickaxe", () -> new PickaxeItem(ModdedTiers.wood, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> WOODEN_AXE = VANILLA_TOOLS.register("wooden_axe", () -> new AxeItem(ModdedTiers.wood, 6.0F, -3.2F, new Item.Properties()));
    public static final RegistryObject<Item> WOODEN_HOE = VANILLA_TOOLS.register("wooden_hoe", () -> new HoeItem(ModdedTiers.wood, 0, -3.0F, new Item.Properties()));

    // Stone
    public static final RegistryObject<Item> STONE_SWORD = VANILLA_TOOLS.register("stone_sword", () -> new SwordItem(ModdedTiers.stone, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> STONE_SHOVEL = VANILLA_TOOLS.register("stone_shovel", () -> new ShovelItem(ModdedTiers.stone, 1.5F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> STONE_PICKAXE = VANILLA_TOOLS.register("stone_pickaxe", () -> new PickaxeItem(ModdedTiers.stone, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> STONE_AXE = VANILLA_TOOLS.register("stone_axe", () -> new AxeItem(ModdedTiers.stone, 7.0F, -3.2F, new Item.Properties()));
    public static final RegistryObject<Item> STONE_HOE = VANILLA_TOOLS.register("stone_hoe", () -> new HoeItem(ModdedTiers.stone, -1, -2.0F, new Item.Properties()));

    // Copper
    public static final RegistryObject<Item> COPPER_SWORD = VANILLA_TOOLS.register("copper_sword", () -> new SwordItem(ModdedTiers.copper, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_SHOVEL = VANILLA_TOOLS.register("copper_shovel", () -> new ShovelItem(ModdedTiers.copper, 1.5F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_PICKAXE = VANILLA_TOOLS.register("copper_pickaxe", () -> new PickaxeItem(ModdedTiers.copper, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_AXE = VANILLA_TOOLS.register("copper_axe", () -> new AxeItem(ModdedTiers.copper, 6.0F, -3.1F, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_HOE = VANILLA_TOOLS.register("copper_hoe", () -> new HoeItem(ModdedTiers.copper, -2, -1.0F, new Item.Properties()));

    // Gold
    public static final RegistryObject<Item> GOLDEN_SWORD = VANILLA_TOOLS.register("golden_sword", () -> new SwordItem(ModdedTiers.gold, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_SHOVEL = VANILLA_TOOLS.register("golden_shovel", () -> new ShovelItem(ModdedTiers.gold, 1.5F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_PICKAXE = VANILLA_TOOLS.register("golden_pickaxe", () -> new PickaxeItem(ModdedTiers.gold, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_AXE = VANILLA_TOOLS.register("golden_axe", () -> new AxeItem(ModdedTiers.gold, 6.0F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_HOE = VANILLA_TOOLS.register("golden_hoe", () -> new HoeItem(ModdedTiers.gold, 0, -3.0F, new Item.Properties()));

    // Iron
    public static final RegistryObject<Item> IRON_SWORD = VANILLA_TOOLS.register("iron_sword", () -> new SwordItem(ModdedTiers.iron, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> IRON_SHOVEL = VANILLA_TOOLS.register("iron_shovel", () -> new ShovelItem(ModdedTiers.iron, 1.5F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> IRON_PICKAXE = VANILLA_TOOLS.register("iron_pickaxe", () -> new PickaxeItem(ModdedTiers.iron, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> IRON_AXE = VANILLA_TOOLS.register("iron_axe", () -> new AxeItem(ModdedTiers.iron, 6.0F, -3.1F, new Item.Properties()));
    public static final RegistryObject<Item> IRON_HOE = VANILLA_TOOLS.register("iron_hoe", () -> new HoeItem(ModdedTiers.iron, -2, -1.0F, new Item.Properties()));

    // Diamond
    public static final RegistryObject<Item> DIAMOND_SWORD = VANILLA_TOOLS.register("diamond_sword", () -> new SwordItem(ModdedTiers.diamond, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_SHOVEL = VANILLA_TOOLS.register("diamond_shovel", () -> new ShovelItem(ModdedTiers.diamond, 1.5F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_PICKAXE = VANILLA_TOOLS.register("diamond_pickaxe", () -> new PickaxeItem(ModdedTiers.diamond, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_AXE = VANILLA_TOOLS.register("diamond_axe", () -> new AxeItem(ModdedTiers.diamond, 5.0F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_HOE = VANILLA_TOOLS.register("diamond_hoe", () -> new HoeItem(ModdedTiers.diamond, -3, 0.0F, new Item.Properties()));

    // Netherite
    public static final RegistryObject<Item> NETHERITE_SWORD = VANILLA_TOOLS.register("netherite_sword", () -> new SwordItem(ModdedTiers.iron, 3, -2.4F, (new Item.Properties()).fireResistant()));
    public static final RegistryObject<Item> NETHERITE_SHOVEL = VANILLA_TOOLS.register("netherite_shovel", () -> new ShovelItem(ModdedTiers.netherite, 1.5F, -3.0F, (new Item.Properties()).fireResistant()));
    public static final RegistryObject<Item> NETHERITE_PICKAXE = VANILLA_TOOLS.register("netherite_pickaxe", () -> new PickaxeItem(ModdedTiers.netherite, 1, -2.8F, (new Item.Properties()).fireResistant()));
    public static final RegistryObject<Item> NETHERITE_AXE = VANILLA_TOOLS.register("netherite_axe", () -> new AxeItem(ModdedTiers.netherite, 5.0F, -3.0F, (new Item.Properties()).fireResistant()));
    public static final RegistryObject<Item> NETHERITE_HOE = VANILLA_TOOLS.register("netherite_hoe", () -> new HoeItem(ModdedTiers.netherite, -4, 0.0F, (new Item.Properties()).fireResistant()));

    // Other Vanilla overrides
    public static final RegistryObject<Item> ELYTRA = VANILLA_TOOLS.register("elytra", () -> new ElytraItem((new Item.Properties()).durability(1000).rarity(Rarity.UNCOMMON)));


}

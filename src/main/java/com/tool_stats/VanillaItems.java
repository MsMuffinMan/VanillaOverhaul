package com.tool_stats;

import net.minecraft.world.item.*;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;



public final class VanillaItems {

    public static final DeferredRegister<Item> VANILLA_TOOLS = DeferredRegister.create(ForgeRegistries.ITEMS, "minecraft");

    // Wood
    public static final RegistryObject<Item> WOODEN_SWORD = VANILLA_TOOLS.register("wooden_sword", () -> new SwordItem(ModdedTiers.WOOD, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> WOODEN_SHOVEL = VANILLA_TOOLS.register("wooden_shovel", () -> new ShovelItem(ModdedTiers.WOOD, 1.5F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> WOODEN_PICKAXE = VANILLA_TOOLS.register("wooden_pickaxe", () -> new PickaxeItem(ModdedTiers.WOOD, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> WOODEN_AXE = VANILLA_TOOLS.register("wooden_axe", () -> new AxeItem(ModdedTiers.WOOD, 6.0F, -3.2F, new Item.Properties()));
    public static final RegistryObject<Item> WOODEN_HOE = VANILLA_TOOLS.register("wooden_hoe", () -> new HoeItem(ModdedTiers.WOOD, 0, -3.0F, new Item.Properties()));

    // Stone
    public static final RegistryObject<Item> STONE_SWORD = VANILLA_TOOLS.register("stone_sword", () -> new SwordItem(ModdedTiers.STONE, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> STONE_SHOVEL = VANILLA_TOOLS.register("stone_shovel", () -> new ShovelItem(ModdedTiers.STONE, 1.5F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> STONE_PICKAXE = VANILLA_TOOLS.register("stone_pickaxe", () -> new PickaxeItem(ModdedTiers.STONE, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> STONE_AXE = VANILLA_TOOLS.register("stone_axe", () -> new AxeItem(ModdedTiers.STONE, 7.0F, -3.2F, new Item.Properties()));
    public static final RegistryObject<Item> STONE_HOE = VANILLA_TOOLS.register("stone_hoe", () -> new HoeItem(ModdedTiers.STONE, -1, -2.0F, new Item.Properties()));

    // Copper
    public static final RegistryObject<Item> COPPER_SWORD = VANILLA_TOOLS.register("copper_sword", () -> new SwordItem(ModdedTiers.COPPER, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_SHOVEL = VANILLA_TOOLS.register("copper_shovel", () -> new ShovelItem(ModdedTiers.COPPER, 1.5F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_PICKAXE = VANILLA_TOOLS.register("copper_pickaxe", () -> new PickaxeItem(ModdedTiers.COPPER, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_AXE = VANILLA_TOOLS.register("copper_axe", () -> new AxeItem(ModdedTiers.COPPER, 6.0F, -3.1F, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_HOE = VANILLA_TOOLS.register("copper_hoe", () -> new HoeItem(ModdedTiers.COPPER, -2, -1.0F, new Item.Properties()));

    // Gold
    public static final RegistryObject<Item> GOLDEN_SWORD = VANILLA_TOOLS.register("golden_sword", () -> new SwordItem(ModdedTiers.GOLD, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_SHOVEL = VANILLA_TOOLS.register("golden_shovel", () -> new ShovelItem(ModdedTiers.GOLD, 1.5F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_PICKAXE = VANILLA_TOOLS.register("golden_pickaxe", () -> new PickaxeItem(ModdedTiers.GOLD, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_AXE = VANILLA_TOOLS.register("golden_axe", () -> new AxeItem(ModdedTiers.GOLD, 6.0F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_HOE = VANILLA_TOOLS.register("golden_hoe", () -> new HoeItem(ModdedTiers.GOLD, 0, -3.0F, new Item.Properties()));

    // Iron
    public static final RegistryObject<Item> IRON_SWORD = VANILLA_TOOLS.register("iron_sword", () -> new SwordItem(ModdedTiers.IRON, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> IRON_SHOVEL = VANILLA_TOOLS.register("iron_shovel", () -> new ShovelItem(ModdedTiers.IRON, 1.5F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> IRON_PICKAXE = VANILLA_TOOLS.register("iron_pickaxe", () -> new PickaxeItem(ModdedTiers.IRON, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> IRON_AXE = VANILLA_TOOLS.register("iron_axe", () -> new AxeItem(ModdedTiers.IRON, 6.0F, -3.1F, new Item.Properties()));
    public static final RegistryObject<Item> IRON_HOE = VANILLA_TOOLS.register("iron_hoe", () -> new HoeItem(ModdedTiers.IRON, -2, -1.0F, new Item.Properties()));

    // Diamond
    public static final RegistryObject<Item> DIAMOND_SWORD = VANILLA_TOOLS.register("diamond_sword", () -> new SwordItem(ModdedTiers.DIAMOND, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_SHOVEL = VANILLA_TOOLS.register("diamond_shovel", () -> new ShovelItem(ModdedTiers.DIAMOND, 1.5F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_PICKAXE = VANILLA_TOOLS.register("diamond_pickaxe", () -> new PickaxeItem(ModdedTiers.DIAMOND, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_AXE = VANILLA_TOOLS.register("diamond_axe", () -> new AxeItem(ModdedTiers.DIAMOND, 5.0F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_HOE = VANILLA_TOOLS.register("diamond_hoe", () -> new HoeItem(ModdedTiers.DIAMOND, -3, 0.0F, new Item.Properties()));

    // Netherite
    public static final RegistryObject<Item> NETHERITE_SWORD = VANILLA_TOOLS.register("netherite_sword", () -> new SwordItem(ModdedTiers.NETHERITE, 3, -2.4F, (new Item.Properties()).fireResistant()));
    public static final RegistryObject<Item> NETHERITE_SHOVEL = VANILLA_TOOLS.register("netherite_shovel", () -> new ShovelItem(ModdedTiers.NETHERITE, 1.5F, -3.0F, (new Item.Properties()).fireResistant()));
    public static final RegistryObject<Item> NETHERITE_PICKAXE = VANILLA_TOOLS.register("netherite_pickaxe", () -> new PickaxeItem(ModdedTiers.NETHERITE, 1, -2.8F, (new Item.Properties()).fireResistant()));
    public static final RegistryObject<Item> NETHERITE_AXE = VANILLA_TOOLS.register("netherite_axe", () -> new AxeItem(ModdedTiers.NETHERITE, 5.0F, -3.0F, (new Item.Properties()).fireResistant()));
    public static final RegistryObject<Item> NETHERITE_HOE = VANILLA_TOOLS.register("netherite_hoe", () -> new HoeItem(ModdedTiers.NETHERITE, -4, 0.0F, (new Item.Properties()).fireResistant()));

    // Other Vanilla overrides
    public static final RegistryObject<Item> ELYTRA = VANILLA_TOOLS.register("elytra", () -> new ElytraItem((new Item.Properties()).durability(1000).rarity(Rarity.UNCOMMON)));


}

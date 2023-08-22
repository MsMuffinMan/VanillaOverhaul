package com.tool_stats;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class VanillaEnchantments {

    public static final DeferredRegister<Enchantment> VANILLA_ENCHANTMENTS = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, "minecraft");

    public static final RegistryObject<Enchantment> MENDING = VANILLA_ENCHANTMENTS.register("mending", () ->  new ModdedMendingEnchantment(Enchantment.Rarity.RARE, EquipmentSlot.values()));


}

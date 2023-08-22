package com.tool_stats;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.MendingEnchantment;

public class ModdedMendingEnchantment extends MendingEnchantment implements net.minecraftforge.common.extensions.IForgeEnchantment {
    public ModdedMendingEnchantment(Rarity p_45098_, EquipmentSlot... p_45099_) {
        super(p_45098_, p_45099_);
    }

    @Override
    public boolean isAllowedOnBooks() {
        return false;
    }
}

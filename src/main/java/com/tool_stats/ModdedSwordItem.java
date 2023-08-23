package com.tool_stats;

import com.google.common.collect.ImmutableMultimap;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;


public class ModdedSwordItem extends SwordItem {

    private ItemSocket socketSlotOne;

    public ModdedSwordItem(Tier p_43269_, int p_43270_, float p_43271_, Properties p_43272_) {
        super(p_43269_, p_43270_, p_43271_, p_43272_);
    }

    public ItemSocket getItemSocketSlotOne() {
        return socketSlotOne;
    }

    public void setSocketSlotOne(ItemSocket socketSlotOne) {
        this.socketSlotOne = socketSlotOne;
    }


    public AttributeModifier setAttackDamage(double newDamage) {
        return new AttributeModifier(BASE_ATTACK_DAMAGE_UUID, "Weapon modifier", newDamage, AttributeModifier.Operation.ADDITION);
    }
}

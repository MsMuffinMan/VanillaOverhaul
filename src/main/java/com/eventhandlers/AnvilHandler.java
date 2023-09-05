package com.eventhandlers;

import com.tool_stats.TiersMod;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.event.AnvilUpdateEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;


public class AnvilHandler {

    @SubscribeEvent
    public void UpdateAnvil(AnvilUpdateEvent event) {
        ItemStack left = event.getLeft();
        ItemStack right = event.getRight();
        ItemStack output;

        if (left.getItem() instanceof DiggerItem && (Items.DIAMOND).equals(right.getItem())) {

            output = new ItemStack(TiersMod.MODDED_IRON_PICKAXE.get());

            event.setOutput(output);
            event.setCost(1);
            event.setMaterialCost(0);
        }
    }
}

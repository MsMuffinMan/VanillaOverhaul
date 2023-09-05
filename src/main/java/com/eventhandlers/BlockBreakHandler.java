package com.eventhandlers;

import com.fishing.LootCrateRegister;
import com.tool_stats.TiersMod;
import com.tool_stats.ToolStatsConfig;
import com.tool_stats.UpgradeableTool;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.Tags.Blocks;
import net.minecraftforge.event.level.BlockEvent.BreakEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class BlockBreakHandler {

    @SubscribeEvent
    public void updateTool(BreakEvent event) {
        Player player = event.getPlayer();
        ItemStack heldItem = player.getMainHandItem();
        if (heldItem.getItem() instanceof UpgradeableTool && event.getState().getTags().anyMatch(tag -> tag == Blocks.ORES)) {
            // Increment exp on the tool.
            ((UpgradeableTool) heldItem.getItem()).addExp(ToolStatsConfig.toolExpPerBlock);
        }
    }

    @SubscribeEvent
    public void giveLootCrate(BreakEvent event) {
        Player player = event.getPlayer();
        player.getInventory().add(new ItemStack(LootCrateRegister.COMMON_LOOT_CRATE.get()));
    }
}

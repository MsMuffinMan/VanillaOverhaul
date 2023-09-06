package com.tools;

import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.network.chat.Component;

public interface UpgradeableTool {

    int maxExp = ToolStatsConfig.toolExpToLevel;
    int maxLevel = ToolStatsConfig.maxToolLevel;

    default void addExp(int expToAdd) {
        int newExp = getCurrentExp() + expToAdd;
        while (newExp >= maxExp) {
            if (isLevelUpPossible()) {
                levelUp();
                newExp =- maxExp;
            } else {
                newExp = maxExp;
                break;
            }
        }
        setCurrentExp(newExp);
    }

    default void levelUp() {
        LocalPlayer player = Minecraft.getInstance().player;
        if (player != null) {
            player.sendSystemMessage(Component.literal("Your tool leveled up!"));
        }
        setCurrentLevel(getCurrentLevel() + 1);
    }

    default boolean isLevelUpPossible(){
        return getCurrentLevel() != maxLevel;
    }

    int getCurrentExp();
    void setCurrentExp(int newExp);

    int getCurrentLevel();
    void setCurrentLevel(int newLevel);
}

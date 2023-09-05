package com.tool_stats;

import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.block.state.BlockState;

public class UpgradeableAxeItem extends AxeItem implements UpgradeableTool {

    private int currentExp;
    private int currentLevel;

    public UpgradeableAxeItem(Tier p_40521_, float p_40522_, float p_40523_, Properties p_40524_) {
        super(p_40521_, p_40522_, p_40523_, p_40524_);
        this.currentExp = 0;
        this.currentLevel = 0;
    }


    @Override
    public float getDestroySpeed(ItemStack itemStack, BlockState blockState) {
        float normalSpeed = super.getDestroySpeed(itemStack, blockState);
        return normalSpeed + getCurrentLevel();
    }

    @Override
    public int getCurrentExp() {
        return this.currentExp;
    }

    @Override
    public void setCurrentExp(int newExp) {
        this.currentExp = newExp;
    }

    @Override
    public int getCurrentLevel() {
        return this.currentLevel;
    }

    @Override
    public void setCurrentLevel(int newLevel) {
        this.currentLevel = newLevel;
    }
}

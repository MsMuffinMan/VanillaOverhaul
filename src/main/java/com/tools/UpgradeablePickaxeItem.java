package com.tools;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.block.state.BlockState;

public class UpgradeablePickaxeItem extends PickaxeItem implements UpgradeableTool {

    private int currentExp;
    private int currentLevel;

    public UpgradeablePickaxeItem(Tier p_42961_, int p_42962_, float p_42963_, Properties p_42964_) {
        super(p_42961_, p_42962_, p_42963_, p_42964_);
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

package com.tools;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.block.state.BlockState;

public class UpgradeableSwordItem extends SwordItem implements UpgradeableTool {

    private int currentExp;
    private int currentLevel;

    public UpgradeableSwordItem(Tier p_43269_, int p_43270_, float p_43271_, Properties p_43272_) {
        super(p_43269_, p_43270_, p_43271_, p_43272_);
        this.currentExp = 0;
        this.currentLevel = 0;
    }


    @Override
    public float getDestroySpeed(ItemStack itemStack, BlockState blockState) {
        float normalSpeed = super.getDestroySpeed(itemStack, blockState);
        return normalSpeed + getCurrentLevel();
    }

    @Override
    public float getDamage() {
        float baseDmg = super.getDamage();
        return baseDmg + getCurrentLevel();
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

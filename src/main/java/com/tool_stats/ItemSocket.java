package com.tool_stats;

public class ItemSocket {

    private String name;
    private int powerLevel;
    private int damageBonus;
    private int miningSpeedBonus;

    public ItemSocket(String name, int powerLevel, int damageBonus, int miningSpeedBonus) {
        this.name = name;
        this.powerLevel = powerLevel;
        this.damageBonus = damageBonus;
        this.miningSpeedBonus = miningSpeedBonus;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(int powerLevel) {
        this.powerLevel = powerLevel;
    }

    public int getDamageBonus() {
        return damageBonus;
    }

    public void setDamageBonus(int damageBonus) {
        this.damageBonus = damageBonus;
    }

    public int getMiningSpeedBonus() {
        return miningSpeedBonus;
    }

    public void setMiningSpeedBonus(int miningSpeedBonus) {
        this.miningSpeedBonus = miningSpeedBonus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

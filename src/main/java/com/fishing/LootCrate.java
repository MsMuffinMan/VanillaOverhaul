package com.fishing;

import net.minecraft.Util;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.storage.loot.LootDataResolver;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.storage.loot.LootParams.Builder;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSet;
import org.jetbrains.annotations.NotNull;

import java.util.List;


public class LootCrate extends Item {

    public Rarity rarity;

    public LootCrate(Rarity rarity) {
        super(new Properties().stacksTo(1));
        this.rarity = rarity;
    }

    public @NotNull InteractionResultHolder<ItemStack> use(@NotNull Level level, Player player, @NotNull InteractionHand interactionHand) {
        ItemStack itemStack = player.getItemInHand(interactionHand);
        if (!level.isClientSide) {
            itemStack.shrink(1);
            List<ItemStack> results = openCrate(level);
            Inventory inventory = player.getInventory();
            for (ItemStack item : results) {
                inventory.add(item);
            }
        }
        return InteractionResultHolder.success(itemStack);
    }

    public List<ItemStack> openCrate(Level level) {
        LocalPlayer player = Minecraft.getInstance().player;
        if (player != null) {
            player.sendSystemMessage(Component.literal("You opened the crate"));
        }
        return generateItems(level);
    }

    public List<ItemStack> generateItems(Level level) {
        ResourceLocation lootTableLocation = new ResourceLocation("tiersmod","common_loot_crate");
        MinecraftServer server = ((ServerLevel) level).getServer();
        LootDataResolver resolver = server.getLootData();
        LootTable table = resolver.getLootTable(lootTableLocation);

        Builder builder = new Builder(server.overworld());
        LootParams params = builder.create(LootContextParamSet.builder().build());
        return table.getRandomItems(params);

    }


}

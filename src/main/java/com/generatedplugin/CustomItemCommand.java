package com.generatedplugin;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class CustomItemCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            ItemStack customSword = new ItemStack(Material.DIAMOND_SWORD);
            ItemMeta meta = customSword.getItemMeta();
            meta.setCustomModelData(12345); // Custom Model Data
            meta.setGlowing(true); // Glow Effect
            meta.setDisplayName("§aCustom Schwert"); // Display Name
            customSword.setItemMeta(meta);
            player.getInventory().addItem(customSword);
            player.sendMessage("§aDu hast ein Custom Schwert erhalten!");
            return true;
        }
        return false;
    }
}
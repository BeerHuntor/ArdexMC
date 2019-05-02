package me.beerhuntor.ardexmc.Items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class Items implements Listener {


    /****************************************************
     *                CUSTOM ITEMS                      *
     ****************************************************/
    private static ItemStack ender_crystal = new ItemStack(Material.END_CRYSTAL);
    private static ItemStack alien_dust = new ItemStack(Material.REDSTONE);

    /****************************************************
     *                   METHODS                        *
     ****************************************************/

    public ItemStack enderCrystal() {

        ItemMeta meta = ender_crystal.getItemMeta();
        meta.setDisplayName("Decor Crystal");

        ArrayList<String> lore = new ArrayList<>();
        lore.add("This is decor only");
        lore.add("Not for public use");
        meta.setLore(lore);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        ender_crystal.setItemMeta(meta);

        return ender_crystal;
    }

    public ItemStack alienDust () {

        ItemMeta meta = alien_dust.getItemMeta();
        meta.setDisplayName(ChatColor.DARK_GREEN + "Alien Dust");

        ArrayList<String> lore = new ArrayList<>();
        lore.add("Upgrade Regent");
        lore.add("Used for the Alien Set");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        alien_dust.setItemMeta(meta);

        return alien_dust;

    }

}

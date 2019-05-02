package me.beerhuntor.ardexmc.Inventories;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.*;

public class Upgrade {

    private static final String UPGRADE_INVENTORY_TITLE = "§9§lUpgrade Obelisk";
    private static final int INVENTORY_SIZE = 9;
    private Inventory upgrade_Inventory = Bukkit.createInventory(new MyInventoryHolder(), INVENTORY_SIZE, UPGRADE_INVENTORY_TITLE );

    private ArrayList<UUID> upgradeMenuList = new ArrayList<UUID>();
    private final ArrayList<Material> allowedItems = new ArrayList<>(Arrays.asList(Material.GLOWSTONE_DUST, Material.BOW));
    private final Map<Material, Material> regents = new HashMap<Material, Material>() {{
        put(Material.SADDLE, Material.DIAMOND_BLOCK);
    }};

    private ItemStack blanker = new ItemStack(Material.GRAY_STAINED_GLASS_PANE);
    private ItemStack empty_Slot = new ItemStack(Material.AIR);


    public ItemStack blankerIcon(){
        ItemMeta meta = blanker.getItemMeta();
        meta.setDisplayName(" ");
        blanker.setItemMeta(meta);
        return blanker;
    }

    public Inventory createUpgradeInventory() {
        int i;
        for (i = 0; i<INVENTORY_SIZE; i++) {
            upgrade_Inventory.setItem(i, blankerIcon());
        }
        upgrade_Inventory.setItem(2, empty_Slot);
        upgrade_Inventory.setItem(6, empty_Slot);
        return upgrade_Inventory;
    }

    public ArrayList<UUID> getUpgradeMenuList() {
        return upgradeMenuList;
    }

    public String getUpgradeInventoryTitle() {
        return UPGRADE_INVENTORY_TITLE;
    }

    public ArrayList<Material> getAllowedItems(){
        return allowedItems;
    }

    public Map<Material, Material> getRegents(){
        return regents;
    }
}

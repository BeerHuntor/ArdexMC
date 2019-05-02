package me.beerhuntor.ardexmc.Items;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class RanksMenuItems {
    //GAP ICONS
    private static ItemStack blanker_Icon = new ItemStack(Material.LIGHT_GRAY_STAINED_GLASS_PANE);

    // BOOK ICON
    private static Material book = Material.KNOWLEDGE_BOOK;
    // NAVIGATION ITEMS
    private static ItemStack forward_Icon = new ItemStack(Material.RED_CONCRETE);
    private static ItemStack back_Icon = new ItemStack(Material.BLACK_CONCRETE);
    private static ItemStack close_Icon = new ItemStack(Material.BARRIER);
    private static ItemStack member_Icon = new ItemStack(Material.PLAYER_HEAD);
    private static ItemStack donator_Icon = new ItemStack(Material.DIAMOND_BLOCK);
    private static ItemStack staff_Icon = new ItemStack(Material.COMMAND_BLOCK);

    // RANKS ITEMS
    private static ItemStack member_Rank_Icon = new ItemStack(book);
    private static ItemStack arrival_Icon = new ItemStack(book);
    private static ItemStack explorer_Icon = new ItemStack(book);
    private static ItemStack captain_Icon = new ItemStack(book);
    private static ItemStack ranger_Icon = new ItemStack(book);
    private static ItemStack specialist_Icon = new ItemStack(book);
    private static ItemStack mercenary_Icon = new ItemStack(book);
    private static ItemStack royal_Icon = new ItemStack(book);
    private static ItemStack seasonal_Icon = new ItemStack(book);

    // DONATOR ITEMS
    private static ItemStack general_Icon = new ItemStack(book);
    private static ItemStack corporal_Icon = new ItemStack(book);
    private static ItemStack marshal_Icon = new ItemStack(book);

    // STAFF ITEMS
    private static ItemStack helper_Icon = new ItemStack(book);
    private static ItemStack mod_Icon = new ItemStack(book);
    private static ItemStack executive_Icon = new ItemStack(book);

    // RANK DISPLAY NAMES
    private static final String MEMBER_NAME = "§8[§3Member§8]";
    private static final String ARRIVAL_NAME = "§8[§9Arrival§8]";
    private static final String EXPLORER_NAME = "§8[§9Explorer§8]";
    private static final String CAPTAIN_NAME = "§8[§6Captain§8]";
    private static final String RANGER_NAME = "§8[§6Ranger§8]";
    private static final String SPECIALIST_NAME = "§8[§cSpecialist§8]";
    private static final String MERCENARY_NAME = "§8[§cMercenary§8]";
    private static final String ROYAL_NAME = "§8[§cRoyal§8]";
    private static final String SEASONAL_NAME = "§8[§aSeasonal§8]";

    // DONATOR RANK DISPLAY NAMES
    private static final String CORPORAL_NAME = "§8[§eCorporal§8]";
    private static final String GENERAL_NAME = "§8[§7General§8]";
    private static final String MARSHAL_NAME = "§8[§cMarshall§8]";

    // STAFF RANK DISPLAY NAMES
    private static final String HELPER_NAME = "§8[§bHelper§8]";
    private static final String MOD_NAME = "§8[§bMod§8]";
    private static final String EXECUTIVE_NAME = "§8[§cExec§8]";


    // RANK LORE
    private static final String LINE_1 = "§7Click to buy";
    private static final String STAFF_LORE = "§7Click to apply";

    // RANK PRICES
    private static final String MEMBER_PRICE = "§a$x";
    private static final String ARRIVAL_PRICE = "§a$x";
    private static final String EXPLORER_PRICE = "§a$x";
    private static final String CAPTAIN_PRICE = "§a$x";
    private static final String RANGER_PRICE = "§a$x";
    private static final String SPECIALIST_PRICE = "§a$x";
    private static final String MERCENARY_PRICE = "§a$x";
    private static final String ROYAL_PRICE = "§a$x";
    private static final String SEASONAL_PRICE = "§a$x";

    // DONATOR RANK PRICES
    private static final String CORPORAL_PRICE = "§7Price: §a$15";
    private static final String GENERAL_PRICE = "§7Price: §a$25";
    private static final String MARSHAL_PRICE = "§7Price: §a$35";


    // MENU NAVIGATION ICONS
    public ItemStack forwardIcon () {
        ItemMeta meta = forward_Icon.getItemMeta();
        meta.setDisplayName("§e§lNext Page");
        forward_Icon.setItemMeta(meta);
        return forward_Icon;
    }

    public ItemStack backIcon () {
        ItemMeta meta = back_Icon.getItemMeta();
        meta.setDisplayName("§e§lPrevious Page");
        back_Icon.setItemMeta(meta);
        return back_Icon;
    }

    public ItemStack closeIcon () {
        ItemMeta meta = close_Icon.getItemMeta();
        meta.setDisplayName("§e§lCancel");
        close_Icon.setItemMeta(meta);
        return close_Icon;
    }

    public ItemStack memberIcon() {
        ItemMeta meta = member_Icon.getItemMeta();
        meta.setDisplayName("§e§lMember Ranks");
        member_Icon.setItemMeta(meta);
        return member_Icon;
    }

    public ItemStack donatorIcon () {
        ItemMeta meta = donator_Icon.getItemMeta();
        meta.setDisplayName("§e§lDonator Ranks");
        donator_Icon.setItemMeta(meta);
        return donator_Icon;
    }

    public ItemStack staffIcon () {
        ItemMeta meta = staff_Icon.getItemMeta();
        meta.setDisplayName("§e§lStaff Ranks");
        staff_Icon.setItemMeta(meta);
        return staff_Icon;
    }

    public ItemStack blankIcon () {
        ItemMeta meta = blanker_Icon.getItemMeta();
        meta.setDisplayName(" ");
        blanker_Icon.setItemMeta(meta);
        return blanker_Icon;
    }
    // MEMBER RANKS
    public ItemStack getMemberRankIcon() {
        ItemMeta meta = member_Rank_Icon.getItemMeta();
        ArrayList<String> lore = new ArrayList<>();
        meta.setDisplayName(MEMBER_NAME);
        lore.add(LINE_1);
        lore.add(MEMBER_PRICE);
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LURE, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        member_Rank_Icon.setItemMeta(meta);
        return member_Rank_Icon;
    }
    public ItemStack getArrivalIcon () {
        ItemMeta meta = arrival_Icon.getItemMeta();
        ArrayList<String> lore = new ArrayList<String>();
        meta.setDisplayName(ARRIVAL_NAME);
        lore.add(LINE_1);
        lore.add(ARRIVAL_PRICE);
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LURE, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        arrival_Icon.setItemMeta(meta);
        return arrival_Icon;
    }

    public ItemStack getExplorerIcon () {
        ItemMeta meta = explorer_Icon.getItemMeta();
        ArrayList<String> lore = new ArrayList<String>();
        meta.setDisplayName(EXPLORER_NAME);
        lore.add(LINE_1);
        lore.add(EXPLORER_PRICE);
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LURE, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        explorer_Icon.setItemMeta(meta);
        return explorer_Icon;
    }
    public ItemStack getCaptainIcon () {
        ItemMeta meta = captain_Icon.getItemMeta();
        ArrayList<String> lore = new ArrayList<String>();
        meta.setDisplayName(CAPTAIN_NAME);
        lore.add(LINE_1);
        lore.add(CAPTAIN_PRICE);
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LURE, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        captain_Icon.setItemMeta(meta);
        return captain_Icon;
    }
    public ItemStack getRangerIcon () {
        ItemMeta meta = ranger_Icon.getItemMeta();
        ArrayList<String> lore = new ArrayList<String>();
        meta.setDisplayName(RANGER_NAME);
        lore.add(LINE_1);
        lore.add(RANGER_PRICE);
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LURE,1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        ranger_Icon.setItemMeta(meta);
        return ranger_Icon;
    }
    public ItemStack getSpecialistIcon () {
        ItemMeta meta = specialist_Icon.getItemMeta();
        ArrayList<String> lore = new ArrayList<String>();
        meta.setDisplayName(SPECIALIST_NAME);
        lore.add(LINE_1);
        lore.add(SPECIALIST_PRICE);
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LURE, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        specialist_Icon.setItemMeta(meta);
        return specialist_Icon;
    }
    public ItemStack getMercenaryIcon () {
        ItemMeta meta = mercenary_Icon.getItemMeta();
        ArrayList<String> lore = new ArrayList<String>();
        meta.setDisplayName(MERCENARY_NAME);
        lore.add(LINE_1);
        lore.add(MERCENARY_PRICE);
        meta.setLore(lore);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addEnchant(Enchantment.LURE, 1, true);
        mercenary_Icon.setItemMeta(meta);
        return mercenary_Icon;
    }
    public ItemStack getRoyalIcon () {
        ItemMeta meta = royal_Icon.getItemMeta();
        ArrayList<String> lore = new ArrayList<String>();
        meta.setDisplayName(ROYAL_NAME);
        lore.add(LINE_1);
        lore.add(ROYAL_PRICE);
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LURE, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        royal_Icon.setItemMeta(meta);
        return royal_Icon;
    }
    public ItemStack getSeasonalIcon () {
        ItemMeta meta = seasonal_Icon.getItemMeta();
        ArrayList<String> lore = new ArrayList<String>();
        meta.setDisplayName(SEASONAL_NAME);
        lore.add(LINE_1);
        lore.add(SEASONAL_PRICE);
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LURE, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        seasonal_Icon.setItemMeta(meta);
        return seasonal_Icon;
    }

    // DONATOR RANKS
    public ItemStack getGeneralIcon () {
        ItemMeta meta = general_Icon.getItemMeta();
        ArrayList<String> lore = new ArrayList<String>();
        meta.setDisplayName(GENERAL_NAME);
        lore.add(LINE_1);
        lore.add(GENERAL_PRICE);
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LURE,1,true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        general_Icon.setItemMeta(meta);
        return general_Icon;
    }
    public ItemStack getCorporalIcon () {
        ItemMeta meta = corporal_Icon.getItemMeta();
        ArrayList<String> lore = new ArrayList<String>();
        meta.setDisplayName(CORPORAL_NAME);
        lore.add(LINE_1);
        lore.add(CORPORAL_PRICE);
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LURE,1,true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        corporal_Icon.setItemMeta(meta);
        return corporal_Icon;
    }
    public ItemStack getMarshalIcon () {
        ItemMeta meta = marshal_Icon.getItemMeta();
        ArrayList<String> lore = new ArrayList<String>();
        meta.setDisplayName(MARSHAL_NAME);
        lore.add(LINE_1);
        lore.add(MARSHAL_PRICE);
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LURE,1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        marshal_Icon.setItemMeta(meta);
        return marshal_Icon;
    }


    // STAFF RANKS

    public ItemStack getHelperIcon() {
        ItemMeta meta = helper_Icon.getItemMeta();
        ArrayList<String> lore = new ArrayList<String>();
        meta.setDisplayName(HELPER_NAME);
        lore.add(STAFF_LORE);
        meta.setLore(lore);
        helper_Icon.setItemMeta(meta);
        return helper_Icon;
    }
    public ItemStack getModIcon() {
        ItemMeta meta = mod_Icon.getItemMeta();
        ArrayList<String> lore = new ArrayList<String>();
        meta.setDisplayName(MOD_NAME);
        lore.add(STAFF_LORE);
        meta.setLore(lore);
        mod_Icon.setItemMeta(meta);
        return mod_Icon;
    }
    public ItemStack getExecutiveIcon() {
        ItemMeta meta = executive_Icon.getItemMeta();
        ArrayList<String> lore = new ArrayList<String>();
        meta.setDisplayName(EXECUTIVE_NAME);
        lore.add(STAFF_LORE);
        meta.setLore(lore);
        executive_Icon.setItemMeta(meta);
        return executive_Icon;
    }

    public String getMemberName() { return MEMBER_NAME; }
    public String getArrivalName() {
        return ARRIVAL_NAME;
    }
    public String getExplorerName() {
        return EXPLORER_NAME;
    }
    public String getRangerName() {
        return RANGER_NAME;
    }
    public String getCaptainName() {
        return CAPTAIN_NAME;
    }
    public String getSpecialistName(){
        return SPECIALIST_NAME;
    }
    public String getMercenaryName(){
        return MERCENARY_NAME;
    }
    public String getRoyalName() {
        return ROYAL_NAME;
    }
    public String getSeasonalName(){
        return SEASONAL_NAME;
    }
    public String getCorporalName() { return CORPORAL_NAME; }
    public String getGeneralName() {return GENERAL_NAME; }
    public String getMarshalName() {return MARSHAL_NAME;}
    public String getHelperName() {return HELPER_NAME;}
    public String getModName() {return MOD_NAME;}
    public String getExecutiveName() {return EXECUTIVE_NAME;}
}

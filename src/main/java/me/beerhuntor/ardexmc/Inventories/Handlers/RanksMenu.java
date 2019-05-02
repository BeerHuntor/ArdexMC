package me.beerhuntor.ardexmc.Inventories.Handlers;

import me.beerhuntor.ardexmc.Inventories.BuyRanks;
import me.beerhuntor.ardexmc.Inventories.MyInventoryHolder;
import me.beerhuntor.ardexmc.Items.RanksMenuItems;
import me.beerhuntor.ardexmc.Messages.Messages;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.*;
import org.bukkit.inventory.Inventory;

public class RanksMenu implements Listener {

    private BuyRanks bRanks;
    private Messages msg = new Messages();
    private RanksMenuItems icon = new RanksMenuItems();

    public RanksMenu(BuyRanks bRanks) {
        this.bRanks = bRanks;

    }

    // Code for Inventory Click Events on Custom Menus
    @EventHandler
    public void onMenuClick(InventoryClickEvent event) {
        Inventory inven = event.getClickedInventory();
        Player player = (Player) event.getWhoClicked();

        if (inven != null) {
            if (inven.getHolder() instanceof MyInventoryHolder) {
                // /RANKS MENU
                if (bRanks.getRanksMenuList().contains(player.getUniqueId())) {
                    // Inventory Code Here:
                    switch (event.getCurrentItem().getType()) {
                        case PLAYER_HEAD:
                            bRanks.getRanksMenuList().remove(player.getUniqueId());
                            bRanks.getMemberMenuList().add(player.getUniqueId());
                            player.openInventory(bRanks.createMemberRanksMenu());
                            break;
                        case DIAMOND_BLOCK:
                            bRanks.getRanksMenuList().remove(player.getUniqueId());
                            bRanks.getDonatorRanksList().add(player.getUniqueId());
                            player.openInventory(bRanks.createDonatorRanksMenu());
                            break;
                        case COMMAND_BLOCK:
                            bRanks.getRanksMenuList().remove(player.getUniqueId());
                            bRanks.getStaffRanksList().add(player.getUniqueId());
                            player.openInventory(bRanks.createStaffRanksMenu());
                            break;
                        case BARRIER:
                            player.closeInventory();
                            break;
                        case GRAY_STAINED_GLASS_PANE:
                            break;
                    }
                    // MEMBER RANKS MENU
                } if (bRanks.getMemberMenuList().contains(player.getUniqueId())) {
                    switch (event.getCurrentItem().getType()) {
                        case BLACK_CONCRETE:
                            bRanks.getMemberMenuList().remove(player.getUniqueId());
                            bRanks.getRanksMenuList().add(player.getUniqueId());
                            player.openInventory(bRanks.createRanksMenu());
                            break;
                        case RED_CONCRETE:
                            break;
                        case KNOWLEDGE_BOOK:
                            if (event.getCurrentItem().getItemMeta().getDisplayName().equals(icon.getMemberName())) {
                                player.sendMessage(msg.getArdexPrefix() + ChatColor.YELLOW + "Welcome Member");
                            } else if (event.getCurrentItem().getItemMeta().getDisplayName().equals(icon.getArrivalName())) {
                                player.sendMessage(msg.getArdexPrefix() + ChatColor.YELLOW + "Welcome Arrival");
                            } else if (event.getCurrentItem().getItemMeta().getDisplayName().equals(icon.getExplorerName())) {
                                player.sendMessage(msg.getArdexPrefix() + ChatColor.YELLOW + "Welcome Explorer");
                            } else if (event.getCurrentItem().getItemMeta().getDisplayName().equals(icon.getCaptainName())) {
                                player.sendMessage(msg.getArdexPrefix() + ChatColor.YELLOW + "Welcome Captain");
                            } else if (event.getCurrentItem().getItemMeta().getDisplayName().equals(icon.getRangerName())) {
                                player.sendMessage(msg.getArdexPrefix() + ChatColor.YELLOW + "Welcome Ranger");
                            } else if (event.getCurrentItem().getItemMeta().getDisplayName().equals(icon.getSpecialistName())) {
                                player.sendMessage(msg.getArdexPrefix() + ChatColor.YELLOW + "Welcome Specialist");
                            } else if (event.getCurrentItem().getItemMeta().getDisplayName().equals(icon.getMercenaryName())) {
                                player.sendMessage(msg.getArdexPrefix() + ChatColor.YELLOW + "Welcome Mercenary");
                            } else if (event.getCurrentItem().getItemMeta().getDisplayName().equals(icon.getRoyalName())) {
                                player.sendMessage(msg.getArdexPrefix() + ChatColor.YELLOW + "Welcome Royal");
                            } else if (event.getCurrentItem().getItemMeta().getDisplayName().equals(icon.getSeasonalName())) {
                                player.sendMessage(msg.getArdexPrefix() + ChatColor.YELLOW + "Welcome Seasonal");
                            }
                            break;
                        case GRAY_STAINED_GLASS_PANE:
                            break;
                    }
                    // DONATOR RANKS MENU
                } if (bRanks.getDonatorRanksList().contains(player.getUniqueId())) {
                    switch (event.getCurrentItem().getType()) {
                        case BLACK_CONCRETE:
                            bRanks.getDonatorRanksList().remove(player.getUniqueId());
                            bRanks.getRanksMenuList().add(player.getUniqueId());
                            player.openInventory(bRanks.createRanksMenu());
                            break;
                        case RED_CONCRETE:
                            break;
                        case KNOWLEDGE_BOOK:
                            if (event.getCurrentItem().getItemMeta().getDisplayName().equals(icon.getCorporalName())) {
                                player.sendMessage(msg.getArdexPrefix() + ChatColor.YELLOW + "Welcome Corporal");
                            } else if (event.getCurrentItem().getItemMeta().getDisplayName().equals(icon.getGeneralName())) {
                                player.sendMessage(msg.getArdexPrefix() + ChatColor.YELLOW + "Welcome General");
                            } else if (event.getCurrentItem().getItemMeta().getDisplayName().equals(icon.getMarshalName())) {
                                player.sendMessage(msg.getArdexPrefix() + ChatColor.YELLOW + "Welcome Marshal");
                            }
                            break;
                        case GRAY_STAINED_GLASS_PANE:
                            break;
                    }
                    // STAFF RANKS MENU
                } if (bRanks.getStaffRanksList().contains(player.getUniqueId())) {
                    switch (event.getCurrentItem().getType()) {
                        case BLACK_CONCRETE:
                            bRanks.getStaffRanksList().remove(player.getUniqueId());
                            bRanks.getRanksMenuList().add(player.getUniqueId());
                            player.openInventory(bRanks.createRanksMenu());
                            break;
                        case RED_CONCRETE:
                            break;
                        case KNOWLEDGE_BOOK:
                            if (event.getCurrentItem().getItemMeta().getDisplayName().equals(icon.getHelperName())) {
                                player.sendMessage(msg.getArdexPrefix() + ChatColor.YELLOW + "Welcome Helper");
                            } else if (event.getCurrentItem().getItemMeta().getDisplayName().equals(icon.getModName())) {
                                player.sendMessage(msg.getArdexPrefix() + ChatColor.YELLOW + "Welcome Moderator");
                            } else if (event.getCurrentItem().getItemMeta().getDisplayName().equals(icon.getExecutiveName())) {
                                player.sendMessage(msg.getArdexPrefix() + ChatColor.YELLOW + "Welcome Executive");
                            }
                            break;
                        case GRAY_STAINED_GLASS_PANE:
                            break;
                    }
                }
                event.setCancelled(true);
            }

        }
    }

}
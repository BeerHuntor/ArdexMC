package me.beerhuntor.ardexmc.Inventories.Handlers;

import me.beerhuntor.ardexmc.Inventories.MyInventoryHolder;
import me.beerhuntor.ardexmc.Inventories.Upgrade;
import me.beerhuntor.ardexmc.Messages.Messages;
import org.bukkit.*;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.Inventory;


public class UpgradeMenu implements Listener {

    // Obelisk Block
    private static final Material OBELISK_BLOCK = Material.DIAMOND_BLOCK;
    // Check Block (Block that is 4 blocks under the obelisk block)
    private static final Material CHECK_BLOCK = Material.END_PORTAL_FRAME;
    // Depth of check Block
    private static final int DEPTH_OF_CHECK_BLOCK = 4;

    private Messages msg = new Messages();
    private Upgrade upgradeInventory;


    public UpgradeMenu(Upgrade upgradeInventory) {
        this.upgradeInventory = upgradeInventory;
    }


    @EventHandler
    public void onClickObelisk(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        Action action = event.getAction();
        Block block = event.getClickedBlock();
        World world = event.getClickedBlock().getWorld();
        int obeliskX = block.getLocation().getBlockX();
        int obeliskY = block.getLocation().getBlockY();
        int obeliskZ = block.getLocation().getBlockZ();

        // Gets the Equiptment Slot which triggered the event.
        EquipmentSlot hand = event.getHand();
        // Checking if the equiptment slot which triggered the event is the hand.
        if (hand == EquipmentSlot.HAND) {
            if (action.equals(Action.RIGHT_CLICK_BLOCK)) {
                if (block.getType() == OBELISK_BLOCK) {
                    if (block.getWorld().getBlockAt(new Location(world, obeliskX, obeliskY - DEPTH_OF_CHECK_BLOCK, obeliskZ)).getType() == CHECK_BLOCK) {
                        upgradeInventory.getUpgradeMenuList().add(player.getUniqueId());
                        player.openInventory(upgradeInventory.createUpgradeInventory());

                    }
                }
            }
        }
    }

    //    @EventHandler
//    public void onMenuClick(InventoryClickEvent event) {
//        Inventory inven = event.getClickedInventory();
//        Player player = (Player) event.getWhoClicked();
//        ClickType click = event.getClick();
//
//        if (inven != null) {
//            if (inven instanceof MyInventoryHolder) {
//                if (upgradeInevntory.getUpgradeMenuList().contains(player.getUniqueId())) {
//                    if (click.equals(ClickType.SHIFT_LEFT) || click.equals(ClickType.LEFT)) {
//                        if (inven.getItem(2).getType() == Material.GLOWSTONE && inven.getItem(6).getType() == Material.BOW) {
//                            player.getInventory().addItem(new ItemStack(Material.DIAMOND_BLOCK));
//                        } else {
//                            event.setCancelled(true);
//                        }
//                    } else {
//                        event.setCancelled(true);
//                    }
//                }
//            }
//        }
//    }
    @EventHandler
    public void onMenuClick(InventoryClickEvent event) {
        Inventory inven = event.getClickedInventory();
        Player player = (Player) event.getWhoClicked();
        ClickType click = event.getClick();

        if (inven != null) {
            if (inven.getHolder() instanceof MyInventoryHolder) {
                for (Material material : upgradeInventory.getAllowedItems()) {
                    if (event.getCurrentItem().getType() != material) {
                        event.setCancelled(true);

                    }
                    player.sendMessage(msg.getDebug());

                }
            }
        }

        //        if (event.isLeftClick() || click.isLeftClick()) {
//            if (inven.getHolder() instanceof MyInventoryHolder) {
//                if (event.getSlot() == 2 && upgradeInventory.getAllowedItems().contains(event.getCurrentItem().getType()) ||
//                        event.getSlot() == 6 && inven.getItem(2) != null
//                                && upgradeInventory.getRegents().get(inven.getItem(2).getType()) == event.getCurrentItem().getType()) {
//                    player.sendMessage(msg.getDebug());
//
//                } else {
//                    event.setCancelled(true);
//                }
//            }
//        }
    }


    @EventHandler
    public void onMenuClose(InventoryCloseEvent event) {
        Player player = (Player) event.getPlayer();

        if (player.getOpenInventory().getTitle().equals(upgradeInventory.getUpgradeInventoryTitle())) {
            upgradeInventory.getUpgradeMenuList().remove(player.getUniqueId());
        }
    }


}

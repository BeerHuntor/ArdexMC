package me.beerhuntor.ardexmc.Commands;

import me.beerhuntor.ardexmc.Messages.Messages;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class SetName implements CommandExecutor {

    private Messages msg = new Messages();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player player = (Player) sender;

        if (player != null) {
            ItemStack item = player.getInventory().getItemInMainHand();
            if (item.getType() != Material.AIR) {
                if (args.length == 0) {
                    player.sendMessage(msg.getNotEnoughArgs());
                }
                String input = args[0].replace("_", " ");
                String newInput = input.replaceAll("&", "§");
                ItemMeta meta = item.getItemMeta();
                meta.setDisplayName(newInput);
                item.setItemMeta(meta);

            }
        }




        return true;
    }
}

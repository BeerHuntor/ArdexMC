package me.beerhuntor.ardexmc.Commands;

import me.beerhuntor.ardexmc.Inventories.BuyRanks;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Ranks implements CommandExecutor {

    private BuyRanks bRanks;

    public Ranks (BuyRanks bRanks) {
        this.bRanks = bRanks;
    }
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String args[] ){
        Player player = (Player) sender;

        if (sender != null) {
            if (cmd.getName().equalsIgnoreCase("ranks")) {
                bRanks.getRanksMenuList().add(player.getUniqueId());
                player.openInventory(bRanks.createRanksMenu());
            }
        }
        return true;
    }
}

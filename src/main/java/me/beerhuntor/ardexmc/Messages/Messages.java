package me.beerhuntor.ardexmc.Messages;

import org.bukkit.ChatColor;

public class Messages {

    ChatColor defaultMessageColor = ChatColor.YELLOW;

    // PREFIXES
    private String ardexPrefix = ChatColor.GRAY + "[§l" + ChatColor.AQUA + "Ardex" + ChatColor.GRAY + "] ";
    private String debugPrefix = ChatColor.GOLD + "[§l" + ChatColor.RED + "DEBUG" + ChatColor.GOLD + "] ";

    // ERROR MESSAGES
    private String notEnoughArgs = ardexPrefix + defaultMessageColor + " Not Enough Arguments";
    private String debug = debugPrefix + ChatColor.RED + "It works!";
    private String noUnderstand = ardexPrefix + defaultMessageColor + "Ooops, you have done something wrong there!";

    // COMMAND MESSAGES
    private String itemLoreSet = ardexPrefix + defaultMessageColor + "Item Lore Has Been Set!";
    private String displayNameSet = ardexPrefix + defaultMessageColor + "Display Name Has Been Set!";

    // GETTERS
    public String getArdexPrefix() {
        return ardexPrefix;
    }

    public String getNotEnoughArgs() {
        return notEnoughArgs;
    }

    public String getDebug() {
        return debug;
    }

    public String getNoUnderstand() {
        return noUnderstand;
    }

    public String getItemLoreSet() {
        return itemLoreSet;
    }

    public String getDisplayNameSet() {
        return displayNameSet;
    }
}

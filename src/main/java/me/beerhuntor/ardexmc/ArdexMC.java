package me.beerhuntor.ardexmc;

import me.beerhuntor.ardexmc.Commands.Ranks;
import me.beerhuntor.ardexmc.Commands.SetLore;
import me.beerhuntor.ardexmc.Commands.SetName;
import me.beerhuntor.ardexmc.Events.MobDrops;
import me.beerhuntor.ardexmc.Inventories.BuyRanks;
import me.beerhuntor.ardexmc.Inventories.Handlers.RanksMenu;
import me.beerhuntor.ardexmc.Inventories.Handlers.UpgradeMenu;
import me.beerhuntor.ardexmc.Inventories.Upgrade;
import org.bukkit.plugin.java.JavaPlugin;

public final class ArdexMC extends JavaPlugin {

    private BuyRanks bRanks;
    private Upgrade upgradeMenu;

    @Override
    public void onEnable() {
        bRanks = new BuyRanks();
        upgradeMenu = new Upgrade();

        // REGISTER EVENTS
        getServer().getPluginManager().registerEvents(new MobDrops(), this);
        getServer().getPluginManager().registerEvents(new UpgradeMenu(upgradeMenu), this);
        getServer().getPluginManager().registerEvents(new RanksMenu(bRanks), this);

        // REGISTER COMMANDS
        getCommand("setname").setExecutor(new SetName());
        getCommand("setlore").setExecutor(new SetLore());
        getCommand("ranks").setExecutor(new Ranks(bRanks));

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

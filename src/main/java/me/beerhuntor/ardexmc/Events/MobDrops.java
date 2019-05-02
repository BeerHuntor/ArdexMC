package me.beerhuntor.ardexmc.Events;

import me.beerhuntor.ardexmc.Items.Items;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

import java.util.Random;

public class MobDrops implements Listener {

    private Items item = new Items();

    @EventHandler
    public void onMobDeath(EntityDeathEvent event) {
        LivingEntity e = event.getEntity();
        Random dropRate = new Random();

        if (e.getType().equals(EntityType.ZOMBIE)) {
            if (dropRate.nextInt(99) > 15) {
                e.getWorld().dropItemNaturally(e.getLocation(), item.alienDust());
            }
        }
    }
}

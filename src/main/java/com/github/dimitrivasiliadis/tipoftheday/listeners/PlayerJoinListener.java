package com.github.dimitrivasiliadis.tipoftheday.listeners;
import com.github.dimitrivasiliadis.tipoftheday.TipOfTheDay;
import com.github.dimitrivasiliadis.tipoftheday.util.TipFetch;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;
import java.util.ArrayList;

public class PlayerJoinListener implements Listener {
    private TipOfTheDay plugin;
    private Player p;

    public PlayerJoinListener(TipOfTheDay plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        p = e.getPlayer();
        // Delay 3 seconds for TOTD
        Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable(){
            public void run(){
                TipFetch.giveTips(p);
            }
        }, 60L);//20L = 1 sec
    }

}

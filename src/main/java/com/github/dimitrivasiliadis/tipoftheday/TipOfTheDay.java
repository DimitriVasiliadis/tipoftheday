package com.github.dimitrivasiliadis.tipoftheday;

import com.github.dimitrivasiliadis.tipoftheday.commands.TipCommand;
import com.github.dimitrivasiliadis.tipoftheday.listeners.PlayerJoinListener;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class TipOfTheDay extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        // Register Listeners
        getServer().getPluginManager().registerEvents(new PlayerJoinListener(this), this);

        // Register Commands
        getCommand("tip").setExecutor(new TipCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

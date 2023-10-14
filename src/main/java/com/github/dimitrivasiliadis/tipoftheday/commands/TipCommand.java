package com.github.dimitrivasiliadis.tipoftheday.commands;

import com.github.dimitrivasiliadis.tipoftheday.TipOfTheDay;
import com.github.dimitrivasiliadis.tipoftheday.util.TipFetch;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TipCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player) {
            Player p = (Player) sender;
            TipFetch.giveTips(p);
        }
        return true;
    }
}

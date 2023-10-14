package com.github.dimitrivasiliadis.tipoftheday.util;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;

import java.util.ArrayList;

public class TipFetch {
    public static void giveTips(Player p) {
        ItemStack book = new ItemStack(Material.WRITTEN_BOOK);
        int slot = p.getInventory().getHeldItemSlot();
        ItemStack old = p.getInventory().getItem(slot);

        BookMeta bookmeta = (BookMeta) book.getItemMeta();
        bookmeta.setAuthor("test");
        bookmeta.setTitle(ChatColor.RED + "TESST");

        ArrayList<String> pages = new ArrayList<String>();

        pages.add(ChatColor.GREEN + "312312312312" + "213123123123123");
        bookmeta.setPages(pages);

        book.setItemMeta(bookmeta);

        p.getInventory().setItem(slot, book);
        p.openBook(book);
        p.getInventory().setItem(slot, old);
    }
}

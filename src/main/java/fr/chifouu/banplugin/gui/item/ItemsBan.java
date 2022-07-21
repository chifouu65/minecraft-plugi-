package fr.chifouu.banplugin.gui.item;

import java.util.ArrayList;

import fr.chifouu.banplugin.utils.itembuilder.C;
import fr.chifouu.banplugin.utils.itembuilder.ItemBuilder;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;

public class ItemsBan implements Listener {
    public static ItemStack itemBan() {
        ItemStack d = new ItemBuilder(Material.ANVIL, 1)
                .setName(C.RED + "Ban")
                .toItemStack();
        return d;
    }

    public static ItemStack banCheating() {
        ItemStack d = new ItemBuilder(Material.DIAMOND_SWORD, 1)
                .setName(C.RED + "Hacked Client / Blacklisted mods")
                .addLoreLine(C.RED + "Ban player for use of Hacked Client / Blacklisted mods.")
                .toItemStack();
        return d;
    }

    public static ItemStack banXray() {
        ItemStack d = new ItemBuilder(Material.DIAMOND_ORE, 1)
                .setName(C.RED + "Xray")
                .addLoreLine(C.RED + "Ban player for use of Xray.")
                .toItemStack();
        return d;
    }

    public static ItemStack banDdos() {
        ItemStack d = new ItemBuilder(Material.COMMAND, 1)
                .setName(C.RED + "DDOS Threats")
                .addLoreLine(C.RED + "Ban player for threatening to DDOS server.")
                .toItemStack();
        return d;
    }

    public static ItemStack banSpamming() {
        ItemStack d = new ItemBuilder(Material.PAPER, 1)
                .setName(C.RED + "Continuious Spam")
                .addLoreLine(C.RED + "Ban player for spamming after being muted.")
                .toItemStack();
        return d;
    }

    public static ItemStack banAdvertising() {
        ItemStack d = new ItemBuilder(Material.BOOK_AND_QUILL, 1)
                .setName(C.RED + "Advertising")
                .addLoreLine(C.RED + "Ban player permanently for advertising.")
                .toItemStack();
        return d;
    }


    public static ItemStack banImpersonation() {
        ItemStack d = new ItemBuilder(Material.DIAMOND_HELMET, 1)
                .setName(C.RED + "Staff Impersonation")
                .addLoreLine(C.RED + "Ban player for staff impersonation.")
                .toItemStack();
        return d;
    }

    public static ItemStack banEvading() {
        ItemStack d = new ItemBuilder(Material.ANVIL, 1)
                .setName(C.RED + "Ban Evading")
                .addLoreLine(C.RED + "Ban player for evading ban with alt(s).")
                .toItemStack();
        return d;
    }
}


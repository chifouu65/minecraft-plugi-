package fr.chifouu.banplugin.gui.item;

import fr.chifouu.banplugin.utils.itembuilder.C;
import fr.chifouu.banplugin.utils.itembuilder.ItemBuilder;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class ItemsWarn implements Listener {
    public static ItemStack setItemsWarn() {
        ItemStack d = new ItemBuilder(Material.SIGN, 1)
                .setName(C.YELLOW + "Warn")
                .toItemStack();
        return d;
    }

    public static ItemStack warnSpamming() {
        ItemStack d = new ItemBuilder(Material.SIGN, 1)
                .setName(C.YELLOW + "SIGN")
                .toItemStack();
        return d;
    }

    public static ItemStack warnRacialSlurs() {
        ItemStack d = new ItemBuilder(Material.DEAD_BUSH, 1)
                .setName(C.YELLOW + "Racial Slurs")
                .toItemStack();
        return d;
    }

    public static ItemStack warnStaffDis() {
        ItemStack d = new ItemBuilder(Material.GOLDEN_APPLE, 1)
                .setName(C.YELLOW + "Staff Disrespect")
                .toItemStack();
        return d;
    }

    public static ItemStack warnPlayerDis() {
        ItemStack d = new ItemBuilder(Material.APPLE, 1)
                .setName(C.YELLOW + "Player Disrespect")
                .toItemStack();
        return d;
    }

    public static ItemStack warnHarassment() {
        ItemStack d = new ItemBuilder(Material.CAKE, 1)
                .setName(C.YELLOW + "Player Disrespect")
                .toItemStack();
        return d;
    }

    public static ItemStack warnBigotry() {
        ItemStack d = new ItemBuilder(Material.CACTUS, 1)
                .setName(C.YELLOW + "Bigotry")
                .toItemStack();
        return d;
    }

    public static ItemStack warnOCD() {
        ItemStack d = new ItemBuilder(Material.TRIPWIRE_HOOK, 1)
                .setName(" ")
                .addLoreLine(" ")
                .toItemStack();
        return d;
    }
}

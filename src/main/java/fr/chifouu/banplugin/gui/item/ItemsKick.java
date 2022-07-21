package fr.chifouu.banplugin.gui.item;
import java.util.ArrayList;

import fr.chifouu.banplugin.utils.itembuilder.C;
import fr.chifouu.banplugin.utils.itembuilder.ItemBuilder;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ItemsKick implements Listener {
    public static ItemStack setItemsKick() {
        ItemStack d = new ItemStack(Material.TRIPWIRE_HOOK, 1);
        ItemMeta im = d.getItemMeta();
        im.setDisplayName(ChatColor.RED + "Kick");
        d.setItemMeta(im);
        return d;
    }

    public static ItemStack kickSpamming() {
        ItemStack d = new ItemBuilder(Material.SIGN, 1)
                .setName(C.YELLOW + "Spamming")
                .toItemStack();
        return d;
    }

    public static ItemStack kickRacialSlurs() {
        ItemStack d = new ItemBuilder(Material.DEAD_BUSH, 1)
                .setName(C.YELLOW + "Racial Slurs")
                .toItemStack();
        return d;
    }

    public static ItemStack kickStaffDis() {
        ItemStack d = new ItemBuilder(Material.GOLDEN_APPLE, 1)
                .setName(C.YELLOW + "Staff Disrespect")
                .toItemStack();
        return d;
    }

    public static ItemStack kickPlayerDis() {
        ItemStack d = new ItemBuilder(Material.APPLE, 1)
                .setName(C.YELLOW + "Player Disrespect")
                .toItemStack();
        return d;
    }

    public static ItemStack kickHarassment() {
        ItemStack d = new ItemBuilder(Material.EYE_OF_ENDER, 1)
                .setName(C.YELLOW + "Harassment")
                .toItemStack();
        return d;
    }

    public static ItemStack kickBigotry() {
        ItemStack d = new ItemBuilder(Material.EGG, 1)
                .setName(C.YELLOW + "Bigotry")
                .toItemStack();
        return d;
    }

    public static ItemStack kickOCD() {
        ItemStack d = new ItemBuilder(Material.TRIPWIRE_HOOK, 1)
                .setName(C.YELLOW + "Cure for OCD")
                .addLoreLine(C.YELLOW + "Does nothing, just here so everything is even." )
                .toItemStack();
        return d;
    }
}

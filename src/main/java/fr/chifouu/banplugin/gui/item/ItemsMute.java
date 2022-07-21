package fr.chifouu.banplugin.gui.item;

import java.util.ArrayList;

import fr.chifouu.banplugin.utils.itembuilder.C;
import fr.chifouu.banplugin.utils.itembuilder.ItemBuilder;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ItemsMute implements Listener {
    public static ItemStack setItemsMute() {
        ItemStack d = new ItemBuilder(Material.BOOK, 1)
                .setName(C.YELLOW + "Mute")
                .toItemStack();
        return d;
    }

    public static ItemStack setItemsMuteSpamming() {
        ItemStack d = new ItemBuilder(Material.BOOK_AND_QUILL, 1)
                .setName(C.YELLOW + "Spamming")
                .addLoreLine(C.RED+ "Mute player for spamming.")
                .toItemStack();
        return d;
    }

    public static ItemStack setItemsRacism() {
        ItemStack d = new ItemBuilder(Material.BOOK_AND_QUILL, 1)
                .setName(C.YELLOW + "Racism")
                .addLoreLine(C.RED+ "Mute player for rasist comments.")
                .toItemStack();
        return d;
    }

    public static ItemStack setItemsHarassment() {
        ItemStack d = new ItemBuilder(Material.EGG, 1)
                .setName(C.YELLOW + "Harassment")
                .addLoreLine(C.RED+ "Mute player for harassing another player.")
                .toItemStack();
        return d;
    }

    public static ItemStack setItemsBigotry() {
        ItemStack d = new ItemBuilder(Material.NETHER_STAR, 1)
                .setName(C.YELLOW + "Bigotry")
                .addLoreLine(C.RED+ "Mute player for use of bigotry.")
                .toItemStack();
        return d;
    }

    public static ItemStack setItemsStaffDis() {
        ItemStack d = new ItemBuilder(Material.GOLDEN_APPLE, 1)
                .setName(C.YELLOW + "Staff disrespect")
                .addLoreLine(C.RED+ "Mute player for disrespecting staff.")
                .toItemStack();
        return d;
    }

    public static ItemStack setItemsPlayerDis() {
        ItemStack d = new ItemBuilder(Material.APPLE, 1)
                .setName(C.YELLOW + "Player disrespect")
                .addLoreLine(C.RED+ "Mute player for disrespecting other players.")
                .toItemStack();
        return d;
    }

    public static ItemStack setItemsEvadingMute() {
        ItemStack d = new ItemBuilder(Material.BOOK, 1)
                .setName(C.YELLOW + "Evading mute")
                .addLoreLine(C.RED+ "Mute player for evading mute.")
                .toItemStack();
        return d;
    }
}

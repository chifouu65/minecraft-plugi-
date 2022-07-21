package fr.chifouu.banplugin.gui.punish;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class PunishBan implements Listener {
    public static String banType = "";

    public static ItemStack banDDOS() {
        ItemStack d = new ItemStack(Material.STAINED_CLAY, 1, (short)14);
        ItemMeta im = d.getItemMeta();
        im.setDisplayName(ChatColor.RED + "Permanent");
        d.setItemMeta(im);
        return d;
    }

    public static ItemStack banCheatOne() {
        ItemStack d = new ItemStack(Material.STAINED_CLAY, 1, (short)5);
        ItemMeta im = d.getItemMeta();
        im.setDisplayName(ChatColor.RED + "14 Days");
        d.setItemMeta(im);
        return d;
    }

    public static ItemStack banCheatTwo() {
        ItemStack d = new ItemStack(Material.STAINED_CLAY, 1, (short)4);
        ItemMeta im = d.getItemMeta();
        im.setDisplayName(ChatColor.RED + "32 Days");
        d.setItemMeta(im);
        return d;
    }

    public static ItemStack banCheatThree() {
        ItemStack d = new ItemStack(Material.STAINED_CLAY, 1, (short)1);
        ItemMeta im = d.getItemMeta();
        im.setDisplayName(ChatColor.RED + "90 Days");
        d.setItemMeta(im);
        return d;
    }

    public static ItemStack banCheatFour() {
        ItemStack d = new ItemStack(Material.STAINED_CLAY, 1, (short)14);
        ItemMeta im = d.getItemMeta();
        im.setDisplayName(ChatColor.RED + "Permanent");
        d.setItemMeta(im);
        return d;
    }

    public static ItemStack banCheatFive() {
        ItemStack d = new ItemStack(Material.REDSTONE_TORCH_ON, 1);
        ItemMeta im = d.getItemMeta();
        im.setDisplayName(ChatColor.RED + "IP-Ban Permanent");
        d.setItemMeta(im);
        return d;
    }

    public static ItemStack banXrayOne() {
        ItemStack d = new ItemStack(Material.STAINED_CLAY, 1, (short)5);
        ItemMeta im = d.getItemMeta();
        im.setDisplayName(ChatColor.RED + "14 Days");
        d.setItemMeta(im);
        return d;
    }

    public static ItemStack banXrayTwo() {
        ItemStack d = new ItemStack(Material.STAINED_CLAY, 1, (short)4);
        ItemMeta im = d.getItemMeta();
        im.setDisplayName(ChatColor.RED + "32 Days");
        d.setItemMeta(im);
        return d;
    }

    public static ItemStack banXrayThree() {
        ItemStack d = new ItemStack(Material.STAINED_CLAY, 1, (short)1);
        ItemMeta im = d.getItemMeta();
        im.setDisplayName(ChatColor.RED + "90 Days");
        d.setItemMeta(im);
        return d;
    }

    public static ItemStack banXrayFour() {
        ItemStack d = new ItemStack(Material.STAINED_CLAY, 1, (short)14);
        ItemMeta im = d.getItemMeta();
        im.setDisplayName(ChatColor.RED + "Permanent");
        d.setItemMeta(im);
        return d;
    }

    public static ItemStack banXrayFive() {
        ItemStack d = new ItemStack(Material.REDSTONE_TORCH_ON, 1);
        ItemMeta im = d.getItemMeta();
        im.setDisplayName(ChatColor.RED + "IP-Ban Permanent");
        d.setItemMeta(im);
        return d;
    }

    public static ItemStack banSpammingOne() {
        ItemStack d = new ItemStack(Material.STAINED_CLAY, 1, (short)5);
        ItemMeta im = d.getItemMeta();
        im.setDisplayName(ChatColor.RED + "12 hours");
        d.setItemMeta(im);
        return d;
    }

    public static ItemStack banSpammingTwo() {
        ItemStack d = new ItemStack(Material.STAINED_CLAY, 1, (short)4);
        ItemMeta im = d.getItemMeta();
        im.setDisplayName(ChatColor.RED + "1 Day");
        d.setItemMeta(im);
        return d;
    }

    public static ItemStack banSpammingThree() {
        ItemStack d = new ItemStack(Material.STAINED_CLAY, 1, (short)1);
        ItemMeta im = d.getItemMeta();
        im.setDisplayName(ChatColor.RED + "7 Days");
        d.setItemMeta(im);
        return d;
    }

    public static ItemStack banSpammingFour() {
        ItemStack d = new ItemStack(Material.STAINED_CLAY, 1, (short)14);
        ItemMeta im = d.getItemMeta();
        im.setDisplayName(ChatColor.RED + "Permanent");
        d.setItemMeta(im);
        return d;
    }

    public static ItemStack banSpammingFive() {
        ItemStack d = new ItemStack(Material.REDSTONE_TORCH_ON, 1);
        ItemMeta im = d.getItemMeta();
        im.setDisplayName(ChatColor.RED + "IP-Ban Permanent");
        d.setItemMeta(im);
        return d;
    }

    public static ItemStack banImpersonationOne() {
        ItemStack d = new ItemStack(Material.STAINED_CLAY, 1, (short)5);
        ItemMeta im = d.getItemMeta();
        im.setDisplayName(ChatColor.RED + "1 Day");
        d.setItemMeta(im);
        return d;
    }

    public static ItemStack banImpersonationTwo() {
        ItemStack d = new ItemStack(Material.STAINED_CLAY, 1, (short)4);
        ItemMeta im = d.getItemMeta();
        im.setDisplayName(ChatColor.RED + "7 Days");
        d.setItemMeta(im);
        return d;
    }

    public static ItemStack banImpersonationThree() {
        ItemStack d = new ItemStack(Material.STAINED_CLAY, 1, (short)1);
        ItemMeta im = d.getItemMeta();
        im.setDisplayName(ChatColor.RED + "32 Days");
        d.setItemMeta(im);
        return d;
    }

    public static ItemStack banImpersonationFour() {
        ItemStack d = new ItemStack(Material.STAINED_CLAY, 1, (short)14);
        ItemMeta im = d.getItemMeta();
        im.setDisplayName(ChatColor.RED + "Permanent");
        d.setItemMeta(im);
        return d;
    }

    public static ItemStack banImpersonationFive() {
        ItemStack d = new ItemStack(Material.REDSTONE_TORCH_ON, 1);
        ItemMeta im = d.getItemMeta();
        im.setDisplayName(ChatColor.RED + "IP-Ban Permanent");
        d.setItemMeta(im);
        return d;
    }

    public static ItemStack banEvadingOne() {
        ItemStack d = new ItemStack(Material.STAINED_CLAY, 1, (short)5);
        ItemMeta im = d.getItemMeta();
        im.setDisplayName(ChatColor.RED + "IP-Ban 14 Days");
        d.setItemMeta(im);
        return d;
    }

    public static ItemStack banEvadingTwo() {
        ItemStack d = new ItemStack(Material.STAINED_CLAY, 1, (short)4);
        ItemMeta im = d.getItemMeta();
        im.setDisplayName(ChatColor.RED + "IP-Ban 32 Days");
        d.setItemMeta(im);
        return d;
    }

    public static ItemStack banEvadingThree() {
        ItemStack d = new ItemStack(Material.STAINED_CLAY, 1, (short)1);
        ItemMeta im = d.getItemMeta();
        im.setDisplayName(ChatColor.RED + "IP-Ban 90 Days");
        d.setItemMeta(im);
        return d;
    }

    public static ItemStack banEvadingFour() {
        ItemStack d = new ItemStack(Material.STAINED_CLAY, 1, (short)14);
        ItemMeta im = d.getItemMeta();
        im.setDisplayName(ChatColor.RED + "IP-Ban 120 Days");
        d.setItemMeta(im);
        return d;
    }

    public static ItemStack banEvadingFive() {
        ItemStack d = new ItemStack(Material.REDSTONE_TORCH_ON, 1);
        ItemMeta im = d.getItemMeta();
        im.setDisplayName(ChatColor.RED + "IP-Ban Permanent");
        d.setItemMeta(im);
        return d;
    }
}

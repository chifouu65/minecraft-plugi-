package fr.chifouu.banplugin.gui.item;

import fr.chifouu.banplugin.gui.Inv;
import fr.chifouu.banplugin.utils.itembuilder.C;
import fr.chifouu.banplugin.utils.itembuilder.ItemBuilder;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ItemsMenu {
    public static ItemStack Glass() {
        ItemStack d = new ItemBuilder(Material.STAINED_GLASS_PANE, 1)
                .setName(" ")
                .toItemStack();
        return d;
    }

    public static ItemStack noPerms() {
        ItemStack d = new ItemBuilder(Material.BEDROCK, 1)
                .setName(C.RED + "No permission!")
                .addLoreLine(C.RED + "You do not have permission to use this punish type!")
                .toItemStack();
        return d;
    }

    public static ItemStack menuBack() {
        ItemStack d = new ItemBuilder(Material.SKULL_ITEM, 1)
                .setName(C.RED + "MHF_ArrowLeft")
                .toItemStack();
        return d;
    }

    public static ItemStack setItemsClose() {
        ItemStack d = new ItemBuilder(Material.BEDROCK, 1)
                .setName(C.RED + "Cancel")
                .toItemStack();
        return d;
    }

    public static ItemStack backMenu() {
        ItemStack d = new ItemStack(menuBack());
        ItemMeta im = d.getItemMeta();
        im.setDisplayName(ChatColor.RED + "Back");
        d.setItemMeta(im);
        Inv.PunishBanInv.setItem(36, d);
        Inv.PunishBanCheating.setItem(36, d);
        Inv.PunishBanEvading.setItem(36, d);
        Inv.PunishBanImpersonation.setItem(36, d);
        Inv.PunishBanSpamming.setItem(36, d);
        Inv.PunishBanXray.setItem(36, d);
        Inv.PunishMuteInv.setItem(36, d);
        Inv.PunishMuteBigotry.setItem(36, d);
        Inv.PunishMuteEvading.setItem(36, d);
        Inv.PunishMuteHarassment.setItem(36, d);
        Inv.PunishMutePlayerDis.setItem(36, d);
        Inv.PunishMuteRacism.setItem(36, d);
        Inv.PunishMuteSpamming.setItem(36, d);
        Inv.PunishMuteStaffDis.setItem(36, d);
        Inv.PunishWarnInv.setItem(36, d);
        Inv.PunishKickInv.setItem(36, d);
        return d;
    }
}

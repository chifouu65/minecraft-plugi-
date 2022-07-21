package fr.chifouu.banplugin.gui;

import fr.chifouu.banplugin.gui.item.ItemsWarn;
import fr.chifouu.banplugin.gui.punish.Punish;
import fr.chifouu.banplugin.gui.punish.PunishType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class InvWarnEvent implements Listener {
    @EventHandler
    public void onClick(InventoryClickEvent e) {
        Player p = (Player)e.getWhoClicked();
        if (e.getCurrentItem() == null)
            return;
        if (e.getCurrentItem().equals(ItemsWarn.setItemsWarn())) {
            p.closeInventory();
            Inv.punishWarn(p);
        }
        if (e.getInventory().equals(Inv.PunishWarnInv) && e.getCurrentItem().equals(ItemsWarn.warnBigotry())) {
            e.getWhoClicked().closeInventory();
            PunishType.warnType = "Bigotry";
            p.chat("/warn " + Punish.bannedPlayer.getName() + " " + PunishType.warnType);
        }
        if (e.getInventory().equals(Inv.PunishWarnInv) && e.getCurrentItem().equals(ItemsWarn.warnHarassment())) {
            e.getWhoClicked().closeInventory();
            PunishType.warnType = "Harassment";
            p.chat("/warn " + Punish.bannedPlayer.getName() + " " + PunishType.warnType);
        }
        if (e.getInventory().equals(Inv.PunishWarnInv) && e.getCurrentItem().equals(ItemsWarn.warnSpamming())) {
            e.getWhoClicked().closeInventory();
            PunishType.warnType = "Spamming";
            p.chat("/warn " + Punish.bannedPlayer.getName() + " " + PunishType.warnType);
        }
        if (e.getInventory().equals(Inv.PunishWarnInv) && e.getCurrentItem().equals(ItemsWarn.warnRacialSlurs())) {
            e.getWhoClicked().closeInventory();
            PunishType.warnType = "Racial Slurs";
            p.chat("/warn " + Punish.bannedPlayer.getName() + " " + PunishType.warnType);
        }
        if (e.getInventory().equals(Inv.PunishWarnInv) && e.getCurrentItem().equals(ItemsWarn.warnPlayerDis())) {
            e.getWhoClicked().closeInventory();
            PunishType.warnType = "Player Disrespect";
            p.chat("/warn " + Punish.bannedPlayer.getName() + " " + PunishType.warnType);
        }
        if (e.getInventory().equals(Inv.PunishWarnInv) && e.getCurrentItem().equals(ItemsWarn.warnStaffDis())) {
            e.getWhoClicked().closeInventory();
            PunishType.warnType = "Staff Disrespect";
            p.chat("/warn " + Punish.bannedPlayer.getName() + " " + PunishType.warnType);
        }
    }
}

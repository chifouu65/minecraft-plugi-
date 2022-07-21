package fr.chifouu.banplugin.gui;

import fr.chifouu.banplugin.gui.item.ItemsKick;
import fr.chifouu.banplugin.gui.punish.Punish;
import fr.chifouu.banplugin.gui.punish.PunishType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class InvKickEvent implements Listener {
    @EventHandler
    public void onClick(InventoryClickEvent e) {
        Player p = (Player)e.getWhoClicked();
        if (e.getCurrentItem() == null)
            return;
        if (e.getInventory().equals(Inv.PunishMenuInv) || e.getInventory().equals(Inv.PunishKickInv))
            e.setCancelled(true);
        if (e.getCurrentItem().equals(ItemsKick.setItemsKick())) {
            p.closeInventory();
            Inv.punishKick(p);
        }
        if (e.getInventory().equals(Inv.PunishKickInv) && e.getCurrentItem().equals(ItemsKick.kickBigotry())) {
            e.getWhoClicked().closeInventory();
            PunishType.kickType = "Bigotry";
            p.chat("/kick " + Punish.bannedPlayer.getName() + " " + PunishType.kickType);
        }
        if (e.getInventory().equals(Inv.PunishKickInv) && e.getCurrentItem().equals(ItemsKick.kickHarassment())) {
            e.getWhoClicked().closeInventory();
            PunishType.kickType = "Harassment";
            p.chat("/kick " + Punish.bannedPlayer.getName() + " " + PunishType.kickType);
        }
        if (e.getInventory().equals(Inv.PunishKickInv) && e.getCurrentItem().equals(ItemsKick.kickSpamming())) {
            e.getWhoClicked().closeInventory();
            PunishType.kickType = "Spamming";
            p.chat("/kick " + Punish.bannedPlayer.getName() + " " + PunishType.kickType);
        }
        if (e.getInventory().equals(Inv.PunishKickInv) && e.getCurrentItem().equals(ItemsKick.kickRacialSlurs())) {
            e.getWhoClicked().closeInventory();
            PunishType.kickType = "Racial Slurs";
            p.chat("/kick " + Punish.bannedPlayer.getName() + " " + PunishType.kickType);
        }
        if (e.getInventory().equals(Inv.PunishKickInv) && e.getCurrentItem().equals(ItemsKick.kickPlayerDis())) {
            e.getWhoClicked().closeInventory();
            PunishType.kickType = "Player Disrespect";
            p.chat("/kick " + Punish.bannedPlayer.getName() + " " + PunishType.kickType);
        }
        if (e.getInventory().equals(Inv.PunishKickInv) && e.getCurrentItem().equals(ItemsKick.kickStaffDis())) {
            e.getWhoClicked().closeInventory();
            PunishType.kickType = "Staff Disrespect";
            p.chat("/kick " + Punish.bannedPlayer.getName() + " " + PunishType.kickType);
        }
    }
}

package fr.chifouu.banplugin.gui;

import fr.chifouu.banplugin.gui.item.ItemsMenu;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class InvBackEvent implements Listener {
    @EventHandler
    public void onClick(InventoryClickEvent e) {
        Player p = (Player)e.getWhoClicked();
        if (e.getCurrentItem() == null)
            return;
        if (e.getInventory().equals(Inv.PunishMuteSpamming) || e.getInventory().equals(Inv.PunishMuteInv))
            e.setCancelled(true);
        if (e.getInventory().equals(Inv.PunishMuteSpamming) && e.getCurrentItem().equals(ItemsMenu.Glass()))
            return;
        if (e.getInventory().equals(Inv.PunishWarnInv) || e.getInventory().equals(Inv.PunishMenuInv))
            e.setCancelled(true);
        if (e.getInventory().equals(Inv.PunishWarnInv) && e.getCurrentItem().equals(ItemsMenu.Glass()))
            return;
        if (e.getInventory().equals(Inv.PunishBanCheating) || e.getInventory().equals(Inv.PunishBanInv))
            e.setCancelled(true);
        if (e.getInventory().equals(Inv.PunishBanCheating) && e.getCurrentItem().equals(ItemsMenu.Glass()))
            return;
        if (e.getInventory().equals(Inv.PunishBanInv) || e.getInventory().equals(Inv.PunishMenuInv))
            e.setCancelled(true);
        if (e.getInventory().equals(Inv.PunishBanInv) && e.getCurrentItem().getType().equals(Material.SKULL_ITEM)) {
            p.closeInventory();
            Inv.punishMenu(p);
        }
        if (e.getInventory().equals(Inv.PunishBanCheating) || e.getInventory().equals(Inv.PunishBanInv))
            e.setCancelled(true);
        if (e.getInventory().equals(Inv.PunishBanCheating) && e.getCurrentItem().getType().equals(Material.SKULL_ITEM)) {
            p.closeInventory();
            Inv.punishBan(p);
        }
        if (e.getInventory().equals(Inv.PunishBanEvading) || e.getInventory().equals(Inv.PunishBanInv))
            e.setCancelled(true);
        if (e.getInventory().equals(Inv.PunishBanEvading) && e.getCurrentItem().getType().equals(Material.SKULL_ITEM)) {
            p.closeInventory();
            Inv.punishBan(p);
        }
        if (e.getInventory().equals(Inv.PunishBanImpersonation) || e.getInventory().equals(Inv.PunishBanInv))
            e.setCancelled(true);
        if (e.getInventory().equals(Inv.PunishBanImpersonation) && e.getCurrentItem().getType().equals(Material.SKULL_ITEM)) {
            p.closeInventory();
            Inv.punishBan(p);
        }
        if (e.getInventory().equals(Inv.PunishBanSpamming) || e.getInventory().equals(Inv.PunishBanInv))
            e.setCancelled(true);
        if (e.getInventory().equals(Inv.PunishBanSpamming) && e.getCurrentItem().getType().equals(Material.SKULL_ITEM)) {
            p.closeInventory();
            Inv.punishBan(p);
        }
        if (e.getInventory().equals(Inv.PunishMuteInv) || e.getInventory().equals(Inv.PunishMenuInv))
            e.setCancelled(true);
        if (e.getInventory().equals(Inv.PunishMuteInv) && e.getCurrentItem().getType().equals(Material.SKULL_ITEM)) {
            p.closeInventory();
            Inv.punishMenu(p);
        }
        if (e.getInventory().equals(Inv.PunishKickInv) || e.getInventory().equals(Inv.PunishMenuInv))
            e.setCancelled(true);
        if (e.getInventory().equals(Inv.PunishKickInv) && e.getCurrentItem().getType().equals(Material.SKULL_ITEM)) {
            p.closeInventory();
            Inv.punishMenu(p);
        }
        if (e.getInventory().equals(Inv.PunishMuteBigotry) || e.getInventory().equals(Inv.PunishMuteInv))
            e.setCancelled(true);
        if (e.getInventory().equals(Inv.PunishMuteBigotry) && e.getCurrentItem().getType().equals(Material.SKULL_ITEM)) {
            p.closeInventory();
            Inv.punishMute(p);
        }
        if (e.getInventory().equals(Inv.PunishMuteEvading) || e.getInventory().equals(Inv.PunishMuteInv))
            e.setCancelled(true);
        if (e.getInventory().equals(Inv.PunishMuteEvading) && e.getCurrentItem().getType().equals(Material.SKULL_ITEM)) {
            p.closeInventory();
            Inv.punishMute(p);
        }
        if (e.getInventory().equals(Inv.PunishMuteHarassment) || e.getInventory().equals(Inv.PunishMuteInv))
            e.setCancelled(true);
        if (e.getInventory().equals(Inv.PunishMuteHarassment) && e.getCurrentItem().getType().equals(Material.SKULL_ITEM)) {
            p.closeInventory();
            Inv.punishMute(p);
        }
        if (e.getInventory().equals(Inv.PunishMutePlayerDis) || e.getInventory().equals(Inv.PunishMuteInv))
            e.setCancelled(true);
        if (e.getInventory().equals(Inv.PunishMutePlayerDis) && e.getCurrentItem().getType().equals(Material.SKULL_ITEM)) {
            p.closeInventory();
            Inv.punishMute(p);
        }
        if (e.getInventory().equals(Inv.PunishMuteRacism) || e.getInventory().equals(Inv.PunishMuteInv))
            e.setCancelled(true);
        if (e.getInventory().equals(Inv.PunishMuteRacism) && e.getCurrentItem().getType().equals(Material.SKULL_ITEM)) {
            p.closeInventory();
            Inv.punishMute(p);
        }
        if (e.getInventory().equals(Inv.PunishMuteSpamming) || e.getInventory().equals(Inv.PunishMuteInv))
            e.setCancelled(true);
        if (e.getInventory().equals(Inv.PunishMuteSpamming) && e.getCurrentItem().getType().equals(Material.SKULL_ITEM)) {
            p.closeInventory();
            Inv.punishMute(p);
        }
        if (e.getInventory().equals(Inv.PunishMuteStaffDis) || e.getInventory().equals(Inv.PunishMuteInv))
            e.setCancelled(true);
        if (e.getInventory().equals(Inv.PunishMuteStaffDis) && e.getCurrentItem().getType().equals(Material.SKULL_ITEM)) {
            p.closeInventory();
            Inv.punishMute(p);
        }
        if (e.getInventory().equals(Inv.PunishBanXray) || e.getInventory().equals(Inv.PunishBanInv))
            e.setCancelled(true);
        if (e.getInventory().equals(Inv.PunishBanXray) && e.getCurrentItem().getType().equals(Material.SKULL_ITEM)) {
            p.closeInventory();
            Inv.punishBan(p);
        }
        if (e.getInventory().equals(Inv.PunishWarnInv) || e.getInventory().equals(Inv.PunishMenuInv))
            e.setCancelled(true);
        if (e.getInventory().equals(Inv.PunishWarnInv) && e.getCurrentItem().getType().equals(Material.SKULL_ITEM)) {
            p.closeInventory();
            Inv.punishMenu(p);
        }
    }
}


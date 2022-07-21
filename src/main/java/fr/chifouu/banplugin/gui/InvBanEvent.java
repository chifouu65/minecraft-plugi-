package fr.chifouu.banplugin.gui;

import fr.chifouu.banplugin.gui.item.ItemsBan;
import fr.chifouu.banplugin.gui.item.ItemsMenu;
import fr.chifouu.banplugin.gui.punish.Punish;
import fr.chifouu.banplugin.gui.punish.PunishBan;
import fr.chifouu.banplugin.gui.punish.PunishType;
import fr.chifouu.banplugin.rank.AccountProvider;
import fr.chifouu.banplugin.rank.CPlayer;
import fr.chifouu.banplugin.rank.Ranks;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class InvBanEvent implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent e) {
        Player p = (Player)e.getWhoClicked();
        CPlayer account = new AccountProvider(((Player) e.getWhoClicked()).getPlayer()).get();
        if (e.getCurrentItem() == null)
            return;
        if (e.getCurrentItem().equals(ItemsMenu.setItemsClose())) {
            p.closeInventory();
            p.sendMessage(ChatColor.RED + "Punishment canceled.");
        }
        if (e.getCurrentItem().equals(ItemsBan.itemBan()) && (account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
            p.closeInventory();
            Inv.punishBan(p);
        }
        if (e.getInventory().equals(Inv.PunishMenuInv) || e.getInventory().equals(Inv.PunishBanInv))
            e.setCancelled(true);
        if (e.getInventory().equals(Inv.PunishBanInv) && e.getCurrentItem().equals(ItemsBan.banCheating())) {
            e.getWhoClicked().closeInventory();
            Inv.punishBanCheating(p);
            PunishType.banType = "Hacked client";
        }
        if (e.getInventory().equals(Inv.PunishBanCheating) && e.getCurrentItem().equals(PunishBan.banCheatOne()))
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                p.closeInventory();
                p.chat("/ban " + Punish.bannedPlayer.getName() + " " + PunishType.banType + " 14d");
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                p.closeInventory();
                p.sendMessage(ChatColor.RED + "You do not have permission to use this punishment type!");
            }
        if (e.getInventory().equals(Inv.PunishBanCheating) && e.getCurrentItem().equals(PunishBan.banCheatTwo()))
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                p.closeInventory();
                p.chat("/ban " + Punish.bannedPlayer.getName() + " " + PunishType.banType + " 32d");
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                p.closeInventory();
                p.sendMessage(ChatColor.RED + "You do not have permission to use this punishment type!");
            }
        if (e.getInventory().equals(Inv.PunishBanCheating) && e.getCurrentItem().equals(PunishBan.banCheatThree()))
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                p.closeInventory();
                p.chat("/ban " + Punish.bannedPlayer.getName() + " " + PunishType.banType + " 90d");
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                p.closeInventory();
                p.sendMessage(ChatColor.RED + "You do not have permission to use this punishment type!");
            }
        if (e.getInventory().equals(Inv.PunishBanCheating) && e.getCurrentItem().equals(PunishBan.banCheatFour()))
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                p.closeInventory();
                p.chat("/ban " + Punish.bannedPlayer.getName() + " " + PunishType.banType + " ");
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                p.closeInventory();
                p.sendMessage(ChatColor.RED + "You do not have permission to use this punishment type!");
            }
        if (e.getInventory().equals(Inv.PunishBanCheating) && e.getCurrentItem().equals(PunishBan.banCheatFive()))
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                p.closeInventory();
                p.chat("/ipban " + Punish.bannedPlayer.getName() + " " + PunishType.banType + " ");
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                p.closeInventory();
                p.sendMessage(ChatColor.RED + "You do not have permission to use this punishment type!");
            }
        if (e.getInventory().equals(Inv.PunishMenuInv) || e.getInventory().equals(Inv.PunishBanInv))
            e.setCancelled(true);
        if (e.getInventory().equals(Inv.PunishBanInv) && e.getCurrentItem().equals(ItemsBan.banSpamming())) {
            e.getWhoClicked().closeInventory();
            Inv.punishBanSpamming(p);
            PunishType.banType = "Continuious Spam";
        }
        if (e.getInventory().equals(Inv.PunishBanSpamming) && e.getCurrentItem().equals(PunishBan.banSpammingOne()))
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                p.closeInventory();
                p.chat("/ban " + Punish.bannedPlayer.getName() + " " + PunishType.banType + " 12h");
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                p.closeInventory();
                p.sendMessage(ChatColor.RED + "You do not have permission to use this punishment type!");
            }
        if (e.getInventory().equals(Inv.PunishBanSpamming) && e.getCurrentItem().equals(PunishBan.banSpammingTwo()))
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                p.closeInventory();
                p.chat("/ban " + Punish.bannedPlayer.getName() + " " + PunishType.banType + " 1d");
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                p.closeInventory();
                p.sendMessage(ChatColor.RED + "You do not have permission to use this punishment type!");
            }
        if (e.getInventory().equals(Inv.PunishBanSpamming) && e.getCurrentItem().equals(PunishBan.banSpammingThree()))
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                p.closeInventory();
                p.chat("/ban " + Punish.bannedPlayer.getName() + " " + PunishType.banType + " 7d");
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                p.closeInventory();
                p.sendMessage(ChatColor.RED + "You do not have permission to use this punishment type!");
            }
        if (e.getInventory().equals(Inv.PunishBanSpamming) && e.getCurrentItem().equals(PunishBan.banSpammingFour()))
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                p.closeInventory();
                p.chat("/ban " + Punish.bannedPlayer.getName() + " " + PunishType.banType + " ");
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                p.closeInventory();
                p.sendMessage(ChatColor.RED + "You do not have permission to use this punishment type!");
            }
        if (e.getInventory().equals(Inv.PunishBanSpamming) && e.getCurrentItem().equals(PunishBan.banSpammingFive()))
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                p.closeInventory();
                p.chat("/ipban " + Punish.bannedPlayer.getName() + " " + PunishType.banType + " ");
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                p.closeInventory();
                p.sendMessage(ChatColor.RED + "You do not have permission to use this punishment type!");
            }
        if (e.getInventory().equals(Inv.PunishMenuInv) || e.getInventory().equals(Inv.PunishBanInv))
            e.setCancelled(true);
        if (e.getInventory().equals(Inv.PunishBanInv) && e.getCurrentItem().equals(ItemsBan.banAdvertising())) {
            e.getWhoClicked().closeInventory();
            p.chat("/ban " + Punish.bannedPlayer.getName() + " Advertising");
        }
        if (e.getInventory().equals(Inv.PunishMenuInv) || e.getInventory().equals(Inv.PunishBanInv))
            e.setCancelled(true);
        if (e.getInventory().equals(Inv.PunishBanInv) && e.getCurrentItem().equals(ItemsBan.banImpersonation())) {
            e.getWhoClicked().closeInventory();
            Inv.punishBanImpersonation(p);
            PunishType.banType = "Impersonating staff";
        }
        if (e.getInventory().equals(Inv.PunishBanImpersonation) && e.getCurrentItem().equals(PunishBan.banImpersonationOne()))
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                p.closeInventory();
                p.chat("/ban " + Punish.bannedPlayer.getName() + " " + PunishType.banType + " 1d");
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                p.closeInventory();
                p.sendMessage(ChatColor.RED + "You do not have permission to use this punishment type!");
            }
        if (e.getInventory().equals(Inv.PunishBanImpersonation) && e.getCurrentItem().equals(PunishBan.banImpersonationTwo()))
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                p.closeInventory();
                p.chat("/ban " + Punish.bannedPlayer.getName() + " " + PunishType.banType + " 7d");
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                p.closeInventory();
                p.sendMessage(ChatColor.RED + "You do not have permission to use this punishment type!");
            }
        if (e.getInventory().equals(Inv.PunishBanImpersonation) && e.getCurrentItem().equals(PunishBan.banImpersonationThree()))
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                p.closeInventory();
                p.chat("/ban " + Punish.bannedPlayer.getName() + " " + PunishType.banType + " 32d");
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                p.closeInventory();
                p.sendMessage(ChatColor.RED + "You do not have permission to use this punishment type!");
            }
        if (e.getInventory().equals(Inv.PunishBanImpersonation) && e.getCurrentItem().equals(PunishBan.banImpersonationFour()))
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                p.closeInventory();
                p.chat("/ban " + Punish.bannedPlayer.getName() + " " + PunishType.banType + " ");
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                p.closeInventory();
                p.sendMessage(ChatColor.RED + "You do not have permission to use this punishment type!");
            }
        if (e.getInventory().equals(Inv.PunishBanImpersonation) && e.getCurrentItem().equals(PunishBan.banImpersonationFive()))
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                p.closeInventory();
                p.chat("/ipban " + Punish.bannedPlayer.getName() + " " + PunishType.banType + " ");
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                p.closeInventory();
                p.sendMessage(ChatColor.RED + "You do not have permission to use this punishment type!");
            }
        if (e.getInventory().equals(Inv.PunishMenuInv) || e.getInventory().equals(Inv.PunishBanInv))
            e.setCancelled(true);
        if (e.getInventory().equals(Inv.PunishBanInv) && e.getCurrentItem().equals(ItemsBan.banEvading())) {
            e.getWhoClicked().closeInventory();
            Inv.punishBanEvading(p);
            PunishType.banType = "Ban Evading";
        }
        if (e.getInventory().equals(Inv.PunishBanEvading) && e.getCurrentItem().equals(PunishBan.banEvadingOne()))
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                p.closeInventory();
                p.chat("/ipban " + Punish.bannedPlayer.getName() + " " + PunishType.banType + " 14d");
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                p.closeInventory();
                p.sendMessage(ChatColor.RED + "You do not have permission to use this punishment type!");
            }
        if (e.getInventory().equals(Inv.PunishBanEvading) && e.getCurrentItem().equals(PunishBan.banEvadingTwo()))
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                p.closeInventory();
                p.chat("/ban " + Punish.bannedPlayer.getName() + " " + PunishType.banType + " 32d");
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                p.closeInventory();
                p.sendMessage(ChatColor.RED + "You do not have permission to use this punishment type!");
            }
        if (e.getInventory().equals(Inv.PunishBanEvading) && e.getCurrentItem().equals(PunishBan.banEvadingThree()))
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                p.closeInventory();
                p.chat("/ban " + Punish.bannedPlayer.getName() + " " + PunishType.banType + " 90d");
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                p.closeInventory();
                p.sendMessage(ChatColor.RED + "You do not have permission to use this punishment type!");
            }
        if (e.getInventory().equals(Inv.PunishBanEvading) && e.getCurrentItem().equals(PunishBan.banEvadingFour()))
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                p.closeInventory();
                p.chat("/ban " + Punish.bannedPlayer.getName() + " " + PunishType.banType + " 120d");
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                p.closeInventory();
                p.sendMessage(ChatColor.RED + "You do not have permission to use this punishment type!");
            }
        if (e.getInventory().equals(Inv.PunishBanEvading) && e.getCurrentItem().equals(PunishBan.banEvadingFive()))
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                p.closeInventory();
                p.chat("/ipban " + Punish.bannedPlayer.getName() + " " + PunishType.banType + " ");
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                p.closeInventory();
                p.sendMessage(ChatColor.RED + "You do not have permission to use this punishment type!");
            }
        if (e.getInventory().equals(Inv.PunishMenuInv) || e.getInventory().equals(Inv.PunishBanInv))
            e.setCancelled(true);
        if (e.getInventory().equals(Inv.PunishBanInv) && e.getCurrentItem().equals(ItemsBan.banXray())) {
            e.getWhoClicked().closeInventory();
            Inv.punishBanXray(p);
            PunishType.banType = "Xray";
        }
        if (e.getInventory().equals(Inv.PunishBanXray) && e.getCurrentItem().equals(PunishBan.banXrayOne()))
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                p.closeInventory();
                p.chat("/ban " + Punish.bannedPlayer.getName() + " " + PunishType.banType + " 14d");
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                p.closeInventory();
                p.sendMessage(ChatColor.RED + "You do not have permission to use this punishment type!");
            }
        if (e.getInventory().equals(Inv.PunishBanXray) && e.getCurrentItem().equals(PunishBan.banXrayTwo()))
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                p.closeInventory();
                p.chat("/ban " + Punish.bannedPlayer.getName() + " " + PunishType.banType + " 32d");
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                p.closeInventory();
                p.sendMessage(ChatColor.RED + "You do not have permission to use this punishment type!");
            }
        if (e.getInventory().equals(Inv.PunishBanXray) && e.getCurrentItem().equals(PunishBan.banXrayThree()))
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                p.closeInventory();
                p.chat("/ban " + Punish.bannedPlayer.getName() + " " + PunishType.banType + " 90d");
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                p.closeInventory();
                p.sendMessage(ChatColor.RED + "You do not have permission to use this punishment type!");
            }
        if (e.getInventory().equals(Inv.PunishBanXray) && e.getCurrentItem().equals(PunishBan.banXrayFour()))
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                p.closeInventory();
                p.chat("/ban " + Punish.bannedPlayer.getName() + " " + PunishType.banType + " ");
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                p.closeInventory();
                p.sendMessage(ChatColor.RED + "You do not have permission to use this punishment type!");
            }
        if (e.getInventory().equals(Inv.PunishBanXray) && e.getCurrentItem().equals(PunishBan.banXrayFive()))
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                p.closeInventory();
                p.chat("/ipban " + Punish.bannedPlayer.getName() + " " + PunishType.banType + " ");
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                p.closeInventory();
                p.sendMessage(ChatColor.RED + "You do not have permission to use this punishment type!");
            }
        if (e.getInventory().equals(Inv.PunishBanInv) && e.getCurrentItem().equals(ItemsBan.banDdos()))
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                p.closeInventory();
                p.chat("/ipban " + Punish.bannedPlayer.getName() + " Threatening to DDOS server");
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                p.closeInventory();
                p.sendMessage(ChatColor.RED + "You do not have permission to use this punishment type!");
            }
    }
}
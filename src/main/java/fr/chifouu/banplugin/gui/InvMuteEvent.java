package fr.chifouu.banplugin.gui;

import fr.chifouu.banplugin.gui.item.ItemsMenu;
import fr.chifouu.banplugin.gui.item.ItemsMute;
import fr.chifouu.banplugin.gui.punish.Punish;
import fr.chifouu.banplugin.gui.punish.PunishMute;
import fr.chifouu.banplugin.rank.AccountProvider;
import fr.chifouu.banplugin.rank.CPlayer;
import fr.chifouu.banplugin.rank.Ranks;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class InvMuteEvent implements Listener {
    @EventHandler
    public void onClick(InventoryClickEvent e) {
        Player p = (Player)e.getWhoClicked();
        CPlayer account = new AccountProvider(p).get();

        if (e.getCurrentItem() == null)
            return;
        if (e.getCurrentItem().equals(ItemsMute.setItemsMute()) && (account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
            p.closeInventory();
            Inv.punishMute(p);
        } else if (e.getCurrentItem().equals(ItemsMenu.noPerms()) && account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            p.closeInventory();
            p.sendMessage(ChatColor.RED + "You do not have permission to use this punishment type!");
        }
        if (e.getInventory().equals(Inv.PunishMenuInv) || e.getInventory().equals(Inv.PunishMuteInv))
            e.setCancelled(true);
        if (e.getInventory().equals(Inv.PunishMuteInv) && e.getCurrentItem().equals(ItemsMute.setItemsMuteSpamming()) &&
                (account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
            p.closeInventory();
            Inv.punishMuteSpamming(p);
            PunishMute.muteType = "Spamming";
        }
        if (e.getInventory().equals(Inv.PunishMuteSpamming) && e.getCurrentItem().equals(PunishMute.muteSpammingOne()))
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                p.closeInventory();
                p.chat("/mute " + Punish.bannedPlayer.getName() + " " + PunishMute.muteType + " 30m");
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                p.closeInventory();
                p.sendMessage(ChatColor.RED + "You do not have permission to use this punishment type!");
            }
        if (e.getInventory().equals(Inv.PunishMuteSpamming) && e.getCurrentItem().equals(PunishMute.muteSpammingTwo()))
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                p.closeInventory();
                p.chat("/mute " + Punish.bannedPlayer.getName() + " " + PunishMute.muteType + " 12h");
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                p.closeInventory();
                p.sendMessage(ChatColor.RED + "You do not have permission to use this punishment type!");
            }
        if (e.getInventory().equals(Inv.PunishMuteSpamming) && e.getCurrentItem().equals(PunishMute.muteSpammingThree()))
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                p.closeInventory();
                p.chat("/mute " + Punish.bannedPlayer.getName() + " " + PunishMute.muteType + " 1d");
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                p.closeInventory();
                p.sendMessage(ChatColor.RED + "You do not have permission to use this punishment type!");
            }
        if (e.getInventory().equals(Inv.PunishMuteSpamming) && e.getCurrentItem().equals(PunishMute.muteSpammingFour()))
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                p.closeInventory();
                p.chat("/mute " + Punish.bannedPlayer.getName() + " " + PunishMute.muteType + " 7d");
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                p.closeInventory();
                p.sendMessage(ChatColor.RED + "You do not have permission to use this punishment type!");
            }
        if (e.getInventory().equals(Inv.PunishMuteSpamming) && e.getCurrentItem().equals(PunishMute.muteSpammingFive()))
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                p.closeInventory();
                p.chat("/mute " + Punish.bannedPlayer.getName() + " " + PunishMute.muteType + " ");
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                p.closeInventory();
                p.sendMessage(ChatColor.RED + "You do not have permission to use this punishment type!");
            }
        if (e.getCurrentItem().equals(ItemsMute.setItemsHarassment()) && (account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
            p.closeInventory();
            Inv.punishMuteHarassment(p);
            PunishMute.muteType = "Harassment";
        }
        if (e.getInventory().equals(Inv.PunishMuteHarassment) && e.getCurrentItem().equals(PunishMute.muteHarassmentOne()))
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                p.closeInventory();
                p.chat("/mute " + Punish.bannedPlayer.getName() + " " + PunishMute.muteType + " 1h");
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                p.closeInventory();
                p.sendMessage(ChatColor.RED + "You do not have permission to use this punishment type!");
            }
        if (e.getInventory().equals(Inv.PunishMuteHarassment) && e.getCurrentItem().equals(PunishMute.muteHarassmentTwo()))
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                p.closeInventory();
                p.chat("/mute " + Punish.bannedPlayer.getName() + " " + PunishMute.muteType + " 12h");
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                p.closeInventory();
                p.sendMessage(ChatColor.RED + "You do not have permission to use this punishment type!");
            }
        if (e.getInventory().equals(Inv.PunishMuteHarassment) && e.getCurrentItem().equals(PunishMute.muteHarassmentThree()))
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                p.closeInventory();
                p.chat("/mute " + Punish.bannedPlayer.getName() + " " + PunishMute.muteType + " 1d");
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                p.closeInventory();
                p.sendMessage(ChatColor.RED + "You do not have permission to use this punishment type!");
            }
        if (e.getInventory().equals(Inv.PunishMuteHarassment) && e.getCurrentItem().equals(PunishMute.muteHarassmentFour()))
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                p.closeInventory();
                p.chat("/mute " + Punish.bannedPlayer.getName() + " " + PunishMute.muteType + " 7d");
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                p.closeInventory();
                p.sendMessage(ChatColor.RED + "You do not have permission to use this punishment type!");
            }
        if (e.getInventory().equals(Inv.PunishMuteHarassment) && e.getCurrentItem().equals(PunishMute.muteHarassmentFive()))
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                p.closeInventory();
                p.chat("/mute " + Punish.bannedPlayer.getName() + " " + PunishMute.muteType + " ");
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                p.closeInventory();
                p.sendMessage(ChatColor.RED + "You do not have permission to use this punishment type!");
            }
        if (e.getCurrentItem().equals(ItemsMute.setItemsBigotry()) && account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            p.closeInventory();
            Inv.punishMuteBigotry(p);
            PunishMute.muteType = "Bigotry";
        }
        if (e.getInventory().equals(Inv.PunishMuteBigotry) && e.getCurrentItem().equals(PunishMute.muteBigotryOne()))
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                p.closeInventory();
                p.chat("/mute " + Punish.bannedPlayer.getName() + " " + PunishMute.muteType + " 30m");
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                p.closeInventory();
                p.sendMessage(ChatColor.RED + "You do not have permission to use this punishment type!");
            }
        if (e.getInventory().equals(Inv.PunishMuteBigotry) && e.getCurrentItem().equals(PunishMute.muteBigotryTwo()))
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                p.closeInventory();
                p.chat("/mute " + Punish.bannedPlayer.getName() + " " + PunishMute.muteType + " 6h");
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                p.closeInventory();
                p.sendMessage(ChatColor.RED + "You do not have permission to use this punishment type!");
            }
        if (e.getInventory().equals(Inv.PunishMuteBigotry) && e.getCurrentItem().equals(PunishMute.muteBigotryThree()))
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                p.closeInventory();
                p.chat("/mute " + Punish.bannedPlayer.getName() + " " + PunishMute.muteType + " 1d");
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                p.closeInventory();
                p.sendMessage(ChatColor.RED + "You do not have permission to use this punishment type!");
            }
        if (e.getInventory().equals(Inv.PunishMuteBigotry) && e.getCurrentItem().equals(PunishMute.muteBigotryFour()))
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                p.closeInventory();
                p.chat("/mute " + Punish.bannedPlayer.getName() + " " + PunishMute.muteType + " 7d");
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                p.closeInventory();
                p.sendMessage(ChatColor.RED + "You do not have permission to use this punishment type!");
            }
        if (e.getInventory().equals(Inv.PunishMuteBigotry) && e.getCurrentItem().equals(PunishMute.muteBigotryFive()))
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                p.closeInventory();
                p.chat("/mute " + Punish.bannedPlayer.getName() + " " + PunishMute.muteType + " ");
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                p.closeInventory();
                p.sendMessage(ChatColor.RED + "You do not have permission to use this punishment type!");
            }
        if (e.getCurrentItem().equals(ItemsMute.setItemsStaffDis()) && account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            p.closeInventory();
            Inv.punishMuteStaffDis(p);
            PunishMute.muteType = "Staff disrespect";
        }
        if (e.getInventory().equals(Inv.PunishMuteStaffDis) && e.getCurrentItem().equals(PunishMute.muteStaffDisOne()))
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                p.closeInventory();
                p.chat("/mute " + Punish.bannedPlayer.getName() + " " + PunishMute.muteType + " 1h");
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                p.closeInventory();
                p.sendMessage(ChatColor.RED + "You do not have permission to use this punishment type!");
            }
        if (e.getInventory().equals(Inv.PunishMuteStaffDis) && e.getCurrentItem().equals(PunishMute.muteStaffDisTwo()))
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                p.closeInventory();
                p.chat("/mute " + Punish.bannedPlayer.getName() + " " + PunishMute.muteType + " 12h");
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                p.closeInventory();
                p.sendMessage(ChatColor.RED + "You do not have permission to use this punishment type!");
            }
        if (e.getInventory().equals(Inv.PunishMuteStaffDis) && e.getCurrentItem().equals(PunishMute.muteStaffDisThree()))
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                p.closeInventory();
                p.chat("/mute " + Punish.bannedPlayer.getName() + " " + PunishMute.muteType + " 1d");
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                p.closeInventory();
                p.sendMessage(ChatColor.RED + "You do not have permission to use this punishment type!");
            }
        if (e.getInventory().equals(Inv.PunishMuteStaffDis) && e.getCurrentItem().equals(PunishMute.muteStaffDisFour()))
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                p.closeInventory();
                p.chat("/mute " + Punish.bannedPlayer.getName() + " " + PunishMute.muteType + " 7d");
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                p.closeInventory();
                p.sendMessage(ChatColor.RED + "You do not have permission to use this punishment type!");
            }
        if (e.getInventory().equals(Inv.PunishMuteStaffDis) && e.getCurrentItem().equals(PunishMute.muteStaffDisFive()))
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                p.closeInventory();
                p.chat("/mute " + Punish.bannedPlayer.getName() + " " + PunishMute.muteType + " ");
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                p.closeInventory();
                p.sendMessage(ChatColor.RED + "You do not have permission to use this punishment type!");
            }
        if (e.getCurrentItem().equals(ItemsMute.setItemsPlayerDis()) && account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            p.closeInventory();
            Inv.punishMutePlayerDis(p);
            PunishMute.muteType = "Player disrespect";
        }
        if (e.getInventory().equals(Inv.PunishMutePlayerDis) && e.getCurrentItem().equals(PunishMute.mutePlayerDisOne()))
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                p.closeInventory();
                p.chat("/mute " + Punish.bannedPlayer.getName() + " " + PunishMute.muteType + " 1h");
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                p.closeInventory();
                p.sendMessage(ChatColor.RED + "You do not have permission to use this punishment type!");
            }
        if (e.getInventory().equals(Inv.PunishMutePlayerDis) && e.getCurrentItem().equals(PunishMute.mutePlayerDisTwo()))
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                p.closeInventory();
                p.chat("/mute " + Punish.bannedPlayer.getName() + " " + PunishMute.muteType + " 6h");
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                p.closeInventory();
                p.sendMessage(ChatColor.RED + "You do not have permission to use this punishment type!");
            }
        if (e.getInventory().equals(Inv.PunishMutePlayerDis) && e.getCurrentItem().equals(PunishMute.mutePlayerDisThree()))
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                p.closeInventory();
                p.chat("/mute " + Punish.bannedPlayer.getName() + " " + PunishMute.muteType + " 1d");
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                p.closeInventory();
                p.sendMessage(ChatColor.RED + "You do not have permission to use this punishment type!");
            }
        if (e.getInventory().equals(Inv.PunishMutePlayerDis) && e.getCurrentItem().equals(PunishMute.mutePlayerDisFour()))
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                p.closeInventory();
                p.chat("/mute " + Punish.bannedPlayer.getName() + " " + PunishMute.muteType + " 7d");
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                p.closeInventory();
                p.sendMessage(ChatColor.RED + "You do not have permission to use this punishment type!");
            }
        if (e.getInventory().equals(Inv.PunishMutePlayerDis) && e.getCurrentItem().equals(PunishMute.mutePlayerDisFive()))
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                p.closeInventory();
                p.chat("/mute " + Punish.bannedPlayer.getName() + " " + PunishMute.muteType + " ");
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                p.closeInventory();
                p.sendMessage(ChatColor.RED + "You do not have permission to use this punishment type!");
            }
        if (e.getCurrentItem().equals(ItemsMute.setItemsEvadingMute()) && account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            p.closeInventory();
            Inv.punishMuteEvading(p);
            PunishMute.muteType = "Mute evading";
        }
        if (e.getInventory().equals(Inv.PunishMuteEvading) && e.getCurrentItem().equals(PunishMute.muteEvadingOne()))
            if ((account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                p.closeInventory();
                p.chat("/mute " + Punish.bannedPlayer.getName() + " " + PunishMute.muteType + " 1d");
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                p.closeInventory();
                p.sendMessage(ChatColor.RED + "You do not have permission to use this punishment type!");
            }
        if (e.getInventory().equals(Inv.PunishMuteEvading) && e.getCurrentItem().equals(PunishMute.muteEvadingTwo()))
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                p.closeInventory();
                p.chat("/mute " + Punish.bannedPlayer.getName() + " " + PunishMute.muteType + " 7d");
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                p.closeInventory();
                p.sendMessage(ChatColor.RED + "You do not have permission to use this punishment type!");
            }
        if (e.getInventory().equals(Inv.PunishMuteEvading) && e.getCurrentItem().equals(PunishMute.muteEvadingThree()))
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                p.closeInventory();
                p.chat("/mute " + Punish.bannedPlayer.getName() + " " + PunishMute.muteType + " 14d");
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                p.closeInventory();
                p.sendMessage(ChatColor.RED + "You do not have permission to use this punishment type!");
            }
        if (e.getInventory().equals(Inv.PunishMuteEvading) && e.getCurrentItem().equals(PunishMute.muteEvadingFour()))
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                p.closeInventory();
                p.chat("/mute " + Punish.bannedPlayer.getName() + " " + PunishMute.muteType + " 28d");
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                p.closeInventory();
                p.sendMessage(ChatColor.RED + "You do not have permission to use this punishment type!");
            }
        if (e.getInventory().equals(Inv.PunishMuteEvading) && e.getCurrentItem().equals(PunishMute.muteEvadingFive()))
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                p.closeInventory();
                p.chat("/mute " + Punish.bannedPlayer.getName() + " " + PunishMute.muteType + " ");
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                p.closeInventory();
                p.sendMessage(ChatColor.RED + "You do not have permission to use this punishment type!");
            }
        if (e.getCurrentItem().equals(ItemsMute.setItemsRacism()) && (account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
            p.closeInventory();
            Inv.punishMuteRacism(p);
            PunishMute.muteType = "Racial slurs";
        }
        if (e.getInventory().equals(Inv.PunishMuteRacism) && e.getCurrentItem().equals(PunishMute.muteRacismOne()))
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                p.closeInventory();
                p.chat("/mute " + Punish.bannedPlayer.getName() + " " + PunishMute.muteType + " 1h");
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                p.closeInventory();
                p.sendMessage(ChatColor.RED + "You do not have permission to use this punishment type!");
            }
        if (e.getInventory().equals(Inv.PunishMuteRacism) && e.getCurrentItem().equals(PunishMute.muteRacismTwo()))
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                p.closeInventory();
                p.chat("/mute " + Punish.bannedPlayer.getName() + " " + PunishMute.muteType + " 12h");
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                p.closeInventory();
                p.sendMessage(ChatColor.RED + "You do not have permission to use this punishment type!");
            }
        if (e.getInventory().equals(Inv.PunishMuteRacism) && e.getCurrentItem().equals(PunishMute.muteRacismThree()))
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                p.closeInventory();
                p.chat("/mute " + Punish.bannedPlayer.getName() + " " + PunishMute.muteType + " 1d");
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                p.closeInventory();
                p.sendMessage(ChatColor.RED + "You do not have permission to use this punishment type!");
            }
        if (e.getInventory().equals(Inv.PunishMuteRacism) && e.getCurrentItem().equals(PunishMute.muteRacismFour()))
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                p.closeInventory();
                p.chat("/mute " + Punish.bannedPlayer.getName() + " " + PunishMute.muteType + " 7d");
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                p.closeInventory();
                p.sendMessage(ChatColor.RED + "You do not have permission to use this punishment type!");
            }
        if (e.getInventory().equals(Inv.PunishMuteRacism) && e.getCurrentItem().equals(PunishMute.muteRacismFive()))
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                p.closeInventory();
                p.chat("/mute " + Punish.bannedPlayer.getName() + " " + PunishMute.muteType + " ");
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                p.closeInventory();
                p.sendMessage(ChatColor.RED + "You do not have permission to use this punishment type!");
            }
    }
}
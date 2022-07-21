package fr.chifouu.banplugin.gui.punish;

import fr.chifouu.banplugin.gui.Inv;
import fr.chifouu.banplugin.gui.item.ItemsMenu;
import fr.chifouu.banplugin.rank.AccountProvider;
import fr.chifouu.banplugin.rank.CPlayer;
import fr.chifouu.banplugin.rank.Ranks;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class Punish implements Listener, CommandExecutor {
    public static Player bannedPlayer;

    public Punish() {
        bannedPlayer = null;
    }

    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        if (!(sender instanceof Player)) {
            Bukkit.getServer().getLogger().warning("This command can only be used by a player!");
            return true;
        }
        Player p = (Player)sender;
        CPlayer account = new AccountProvider(p).get();
        if (!cmd.getName().equalsIgnoreCase("punish"))
            return true;
        if (args.length < 1) {
            sender.sendMessage(ChatColor.DARK_RED + "No username was given, /punish <username>");
            return true;
        }
        if (args.length == 1)
            bannedPlayer = Bukkit.getPlayer(args[0]);
        if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
            sender.sendMessage(ChatColor.RED + "You do not have permmision to use this command!");
            return true;
        }
        if (args.length > 1) {
            sender.sendMessage(ChatColor.RED + "No username was given, /punish <username>");
            return true;
        }
        if (bannedPlayer == null) {
            sender.sendMessage(ChatColor.RED + "Specified player is offline.");
            return true;
        }
        for (int i = 0; i < 45; i++) {
            ItemsMenu.Glass();
            if (Inv.PunishMenuInv.getItem(i) == null)
                Inv.PunishMenuInv.setItem(i, ItemsMenu.Glass());
            if (Inv.PunishBanInv.getItem(i) == null)
                Inv.PunishBanInv.setItem(i, ItemsMenu.Glass());
            if (Inv.PunishBanCheating.getItem(i) == null)
                Inv.PunishBanCheating.setItem(i, ItemsMenu.Glass());
            if (Inv.PunishBanSpamming.getItem(i) == null)
                Inv.PunishBanSpamming.setItem(i, ItemsMenu.Glass());
            if (Inv.PunishBanEvading.getItem(i) == null)
                Inv.PunishBanEvading.setItem(i, ItemsMenu.Glass());
            if (Inv.PunishBanImpersonation.getItem(i) == null)
                Inv.PunishBanImpersonation.setItem(i, ItemsMenu.Glass());
            if (Inv.PunishMuteInv.getItem(i) == null)
                Inv.PunishMuteInv.setItem(i, ItemsMenu.Glass());
            if (Inv.PunishMuteSpamming.getItem(i) == null)
                Inv.PunishMuteSpamming.setItem(i, ItemsMenu.Glass());
            if (Inv.PunishMuteHarassment.getItem(i) == null)
                Inv.PunishMuteHarassment.setItem(i, ItemsMenu.Glass());
            if (Inv.PunishMuteBigotry.getItem(i) == null)
                Inv.PunishMuteBigotry.setItem(i, ItemsMenu.Glass());
            if (Inv.PunishMuteStaffDis.getItem(i) == null)
                Inv.PunishMuteStaffDis.setItem(i, ItemsMenu.Glass());
            if (Inv.PunishMutePlayerDis.getItem(i) == null)
                Inv.PunishMutePlayerDis.setItem(i, ItemsMenu.Glass());
            if (Inv.PunishMuteEvading.getItem(i) == null)
                Inv.PunishMuteEvading.setItem(i, ItemsMenu.Glass());
            if (Inv.PunishMuteRacism.getItem(i) == null)
                Inv.PunishMuteRacism.setItem(i, ItemsMenu.Glass());
            if (Inv.PunishWarnInv.getItem(i) == null)
                Inv.PunishWarnInv.setItem(i, ItemsMenu.Glass());
            if (Inv.PunishBanXray.getItem(i) == null)
                Inv.PunishBanXray.setItem(i, ItemsMenu.Glass());
            if (Inv.PunishKickInv.getItem(i) == null)
                Inv.PunishKickInv.setItem(i, ItemsMenu.Glass());
        }
        Inv.punishMenu(p);
        p.sendMessage(ChatColor.RED + "Opened gui");
        return true;
    }
}
package fr.chifouu.banplugin.gui;

import fr.chifouu.banplugin.gui.item.*;
import fr.chifouu.banplugin.gui.punish.PunishBan;
import fr.chifouu.banplugin.gui.punish.PunishMute;
import fr.chifouu.banplugin.rank.AccountProvider;
import fr.chifouu.banplugin.rank.CPlayer;
import fr.chifouu.banplugin.rank.Ranks;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class Inv {
    public static Inventory PunishMenuInv = Bukkit.createInventory(null, 45, "§4§lPunishments");
    public static void punishMenu(Player p) {
        CPlayer account = new AccountProvider(p).get();

        ItemsMenu.backMenu();
        ItemsMenu.setItemsClose();
        PunishMenuInv.setItem(44, ItemsMenu.setItemsClose());
        PunishBanInv.setItem(44, ItemsMenu.setItemsClose());
        PunishBanCheating.setItem(44, ItemsMenu.setItemsClose());
        PunishBanSpamming.setItem(44, ItemsMenu.setItemsClose());
        PunishBanEvading.setItem(44, ItemsMenu.setItemsClose());
        PunishBanImpersonation.setItem(44, ItemsMenu.setItemsClose());
        PunishBanXray.setItem(44, ItemsMenu.setItemsClose());
        PunishMuteInv.setItem(44, ItemsMenu.setItemsClose());
        PunishMuteSpamming.setItem(44, ItemsMenu.setItemsClose());
        PunishMuteHarassment.setItem(44, ItemsMenu.setItemsClose());
        PunishMuteBigotry.setItem(44, ItemsMenu.setItemsClose());
        PunishMuteStaffDis.setItem(44, ItemsMenu.setItemsClose());
        PunishMutePlayerDis.setItem(44, ItemsMenu.setItemsClose());
        PunishMuteEvading.setItem(44, ItemsMenu.setItemsClose());
        PunishMuteRacism.setItem(44, ItemsMenu.setItemsClose());
        PunishWarnInv.setItem(44, ItemsMenu.setItemsClose());
        PunishKickInv.setItem(44, ItemsMenu.setItemsClose());
        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            ItemsBan.itemBan();
            PunishMenuInv.setItem(19, ItemsBan.itemBan());
        } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
            ItemsMenu.noPerms();
            PunishMenuInv.setItem(19, ItemsMenu.noPerms());
        }
        if ((account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
            ItemsMute.setItemsMute();
            PunishMenuInv.setItem(21, ItemsMute.setItemsMute());
        } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
            ItemsMenu.noPerms();
            PunishMenuInv.setItem(21, ItemsMenu.noPerms());
        }
        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            ItemsWarn.setItemsWarn();
            PunishMenuInv.setItem(23, ItemsWarn.setItemsWarn());
        } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
            ItemsMenu.noPerms();
            PunishMenuInv.setItem(23, ItemsMenu.noPerms());
        }
        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            ItemsKick.setItemsKick();
            PunishMenuInv.setItem(25, ItemsKick.setItemsKick());
        } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
            ItemsMenu.noPerms();
            PunishMenuInv.setItem(25, ItemsMenu.noPerms());
        }
        p.openInventory(PunishMenuInv);
    }

    public static Inventory PunishBanInv = Bukkit.createInventory(null, 45, "reason");

    public static void punishBan(Player p) {
        CPlayer account = new AccountProvider(p).get();
        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            ItemsBan.banXray();
            PunishBanInv.setItem(19, ItemsBan.banXray());
        }
        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            ItemsBan.banCheating();
            PunishBanInv.setItem(20, ItemsBan.banCheating());
        }
        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            ItemsBan.banAdvertising();
            PunishBanInv.setItem(21, ItemsBan.banAdvertising());
        }
        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            ItemsBan.banSpamming();
            PunishBanInv.setItem(22, ItemsBan.banSpamming());
        }
        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            ItemsBan.banImpersonation();
            PunishBanInv.setItem(23, ItemsBan.banImpersonation());
        }
        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            ItemsBan.banEvading();
            PunishBanInv.setItem(24, ItemsBan.banEvading());
        }
        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            ItemsBan.banDdos();
            PunishBanInv.setItem(25, ItemsBan.banDdos());
        }
        p.openInventory(PunishBanInv);
    }

    public static Inventory PunishBanCheating = Bukkit.createInventory(null, 45, "length");

    public static void punishBanCheating(Player p) {
        CPlayer account = new AccountProvider(p).get();

        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            PunishBan.banCheatOne();
            PunishBanCheating.setItem(20, PunishBan.banCheatOne());
        } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
            ItemsMenu.noPerms();
            PunishBanCheating.setItem(20, ItemsMenu.noPerms());
        }
        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            PunishBan.banCheatTwo();
            PunishBanCheating.setItem(21, PunishBan.banCheatTwo());
        } else if (!p.isOp()) {
            ItemsMenu.noPerms();
            PunishBanCheating.setItem(21, ItemsMenu.noPerms());
        }
        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            PunishBan.banCheatThree();
            PunishBanCheating.setItem(22, PunishBan.banCheatThree());
        } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
            ItemsMenu.noPerms();
            PunishBanCheating.setItem(22, ItemsMenu.noPerms());
        }
        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            PunishBan.banCheatFour();
            PunishBanCheating.setItem(23, PunishBan.banCheatFour());
        } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
            ItemsMenu.noPerms();
            PunishBanCheating.setItem(23, ItemsMenu.noPerms());
        }
        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            PunishBan.banCheatFive();
            PunishBanCheating.setItem(24, PunishBan.banCheatFive());
        } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
            ItemsMenu.noPerms();
            PunishBanCheating.setItem(24, ItemsMenu.noPerms());
        }
        p.openInventory(PunishBanCheating);
    }

    public static Inventory PunishBanXray = Bukkit.createInventory(null, 45, "length");

    public static void punishBanXray(Player p) {
        CPlayer account = new AccountProvider(p).get();

        if ((account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
            PunishBan.banXrayOne();
            PunishBanXray.setItem(20, PunishBan.banXrayOne());
        } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
            ItemsMenu.noPerms();
            PunishBanXray.setItem(20, ItemsMenu.noPerms());
        }
        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            PunishBan.banXrayTwo();
            PunishBanXray.setItem(21, PunishBan.banXrayTwo());
        } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
            ItemsMenu.noPerms();
            PunishBanXray.setItem(21, ItemsMenu.noPerms());
        }
        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            PunishBan.banXrayThree();
            PunishBanXray.setItem(22, PunishBan.banXrayThree());
        } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
            ItemsMenu.noPerms();
            PunishBanXray.setItem(22, ItemsMenu.noPerms());
        }
        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            PunishBan.banXrayFour();
            PunishBanXray.setItem(23, PunishBan.banXrayFour());
        } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
            ItemsMenu.noPerms();
            PunishBanXray.setItem(23, ItemsMenu.noPerms());
        }
        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            PunishBan.banXrayFive();
            PunishBanXray.setItem(24, PunishBan.banXrayFive());
        } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
            ItemsMenu.noPerms();
            PunishBanXray.setItem(24, ItemsMenu.noPerms());
        }
        p.openInventory(PunishBanXray);
    }

    public static Inventory PunishBanSpamming = Bukkit.createInventory(null, 45, "length");

    public static void punishBanSpamming(Player p) {
        CPlayer account = new AccountProvider(p).get();

        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                PunishBan.banSpammingOne();
                PunishBanSpamming.setItem(20, PunishBan.banSpammingOne());
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                ItemsMenu.noPerms();
                PunishBanSpamming.setItem(20, ItemsMenu.noPerms());
            }
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                PunishBan.banSpammingTwo();
                PunishBanSpamming.setItem(21, PunishBan.banSpammingTwo());
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                ItemsMenu.noPerms();
                PunishBanSpamming.setItem(21, ItemsMenu.noPerms());
            }
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                PunishBan.banSpammingThree();
                PunishBanSpamming.setItem(22, PunishBan.banSpammingThree());
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                ItemsMenu.noPerms();
                PunishBanSpamming.setItem(22, ItemsMenu.noPerms());
            }
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                PunishBan.banSpammingFour();
                PunishBanSpamming.setItem(23, PunishBan.banSpammingFour());
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                ItemsMenu.noPerms();
                PunishBanSpamming.setItem(23, ItemsMenu.noPerms());
            }
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                PunishBan.banSpammingFive();
                PunishBanSpamming.setItem(24, PunishBan.banSpammingFive());
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                ItemsMenu.noPerms();
                PunishBanSpamming.setItem(24, ItemsMenu.noPerms());
            }
        }
        p.openInventory(PunishBanSpamming);
    }

    public static Inventory PunishBanImpersonation = Bukkit.createInventory(null, 45, "length");

    public static void punishBanImpersonation(Player p) {
        CPlayer account = new AccountProvider(p).get();

        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            if (p.isOp()) {
                PunishBan.banImpersonationOne();
                PunishBanImpersonation.setItem(20, PunishBan.banImpersonationOne());
            } else if (!p.isOp()) {
                ItemsMenu.noPerms();
                PunishBanImpersonation.setItem(20, ItemsMenu.noPerms());
            }
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                PunishBan.banImpersonationTwo();
                PunishBanImpersonation.setItem(21, PunishBan.banImpersonationTwo());
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                ItemsMenu.noPerms();
                PunishBanImpersonation.setItem(21, ItemsMenu.noPerms());
            }
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                PunishBan.banImpersonationThree();
                PunishBanImpersonation.setItem(22, PunishBan.banImpersonationThree());
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                ItemsMenu.noPerms();
                PunishBanImpersonation.setItem(22, ItemsMenu.noPerms());
            }
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                PunishBan.banImpersonationFour();
                PunishBanImpersonation.setItem(23, PunishBan.banImpersonationFour());
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                ItemsMenu.noPerms();
                PunishBanImpersonation.setItem(23, ItemsMenu.noPerms());
            }
            if ((account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                PunishBan.banImpersonationFive();
                PunishBanImpersonation.setItem(24, PunishBan.banImpersonationFive());
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                ItemsMenu.noPerms();
                PunishBanImpersonation.setItem(24, ItemsMenu.noPerms());
            }
        }
        p.openInventory(PunishBanImpersonation);
    }

    public static Inventory PunishBanEvading = Bukkit.createInventory(null, 45, "length");

    public static void punishBanEvading(Player p) {
        CPlayer account = new AccountProvider(p).get();

        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                PunishBan.banEvadingOne();
                PunishBanEvading.setItem(20, PunishBan.banEvadingOne());
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                ItemsMenu.noPerms();
                PunishBanEvading.setItem(20, ItemsMenu.noPerms());
            }
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                PunishBan.banEvadingTwo();
                PunishBanEvading.setItem(21, PunishBan.banEvadingTwo());
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                ItemsMenu.noPerms();
                PunishBanEvading.setItem(21, ItemsMenu.noPerms());
            }
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                PunishBan.banEvadingThree();
                PunishBanEvading.setItem(22, PunishBan.banEvadingThree());
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                ItemsMenu.noPerms();
                PunishBanEvading.setItem(22, ItemsMenu.noPerms());
            }
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                PunishBan.banEvadingFour();
                PunishBanEvading.setItem(23, PunishBan.banEvadingFour());
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                ItemsMenu.noPerms();
                PunishBanEvading.setItem(23, ItemsMenu.noPerms());
            }
            if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
                PunishBan.banEvadingFive();
                PunishBanEvading.setItem(24, PunishBan.banEvadingFive());
            } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
                ItemsMenu.noPerms();
                PunishBanEvading.setItem(24, ItemsMenu.noPerms());
            }
        }
        p.openInventory(PunishBanEvading);
    }

    public static Inventory PunishMuteInv = Bukkit.createInventory(null, 45, "reason");

    public static void punishMute(Player p) {
        CPlayer account = new AccountProvider(p).get();

        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            ItemsMute.setItemsMuteSpamming();
            PunishMuteInv.setItem(19, ItemsMute.setItemsMuteSpamming());
        }
        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            ItemsMute.setItemsHarassment();
            PunishMuteInv.setItem(20, ItemsMute.setItemsHarassment());
        }
        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            ItemsMute.setItemsBigotry();
            PunishMuteInv.setItem(21, ItemsMute.setItemsBigotry());
        }
        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            ItemsMute.setItemsStaffDis();
            PunishMuteInv.setItem(22, ItemsMute.setItemsStaffDis());
        }
        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            ItemsMute.setItemsPlayerDis();
            PunishMuteInv.setItem(23, ItemsMute.setItemsPlayerDis());
        }
        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            ItemsMute.setItemsEvadingMute();
            PunishMuteInv.setItem(24, ItemsMute.setItemsEvadingMute());
        }
        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            ItemsMute.setItemsRacism();
            PunishMuteInv.setItem(25, ItemsMute.setItemsRacism());
        }
        p.openInventory(PunishMuteInv);
    }

    public static Inventory PunishMuteSpamming = Bukkit.createInventory(null, 45, "length");

    public static void punishMuteSpamming(Player p) {
        CPlayer account = new AccountProvider(p).get();

        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            PunishMute.muteSpammingOne();
            PunishMuteSpamming.setItem(20, PunishMute.muteSpammingOne());
        } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
            ItemsMenu.noPerms();
            PunishMuteSpamming.setItem(20, ItemsMenu.noPerms());
        }
        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            PunishMute.muteSpammingTwo();
            PunishMuteSpamming.setItem(21, PunishMute.muteSpammingTwo());
        } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
            ItemsMenu.noPerms();
            PunishMuteSpamming.setItem(21, ItemsMenu.noPerms());
        }
        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            PunishMute.muteSpammingThree();
            PunishMuteSpamming.setItem(22, PunishMute.muteSpammingThree());
        } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
            ItemsMenu.noPerms();
            PunishMuteSpamming.setItem(22, ItemsMenu.noPerms());
        }
        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            PunishMute.muteSpammingFour();
            PunishMuteSpamming.setItem(23, PunishMute.muteSpammingFour());
        } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
            ItemsMenu.noPerms();
            PunishMuteSpamming.setItem(23, ItemsMenu.noPerms());
        }
        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            PunishMute.muteSpammingFive();
            PunishMuteSpamming.setItem(24, PunishMute.muteSpammingFive());
        } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
            ItemsMenu.noPerms();
            PunishMuteSpamming.setItem(24, ItemsMenu.noPerms());
        }
        p.openInventory(PunishMuteSpamming);
    }

    public static Inventory PunishMuteHarassment = Bukkit.createInventory(null, 45, "length");

    public static void punishMuteHarassment(Player p) {
        CPlayer account = new AccountProvider(p).get();

        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            PunishMute.muteHarassmentOne();
            PunishMuteHarassment.setItem(20, PunishMute.muteHarassmentOne());
        } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
            ItemsMenu.noPerms();
            PunishMuteHarassment.setItem(20, ItemsMenu.noPerms());
        }
        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            PunishMute.muteHarassmentTwo();
            PunishMuteHarassment.setItem(21, PunishMute.muteHarassmentTwo());
        } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
            ItemsMenu.noPerms();
            PunishMuteHarassment.setItem(21, ItemsMenu.noPerms());
        }
        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            PunishMute.muteHarassmentThree();
            PunishMuteHarassment.setItem(22, PunishMute.muteHarassmentThree());
        } else if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            ItemsMenu.noPerms();
            PunishMuteHarassment.setItem(22, ItemsMenu.noPerms());
        }
        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            PunishMute.muteHarassmentFour();
            PunishMuteHarassment.setItem(23, PunishMute.muteHarassmentFour());
        } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
            ItemsMenu.noPerms();
            PunishMuteHarassment.setItem(23, ItemsMenu.noPerms());
        }
        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            PunishMute.muteHarassmentFive();
            PunishMuteHarassment.setItem(24, PunishMute.muteHarassmentFive());
        } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
            ItemsMenu.noPerms();
            PunishMuteHarassment.setItem(24, ItemsMenu.noPerms());
        }
        p.openInventory(PunishMuteHarassment);
    }

    public static Inventory PunishMuteRacism = Bukkit.createInventory(null, 45, "length");

    public static void punishMuteRacism(Player p) {
        CPlayer account = new AccountProvider(p).get();

        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            PunishMute.muteRacismOne();
            PunishMuteRacism.setItem(20, PunishMute.muteRacismOne());
        } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
            ItemsMenu.noPerms();
            PunishMuteRacism.setItem(20, ItemsMenu.noPerms());
        }
        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            PunishMute.muteRacismTwo();
            PunishMuteRacism.setItem(21, PunishMute.muteRacismTwo());
        } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
            ItemsMenu.noPerms();
            PunishMuteRacism.setItem(21, ItemsMenu.noPerms());
        }
        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            PunishMute.muteRacismThree();
            PunishMuteRacism.setItem(22, PunishMute.muteRacismThree());
        } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
            ItemsMenu.noPerms();
            PunishMuteRacism.setItem(22, ItemsMenu.noPerms());
        }
        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            PunishMute.muteRacismFour();
            PunishMuteRacism.setItem(23, PunishMute.muteRacismFour());
        } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
            ItemsMenu.noPerms();
            PunishMuteRacism.setItem(23, ItemsMenu.noPerms());
        }
        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            PunishMute.muteRacismFive();
            PunishMuteRacism.setItem(24, PunishMute.muteRacismFive());
        } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
            ItemsMenu.noPerms();
            PunishMuteRacism.setItem(24, ItemsMenu.noPerms());
        }
        p.openInventory(PunishMuteRacism);
    }

    public static Inventory PunishMuteBigotry = Bukkit.createInventory(null, 45, "length");

    public static void punishMuteBigotry(Player p) {
        CPlayer account = new AccountProvider(p).get();

        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            PunishMute.muteBigotryOne();
            PunishMuteBigotry.setItem(20, PunishMute.muteBigotryOne());
        } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
            ItemsMenu.noPerms();
            PunishMuteBigotry.setItem(20, ItemsMenu.noPerms());
        }
        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            PunishMute.muteBigotryTwo();
            PunishMuteBigotry.setItem(21, PunishMute.muteBigotryTwo());
        } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
            ItemsMenu.noPerms();
            PunishMuteBigotry.setItem(21, ItemsMenu.noPerms());
        }
        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            PunishMute.muteBigotryThree();
            PunishMuteBigotry.setItem(22, PunishMute.muteBigotryThree());
        } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
            ItemsMenu.noPerms();
            PunishMuteBigotry.setItem(23, ItemsMenu.noPerms());
        }
        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            PunishMute.muteBigotryFour();
            PunishMuteBigotry.setItem(23, PunishMute.muteBigotryFour());
        } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
            ItemsMenu.noPerms();
            PunishMuteBigotry.setItem(23, ItemsMenu.noPerms());
        }
        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            PunishMute.muteBigotryFive();
            PunishMuteBigotry.setItem(24, PunishMute.muteBigotryFive());
        } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
            ItemsMenu.noPerms();
            PunishMuteBigotry.setItem(24, ItemsMenu.noPerms());
        }
        p.openInventory(PunishMuteBigotry);
    }

    public static Inventory PunishMuteStaffDis = Bukkit.createInventory(null, 45, "length");

    public static void punishMuteStaffDis(Player p) {
        CPlayer account = new AccountProvider(p).get();

        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            PunishMute.muteStaffDisOne();
            PunishMuteStaffDis.setItem(20, PunishMute.muteStaffDisOne());
        } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
            ItemsMenu.noPerms();
            PunishMuteBigotry.setItem(20, ItemsMenu.noPerms());
        }
        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            PunishMute.muteStaffDisTwo();
            PunishMuteStaffDis.setItem(21, PunishMute.muteStaffDisTwo());
        } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
            ItemsMenu.noPerms();
            PunishMuteBigotry.setItem(21, ItemsMenu.noPerms());
        }
        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            PunishMute.muteStaffDisThree();
            PunishMuteStaffDis.setItem(22, PunishMute.muteStaffDisThree());
        } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
            ItemsMenu.noPerms();
            PunishMuteBigotry.setItem(22, ItemsMenu.noPerms());
        }
        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            PunishMute.muteStaffDisFour();
            PunishMuteStaffDis.setItem(23, PunishMute.muteStaffDisFour());
        } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
            ItemsMenu.noPerms();
            PunishMuteBigotry.setItem(23, ItemsMenu.noPerms());
        }
        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()){
            PunishMute.muteStaffDisFive();
            PunishMuteStaffDis.setItem(24, PunishMute.muteStaffDisFive());
        } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
            ItemsMenu.noPerms();
            PunishMuteBigotry.setItem(24, ItemsMenu.noPerms());
        }
        p.openInventory(PunishMuteStaffDis);
    }

    public static Inventory PunishMutePlayerDis = Bukkit.createInventory(null, 45, "length");

    public static void punishMutePlayerDis(Player p) {
        CPlayer account = new AccountProvider(p).get();

        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            PunishMute.mutePlayerDisOne();
            PunishMutePlayerDis.setItem(20, PunishMute.mutePlayerDisOne());
        } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
            ItemsMenu.noPerms();
            PunishMutePlayerDis.setItem(20, ItemsMenu.noPerms());
        }
        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            PunishMute.mutePlayerDisTwo();
            PunishMutePlayerDis.setItem(21, PunishMute.mutePlayerDisTwo());
        } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
            ItemsMenu.noPerms();
            PunishMutePlayerDis.setItem(21, ItemsMenu.noPerms());
        }
        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            PunishMute.mutePlayerDisThree();
            PunishMutePlayerDis.setItem(22, PunishMute.mutePlayerDisThree());
        } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
            ItemsMenu.noPerms();
            PunishMutePlayerDis.setItem(22, ItemsMenu.noPerms());
        }
        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            PunishMute.mutePlayerDisFour();
            PunishMutePlayerDis.setItem(23, PunishMute.mutePlayerDisFour());
        } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
            ItemsMenu.noPerms();
            PunishMutePlayerDis.setItem(23, ItemsMenu.noPerms());
        }
        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()){
            PunishMute.mutePlayerDisFive();
            PunishMutePlayerDis.setItem(24, PunishMute.mutePlayerDisFive());
        } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
            ItemsMenu.noPerms();
            PunishMutePlayerDis.setItem(24, ItemsMenu.noPerms());
        }
        p.openInventory(PunishMutePlayerDis);
    }

    public static Inventory PunishMuteEvading = Bukkit.createInventory(null, 45, "length");

    public static void punishMuteEvading(Player p) {
        CPlayer account = new AccountProvider(p).get();

        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            PunishMute.muteEvadingOne();
            PunishMuteEvading.setItem(20, PunishMute.muteEvadingOne());
        } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
            ItemsMenu.noPerms();
            PunishMuteEvading.setItem(20, ItemsMenu.noPerms());
        }
        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            PunishMute.muteEvadingTwo();
            PunishMuteEvading.setItem(21, PunishMute.muteEvadingTwo());
        } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
            ItemsMenu.noPerms();
            PunishMuteEvading.setItem(21, ItemsMenu.noPerms());
        }
        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            PunishMute.muteEvadingThree();
            PunishMuteEvading.setItem(22, PunishMute.muteEvadingThree());
        } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
            ItemsMenu.noPerms();
            PunishMuteEvading.setItem(22, ItemsMenu.noPerms());
        }
        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            PunishMute.muteEvadingFour();
            PunishMuteEvading.setItem(23, PunishMute.muteEvadingFour());
        } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
            ItemsMenu.noPerms();
            PunishMuteEvading.setItem(23, ItemsMenu.noPerms());
        }
        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            PunishMute.muteEvadingFive();
            PunishMuteEvading.setItem(24, PunishMute.muteEvadingFive());
        } else if (!(account.getRank().getLevel() < Ranks.MODERATOR.getLevel())) {
            ItemsMenu.noPerms();
            PunishMuteEvading.setItem(24, ItemsMenu.noPerms());
        }
        p.openInventory(PunishMuteEvading);
    }

    public static Inventory PunishWarnInv = Bukkit.createInventory(null, 45, "reason");

    public static void punishWarn(Player p) {
        CPlayer account = new AccountProvider(p).get();

        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            ItemsWarn.warnSpamming();
            PunishWarnInv.setItem(19, ItemsWarn.warnSpamming());
        }
        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            ItemsWarn.warnBigotry();
            PunishWarnInv.setItem(20, ItemsWarn.warnBigotry());
        }
        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            ItemsWarn.warnHarassment();
            PunishWarnInv.setItem(21, ItemsWarn.warnHarassment());
        }
        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            ItemsWarn.warnPlayerDis();
            PunishWarnInv.setItem(22, ItemsWarn.warnPlayerDis());
        }
        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            ItemsWarn.warnStaffDis();
            PunishWarnInv.setItem(23, ItemsWarn.warnStaffDis());
        }
        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            ItemsWarn.warnRacialSlurs();
            PunishWarnInv.setItem(24, ItemsWarn.warnRacialSlurs());
        }
        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            ItemsWarn.warnOCD();
            PunishWarnInv.setItem(25, ItemsWarn.warnOCD());
        }
        p.openInventory(PunishWarnInv);
    }

    public static Inventory PunishKickInv = Bukkit.createInventory(null, 45, "reason");

    public static void punishKick(Player p) {
        CPlayer account = new AccountProvider(p).get();

        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            ItemsKick.kickBigotry();
            PunishKickInv.setItem(19, ItemsKick.kickBigotry());
        }
        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()){
            ItemsKick.kickSpamming();
            PunishKickInv.setItem(20, ItemsKick.kickSpamming());
        }
        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            ItemsKick.kickHarassment();
            PunishKickInv.setItem(21, ItemsKick.kickHarassment());
        }
        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            ItemsKick.kickPlayerDis();
            PunishKickInv.setItem(22, ItemsKick.kickPlayerDis());
        }
        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            ItemsKick.kickStaffDis();
            PunishKickInv.setItem(23, ItemsKick.kickStaffDis());
        }
        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            ItemsKick.kickRacialSlurs();
            PunishKickInv.setItem(24, ItemsKick.kickRacialSlurs());
        }
        if (account.getRank().getLevel() < Ranks.MODERATOR.getLevel()) {
            ItemsKick.kickOCD();
            PunishKickInv.setItem(25, ItemsKick.kickOCD());
        }
        p.openInventory(PunishKickInv);
    }
}


package fr.chifouu.banplugin.commands;

import fr.chifouu.banplugin.BanPlugin;
import fr.chifouu.banplugin.utils.framework.Command;
import fr.chifouu.banplugin.utils.framework.CommandArgs;
import fr.chifouu.banplugin.utils.itembuilder.ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class ModCommand {


    public static String message = new StringBuilder().toString();

    private BanPlugin INSTANCE;

    public ModCommand(BanPlugin INSTANCE) {
        this.INSTANCE = INSTANCE;
    }

    @Command(name = "playerprofile", aliases = {"profile", "pp"})
    public void onStart(CommandArgs args) {
        CommandSender sender = args.getSender();
        Player player = (Player) sender;
        Player target = Bukkit.getPlayer(args.getArgs(0));

        if(args.length() != 1){
            player.sendMessage("§cVeuillez saisir un message !");
            return;
        }
        if(args.length() ==1) {
            if( target == null) {

                Inventory modInv = Bukkit.createInventory(null, 9, "Mod Menu" + target.getName());

                modInv.setItem(2, new ItemBuilder(Material.SNOW_BALL)
                        .setName("Anti jeux")
                        .addLoreLine("")
                        .toItemStack());

                modInv.setItem(4, new ItemBuilder(Material.DIAMOND_SWORD)
                        .setName("Cheat / UseBug")
                        .addLoreLine("")
                        .toItemStack());

                modInv.setItem(6, new ItemBuilder(Material.BOOK)
                        .setName("Chat / Mumble")
                        .addLoreLine("")
                        .toItemStack());

                player.openInventory(modInv);
            }
        }
    }
}

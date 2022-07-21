package fr.chifouu.banplugin;

import fr.chifouu.banplugin.data.SqlManager;
import fr.chifouu.banplugin.data.ban.Ban;
import fr.chifouu.banplugin.gui.*;
import fr.chifouu.banplugin.manager.LiteBanManager;
import fr.chifouu.banplugin.gui.punish.Punish;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;


public final class BanPlugin extends JavaPlugin {

    public static BanPlugin Instance;
    @Getter @Setter public SqlManager sqlManager;
    @Getter @Setter public Ban ban;
    @Getter @Setter public LiteBanManager liteBanManager;
    private static String defaultGuidId = "9a29e7c6-6d0f-4332-b24f-4cd0bc1e62af";

    public static Plugin get() {
        return getInstance();
    }

    @Override
    public void onEnable() {
        Instance = this;
        SqlManager.initConnections();
        registerEvents();
        registerCommands();
    }

    public static BanPlugin getInstance() {
        return Instance;
    }

    public void registerEvents() {
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents((Listener)new Punish(),this);
        pm.registerEvents(new InvBanEvent(),this);
        pm.registerEvents(new InvBackEvent(), this);
        pm.registerEvents(new InvMuteEvent(),this);
        pm.registerEvents(new InvKickEvent(),this);
        pm.registerEvents(new InvWarnEvent(), this);
    }


    public void registerCommands() {
        getCommand("punish").setExecutor(new Punish());
    }

    public static String getDefaultGuidId() {
        return defaultGuidId;
    }


    @Override
    public void onDisable() {
        // Plugin shutdown logic
        SqlManager.closeConnections();
    }
}

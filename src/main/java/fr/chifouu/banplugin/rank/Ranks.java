package fr.chifouu.banplugin.rank;

public enum Ranks {

    ADMIN("§4§l", "Admin", "ADMIN", "§4§lADMIN⛊ §7| §4§l", 150),
    MANAGER("§c§l", "Responsable", "RESP", "§c§lRESP⛊ §7| §c§l", 140),
    DEVELOPER("§9", "Developpeur", "DEV", "§9DEV⛊ §7| §9", 120),
    MODERATOR("§2", "Moderateur", "MOD", "§2MOD⛊ §7| §2", 100),
    HELPER("§e", "Helper", "Helper", "§eHELPER⛊ §7| §e", 90),
    STAFF("§a", "Staff", "Staff", "§aSTAFF⛊ §7| §a", 80),
    FRIEND("§9", "Amis", "Amis", "§9AMIS❤ §7| §9", 70),
    GUEST("§5", "Guest", "Guest", "§5Guest⚔ §7| §a", 60),
    FAMOUS("§d", "Famous", "Famous", "§bFamous⚔ §7| §a", 50),
    ULTRA("§b", "MetaSub", "Meta", "§b§l✮§b", 40),
    MVP("§6", "SubPlus", "Sub+", "§6§l✭§6", 30),
    VIP("§e", "Sub", "Sub", "§e§l✬§e", 10),
    PLAYER("§7", "Joueur", null, "§7", 0);

    private String color;
    private String name;
    private String prefix;
    private String tabPrefix;
    private int level;

    Ranks(String color, String name, String prefix, String tabPrefix, int level) {
        this.color = color;
        this.name = name;
        this.prefix = prefix;
        this.tabPrefix = tabPrefix;
        this.level = level;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public String getPrefix() {
        return prefix;
    }

    public int getLevel() {
        return level;
    }

    public String getTabPrefix() {
        return tabPrefix;
    }

    public static Ranks getRankByLevel(int level) {
        for (Ranks current : values())
            if (current.getLevel() == level)
                return current;
        return Ranks.PLAYER;
    }

    public static Ranks getRank(String name) {
        for (Ranks current : values())
            if (current.getName().equals(name))
                return current;
        return Ranks.PLAYER;
    }

}

package fr.chifouu.banplugin.data;

public enum SqlManager {

    ZEUS(new SqlCredentials("localhost", "root", "", "moderation", 3306)),
    //ZEUS(new SqlCredentials("127.0.0.1", "javaplugins", "P0s31dOn!14760$", "zeus", 3306)),
    ;

    private SqlAccess sqlAccess;

    SqlManager(SqlCredentials sqlCredentials) {
        this.sqlAccess = new SqlAccess(sqlCredentials);
    }

    public SqlAccess getSqlAccess() {
        return sqlAccess;
    }

    public static void initConnections() {
        for (SqlManager sqlManager : SqlManager.values()) {
            sqlManager.getSqlAccess().initPool();
        }
    }

    public static void closeConnections() {
        for (SqlManager sqlManager : SqlManager.values()) {
            sqlManager.getSqlAccess().cancelPool();
        }
    }
}
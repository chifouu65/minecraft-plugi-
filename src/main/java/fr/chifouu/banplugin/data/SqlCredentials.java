package fr.chifouu.banplugin.data;

public class SqlCredentials {

    private String host;
    private String user;
    private String password;
    private String database;
    private int port;

    public SqlCredentials(String host, String user, String password, String database, int port) {
        this.host = host;
        this.user = user;
        this.password = password;
        this.database = database;
        this.port = port;
    }

    public String toURI() {
        final StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("jdbc:mysql://")
                .append(host)
                .append(":")
                .append(port)
                .append("/")
                .append(database + "?autoReconnect=true&useSSL=false");
        return stringBuilder.toString();
    }

    public String getHost() {
        return host;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public String getDatabase() {
        return database;
    }

    public int getPort() {
        return port;
    }
}

package fr.chifouu.banplugin.rank.redis;

public class RedisCredentials {

    private String ip;
    private String password;
    private int port;
    private String client;

    public RedisCredentials(String ip, String password, int port) {
        this(ip, password, port, "clovermc");
    }

    public RedisCredentials(String ip, String password, int port, String client) {
        this.ip = ip;
        this.password = password;
        this.port = port;
        this.client = client;
    }

    public String toURI() {
        StringBuilder stringBuilder = new StringBuilder()
                .append(this.ip)
                .append(":")
                .append(this.port);
        return stringBuilder.toString();
    }

    public String getIp() {
        return ip;
    }

    public String getPassword() {
        return password;
    }

    public int getPort() {
        return port;
    }

    public String getClient() {
        return client;
    }

}

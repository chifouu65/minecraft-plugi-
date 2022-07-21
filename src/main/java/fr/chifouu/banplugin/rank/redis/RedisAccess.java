package fr.chifouu.banplugin.rank.redis;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.codec.JsonJacksonCodec;
import org.redisson.config.Config;

public class RedisAccess {

    private static RedisAccess instance;

    private RedissonClient redissonClient;

    public RedisAccess(RedisCredentials redisCredentials) {
        this.redissonClient = this.initRedisson(redisCredentials);

        instance = this;
    }

    public RedissonClient initRedisson(RedisCredentials credentials) {
        Config config = new Config();
        config.setCodec(new JsonJacksonCodec());
        config.setUseLinuxNativeEpoll(true);
        config.setThreads(4);
        config.setNettyThreads(4);
        config.useSingleServer()
                .setConnectionPoolSize(5)
                .setAddress(credentials.toURI())
                .setPassword(credentials.getPassword())
                .setDatabase(1)
                .setClientName(credentials.getClient());

        return Redisson.create(config);
    }

    public static void init() {
        new RedisAccess(new RedisCredentials("138.201.252.250", "4d0LaR3d1$492587163458!", 5468));
    }

    public static void close() {
        RedisAccess.get().getClient().shutdown();
    }

    public RedissonClient getClient() {
        return this.redissonClient;
    }

    public static RedisAccess get() {
        return instance;
    }

}

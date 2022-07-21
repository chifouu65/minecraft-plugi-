package fr.chifouu.banplugin.rank;


import fr.chifouu.banplugin.BanPlugin;
import fr.chifouu.banplugin.data.SqlManager;
import fr.chifouu.banplugin.rank.redis.RedisAccess;
import org.bukkit.entity.Player;
import org.redisson.api.RBucket;
import org.redisson.api.RedissonClient;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

public class AccountProvider {

    private final Player player;
    private final RedisAccess access = RedisAccess.get();
    public static final String REDIS_KEY = "account:";

    public AccountProvider(Player player) {
        this.player = player;
    }

    public CPlayer get() {
        CPlayer account = this.getAccountFromRedis();
        if (account == null) {
            this.load();
            account = this.getAccountFromRedis();
        }
        return account;
    }

    public void sendAccountToRedis(CPlayer account) {
        final RedissonClient redissonClient = access.getClient();
        final String key = REDIS_KEY + this.player.getUniqueId().toString();
        final RBucket<CPlayer> accountRBucket = redissonClient.getBucket(key);

        accountRBucket.set(account);
    }

    private CPlayer getAccountFromRedis() {
        final RedissonClient redissonClient = access.getClient();
        final String key = REDIS_KEY + this.player.getUniqueId().toString();
        final RBucket<CPlayer> accountRBucket = redissonClient.getBucket(key);

        return accountRBucket.get();
    }

    public void load() {
        BanPlugin.getInstance().getServer().getScheduler().runTaskAsynchronously(BanPlugin.getInstance(), ()  -> {
            try {
                final Connection connection = SqlManager.ZEUS.getSqlAccess().getConnection();
                final PreparedStatement preparedStatement = connection.prepareStatement("SELECT uuid, rank, rankTime, rankTag, customTag, privateMessages, friendsRequest, groupRequest, guildRequest, coins, boxs, hostTicket, hostRankTickets, guildId, friends, data FROM users WHERE uuid = ?");
                preparedStatement.setString(1, player.getUniqueId().toString());
                final ResultSet resultSet = preparedStatement.executeQuery();
                if (resultSet.next()) {
                    CPlayer account = new CPlayer(resultSet.getString("uuid"),
                            player.getName(),
                            resultSet.getString("rank"),
                            resultSet.getString("rankTag"),
                            resultSet.getString("customTag"),
                            resultSet.getBoolean("privateMessages"),
                            resultSet.getBoolean("friendsRequest"),
                            resultSet.getBoolean("groupRequest"),
                            resultSet.getBoolean("guildRequest"),
                            resultSet.getInt("coins"),
                            resultSet.getInt("hostTicket"),
                            resultSet.getInt("hostRankTickets"),
                            UUID.fromString(resultSet.getString("guildId")),
                            new ArrayList<>(),
                            new HashMap<>());

                    //Send To redis
                    final RedissonClient redissonClient = access.getClient();
                    final String key = REDIS_KEY + this.player.getUniqueId().toString();
                    final RBucket<CPlayer> accountRBucket = redissonClient.getBucket(key);
                    accountRBucket.set(account);

                    connection.close();
                    preparedStatement.close();
                } else {
                    createAccountDB();
                }
            } catch (SQLException exception) {
                exception.printStackTrace();
            }
        });
    }

    public void save() {
        BanPlugin.getInstance().getServer().getScheduler().runTaskAsynchronously(BanPlugin.get(), () -> {
            try {
                final Connection connection = SqlManager.ZEUS.getSqlAccess().getConnection();
                CPlayer account = this.getAccountFromRedis();
                final PreparedStatement preparedStatement = connection.prepareStatement("UPDATE users SET name = ?, rank = ?, rankTag = ?, customTag = ?, privateMessages = ?, friendsRequest = ?, groupRequest = ?, guildRequest = ?, coins = ?, boxs = ?, hostTicket = ?, hostRankTickets = ?, guildId = ?, friends = ?, data = ?, rankTime = ? WHERE uuid = ?");
                preparedStatement.setString(1, player.getName());
                preparedStatement.setString(2, account.getRank().getName());
                preparedStatement.setString(3, account.getRankTag());
                preparedStatement.setString(4, account.getCustomTag());
                preparedStatement.setBoolean(5, account.isPrivateMessages());
                preparedStatement.setBoolean(6, account.isFriendsRequests());
                preparedStatement.setBoolean(7, account.isGroupRequests());
                preparedStatement.setBoolean(8, account.isGuildRequests());
                preparedStatement.setInt(9, account.getCoins());
                preparedStatement.setInt(10, 0);
                preparedStatement.setInt(11, account.getHostTicket());
                preparedStatement.setInt(12, account.getHostRankTickets());
                preparedStatement.setString(13, account.getGuildId().toString());
                preparedStatement.setString(14, account.getFriends().toString());
                preparedStatement.setString(15, account.getData().toString());
                preparedStatement.setLong(16, 0);
                preparedStatement.setString(17, player.getUniqueId().toString());
                preparedStatement.executeUpdate();

                final RedissonClient redissonClient = access.getClient();
                final String key = REDIS_KEY + this.player.getUniqueId().toString();
                final RBucket<CPlayer> accountRBucket = redissonClient.getBucket(key);

                accountRBucket.delete();

                connection.close();
                preparedStatement.close();
            } catch (SQLException exception) {
                exception.printStackTrace();
            }
        });
    }

    private void createAccountDB() {
        BanPlugin.getInstance().getServer().getScheduler().runTaskAsynchronously(BanPlugin.get(), () -> {
            CPlayer account = new CPlayer(player.getUniqueId().toString(), player.getName(), Ranks.PLAYER.getName(), "", "", false, false, false, false, 0, 0, 0, UUID.fromString(BanPlugin.getDefaultGuidId()), new ArrayList<>(), new HashMap<>());
            try {
                final Connection connection = SqlManager.ZEUS.getSqlAccess().getConnection();
                final PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO users (uuid, name, rank, rankTime, rankTag, customTag, privateMessages, friendsRequest, groupRequest, guildRequest, coins, boxs, hostTicket, hostRankTickets, guildId, friends, data) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

                preparedStatement.setString(1, account.getUuid().toString());
                preparedStatement.setString(2, account.getName());
                preparedStatement.setString(3, account.getRank().getName());
                preparedStatement.setLong(4, 0);
                preparedStatement.setString(5, account.getRankTag());
                preparedStatement.setString(6, account.getCustomTag());
                preparedStatement.setBoolean(7, account.isPrivateMessages());
                preparedStatement.setBoolean(8, account.isFriendsRequests());
                preparedStatement.setBoolean(9, account.isGroupRequests());
                preparedStatement.setBoolean(10, account.isGuildRequests());
                preparedStatement.setInt(11, account.getCoins());
                preparedStatement.setInt(12, 0);
                preparedStatement.setInt(13, account.getHostTicket());
                preparedStatement.setInt(14, account.getHostRankTickets());
                preparedStatement.setString(15, account.getGuildId().toString());
                preparedStatement.setString(16, account.getFriends().toString());
                preparedStatement.setString(17, account.getData().toString());
                preparedStatement.execute();

                connection.close();
                preparedStatement.close();
            } catch (SQLException exception) {
                exception.printStackTrace();
            }

            //Send To redis
            final RedissonClient redissonClient = access.getClient();
            final String key = REDIS_KEY + this.player.getUniqueId().toString();
            final RBucket<CPlayer> accountRBucket = redissonClient.getBucket(key);
            accountRBucket.set(account);
        });
    }

    public Player getPlayer() {
        return player;
    }

}

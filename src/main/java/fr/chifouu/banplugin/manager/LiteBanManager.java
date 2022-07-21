package fr.chifouu.banplugin.manager;

import fr.chifouu.banplugin.BanPlugin;
import fr.chifouu.banplugin.data.SqlManager;
import fr.chifouu.banplugin.data.ban.Ban;
import org.bukkit.entity.Player;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class LiteBanManager {

    public static LiteBanManager instance;
    private final List<Ban> bans;

    public LiteBanManager() {
        instance = this;
        bans = new LinkedList<>();
    }

    public List<Ban> getBans(Player player) {
        return bans.stream().filter(ban -> ban.getPlayer().equals(player.getUniqueId())).collect(Collectors.toList());
    }

    public void loadBan(Player player) {
        BanPlugin.getInstance().getServer().getScheduler().runTaskAsynchronously(BanPlugin.getInstance(), () -> {
            try {
                final Connection conn = SqlManager.ZEUS.getSqlAccess().getConnection();
                final PreparedStatement preparedStatement = conn.prepareStatement("SELECT id, author, player, reason, message, banAt, unbanAt FROM bans WHERE player = ?");
                preparedStatement.setString(1, player.getUniqueId().toString());
                final ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    final Ban ban = new Ban(
                            resultSet.getLong("id"),
                            UUID.fromString(resultSet.getString("author")),
                            UUID.fromString(resultSet.getString("player")),
                            resultSet.getString("reason"),
                            resultSet.getString("message"),
                            resultSet.getTimestamp("banAt"),
                            resultSet.getTimestamp("unbanAt")
                    );
                    bans.add(ban);
                    resultSet.close();
                    preparedStatement.close();
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        });
    }

    public void unloadBan(Player player) {
        bans.removeIf(ban -> ban.getPlayer().equals(player.getUniqueId()));
        //Pubsub.get().getPub().publish("updateBans");
    }

    public void addBan(Ban ban) {
        bans.add(ban);
        BanPlugin.getInstance().getServer().getScheduler().runTaskAsynchronously(BanPlugin.getInstance(), () -> {
            try {
                final Connection conn = SqlManager.ZEUS.getSqlAccess().getConnection();
                final PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO bans (author, player, reason, message, banAt, unbanAt) VALUES (?, ?, ?, ?, ?, ?)");
                preparedStatement.setString(1, ban.getAuthor().toString());
                preparedStatement.setString(2, ban.getPlayer().toString());
                preparedStatement.setString(3, ban.getReason());
                preparedStatement.setString(4, ban.getMessage());
                preparedStatement.setTimestamp(5, ban.getBanAt());
                preparedStatement.setTimestamp(6, ban.getUnbanAt());
                preparedStatement.executeUpdate();
                ResultSet keys = preparedStatement.getGeneratedKeys();
                if( keys.next() ) {
                    ban.setId(keys.getLong(1));
                    ban.setBanAt(keys.getTimestamp(2));
                }
                keys.close();
                preparedStatement.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        });
        //Pubsub.get().getPub().publish("updateBans");
    }

    public void removeBan(Ban ban) {
        bans.remove(ban);
        BanPlugin.getInstance().getServer().getScheduler().runTaskAsynchronously(BanPlugin.getInstance(), () -> {
            try {
                final Connection conn = SqlManager.ZEUS.getSqlAccess().getConnection();
                final PreparedStatement preparedStatement = conn.prepareStatement("DELETE FROM bans WHERE id = ?");
                preparedStatement.setLong(1, ban.getId());
                preparedStatement.executeUpdate();
                preparedStatement.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        });
        //Pubsub.get().getPub().publish("updateBans");
    }


    public static LiteBanManager get() {
        return instance;
    }
}

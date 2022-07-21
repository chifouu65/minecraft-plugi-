package fr.chifouu.banplugin.data;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class SqlAccess {

    private SqlCredentials sqlCredentials;
    private HikariDataSource hikariDataSource;

    public SqlAccess(SqlCredentials sqlCredentials) {
        this.sqlCredentials = sqlCredentials;
    }

    private void setupHikariCP() {
        final HikariConfig hikariConfig = new HikariConfig();

        hikariConfig.setMaximumPoolSize(30); // Max de connection sur la pool
        hikariConfig.setJdbcUrl(sqlCredentials.toURI());
        hikariConfig.setUsername(sqlCredentials.getUser());
        hikariConfig.setPassword(sqlCredentials.getPassword());
        hikariConfig.setMaxLifetime(600000L); //Temps maximum dans la pool avant regen en ms
        hikariConfig.setIdleTimeout(300000L); //Temps maximum d'une connection non utilisier dans le pool
        hikariConfig.setLeakDetectionThreshold(60000L); //Temps pour fuite de memoire
        hikariConfig.setConnectionTimeout(10000L);

        this.hikariDataSource = new HikariDataSource(hikariConfig);
    }

    public void initPool() {
        setupHikariCP();
    }

    public void cancelPool() {
        this.hikariDataSource.close();
    }

    public Connection getConnection() throws SQLException {
        if (hikariDataSource == null) {
            System.out.println("DB Not connected");
            setupHikariCP();
        }
        return this.hikariDataSource.getConnection();
    }
}

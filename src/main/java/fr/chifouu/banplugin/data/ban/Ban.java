package fr.chifouu.banplugin.data.ban;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.UUID;

public class Ban {

    private Long id;
    private UUID author;
    private UUID player;
    private String reason;
    private String message;
    private Timestamp banAt;
    private Timestamp unbanAt;

    public Ban(UUID author, UUID player, String reason, String message, Timestamp banAt, Timestamp unbanAt) {
        this.author = author;
        this.player = player;
        this.reason = reason;
        this.message = message;
        this.banAt = banAt;
        this.unbanAt = unbanAt;
    }

    public Ban(Long id, UUID author, UUID player, String reason, String message, Timestamp banAt, Timestamp unbanAt) {
        this.id = id;
        this.author = author;
        this.player = player;
        this.reason = reason;
        this.message = message;
        this.banAt = banAt;
        this.unbanAt = unbanAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UUID getAuthor() {
        return author;
    }

    public void setAuthor(UUID author) {
        this.author = author;
    }

    public UUID getPlayer() {
        return player;
    }

    public void setPlayer(UUID player) {
        this.player = player;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Timestamp getBanAt() {
        return banAt;
    }

    public void setBanAt(Timestamp banAt) {
        this.banAt = banAt;
    }

    public Timestamp getUnbanAt() {
        return unbanAt;
    }

    public void setUnbanAt(Timestamp unbanAt) {
        this.unbanAt = unbanAt;
    }
}

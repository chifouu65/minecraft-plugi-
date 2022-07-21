package fr.chifouu.banplugin.rank;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public class CPlayer implements Cloneable {

    private String uuid;
    private String name;

    private String rank;
    private String rankTag;
    private String customTag;

    private boolean privateMessages;
    private boolean friendsRequests;
    private boolean groupRequests;
    private boolean guildRequests;

    private int coins;

    private int hostTicket;
    private int hostRankTickets;

    private UUID guildId;
    private List<UUID> friends;

    private Map<String, Object> data;

    public CPlayer() {
    }

    public CPlayer(String uuid, String name, String rank, String rankTag, String customTag, boolean privateMessages, boolean friendsRequests, boolean groupRequests, boolean guildRequests, int coins, int hostTicket, int hostRankTickets, UUID guildId, List<UUID> friends, Map<String, Object> data) {
        this.uuid = uuid;
        this.name = name;
        this.rank = rank;
        this.rankTag = rankTag;
        this.customTag = customTag;
        this.privateMessages = privateMessages;
        this.friendsRequests = friendsRequests;
        this.groupRequests = groupRequests;
        this.guildRequests = guildRequests;
        this.coins = coins;
        this.hostTicket = hostTicket;
        this.hostRankTickets = hostRankTickets;
        this.guildId = guildId;
        this.friends = friends;
        this.data = data;
    }

    public String getUuid() {
        return this.uuid;
    }

    public String getName() {
        return name;
    }

    public String getRankName() {
        return rank;
    }

    public Ranks getRank() {
        return Ranks.getRank(rank);
    }

    public String getRankTag() {
        return rankTag;
    }

    public String getCustomTag() {
        return customTag;
    }

    public boolean isPrivateMessages() {
        return privateMessages;
    }

    public boolean isFriendsRequests() {
        return friendsRequests;
    }

    public boolean isGroupRequests() {
        return groupRequests;
    }

    public boolean isGuildRequests() {
        return guildRequests;
    }

    public int getCoins() {
        return coins;
    }

    public int getHostTicket() {
        return hostTicket;
    }

    public int getHostRankTickets() {
        return hostRankTickets;
    }

    public UUID getGuildId() {
        return guildId;
    }

    public List<UUID> getFriends() {
        return this.friends;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRank(Ranks rank) {
        this.rank = rank.getName();
    }

    public void setRankTag(String rankTag) {
        this.rankTag = rankTag;
    }

    public void setCustomTag(String customTag) {
        this.customTag = customTag;
    }

    public void setPrivateMessages(boolean privateMessages) {
        this.privateMessages = privateMessages;
    }

    public void setFriendsRequests(boolean friendsRequests) {
        this.friendsRequests = friendsRequests;
    }

    public void setGroupRequests(boolean groupRequests) {
        this.groupRequests = groupRequests;
    }

    public void setGuildRequests(boolean guildRequests) {
        this.guildRequests = guildRequests;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    public void setHostTicket(int hostTicket) {
        this.hostTicket = hostTicket;
    }

    public void setHostRankTickets(int hostRankTickets) {
        this.hostRankTickets = hostRankTickets;
    }

    public void setGuildId(UUID guildId) {
        this.guildId = guildId;
    }

    @Override
    public CPlayer clone() {
        try {
            return (CPlayer) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}

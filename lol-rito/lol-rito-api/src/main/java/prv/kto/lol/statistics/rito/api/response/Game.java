package prv.kto.lol.statistics.rito.api.response;

import java.util.List;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Game {

    private long gameId;
    private String platformId; // enum?

    private long gameCreation;
    private int gameDuration;
    private int queueId;
    private int mapId;
    private int seasonId;
    private String gameVersion;
    private GameModes gameMode;
    private GameTypes gameType;

    private List<Participant> participants;

    private List<ParticipantIdentity> participantIdentities;

    public Game() {
    }

    public Game(long gameId, String platformId, long gameCreation, int gameDuration, int queueId, int mapId, int seasonId, String gameVersion, GameModes gameMode, String GameTypes, List<Participant> participants, List<ParticipantIdentity> participantIdentities) {
        this.gameId = gameId;
        this.platformId = platformId;
        this.gameCreation = gameCreation;
        this.gameDuration = gameDuration;
        this.queueId = queueId;
        this.mapId = mapId;
        this.seasonId = seasonId;
        this.gameVersion = gameVersion;
        this.gameMode = gameMode;
        this.gameType = gameType;
        this.participants = participants;
        this.participantIdentities = participantIdentities;
    }

    public long getGameId() {
        return gameId;
    }

    public String getPlatformId() {
        return platformId;
    }

    public long getGameCreation() {
        return gameCreation;
    }

    public int getGameDuration() {
        return gameDuration;
    }

    public int getQueueId() {
        return queueId;
    }

    public int getMapId() {
        return mapId;
    }

    public int getSeasonId() {
        return seasonId;
    }

    public String getGameVersion() {
        return gameVersion;
    }

    public GameModes getGameMode() {
        return gameMode;
    }

    public GameTypes getGameType() {
        return gameType;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public List<ParticipantIdentity> getParticipantIdentities() {
        return participantIdentities;
    }

    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }
}

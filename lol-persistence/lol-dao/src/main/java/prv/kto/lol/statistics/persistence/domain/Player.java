package prv.kto.lol.statistics.persistence.domain;

import java.time.LocalDateTime;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import prv.kto.lol.statistics.domain.PlayerIdentifier;
import javax.persistence.Id;

@Entity
@Table(name = "player_statistics")
public class Player {

    @Id
    private long id;

    @Embedded
    private PlayerIdentifier playerIdentifier;

    @Column
    private LocalDateTime scheduled;

    @Column
    private LocalDateTime lastUpdate;

    @Column
    private Integer numberOfGames;

    @Column
    private Integer gameEntriesProcessed;

    @Column
    private Status status;

    public enum Status {
        UPDATED,
        DURING_UPDATE,
        REQUIRES_UPDATE
    }

    public Player(PlayerIdentifier playerIdentifier) {
        this.playerIdentifier = playerIdentifier;
        this.scheduled = LocalDateTime.now();
        this.lastUpdate = null;
        this.numberOfGames = null;
        this.gameEntriesProcessed = null;
        this.status = Status.REQUIRES_UPDATE;
    }

    public PlayerIdentifier getPlayerIdentifier() {
        return playerIdentifier;
    }

    public LocalDateTime getScheduled() {
        return scheduled;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public Integer getNumberOfGames() {
        return numberOfGames;
    }

    public Integer getGameEntriesProcessed() {
        return gameEntriesProcessed;
    }

    public Status getStatus() {
        return status;
    }

    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}

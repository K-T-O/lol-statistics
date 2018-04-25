package prv.kto.lol.statistics.rito.api.response;

import java.util.List;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Games {
    private  int gameIndexBegin;
    private  int gameIndexEnd;
    private  int gameTimestampBegin;
    private  int gameTimestampEnd;
    private  int gameCount;
    private  List<Game> games;

    public Games() {
    }

    public Games(int gameIndexBegin, int gameIndexEnd, int gameTimestampBegin, int gameTimestampEnd, int gameCount, List<Game> games) {
        this.gameIndexBegin = gameIndexBegin;
        this.gameIndexEnd = gameIndexEnd;
        this.gameTimestampBegin = gameTimestampBegin;
        this.gameTimestampEnd = gameTimestampEnd;
        this.gameCount = gameCount;
        this.games = games;
    }

    public int getGameIndexBegin() {
        return gameIndexBegin;
    }

    public int getGameIndexEnd() {
        return gameIndexEnd;
    }

    public int getGameTimestampBegin() {
        return gameTimestampBegin;
    }

    public int getGameTimestampEnd() {
        return gameTimestampEnd;
    }

    public int getGameCount() {
        return gameCount;
    }

    public List<Game> getGames() {
        return games;
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

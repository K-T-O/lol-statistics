package prv.kto.lol.statistics.rito.api.response;

import java.util.List;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class PlayerHistoryResponse {

    private String platformId;

    private int accountId;

    private Games games;

    private List<Object> shownQueues;

    public PlayerHistoryResponse() {
    }

    public PlayerHistoryResponse(String platformId, int accountId, Games games, List<Object> shownQueues) {
        this.platformId = platformId;
        this.accountId = accountId;
        this.games = games;
        this.shownQueues = shownQueues;
    }

    public String getPlatformId() {
        return platformId;
    }

    public int getAccountId() {
        return accountId;
    }

    public Games getGames() {
        return games;
    }

    public List<Object> getShownQueues() {
        return shownQueues;
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

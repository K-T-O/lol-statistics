package prv.kto.lol.statistics.rito.client.event;

import java.util.Calendar;

import prv.kto.lol.statistics.rito.api.request.PlayerHistoryRequest;
import prv.kto.lol.statistics.rito.api.response.PlayerHistoryResponse;

public final class PlayerHistoryStatisticsImported {

    private final long timestamp;

    private final PlayerHistoryRequest playerHistoryRequest;

    private final PlayerHistoryResponse playerHistoryResponse;

    public PlayerHistoryStatisticsImported(PlayerHistoryRequest playerHistoryRequest, PlayerHistoryResponse playerHistoryResponse) {
        this.timestamp = Calendar.getInstance().getTime().getTime();
        this.playerHistoryRequest = playerHistoryRequest;
        this.playerHistoryResponse = playerHistoryResponse;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public PlayerHistoryRequest getPlayerHistoryRequest() {
        return playerHistoryRequest;
    }

    public PlayerHistoryResponse getPlayerHistoryResponse() {
        return playerHistoryResponse;
    }
}

package prv.kto.lol.statistics.rito.api.helpers;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import prv.kto.lol.statistics.rest.server.resources.rito.api.response.PlayerHistoryResponse;

public class GameComparator {

    public Long getLatest(List<PlayerHistoryResponse> responses) {
        final AtomicLong newest = new AtomicLong();

        responses.forEach(response -> {

                    long maxGameCreation = response.getGames().getGames().stream().max((g1, g2) ->
                            Long.valueOf(g1.getGameCreation()).compareTo(g2.getGameCreation())
                    ).get().getGameCreation();

                    if (maxGameCreation > newest.longValue()) {
                        newest.set(maxGameCreation);
                    }
                }
        );

        return newest.longValue();
    }

}

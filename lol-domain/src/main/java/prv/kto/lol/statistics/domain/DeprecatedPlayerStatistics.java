package prv.kto.lol.statistics.domain;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import com.google.common.collect.Lists;
import prv.kto.lol.statistics.rest.server.resources.rito.api.response.Stats;
import prv.kto.lol.statistics.rest.server.resources.rito.api.response.PlayerHistoryResponse;

public class DeprecatedPlayerStatistics {

    private final int wins;

    private final int losses;

    private final List<Integer> kills = Lists.newArrayList();

    private final List<Integer> deaths = Lists.newArrayList();

    private final List<Integer> assists = Lists.newArrayList();

    public DeprecatedPlayerStatistics(List<PlayerHistoryResponse> fullHistory) {

        final AtomicInteger tmpWins = new AtomicInteger(), tmpLoses = new AtomicInteger();

        fullHistory.forEach(historyEntry ->
                        historyEntry.getGames().getGames().forEach(
                                (game) -> {
                                    if (game.getParticipants().size() > 1) {
                                        throw new IllegalStateException("Too many: " + game.getParticipants().size());
                                    }
//                    System.out.println(game.getGameMode());
//                    System.out.println(game.getGameType());
                                    process(game.getParticipants().get(0).getStats(), tmpWins, tmpLoses);
                                }
                        )
        );


        this.wins = tmpWins.get();
        this.losses = tmpLoses.get();
    }

    private void process(Stats stats, AtomicInteger tmpWins, AtomicInteger tmpLoses) {
        if (stats.isWin()) {
            tmpWins.incrementAndGet();
        } else {
            tmpLoses.incrementAndGet();
        }
        kills.add(stats.getKills());
        deaths.add(stats.getDeaths());
        assists.add(stats.getAssists());
    }

    public final int getGamesTotal() {
        return wins + losses;
    }

    public final double getWinRatio() {
        return Double.valueOf(wins) / Double.valueOf(wins + losses);
    }

    public final double getKills() {
        return kills.stream().reduce(0, Integer::sum);
    }

    public final double getDeaths() {
        return deaths.stream().reduce(0, Integer::sum);
    }

    public final double getAssists() {
        return assists.stream().reduce(0, Integer::sum);
    }
}

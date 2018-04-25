package prv.kto.lol.statistics.rest.core;

import java.nio.file.Path;
import java.nio.file.Paths;

import prv.kto.lol.statistics.domain.DeprecatedPlayerStatistics;
import prv.kto.lol.statistics.rest.server.resources.filesystem.config.PathProvider;
import prv.kto.lol.statistics.rest.server.resources.rito.api.request.PlayerHistoryRequest;
import prv.kto.lol.statistics.service.LolRitoClientImpl;

@Deprecated
public class DeprecatedLolStatisticsApplication {

    private static final String REGION = "EUN1";

    private static final String SUMMONER_ID = "204189186";

    public static void main(String[] args) throws InterruptedException {

        DeprecatedPlayerStatistics playerStatistics = new DeprecatedPlayerStatistics(
                new LolRitoClientImpl().get(
                        new PlayerHistoryRequest(REGION, SUMMONER_ID)
                )
        );

        System.out.println(playerStatistics.getGamesTotal());
        System.out.println(playerStatistics.getWinRatio());
        System.out.println(String.format("%s/%s/%s",
                playerStatistics.getKills(), playerStatistics.getDeaths(), playerStatistics.getAssists()));
    }

    public class PathProviderImpl implements PathProvider {

        private final PlayerHistoryRequest playerHistoryRequest;
        private final int from;
        private final int to;

        public PathProviderImpl(PlayerHistoryRequest playerHistoryRequest, int from, int to) {
            this.playerHistoryRequest = playerHistoryRequest;
            this.from = from;
            this.to = to;
        }

        public Path getPath() {
            return Paths.get(String.format("%s_%s_%s_%s_%s.txt",
                    getPath(),
                    playerHistoryRequest.getRegion(),
                    playerHistoryRequest.getSummonerId(),
                    from,
                    to
            ));
        }
    }

}

package prv.kto.lol.statistics.rito.http.config;

public class HttpClientConfiguration {

    // https://acs.leagueoflegends.com/v1/stats/player_history/EUN1/204189186?begIndex=2000&endIndex=2100&

    private static final String URL =
            "https://acs.leagueoflegends.com/v1/stats/player_history/%s/%s?begIndex=%d&endIndex=%d";

    public String getUrl(String region, String summonerId, int from, int to) {
        return String.format(URL, region, summonerId, from, to);
    }

    public int getTimeout() {
        return 4000;
    }

    public int getStep() {
        return 20;
    }

    /**
     * In order to avoid HTTP#429 from RITO
     */
    public int getDelay() {
        return 2000;
    }
}

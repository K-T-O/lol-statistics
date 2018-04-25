package prv.kto.lol.statistics.rito.http;

import prv.kto.lol.statistics.rest.server.resources.rito.api.request.PlayerHistoryRequest;
import prv.kto.lol.statistics.rito.http.config.HttpClientConfiguration;

public class RitoUrlHelper {

    private final HttpClientConfiguration httpClientConfiguration;

    public RitoUrlHelper(HttpClientConfiguration httpClientConfiguration) {
        this.httpClientConfiguration = httpClientConfiguration;
    }

    public String getUrl(PlayerHistoryRequest playerHistoryRequest, int from, int to) {
        return httpClientConfiguration.getUrl(
                playerHistoryRequest.getRegion(),
                playerHistoryRequest.getSummonerId(),
                from,
                to
        );
    }
}

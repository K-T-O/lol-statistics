package prv.kto.lol.statistics.rito.http;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Lists;
import prv.kto.lol.statistics.rito.http.config.HttpClientConfiguration;

// FIXME implements LolRitoClient
public class ClientHttpImpl {

    private final PlainHttpClient plainHttpClient = new PlainHttpClient();

    private final RitoUrlHelper ritoUrlHelper;

    private final ObjectMapper objectMapper = new ObjectMapper();

    private final HttpClientConfiguration lolRitoClientConfiguration;

    public ClientHttpImpl(HttpClientConfiguration httpClientConfiguration) {
        this.lolRitoClientConfiguration = httpClientConfiguration;
        this.ritoUrlHelper = new RitoUrlHelper(httpClientConfiguration);
    }

    public List<PlayerHistoryResponse> get(PlayerHistoryRequest playerHistoryRequest) {
        List<PlayerHistoryResponse> fullHistory = Lists.newArrayList();

        int index = 0;
        PlayerHistoryResponse playerHistoryResponse;

        do {
            playerHistoryResponse = get(playerHistoryRequest, index, index + lolRitoClientConfiguration.getStep());

            fullHistory.add(playerHistoryResponse);
            index += lolRitoClientConfiguration.getStep();

            try {
                Thread.sleep(lolRitoClientConfiguration.getDelay());
            } catch (InterruptedException e) {
                throw new IllegalStateException("Sleep interrupted due to: " + e.getMessage());
            }
        } while (playerHistoryResponse.getGames().getGames().size() > 0);

        return fullHistory;
    }

    private PlayerHistoryResponse get(PlayerHistoryRequest playerHistoryRequest, int from, int to) {
        try {
            final String result = plainHttpClient.get(
                    ritoUrlHelper.getUrl(playerHistoryRequest, from, to),
                    lolRitoClientConfiguration.getTimeout());

            return objectMapper.readValue(result, PlayerHistoryResponse.class);

        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new IllegalStateException(e);
        }
    }
}

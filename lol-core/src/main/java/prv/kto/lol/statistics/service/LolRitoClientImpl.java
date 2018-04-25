package prv.kto.lol.statistics.service;

//import java.io.IOException;
//import java.util.List;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.google.common.collect.Lists;
//import prv.kto.lol.statistics.cache.file.FileChecker;
//import prv.kto.lol.statistics.cache.file.FileRepository;
//import prv.kto.lol.statistics.cache.file.config.FileConfiguration;
//import GameComparator;
//import PlayerHistoryRequest;
//import PlayerHistoryResponse;
import java.util.List;

import prv.kto.lol.statistics.rest.server.resources.rito.api.request.PlayerHistoryRequest;
import prv.kto.lol.statistics.rest.server.resources.rito.api.response.PlayerHistoryResponse;
import prv.kto.lol.statistics.rest.server.resources.rito.client.LolRitoClient;
//import prv.kto.lol.statistics.rito.http.ClientHttpImpl;
//import prv.kto.lol.statistics.rito.http.RitoUrlHelper;
//import prv.kto.lol.statistics.rito.http.config.HttpClientConfiguration;

public class LolRitoClientImpl implements LolRitoClient {

    Object get() {
        return "status of data (database/filesystem/http scheduler) as % completed";
    }

    @Override
    public List<PlayerHistoryResponse> get(PlayerHistoryRequest playerHistoryRequest) {
        return null;
    }
/*
    private final FileRepository fileRepository;

    private final FileChecker fileChecker;

    private final RitoUrlHelper ritoUrlHelper;

    private final LolRitoClient lolRitoClient;

    private final GameComparator gameComparator = new GameComparator();

    public LolRitoClientImpl(HttpClientConfiguration httpClientConfiguration,
                             FileConfiguration fileConfiguration) {
        fileRepository = new FileRepository(fileConfiguration);
        fileChecker = new FileChecker(fileRepository, gameComparator);
        ritoUrlHelper = new RitoUrlHelper(httpClientConfiguration);
        lolRitoClient = new ClientHttpImpl(httpClientConfiguration, fileRepository::save);
    }

    public List<PlayerHistoryResponse> get(PlayerHistoryRequest playerHistoryRequest) {
        long latestFromHttp = 0; // FIXME THIS
        try {
            latestFromHttp = gameComparator.getLatest(Lists.newArrayList(
                    new ObjectMapper().readValue(
                            ritoUrlHelper.getUrl(playerHistoryRequest, 0, 1),
                            PlayerHistoryResponse.class
                    )));
        } catch (IOException e) {
            // FIXME
            e.printStackTrace();
        }
        long latestFromCache = fileChecker.getLatestGame(playerHistoryRequest);

        if (latestFromHttp > latestFromCache) {
            fileRepository.clear(playerHistoryRequest);
            // updates cache during requests. @see FileRepository#save()
            return lolRitoClient.get(playerHistoryRequest);
        } else {
            return fileRepository.get(playerHistoryRequest);
        }
    }*/
}

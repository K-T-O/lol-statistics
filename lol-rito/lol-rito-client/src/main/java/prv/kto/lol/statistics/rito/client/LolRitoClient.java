package prv.kto.lol.statistics.rito.client;

import java.util.List;

import prv.kto.lol.statistics.rito.api.request.PlayerHistoryRequest;
import prv.kto.lol.statistics.rito.api.response.PlayerHistoryResponse;

public interface LolRitoClient {

    List<PlayerHistoryResponse> get(PlayerHistoryRequest playerHistoryRequest);

}

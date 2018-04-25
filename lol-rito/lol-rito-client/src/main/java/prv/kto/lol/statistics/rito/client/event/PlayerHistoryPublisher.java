package prv.kto.lol.statistics.rito.client.event;

import java.util.concurrent.SubmissionPublisher;

import prv.kto.lol.statistics.rito.api.request.PlayerHistoryRequest;
import prv.kto.lol.statistics.rito.api.response.PlayerHistoryResponse;

class PlayerHistoryPublisher extends SubmissionPublisher<PlayerHistoryStatisticsImported> {

    void playerHistoryReceived(
            PlayerHistoryRequest playerHistoryRequest,
            PlayerHistoryResponse playerHistoryResponse) {

        this.submit(new PlayerHistoryStatisticsImported(playerHistoryRequest, playerHistoryResponse));
    }
}

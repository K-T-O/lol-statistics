package prv.kto.lol.statistics.rito.client.event;

import java.util.concurrent.Flow;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import prv.kto.lol.statistics.rito.api.request.PlayerHistoryRequest;
import prv.kto.lol.statistics.rito.api.response.PlayerHistoryResponse;

public abstract class DefaultPlayerHistorySubscriber implements Flow.Subscriber<PlayerHistoryStatisticsImported> {

    private static final Logger LOG = LoggerFactory.getLogger(DefaultPlayerHistorySubscriber.class);

    private Flow.Subscription subscription;

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        LOG.info("Subscribed with %s", subscription);

        this.subscription = subscription;
        subscription.request(Long.MAX_VALUE);
    }

    @Override
    public void onNext(PlayerHistoryStatisticsImported item) {
        LOG.debug("Event received: %s", item);

        handle(item.getPlayerHistoryRequest(), item.getPlayerHistoryResponse());
    }

    @Override
    public void onError(Throwable throwable) {
        LOG.warn("Error encountered: %s", throwable);
    }

    @Override
    public void onComplete() {
        LOG.debug("Subscription completed: %s", subscription);

        subscription.cancel();
    }

    abstract void handle(PlayerHistoryRequest playerHistoryRequest, PlayerHistoryResponse playerHistoryResponse);
}

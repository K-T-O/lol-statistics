package prv.kto.lol.statistics.rito.http.scheduler;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public class RequestScheduler {

    private final ScheduledExecutorService scheduler = new ScheduledThreadPoolExecutor(1);

    private void a() {
        scheduler.scheduleWithFixedDelay();
    }



}

package prv.kto.lol.statistics.rito.http.scheduler;

public class RequestExecutionRunner implements Runnable {

    @Override
    public void run() {
        // get scheduled request (BY PRIORITY QUEUE)
        // apply policy
        // if executed correctly remove request from heap otherwise put into 'debug heap'
        // emit event
    }
}

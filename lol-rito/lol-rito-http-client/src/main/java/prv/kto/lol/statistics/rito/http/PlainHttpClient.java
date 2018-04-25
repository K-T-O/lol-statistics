package prv.kto.lol.statistics.rito.http;

import java.io.IOException;
import io.dropwizard.client.HttpClientBuilder;

public class PlainHttpClient {

    public PlainHttpClient() {
        new HttpClientBuilder();
    }

    String get(String requestUrl, int timeout) throws IOException {
     /*   Response response;
        try {
            response = Request.Get(requestUrl)
                    .connectTimeout(timeout)
                    .socketTimeout(timeout)
                    .execute();

            final String result = response.returnContent().asString();

            return result;
        } catch (HttpResponseException e) {
            if (e.getStatusCode() == 429) {
                System.out.println("Too many requests! Increase the delay between the requests!");
            } else {
                System.out.println(e.getStatusCode());
                System.out.println(e.getMessage());
            }
            throw new IllegalStateException(e);
        }*/
     return null;
    }
}

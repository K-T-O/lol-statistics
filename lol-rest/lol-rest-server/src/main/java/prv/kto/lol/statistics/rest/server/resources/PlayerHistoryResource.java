package prv.kto.lol.statistics.rest.server.resources;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.codahale.metrics.annotation.Timed;

@Path("/hello-world")
@Produces(MediaType.APPLICATION_JSON)
public class PlayerHistoryResource {
    private final String template;
    private final String defaultName;
    private final AtomicLong counter;

    public PlayerHistoryResource(String template, String defaultName) {
        this.template = template;
        this.defaultName = defaultName;
        this.counter = new AtomicLong();
    }

    @GET
    @Timed
    public Response sayHello(@QueryParam("name") Optional<String> name) {
        final String value = String.format(template, name.orElse(defaultName));
        return null;//new Response(counter.incrementAndGet(), value);
    }
}
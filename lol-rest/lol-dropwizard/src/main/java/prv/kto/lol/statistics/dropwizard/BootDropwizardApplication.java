package prv.kto.lol.statistics.dropwizard;


import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import prv.kto.lol.statistics.dropwizard.config.LolApplicationConfiguration;
import prv.kto.lol.statistics.dropwizard.health.HealthCheckResource;
import prv.kto.lol.statistics.rest.server.resources.PlayerHistoryResource;

public class BootDropwizardApplication extends Application<LolApplicationConfiguration> {

    public static void main(String[] args) throws Exception {
        new BootDropwizardApplication().run(args);
    }

    @Override
    public String getName() {
        return "lol-statistics";
    }

    @Override
    public void initialize(Bootstrap<LolApplicationConfiguration> bootstrap) {
        // nothing to do yet
    }

    @Override
    public void run(LolApplicationConfiguration configuration,
                    Environment environment) {
        final PlayerHistoryResource resource = new PlayerHistoryResource(
                "",
                configuration.getDefaultName()
        );
        environment.jersey().register(resource);

        final HealthCheckResource healthCheck = new HealthCheckResource("");
        environment.healthChecks().register("my-health-nvm", healthCheck);
    }
}
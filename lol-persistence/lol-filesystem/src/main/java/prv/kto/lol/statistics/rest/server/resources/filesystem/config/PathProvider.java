package prv.kto.lol.statistics.rest.server.resources.filesystem.config;

import java.nio.file.Path;

public interface PathProvider {

    Path getPath();

    /*


    private Path toPath(PlayerHistoryRequest playerHistoryRequest) {
        return Paths.get(String.format("%s/%s/%s",
                fileConfiguration.getPath(),
                playerHistoryRequest.getRegion(),
                playerHistoryRequest.getSummonerId()));
    }


     */
}

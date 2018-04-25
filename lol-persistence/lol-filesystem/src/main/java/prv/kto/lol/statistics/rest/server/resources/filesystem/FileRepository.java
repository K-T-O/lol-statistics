package prv.kto.lol.statistics.rest.server.resources.filesystem;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import com.google.common.collect.Lists;
import prv.kto.lol.statistics.rest.server.resources.filesystem.config.FileConfiguration;
import prv.kto.lol.statistics.rest.server.resources.filesystem.config.PathProvider;

class FileRepository {

    private final String LINE_SEPARATOR = System.lineSeparator();
    private final FileConfiguration fileConfiguration;

    FileRepository(FileConfiguration fileConfiguration) {
        this.fileConfiguration = fileConfiguration;
    }

    void save(PathProvider pathProvider, String content) {
        Path path = pathProvider.getPath();
        if (path.toFile().exists()) {
            throw new IllegalStateException("File exists at: " + path);
        }
        try {
            Files.write(path, content.getBytes());
        } catch (IOException e) {
            throw new IllegalStateException("Unable to write file due to: " + e.getMessage() + " at " + path);
        }
    }

    void clear(PathProvider pathProvider) {
        createIfDoesNotExist(pathProvider.getPath());

        pathProvider.getPath().forEach(
                p -> {
                    try {
                        Files.delete(p);
                    } catch (IOException e) {
                        throw new IllegalStateException(e);
                    }
                }
        );
    }

    List<String> get(PathProvider pathProvider) {
        List<String> results = Lists.newArrayList();

        Path pathToSummonersData = pathProvider.getPath();

        createIfDoesNotExist(pathToSummonersData);

        pathToSummonersData.forEach(pathToAFile -> {
                    try {
                        results.add(String.join(LINE_SEPARATOR, Files.readAllLines(pathToSummonersData)));
                    } catch (IOException e) {
                        throw new IllegalStateException(e);
                    }
                }
        );

        return results;
    }

    private void createIfDoesNotExist(Path path) {
        if (!Files.isDirectory(path)) {
            try {
                Files.createDirectory(path);
            } catch (IOException e) {
                throw new IllegalStateException("Unable to create a folder for:" + path + " due to " + e.getMessage());
            }
        }
    }
}

package prv.kto.lol.statistics.filter;

import java.util.Optional;
import java.util.function.Predicate;

import prv.kto.lol.statistics.rest.server.resources.rito.api.response.GameModes;
import prv.kto.lol.statistics.rest.server.resources.rito.api.response.GameTypes;
import prv.kto.lol.statistics.rest.server.resources.rito.api.response.Game;

public class GameFilter implements Predicate<Game> {

    private final Optional<GameModes> gameMode;

    private final Optional<GameTypes> gameType;

    private final Optional<Integer> seasonId;

    public GameFilter(GameModes gameModeOrNull, GameTypes gameTypeOrNull, Integer seasonIdOrNull) {
        this.gameMode = Optional.ofNullable(gameModeOrNull);
        this.gameType = Optional.ofNullable(gameTypeOrNull);
        this.seasonId = Optional.ofNullable(seasonIdOrNull);
    }

    public boolean test(Game game) {
        if (gameMode.isPresent() && !game.getGameMode().equals(gameMode.get())) {
            return false;
        }
        if (gameType.isPresent() && !game.getGameType().equals(gameType.get())) {
            return false;
        }
        if (seasonId.isPresent() && game.getSeasonId() != seasonId.get().intValue()) {
            return false;
        }
        return true;
    }
}

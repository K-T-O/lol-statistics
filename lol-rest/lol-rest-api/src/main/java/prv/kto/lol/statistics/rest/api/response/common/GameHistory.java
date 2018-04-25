package prv.kto.lol.statistics.rest.api.response.common;

public class GameHistory {

    private final long gameCreation;
    private final int gameDuration;
    private final int kills;
    private final int deaths;
    private final int assists;
    private final int totalDamageDealt;
    private final int totalDamageDealtToChampions;
    private final int totalDamageTaken;
    private final int goldEarned;
    private final boolean win;

    public GameHistory(long gameCreation, int gameDuration, int kills, int deaths, int assists, int totalDamageDealt, int totalDamageDealtToChampions, int totalDamageTaken, int goldEarned, boolean win) {
        this.gameCreation = gameCreation;
        this.gameDuration = gameDuration;
        this.kills = kills;
        this.deaths = deaths;
        this.assists = assists;
        this.totalDamageDealt = totalDamageDealt;
        this.totalDamageDealtToChampions = totalDamageDealtToChampions;
        this.totalDamageTaken = totalDamageTaken;
        this.goldEarned = goldEarned;
        this.win = win;
    }

    public long getGameCreation() {
        return gameCreation;
    }

    public int getGameDuration() {
        return gameDuration;
    }

    public int getKills() {
        return kills;
    }

    public int getDeaths() {
        return deaths;
    }

    public int getAssists() {
        return assists;
    }

    public int getTotalDamageDealt() {
        return totalDamageDealt;
    }

    public int getTotalDamageDealtToChampions() {
        return totalDamageDealtToChampions;
    }

    public int getTotalDamageTaken() {
        return totalDamageTaken;
    }

    public int getGoldEarned() {
        return goldEarned;
    }

    public boolean isWin() {
        return win;
    }
}

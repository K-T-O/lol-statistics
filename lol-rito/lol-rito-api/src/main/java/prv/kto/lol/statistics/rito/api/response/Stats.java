package prv.kto.lol.statistics.rito.api.response;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/*
"participantId":0,
                 "item0":3401,
                 "item1":3050,
                 "item2":0,
                 "item3":3117,
                 "item4":1029,
                 "item5":1006,
                 "item6":3340,
                 "largestKillingSpree":2,
                 "largestMultiKill":1,
                 "killingSprees":1,
                 "longestTimeSpentLiving":0,
                 "doubleKills":0,
                 "tripleKills":0,
                 "quadraKills":0,
                 "pentaKills":0,
                 "unrealKills":0,
                 "totalDamageDealt":29878,
                 "magicDamageDealt":9141,
                 "physicalDamageDealt":13143,
                 "trueDamageDealt":7593,
                 "largestCriticalStrike":0,
                 "totalDamageDealtToChampions":7601,
                 "magicDamageDealtToChampions":4956,
                 "physicalDamageDealtToChampions":2645,
                 "trueDamageDealtToChampions":0,
                 "totalHeal":3856,
                 "totalUnitsHealed":5,
                 "damageSelfMitigated":0,
                 "damageDealtToObjectives":0,
                 "damageDealtToTurrets":0,
                 "visionScore":0,
                 "timeCCingOthers":0,
                 "totalDamageTaken":14103,
                 "magicalDamageTaken":4901,
                 "physicalDamageTaken":9202,
                 "trueDamageTaken":0,
                 "goldSpent":6035,
                 "turretKills":0,
                 "inhibitorKills":0,
                 "totalMinionsKilled":41,
                 "neutralMinionsKilled":1,
                 "neutralMinionsKilledTeamJungle":0,
                 "neutralMinionsKilledEnemyJungle":1,
                 "totalTimeCrowdControlDealt":587,
                 "champLevel":13,
                 "visionWardsBoughtInGame":0,
                 "sightWardsBoughtInGame":0,
                 "wardsPlaced":5,
                 "wardsKilled":0,
                 "firstBloodKill":false,
                 "firstBloodAssist":false,
                 "firstTowerKill":false,
                 "firstTowerAssist":true,
                 "firstInhibitorKill":false,
                 "firstInhibitorAssist":true,
                 "combatPlayerScore":0,
                 "objectivePlayerScore":0,
                 "totalPlayerScore":0,
                 "totalScoreRank":0,
                 "wasAfk":false,
                 "leaver":false,
                 "playerScore0":0,
                 "playerScore1":0,
                 "playerScore2":0,
                 "playerScore3":0,
                 "playerScore4":0,
                 "playerScore5":0,
                 "playerScore6":0,
                 "playerScore7":0,
                 "playerScore8":0,
                 "playerScore9":0
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Stats {
    private  int goldEarned;
    private  boolean win;
    private  int kills;
    private  int deaths;
    private  int assists;

    public Stats() {
    }

    public Stats(int goldEarned, boolean win, int kills, int deaths, int assists) {
        this.goldEarned = goldEarned;
        this.win = win;
        this.kills = kills;
        this.deaths = deaths;
        this.assists = assists;
    }

    public int getGoldEarned() {
        return goldEarned;
    }

    public boolean isWin() {
        return win;
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

    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }
}

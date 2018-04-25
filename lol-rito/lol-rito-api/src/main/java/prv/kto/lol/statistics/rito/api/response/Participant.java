package prv.kto.lol.statistics.rito.api.response;

import java.util.List;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Participant {

    private  int participantId;

    private  int teamId;

    private  int championId;

    private  int spell1Id;

    private  int spell2Id;

    private  List<Mastery> masteries;

    private  List<Rune> runes;

    private  String highestAchievedSeasonTier;

    private Stats stats;

    private Timeline timeline;

    public Participant() {
    }

    public Participant(int participantId, int teamId, int championId, int spell1Id, int spell2Id, List<Mastery> masteries, List<Rune> runes, String highestAchievedSeasonTier, Stats stats, Timeline timeline) {
        this.participantId = participantId;
        this.teamId = teamId;
        this.championId = championId;
        this.spell1Id = spell1Id;
        this.spell2Id = spell2Id;
        this.masteries = masteries;
        this.runes = runes;
        this.highestAchievedSeasonTier = highestAchievedSeasonTier;
        this.stats = stats;
        this.timeline = timeline;
    }

    public int getParticipantId() {
        return participantId;
    }

    public int getTeamId() {
        return teamId;
    }

    public int getChampionId() {
        return championId;
    }

    public int getSpell1Id() {
        return spell1Id;
    }

    public int getSpell2Id() {
        return spell2Id;
    }

    public List<Mastery> getMasteries() {
        return masteries;
    }

    public List<Rune> getRunes() {
        return runes;
    }

    public String getHighestAchievedSeasonTier() {
        return highestAchievedSeasonTier;
    }

    public Stats getStats() {
        return stats;
    }

    public Timeline getTimeline() {
        return timeline;
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

package prv.kto.lol.statistics.rito.api.response;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class ParticipantIdentity {

    private int participantId;

    private Player player;

    public ParticipantIdentity() {
    }

    public ParticipantIdentity(int participantId, Player player) {
        this.participantId = participantId;
        this.player = player;
    }

    public int getParticipantId() {
        return participantId;
    }

    public Player getPlayer() {
        return player;
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

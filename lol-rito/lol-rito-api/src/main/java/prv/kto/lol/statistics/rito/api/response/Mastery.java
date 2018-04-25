package prv.kto.lol.statistics.rito.api.response;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Mastery {

    private int masteryId;

    private int rank;

    public int getMasteryId() {
        return masteryId;
    }

    public int getRank() {
        return rank;
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

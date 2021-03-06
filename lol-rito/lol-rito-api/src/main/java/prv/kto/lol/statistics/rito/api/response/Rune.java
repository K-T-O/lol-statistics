package prv.kto.lol.statistics.rito.api.response;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Rune {

    private int runeId;

    private int rank;

    public int getRuneId() {
        return runeId;
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

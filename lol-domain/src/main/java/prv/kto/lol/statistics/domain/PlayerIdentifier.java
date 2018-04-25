package prv.kto.lol.statistics.domain;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class PlayerIdentifier {

    private final String region;

    private final String summonerId;

    public PlayerIdentifier(String region, String summonerId) {
        this.region = region;
        this.summonerId = summonerId;
    }

    public String getRegion() {
        return region;
    }

    public String getSummonerId() {
        return summonerId;
    }

    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}

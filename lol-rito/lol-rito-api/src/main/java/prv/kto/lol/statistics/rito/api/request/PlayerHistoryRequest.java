package prv.kto.lol.statistics.rito.api.request;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class PlayerHistoryRequest {

    private final String region;

    private final String summonerId;

    public PlayerHistoryRequest(String region, String summonerId) {
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
}

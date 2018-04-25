package prv.kto.lol.statistics.rest.api.response.common;

public class Champion {

    private final String name;

    public Champion(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

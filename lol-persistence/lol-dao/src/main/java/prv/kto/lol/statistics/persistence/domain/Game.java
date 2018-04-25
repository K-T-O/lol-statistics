package prv.kto.lol.statistics.persistence.domain;

public class Game {

    @Id
    private long id; // gameId from RITO

    @ManyToOne(optional=false)
    @JoinColumn(name="CUST_ID", nullable=false, updatable=false)
    private Player playerStatistics;


}

package ie.beyond2022.utils.regnaldate;

import org.joda.time.DateTime;

public class MovableFeastsForYear {

    private final Feast easter;
    private final Feast quinquageisima;
    private final Feast quadrageisma;
    private final Feast rogation;
    private final Feast ascension;
    private final Feast pentecost;
    private final Feast trinity;
    private final Feast corpus_christi;

    public MovableFeastsForYear(Feast easter, Feast quinquageisima, Feast quadrageisma, Feast rogation,
                                Feast ascension, Feast pentecost, Feast trinity, Feast corpus_christi) {
        this.easter = easter;
        this.quinquageisima = quinquageisima;
        this.quadrageisma = quadrageisma;
        this.rogation = rogation;
        this.ascension = ascension;
        this.pentecost = pentecost;
        this.trinity = trinity;
        this.corpus_christi = corpus_christi;
    }

    public Feast getEaster() {
        return easter;
    }

    public Feast getQuinquageisima() {
        return quinquageisima;
    }

    public Feast getQuadrageisma() {
        return quadrageisma;
    }

    public Feast getRogation() {
        return rogation;
    }

    public Feast getAscension() {
        return ascension;
    }

    public Feast getPentecost() {
        return pentecost;
    }

    public Feast getTrinity() {
        return trinity;
    }

    public Feast getCorpus_christi() {
        return corpus_christi;
    }
}

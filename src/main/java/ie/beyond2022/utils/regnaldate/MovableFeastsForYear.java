package ie.beyond2022.utils.regnaldate;

import org.joda.time.DateTime;

public class MovableFeastsForYear {

    private final Feast easter;
    private final Feast quinquageisima;
    private final Feast shrove_Tuesday;
    private final Feast ash_wednesday;
    private final Feast quadrageisma;
    private final Feast palm_sunday;
    private final Feast good_friday;
    private final Feast rogation;
    private final Feast ascension;
    private final Feast pentecost;
    private final Feast trinity;
    private final Feast corpus_christi;

    public MovableFeastsForYear(Feast easter, Feast quinquageisima, Feast shrove_Tuesday, Feast ash_wednesday,
                                Feast quadrageisma, Feast palm_sunday, Feast good_friday, Feast rogation,
                                Feast ascension, Feast pentecost, Feast trinity, Feast corpus_christi) {
        this.easter = easter;
        this.quinquageisima = quinquageisima;
        this.shrove_Tuesday = shrove_Tuesday;
        this.ash_wednesday = ash_wednesday;
        this.quadrageisma = quadrageisma;
        this.palm_sunday = palm_sunday;
        this.good_friday = good_friday;
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

    public Feast getShrove_Tuesday() {
        return shrove_Tuesday;
    }

    public Feast getAsh_wednesday() {
        return ash_wednesday;
    }

    public Feast getQuadrageisma() {
        return quadrageisma;
    }

    public Feast getPalm_sunday() {
        return palm_sunday;
    }

    public Feast getGood_friday() {
        return good_friday;
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

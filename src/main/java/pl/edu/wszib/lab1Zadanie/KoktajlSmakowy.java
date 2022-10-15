package pl.edu.wszib.lab1Zadanie;

public abstract class KoktajlSmakowy extends Koktajl implements Smakowalne {

    protected final RodzajSmaku rodzajSmaku;

    protected KoktajlSmakowy(int kcal, RodzajSmaku rodzajSmaku) {
        super(kcal);
        this.rodzajSmaku = rodzajSmaku;
    }

    @Override
    public void pij() {

    }

    @Override
    public RodzajSmaku smak() {
        return rodzajSmaku;
    }
}

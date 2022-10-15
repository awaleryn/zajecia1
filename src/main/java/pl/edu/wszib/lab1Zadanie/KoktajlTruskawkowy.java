package pl.edu.wszib.lab1Zadanie;

/**
 * Rodzaje truskawek:
 * Ananasowa
 * Honeaye
 * Polka
 * Kent
 * Christine
 */

public class KoktajlTruskawkowy extends Koktajl implements Smakowalne {

    private final RodzajTruskawki rodzajTruskawki;
    private final RodzajSmaku rodzajSmaku;

    public KoktajlTruskawkowy(final int kcal,
                              final RodzajTruskawki rodzajTruskawki,
                              final RodzajSmaku rodzajSmaku) {
        super(kcal);
        this.rodzajTruskawki = rodzajTruskawki;
        this.rodzajSmaku = rodzajSmaku;
    }


    @Override
    public void pij() {
        if (rodzajSmaku.equals(RodzajSmaku.TRUSKAWKOWY)) {
            System.out.println("Pije koktajl o smaku "
                    + smak() + ", ktora cechuje sie "
                    + rodzajTruskawki.cecha());
        } else {
            System.out.println("Pije koktajl o smaku " + smak()
                    + " ktorego poziom slodkosci wynosi " + rodzajSmaku.poziomSlodkosci());
        }

    }

    @Override
    public RodzajSmaku smak() {
        return this.rodzajSmaku;
    }
}

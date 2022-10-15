package pl.edu.wszib.lab1Zadanie;

/**
 * Rodzaje truskawek:
 * Ananasowa
 * Honeaye
 * Polka
 * Kent
 * Christine
 */

public class KoktajlTruskawkowy extends KoktajlSmakowy {

    private final RodzajTruskawki rodzajTruskawki;

    public KoktajlTruskawkowy(final int kcal,
                              final RodzajTruskawki rodzajTruskawki) {
        super(kcal, RodzajSmaku.TRUSKAWKOWY);
        this.rodzajTruskawki = rodzajTruskawki;

    }


    @Override
    public void pij() {
        System.out.println("Pije koktajl o smaku "
                + smak() + ", ktora cechuje sie "
                + rodzajTruskawki.cecha());
    }

}

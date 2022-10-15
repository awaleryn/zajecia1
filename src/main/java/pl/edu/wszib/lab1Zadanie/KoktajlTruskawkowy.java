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

    public KoktajlTruskawkowy(final int kcal,
                              final RodzajTruskawki rodzajTruskawki) {
        super(kcal);
        this.rodzajTruskawki = rodzajTruskawki;
    }

    @Override
    public void pij() {
        System.out.println("Pije koktajl o smaku "
                + smak() + ", ktora cechuje sie "
                + rodzajTruskawki.cecha());

        String message = String.format("Pije koktajl o smaku %s, ktora cechuje sie %s", smak(), rodzajTruskawki.cecha());
        System.out.println(message);
    }

    @Override
    public String smak() {
        return "Truskawkowy";
    }
}

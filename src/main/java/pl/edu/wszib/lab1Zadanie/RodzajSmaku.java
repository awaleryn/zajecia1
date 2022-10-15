package pl.edu.wszib.lab1Zadanie;

public enum RodzajSmaku {

    TRUSKAWKOWY(3),

    BANANOWY(3),

    SZPINAKOWY(0),
    CIASTECZKOWY(5),

    JABLKOWY(4);

    private final int poziomSlodkosci;

    RodzajSmaku(int poziomSlodkosci) {
        this.poziomSlodkosci = poziomSlodkosci;
    }

    public int poziomSlodkosci() {
        return poziomSlodkosci;
    }


}

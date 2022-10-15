package pl.edu.wszib.lab1Zadanie;

public enum RodzajTruskawki {

    ANANASOWA("Biale owoce"),

    HONEOYE("Wyrazista"),

    POLKA("Najsmaczniejsza"),

    KENT("Dla fanów slodyczy"),

    CHRISTINE("Zaowocuje szybko i obficie");


    private final String cecha;
    RodzajTruskawki(final String cecha) {
        this.cecha = cecha;
    }

    public String cecha() {
        return cecha;
    }
}

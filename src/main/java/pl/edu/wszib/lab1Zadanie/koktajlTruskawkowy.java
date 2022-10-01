package pl.edu.wszib.lab1Zadanie;

public class koktajlTruskawkowy extends koktajl implements Smakowalne {

    @Override
    public void pij() {
        System.out.println("Piję koktajl");
    }

    @Override
    public void smak() {
        System.out.println("Truskawkowy");
    }
}

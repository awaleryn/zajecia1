package pl.edu.wszib.lab1Zadanie;

public class Application {

    public static void main(String[] args) {
        KoktajlTruskawkowy koktajl = new KoktajlTruskawkowy(300, RodzajTruskawki.ANANASOWA);
        koktajl.jedz();
        koktajl.pij();

        int myVar = 5;
        test(myVar);
        System.out.println(myVar);
    }

    public static void test(int myVar) {
        myVar = 10;
    }
}

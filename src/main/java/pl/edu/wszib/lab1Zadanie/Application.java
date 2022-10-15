package pl.edu.wszib.lab1Zadanie;


/**
 * Zadanie:
 * Utwórz enum RodzajSmaku zawierający wartości:
 * Truskawkowy
 * Bananowy
 * Szpinakowy
 * Ciasteczkowy
 * Jabłkowy
 * enum powinien przechowywać dodatkowo informację o poziomie słodkości
 * (int (albo enum jak ktoś bardzo chce),
 * poziomy do ustalenia według indywidualnych preferencji)
 *
 * A następnie zmodyfikować interfejs Smakowy
 * tak aby zwracał rodzaj smaku i dostosować resztę programu
 *
 */

public class Application {

    public static void main(String[] args) {
        KoktajlTruskawkowy koktajl = new KoktajlTruskawkowy(300,RodzajTruskawki.POLKA, RodzajSmaku.TRUSKAWKOWY);
        koktajl.jedz();
        koktajl.pij();

        KoktajlTruskawkowy koktajl2 = new KoktajlTruskawkowy(300,RodzajTruskawki.NONE, RodzajSmaku.CIASTECZKOWY);
        koktajl2.jedz();
        koktajl2.pij();


        int myVar = 5;
        test(myVar);
        System.out.println(myVar);
    }

    public static void test(int myVar) {
        myVar = 10;
    }
}

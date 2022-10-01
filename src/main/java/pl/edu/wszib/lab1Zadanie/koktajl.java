package pl.edu.wszib.lab1Zadanie;

public abstract class koktajl implements Jadalne, Pijalne {

    @Override
    public void jedz() {
        pij();
    }

}

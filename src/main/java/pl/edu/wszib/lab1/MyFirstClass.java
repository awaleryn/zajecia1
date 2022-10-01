package pl.edu.wszib.lab1;

public class MyFirstClass implements MyFirstInterface, MySecondInterface {

    public static String myStaticField;

    private String firstField;

    String firstField2;

    @Override
    public void run1() {
        System.out.println("FirstField = " + firstField);
        System.out.println("SecondField = " + firstField2);
    }

    @Override
    public void run2() {
        System.out.println("My run2");
    }
}

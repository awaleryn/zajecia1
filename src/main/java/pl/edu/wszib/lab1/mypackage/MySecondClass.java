package pl.edu.wszib.lab1.mypackage;

import pl.edu.wszib.lab1.myabstract.MyAbstractClass;

public class MySecondClass extends MyAbstractClass {

    private String firstField;

    String firstField2;

    public void run() {
        System.out.println("FirstField = " + firstField);
        System.out.println("SecondField = " + firstField2);
        myProtectedField = "my protected field";
        myProtected();
    }

    @Override
    protected void myAbstract() {

    }
}

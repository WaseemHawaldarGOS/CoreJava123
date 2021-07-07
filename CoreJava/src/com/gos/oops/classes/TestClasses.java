package com.gos.oops.classes;

public class TestClasses {

    public static void main(String[] args) {

        /*
        Creating object of class using parameterized constructor
         */
        SymbianPhone nokia1100 = new SymbianPhone(2f, 2f, "Symbian", "Nokia", 3500f);
        System.out.println("\n\nNokia1100 object is created and it's properties are \n"+nokia1100.toString());

         }
}

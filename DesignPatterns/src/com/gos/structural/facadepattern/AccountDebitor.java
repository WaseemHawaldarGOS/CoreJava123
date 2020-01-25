package com.gos.structural.facadepattern;

/*
https://www.javabrahman.com/design-patterns/facade-design-pattern-in-java/
 */
public class AccountDebitor{

    public void debitAccount(String accNo, Double amount){
        System.out.println("Debited "+amount+" from account "+accNo);
    }
}

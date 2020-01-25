package com.gos.structural.facadepattern;

public class AccountDebitor{

    public void debitAccount(String accNo, Double amount){
        System.out.println("Debited "+amount+" from account "+accNo);
    }
}

package com.gos.structural.facadepattern;

/*
https://www.javabrahman.com/design-patterns/facade-design-pattern-in-java/
 */
public class Client{

    private BankingFacade facade;

    public Client(BankingFacade facade){
        this.facade=facade;
    }

    public static void main(String args[]){
        BankingFacade facade=new BankingFacade();
        System.out.println("*************Online transfer*********************");
        facade.onlineTransfer("1001","1002",10000.00);
        System.out.println("*************ATM Withdrawal*********************");
        facade.atmWithdrawal("1001",1000.00);
        System.out.println("*************Issuing FD*********************");
        facade.issueFD("1002",500.00);
    }

}


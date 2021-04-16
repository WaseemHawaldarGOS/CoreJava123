package oops.abstraction;

public class BankEmployee implements BankInterface{


    @Override
    public Bank displayAccountDetails(int accountId) {


        //It actually makes DB calls and sets values

        Bank bank = new Bank();
        bank.setCustomerAccountId(accountId);
        bank.setCustomerAddress("Bangalore");
        bank.setCustomerName("Rahul");
        bank.setMobileNo(9988833928l);

        return bank;


    }
}

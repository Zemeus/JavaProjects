package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Bank bank = new Bank("Bank of America");
        bank.addBranch("O'fallon");
        bank.addCustomer("O'fallon", "Andrew", 500);
        bank.addCustomer("O'fallon", "Mike", 75.25);
        bank.addCustomer("O'fallon", "Bob", 1200.00);

        bank.addBranch("Lake St Louis");
        bank.addCustomer("Lake St Louis", "Joe", 50);

        bank.addCustomerTransaction("Lake St Louis", "Joe", 50000);
        bank.addCustomerTransaction("O'fallon", "Andrew", 50);
        bank.addCustomerTransaction("O'fallon", "Mike", 1.00);

        bank.listCustomers("O'fallon", false);
        bank.listCustomers("O'fallon", true);
        bank.listCustomers("Lake St Louis", true);

        bank.getBranches().fin



    }
}

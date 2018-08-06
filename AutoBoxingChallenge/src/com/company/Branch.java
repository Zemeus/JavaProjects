package com.company;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    //CONSTRUCTOR
    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName(){
        return this.name;
    }

    public boolean addNewCustomer(Customer customer){
        if(findCustomer(customer.getName()) == null){
            this.customers.add(customer);
            return true;
        }
        return false;
    }

    public boolean addNewCustomer(String name, double initialBalance){
        if(findCustomer(name) == null){
            this.customers.add(new Customer(name, initialBalance));
            return true;
        }

        return false;
    }

    public boolean addCustomerTransaction(String name, double amount){
        Customer existingCustomer = findCustomer(name);
        if(existingCustomer != null){
            existingCustomer.addTransaction(amount);
            return true;
        }

        return false;
    }

    public void printCustomerList(){
        for (Customer customer: this.customers) {
            customer.updateBalance();
            System.out.println("Customer Name: " + customer.getName() + " \nBalance: " + customer.getBalance());
        }
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    private Customer findCustomer(String name){
        for(Customer customer: this.customers){
            if(customer.getName().equals(name)){
                return customer;
            }
        }
        return null;
    }



}

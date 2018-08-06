package com.company;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;
    private double balance = 0;

    //CONSTRUCTORS


    public Customer(String name) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
    }

    public Customer(String name, double initialBalance) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        this.transactions.add(initialBalance);
        updateBalance();
    }

    //BALANCE
    public double getBalance() {
        return balance;
    }

    public void updateBalance() {
        double totalBalance = 0;
        for (double transaction: this.transactions) {
            totalBalance += transaction;
        }
        this.balance = totalBalance;
    }

    //NAME
    public String getName() {
        return name;
    }

    //TRANSACTIONS
    public void addTransaction(double amount){
        this.transactions.add(amount);
    }

    public void printTransactions(){
        for (double amount: this.transactions) {
            System.out.println("Transaction: " + amount);
        }
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }




}

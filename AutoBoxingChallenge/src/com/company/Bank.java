package com.company;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(Branch branch){
        Branch existingBranch = findBranch(branch.getName());
        if(existingBranch == null){
            this.branches.add(branch);
            return true;
        }
        return false;
    }

    public boolean addBranch(String name){
        Branch existingBranch = findBranch(name);
        if(existingBranch == null){
            this.branches.add(new Branch((name)));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialBalance){
        Branch branch = findBranch(branchName);
        if(branch != null){
            return branch.addNewCustomer(customerName, initialBalance);
        }

        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount){
        Branch branch = findBranch(branchName);
        if(branch != null){
            return branch.addCustomerTransaction(customerName, amount);
        }
        return false;
    }

    private Branch findBranch(String name){
        for(Branch branch: branches){
            if(branch.getName() == name){
                return branch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean showTransactions){
        Branch branch = findBranch(branchName);
        if(branch != null){
            System.out.println("Customers details for branch " + branch.getName());
            for(Customer customer: branch.getCustomers()){
                System.out.println("Customer: " + customer.getName());
                if(showTransactions)
                    customer.printTransactions();
            }
            return true;
        }
        return false;
    }

    public ArrayList<Branch> getBranches(){
        return this.branches;
    }
}

package com.patdoc;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }



    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public void printBranchCustomers(Branch branch){
        ArrayList<Customer> customers = branch.getCustomers();
        for(int i=0; i<(customers.size()-1); i++){
            System.out.println(customers.get(i).getName());
        }
    }

    public ArrayList<Customer>getBranchCustomers(Branch branch){
        return branch.getCustomers();
    }

    public void viewCustomerDetails(Customer customer){
        System.out.println(customer.getName() + ", Balance: £" + customer.getBalance());
        ArrayList<String>transactions = customer.getTransactions();
        System.out.println("Transactions: ");
        for(int i=0; i<transactions.size(); i++){
            System.out.println(transactions.get(i));
        }
    }

    public Customer findCustomer(String name){
        ArrayList<Branch>branches = getBranches();
        for(int i=0; i<branches.size(); i++){
            ArrayList<Customer> customers = branches.get(i).getCustomers();
            for(int j=0; j<customers.size(); j++){
                if(customers.get(j).getName() == name){
                    return customers.get(j);
                }
                }
            } return
        }
    }


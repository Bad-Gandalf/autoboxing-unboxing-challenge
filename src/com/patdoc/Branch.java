package com.patdoc;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public static Branch createBranch(String name){
        return new Branch(name);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void addCustomer(String name){
        Customer newCustomer = Customer.createCustomer(name);
        this.customers.add(newCustomer);
    }

    public void addCustomer(Customer customer){
        this.customers.add(customer);
    }
}

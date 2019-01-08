package com.patdoc;

import java.util.ArrayList;

public class Customer {
    private String name;
    private int balance  = 0;
    private ArrayList<String> transactions;

    public Customer(String name) {
        this.name = name;
        this.transactions = new ArrayList<String>();
    }

    public static Customer createCustomer(String name){
        return new Customer(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        this.balance += amount;
        this.transactions.add("Deposit: £" + amount + ", Balance: " + this.balance);
        System.out.println("You have deposited: £" + amount + ".\n" +
                            "Your new balance is: £" + this.balance);
    }

    public void withdrawal(int amount){
        if (amount <= this.balance){
            this.balance -= amount;
            this.transactions.add("Withdrawal: £" + amount + ", Balance: " + this.balance);
            System.out.println("You withdrew: £" + amount + ".\n" +
                    "Your new balance is: £" + this.balance);
        }else {
            System.out.println("You have insufficient funds");
        }

    }


    public ArrayList<String> getTransactions() {
        return this.transactions;
    }

    public void setTransactions(ArrayList<String> transactions) {
        this.transactions = transactions;
    }
}

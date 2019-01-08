package com.patdoc;

public class Main {

    public static void main(String[] args) {
	Customer customer = new Customer("Patrick Doherty");
	customer.deposit(50);
	System.out.println(customer.getName());
	customer.withdrawal(60);
	Branch branch = new Branch("Strabane");
	branch.addCustomer(customer);
	Bank bank = new Bank("Pat's Bank");
	bank.addCustomer(branch, customer);
	customer.deposit(70);
	customer.withdrawal(30);
	bank.viewCustomerDetails(customer);




    }
}

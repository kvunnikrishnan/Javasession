package com.unni.oop;

public class Account {
	
	private String accountNumber;
	private double balance;
	private String customerName;
	private String customerEmail;
	
	
	public Account() {
		
		System.out.print("default construcutor");
	}
	
	public Account(String accountNumber, double balance,String customerName, String customerEmail) {
		
		this.accountNumber=accountNumber;
		this.balance=balance;
		this.customerEmail=customerEmail;
		this.customerName=customerName;
		
	}
	
	public void deposit(Double depoistAmount) {
		this.balance +=depoistAmount;
		System.out.println("Current balance is "+ balance);
	}
	
	public void withDraw(double withdrawAmount) {
		if(balance-withdrawAmount<0) {
			System.out.println("insufficent balance " + balance);
		} else {
			this.balance -=withdrawAmount;
		}
	}
	/**
	 * @return the accountNumber
	 */
	public String getAccountNumber() {
		return accountNumber;
	}
	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}
	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	/**
	 * @return the customerEmail
	 */
	public String getCustomerEmail() {
		return customerEmail;
	}
	/**
	 * @param customerEmail the customerEmail to set
	 */
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	
	


}

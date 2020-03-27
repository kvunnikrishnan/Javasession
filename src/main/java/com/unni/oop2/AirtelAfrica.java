package com.unni.oop2;

public class AirtelAfrica implements TelecomSenegal,TelecomRwanda{ //multiple inheritance using interface
	
	//if a class in implements based on interface then its mandatory to declare all its method.
	//is-relationship
	
	public void sms() {
		
		System.out.println("* SMS Feature**");
		
	}
	
	public void data() {
		
		System.out.println("*data Feature*");
		
	}
	
	public void call() {
		
		System.out.println("*Voice Feature");
		
	}
	
	public void International() {
		
		System.out.println("international Call Feature");
	}
	
	public void mobilemoney() {
		
		System.out.println("MobileMoneymethod");
	}
	

}

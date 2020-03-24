package com.unni.concepts;

public class LocalAndGlobalVariables {
	
	 //global variable or class variable
	
	String name="unni";
	public static void main(String[] args) {
		
		//int i=10;
	
		LocalAndGlobalVariables obj =new LocalAndGlobalVariables();
        System.out.println(obj.name); //non static global variable will access through object inside main method
        obj.sum();
	}
	
	public void sum() {
		//int i=15;//local variable
		System.out.println(name); // global variable will accessible here for non static method
		 
	}

}

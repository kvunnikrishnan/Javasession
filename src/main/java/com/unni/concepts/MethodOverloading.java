package com.unni.concepts;

public class MethodOverloading {
	
	public static void main(String args[]) {
		
		MethodOverloading obj=new MethodOverloading();
		obj.sum();
		obj.sum(10);
		
	}
	
	
	// you cannot create method inside a method
	// when the method name is same with different arguments or input parameter  different data type with the class then its called method overloading.
	//main method can be overload
	//
	
	public void sum() {
		
		System.out.println( );
		
	}
	
	public void sum(int i) {
		
		System.out.println( );
		
	}
	
 public void sum(double i) {
		
		System.out.println( );
		
	}
	
	public void sum(int i,int j) {
		
		System.out.println( );
		
	}


}

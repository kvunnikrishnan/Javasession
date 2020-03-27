package com.unni.concepts;

public class Functions {
	
	//starting point of execution

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Functions obj=new Functions();
		//after creating the object all non static method wil get the copy
		obj.test();
		obj.sum();
		double div=obj.division(30, 21.5);
		System.out.println(div);
	}
	
	/*
	 * Non Static Method
	 * 
	 */
	
	//Return is void here

	 public void test() {
		 
		 System.out.println("testMethod");
	 }
	 
	 
	 //return is int
	 
	 public int sum() {
		 int a =10;
		 int b=20;
		 int c=a+b;
		 System.out.println(c );
		 return c;
	 }
	 
	 
	 public double division(double x,double y) {
		 
		 double d=x/y;
		 return d;
	 }
}

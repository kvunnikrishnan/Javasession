package com.unni.practicelession;

public class FibonacciWithRecurssion {
	
	public static int fib(int n) {
		
		if(n<=1) 
			return n;
			int unni= fib(n-1)+ fib(n-2);
			System.out.println(unni);
			return unni;
		} 	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fib(4);

	}

}

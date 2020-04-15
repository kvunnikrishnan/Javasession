package com.unni.practicelession;

import java.util.ArrayList;
import java.util.List;

public class FibnocciUsingArraylIst {
	
	public static void main(String Args[]) {
		
	int n=5,a=0,b=1;	

		
   ArrayList<Integer> arrray=new ArrayList<Integer>();
		
		for(int i=1;i<=n;i++) {
			arrray.add(a);
			int sum=a+b;
			a=b;
			b=sum;
			
			/*
			 * 
			 */
			
		}
		
		//printing outside the for loop
		for(int int1:arrray) {	 
	    System.out.println(int1);
			
		
	}

}
}

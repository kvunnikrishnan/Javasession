package com.unni.practicelession;

import java.util.Scanner;

public class Palindrome {
	
	
	public static void main(String Args[]) {
		
		int sum=0,r,temp;
		//int n=121;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter an integer value");
		int n=input.nextInt();
		
		temp=n;
		
		while(n>0) {
			
			r=n%10;
			sum=(sum*10)+r;
			//System.out.println("sum is " +sum);
			n=n/10;
			//System.out.println("value of n is "+n);
			
		}
		
		if(temp==sum) {
			System.out.println("palindrome");
			
		}else {
			System.out.println("no palindrom");
		}
		
	}

}

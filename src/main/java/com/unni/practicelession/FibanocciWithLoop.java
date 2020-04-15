package com.unni.practicelession;

public class FibanocciWithLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=0,b=1,n=4;
		
		for(int i=1;i<=n;i++) 
		{
		    System.out.println(a);
		    //here swapping is doing so first time a=0 then a=1 so on;
			int sum=a+b;
			a=b;
			b=sum;
			
			
			
		}

	}

}

package com.unni.concepts;

public class TwoDimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s[][]=new String[2][4];
		System.out.println(s.length); // gives you total number of rows.
		System.out.println(s[0].length);// give number of columns
		
		s[0][0]="A";
		s[0][1]="B";
		s[0][2]="C";
		s[0][3]="D";
		
		

		s[1][0]="A1";
		s[1][1]="B1";
		s[1][2]="C1";
		s[1][3]="D1";
		
		
	
		/*
		 * To Print two dimensional array two for loop is required
		 * 
		 */
		
		
		for (int row=0;row<s.length;row++) {
			
			for(int col=0;col<s[0].length;col++) {
				
				System.out.println("Elements in the arrays are in the position of "+ "["+row+"]"+"["+col+"]" + " is " +s[row][col]);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

package com.unni.concepts;

public class ArrayConcept {
	
	public static void main(String args[]) {
		
		/*
		 * size is fixed(static array) to overcome this issues we use collections. Hashtables,arralist etc
		 * similar data type can be stored to overcome this issues we use object array
		 * 
		 * 
		 */
		
		//integer array
		
		int i[]=new int[4];
		
		i[0]=10;
		i[2]=20;
		i[3]=30;
		i[1]=25;
		
		System.out.println(i[1]); // i[1] is not defined so zero ill print
		//System.out.println(i[4]); // Arrayindex 
		
		System.out.println(i.length);
		
		for(int j=0;j<i.length;j++) {
			System.out.println("Number in position of " +j+" is " +i[j]);
			
		}
		
		//double array like this any data type can be used.
		
		double d[]=new double[2];
		d[0]=1.1;
		d[1]=2.3;
		
		
		//charcter array
		
		char c[]=new char[2];
		c[0]='q';
		c[1]='$';
		
		/*
		 * concept of object array.
		 * Object is super class of all class
		 * Used to Store different data type values
		 */
		
		Object obj[]=new Object[5];
		obj[1]=6;
		obj[0]="unni";
		obj[2]='m';
		obj[4]="12/21/22"; 
		
		for(int o=0;o<obj.length;o++) {
			System.out.println("Number in position of " +o+" is " +obj[o]);
			
		}
		
				
				
		
		
		
		
		
				
	}

}

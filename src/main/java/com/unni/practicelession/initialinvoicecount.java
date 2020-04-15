package com.unni.practicelession;

public class initialinvoicecount {
	
	public static String value1="100";
	public static String value2="200";
	public static String fac="2";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		initialinvoicecount obj=new initialinvoicecount();
		boolean unni=obj.calculateInitialInvoiceAmount(value1, value2, fac);
		System.out.println("value of boolean" +unni);
		
		
	}
	
	public  boolean calculateInitialInvoiceAmount(String value,String value2k,String fackk) {
		int setfactor=Integer.parseInt(fac);
		int planamount=Integer.parseInt(value1);
		int intialamount=Integer.parseInt(value2);
		int totalplanamout=planamount*setfactor;
		boolean initialamountvalue;
		if(totalplanamout==intialamount) {
			return true;
		}else {
			return false;
		}

	}
}

		 
  


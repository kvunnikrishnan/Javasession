package com.unni.oop;

public class Main {

	public static void main(String[] args) {
		//CAR porche=new CAR();
		//porche.setmode("abcdef");
		//System.out.println(porche.getModel());
		
		
		/*
		 * SimpleCalculator calc=new SimpleCalculator(); calc.setFirstNumber(1.75);
		 * calc.setSecondNumber(5); System.out.println(calc.getDivisionResult());
		 * System.out.println(calc.getAdditionResult());
		 * System.out.println(calc.getMultiplicationResult());
		 * System.out.println(calc.getSubtractionResult());
		 */
		
		/*
		 * Person person = new Person(); person.setFirstName(""); // firstName is set to
		 * empty string person.setLastName(""); // lastName is set to empty string
		 * person.setAge(10); System.out.println("fullName= " + person.getFullName());
		 * System.out.println("teen= " + person.isTeen()); person.setFirstName("John");
		 * // firstName is set to John person.setAge(18);
		 * System.out.println("fullName= " + person.getFullName());
		 * System.out.println("teen= " + person.isTeen()); person.setLastName("Smith");
		 * // lastName is set to Smith System.out.println("fullName= " +
		 * person.getFullName());
		 */
		
		//Account acc=new Account("107501510161",1000,"unnikrishnan","unni670@gmail.com");
		Account acc=new Account();
		acc.withDraw(11);
		acc.deposit(10.0);
		System.out.println("customer email id is"+ " "+ acc.getCustomerEmail());

	}

}

package com.unni.concepts;

public class StaticAndNonStatic {
	
	int age=30;//non static global variable
	static String name="unni";
	
	public static void main(String Args[]) {
		
		
		//to access static method 
		
		//1.direct method
		
		test2();
		
		//2 using class namew
		
		StaticAndNonStatic.test2();
		
		
		// to access variable
		
		System.out.println(name);
		System.out.println(StaticAndNonStatic.name);
		
		
		// to access non static method
		
		StaticAndNonStatic obj=new StaticAndNonStatic();
		
		obj.test();
	    System.out.println(obj.age);
	    
	    //static method can be access through object but no preferred because its available in common memory.
		
		
	}
	
	public void test() {
		System.out.println("testmethod");
	}
	
	public static void test2() {
		
		System.out.println("testmethod2");
	}

}

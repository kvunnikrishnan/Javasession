package com.unni.oop2;

public class TestAutoMobile {

	public static void main(String[] args) {
		
		//static polymorphisam -- compile time polymorphisam
		Hyundayi hy=new Hyundayi();
		hy.start();
		hy.stop();
		hy.elite120();
		
		
		System.out.println("********************");
		
		
		Car c=new Car();
		
		c.start();
		c.stop();
		
		System.out.println("********************");
		//top casting
		Car c1=new Hyundayi(); //child class object can be reffered by parent class reference is called dynamic polymorphisam or runtime polymorphisam 
		
		c1.start();
		c1.stop();
		
		
		
		
		
		

	}

}

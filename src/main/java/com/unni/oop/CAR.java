package com.unni.oop;

public class CAR {
	
	//instant variable
	private String Model;
	private int wheels;
	private String regno;
	
	
	public void setmode(String Model) {
		//instant varibale and local variable are same hence this keyword
		this.Model=Model;
	}
	
	public String getModel() {
		return this.Model;
	}

}

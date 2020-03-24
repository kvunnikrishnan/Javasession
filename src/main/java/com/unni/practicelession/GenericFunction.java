package com.unni.practicelession;

import java.util.Random;

public class GenericFunction {

	public static void main(String[] args) {
		
		
		/*
			char[] chars = "1234".toCharArray();
			StringBuilder sb = new StringBuilder(20);
			Random random = new Random();
			for (int i = 0; i < 5; i++) {
				char c = chars[random.nextInt(chars.length)];
				System.out.println(c);
				System.out.println(chars);
				sb.append(c);
			}
			String output = sb.toString();
			System.out.println(output);
			//System.out.println(output); 
		

	}*/
		// crearing random class.
		Random rand =new Random();
		StringBuilder sb=new StringBuilder(10);
		
		for(int i=0;i<5;i++) {
		int random1=rand.nextInt(5);
		StringBuilder output=sb.append(random1);
		System.out.println("random integer number is "+output);
		}
		
		
	}

}

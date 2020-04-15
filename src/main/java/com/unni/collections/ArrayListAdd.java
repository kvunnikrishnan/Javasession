package com.unni.collections;

import java.util.ArrayList;

public class ArrayListAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> arraylist = new ArrayList<String> ();
		arraylist.add("u");
		arraylist.add("n");
		System.out.println(arraylist);
		arraylist.add(2,"k");
		System.out.println(arraylist);
		// iterate over arraylist
		for(String str:arraylist) {
			System.out.println(str);
		}
		
	}

}

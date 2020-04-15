package com.unni.collections;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

	public static void main(String[] args) {
	
		
		ArrayList<String> hello=new ArrayList<String>();
		hello.add("unni");
		hello.add("sree");
		hello.add("Bangalore");
		//sorting in case insensitve order
		Collections.sort(hello,String.CASE_INSENSITIVE_ORDER);
		
		for (String str:hello) {
			System.out.println(str);
		}

	}

}

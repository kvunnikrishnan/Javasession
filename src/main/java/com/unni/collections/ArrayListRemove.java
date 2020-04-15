package com.unni.collections;

import java.util.ArrayList;

public class ArrayListRemove {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> intarray=new ArrayList<Integer>();
		// from 0th position 1 will insert
		intarray.add(1);
		intarray.add(2);
		intarray.add(3);
		intarray.add(4);
		intarray.add(5);
		intarray.add(6);
		intarray.add(7);
		intarray.add(8);
		System.out.println(intarray);
		intarray.remove(0); // from 0th position 1 will remove
		System.out.println(intarray);

	}

}

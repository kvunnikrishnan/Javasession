package com.unni.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String Args[]) {

		ArrayList ar = new ArrayList(); // generic is not declared here so the warning is showing.
		ar.add(100);
		ar.add("unni");

		System.out.println(ar.size());

		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(10);
		ar1.add(12);

		System.out.println("**Size of integer arraylist is** " + ar1.size());

		ar1.remove(0);
		System.out.println("**Size of integer arraylist after removal** " + ar1.size());

		Employee e = new Employee("unni", 31, "QA");
		Employee e1 = new Employee("sree", 25, "BI");

		ArrayList<Employee> ar3 = new ArrayList<Employee>();
		ar3.add(e);
		ar3.add(e1);

		Iterator<Employee> it = ar3.iterator();

		while (it.hasNext()) {

			Employee emp = it.next();
			System.out.println(emp.age);
			System.out.println(emp.name);
			System.out.println(emp.dept);
		}

	}

}

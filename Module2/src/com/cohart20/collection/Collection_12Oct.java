package com.cohart20.collection;

import java.util.ArrayList;

public class Collection_12Oct {

	public static void main(String[] args) {


		ArrayList salaries = new ArrayList();

		salaries.add(3000);
		salaries.add(2500);
		salaries.add(6500);
		salaries.add(4300);
		salaries.add("Inan");
		salaries.add(false);
		salaries.add(56.87);
		salaries.add(3000);

		System.out.println(salaries.size());
		System.out.println(salaries.isEmpty());
		System.out.println(salaries.contains("Inan"));;
	}

}

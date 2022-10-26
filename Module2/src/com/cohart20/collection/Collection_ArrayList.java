package com.cohart20.collection;

import java.util.ArrayList;

public class Collection_ArrayList {

	public static void main(String[] args) {


		ArrayList<Integer> rollNumbers = new ArrayList<Integer>();
		ArrayList<String> names = new ArrayList<String>();

		rollNumbers.add(1); rollNumbers.add(2); rollNumbers.add(3);  rollNumbers.add(4);
		names.add("Inan"); names.add("Ali"); names.add("John"); names.add("Olivia");


		for(int i =0; i< rollNumbers.size(); i++) {

			System.out.println("Your roll number is  "+ rollNumbers.get(i)+ " and your name is  " + names.get(i));
		}
	}

}

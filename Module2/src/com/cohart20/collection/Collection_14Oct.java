package com.cohart20.collection;

import java.util.HashSet;

public class Collection_14Oct {

	public static void main(String[] args) {


		HashSet<String> names = new HashSet<String>();


		names.add("Inan");
		names.add("John");
		names.add("Ayse");
		names.add("Steve");
		names.add("Jonathan");

		System.out.println(names.size());

		names.add("Eren");

		System.out.println(names.size());


		for(String value : names) {
			System.out.println(value);
		}

		names.remove("Ayse");

		System.out.println("After the removal");

		for(String value : names) {
			System.out.println(value);
		}

	}

}

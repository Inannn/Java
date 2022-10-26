package com.qa.java.junit_test;
public class Main {

	public static void main(String[] args) {

		Student s1 = new Student("Manit", 39, 45);//Parameterized constructor... 




		//s1.setName("Manit");      s1.setAge(50);     s1.setScore(34); I do not need this line to set values since I created object
		//by parameterized constructor...

		System.out.println(s1.getName());
		System.out.println(s1.getScore());
		System.out.println(s1.getAge());


		//		
		String resultStatus = s1.checkResult();

		System.out.println(resultStatus);
	}

}
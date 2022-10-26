import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

//=================throws keyword start from here===================
import 


//=================throw======================
//throw is the keyword used to manually throw an Exception

public class ExceptionHandling_02 {

	public static void main(String[] args) throws Exception {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Kindly enter you Age!!");

		int age = sc.nextInt();

		if(age < 18) {
			throw new LessThan17Exception();
		}
		else {
			System.out.println("You are Allowed..");
		}

		System.out.println("First Statement");

		System.out.println("Second Statement");

	}
}
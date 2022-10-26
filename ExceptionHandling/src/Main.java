import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		try {

			Scanner sc = new Scanner(System.in);

			System.out.println("Enter any number for Numerator!!!");

			int numerator = sc.nextInt();

			System.out.println("Enter any number for Demoninator!!!");

			int demoninator = sc.nextInt();

			int result = numerator / demoninator;

			System.out.println("The result is   " + result);

		}

		catch (Exception a) {

			System.out.println("Inside catch ...");

			a.printStackTrace();

			main(null);
		}

	}

}

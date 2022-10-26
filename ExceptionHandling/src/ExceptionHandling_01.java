import java.io.File;
import java.io.FileReader;

//=================throws keyword start from here===================

public class ExceptionHandling_01 {

	private static FileReader reader;

	public static void main(String[] args) {

		try {
			File f = new File("C:\\Users\\ibozd\\OneDrive\\Desktop\\Java\\Main.txt");

			reader = new FileReader(f);

			System.out.println((char)reader.read());	
		}
		catch(Exception e) {
			System.out.println("inside catch...");
			e.printStackTrace();
		}


	}
}
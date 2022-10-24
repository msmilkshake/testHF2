import java.util.Scanner;
import java.nio.file.Paths;

public class Compras{
	public static void main(String[] args) {

		try (Scanner fileScanner = new Scanner(Paths.get("compras.txt"))) {
			while(fileScanner.hasNextLine()) {
				System.out.println(fileScanner.nextLine());
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		
	}
}
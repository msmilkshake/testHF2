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
		
		System.out.print("Insert time in seconds: ");
		int time = Integer.parseInt(scanner.nextLine());
		System.out.print("Insert distance in kilometers: ");
		double distance = Double.parseDouble(scanner.nextLine());
		int minutes = (int)(time / distance / 60);
		int seconds = (int)(((time / distance / 60) - minutes) * 60);
		System.out.printf("%02d:%02d/km", minutes, seconds);
		System.out.print("\nPress ENTER to exit");
		scanner.nextLine();
		
		System.out.printf("%02d:%02d/km", minutes, seconds);
		System.out.print("\nPress ENTER to exit");
		scanner.nextLine();
		
	}
}

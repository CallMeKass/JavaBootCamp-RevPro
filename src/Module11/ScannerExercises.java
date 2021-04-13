package Module11;

import java.util.Scanner;

public class ScannerExercises {
	public static void main(String[] args) {
		exerciseOne();
	}
	
	//Create a method that prints different statements based on the user’s input according to the following cases.
	public static void exerciseOne() {
		Scanner scanner = new Scanner(System.in);
		String input = new String();
		System.out.println("Accepatable input: [1 - Move right, 2 - Move Left, 3 - Move Up, 4 - Move Down, q - exit program]");
		
		while(true) {
			System.out.print("Your Move: ");
			input = scanner.nextLine();
			
			if(input.equals("1")) {
				System.out.println("Moving Right");
			}
			else if(input.equals("2")) {
				System.out.println("Moving Left");
			}
			else if(input.equals("3")) {
				System.out.println("Moving Up");
			}
			else if(input.equals("4")) {
				System.out.println("Moving Down");
			}
			else if(input.equals("q")) {
				System.out.println("Goodbye");
				break;
			}
			else {
				System.out.println("Try again. Accepatable input: [1 - Move right, 2 - Move Left, 3 - Move Up, 4 - Move Down, q - exit program]");
			}
		}
		scanner.close();
	}
}

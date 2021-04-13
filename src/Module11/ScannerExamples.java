package Module11;

import java.util.Scanner;

public class ScannerExamples {
	public static void main(String[] args) {
		exampleOne();
		exampleTwo();
	}
	
	public static void exampleOne() {
		Scanner scanner = new Scanner(System.in);
		String result = "";
		
		System.out.print("INPUT: ");
		result = scanner.nextLine();
		
		scanner.close();
		
		System.out.println("RESULT: "+result);
	}
	
	public static void exampleTwo() {
		String numbers = "1 2 3 4 5 6";
		
		Scanner scanner = new Scanner(numbers);
		
		while (scanner.hasNextInt()) {
			System.out.print(scanner.nextInt());
			
			if (scanner.hasNextInt()) {
				System.out.print(", ");
			}
		}
		scanner.close();
	}	
}

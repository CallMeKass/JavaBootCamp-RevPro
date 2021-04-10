package examples;

public class SwitchStatements {
	public static void main(String[] args) {
		int value = 7;
		
		
		//Fall through logic - Runs everything after the first true case
		switch(value) {
		case 3:
			System.out.println("Case 3");
		case 4:
			System.out.println("Case 4");
			break;		//Stops fall through logic
		case 5:
			System.out.println("Case 5");
			
		default: 		//Runs this if nothing else passes
			System.out.println("Default Case");
		}
	}

}

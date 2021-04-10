/* Module 5
 * Examples for if/switch statements
 */

package Module5;

public class IfAndSwitch {
	
	public static void main(String[] args) {
		//if Statements
		int x = 2;
		if(x > 1) {
			System.out.println("We Big");
		}
		else if(x > 0){
			System.out.println("We exist");
		}
		else {
			System.out.println("We have nothing :(");
		}
		
		
		if(!false) {
			System.out.println("Double negative, YEET");
		}
		
		//Switch Statements
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

/**********
 * Module 7
 * Examples for Loops
 */
package Module7;

public class Examples {
	public static void main(String[] args) {
		//For Loop
		for(int i=1; i<=3; i++) {
			System.out.println("For loop iteration count: " + i);
		}
		
		//While Loop
		int j = 1;
		while(j<=3) {
			System.out.println("While loop iteration count: " + j);
			j++;
		}
		
		//Do-While Loop
		int k = 1;
		do {
			System.out.println("Do-While loop iteration count: " + k);
			k++;
		} while(k <= 3);
	}
}

/* Module 8
 * Exercise
 */

package Module8;

public class Exercise {
	public static void main(String[] args) {
		String[] first = {"Adam", "Alexis", "Dennis", "Jose", "Jessica", "Meghan", "Memphis", "Nicky", "Sarah", "William"};
		String[] last = {"Adamson", "Bond", "Brown", "Johnson", "Gallagher", "Smith", "Thompson", "Perez", "Snow", "Tran"};
		
		//Your program should list all possible combinations between a first name and a last name from lists that are provided
		for(int i=0; i<first.length; i++) {
			for(int j=0; j<last.length; j++) {
				System.out.println(first[i] + " " + last[j]);
			}
		}
	}
}

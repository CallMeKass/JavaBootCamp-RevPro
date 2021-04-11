/*
 * Module 10
 * Recursion
 */

package Module10;

public class Recursion {
	public static void main(String[] args) {
		int n = 10;
		int f = factorial(n);
		System.out.println("factorial(" + n + ") is " + f);
	}
	
	//Recursive factorial algorithm
	//Probably shouldn't use int for this but,
	//its just and example so whatever
	public static int factorial(int x) {
		int result = 1;
		if(x > 0) {
			return x * factorial(x-1);
		}
		else if(x < 0) {
			return x * factorial(x+1);
		}
		return 1;
	}
}

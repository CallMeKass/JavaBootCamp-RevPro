/* Module 9
 * This module is about making methods. 
 * I already know most of this so I'm skipping a lot
 */

package Module9;

public class MethodExample {
	public static void main(String[] args) {
		sayIt("Suh dude", 2);
		System.out.println(random());
	}
	
	public static void sayIt(String it, int n) {
		for(int i = 0; i<n; i++) {
			System.out.println(it);
		}
	}
	
	public static double random() {
		return Math.random();
	}
}

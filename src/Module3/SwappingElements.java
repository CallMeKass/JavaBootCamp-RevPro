/* Module 3
 * Exercise for moving elements in a list
 */

package Module3;

public class SwappingElements {
	
	public static void main(String[] args) {
		int[] elements = {1, 2, 3, 4, 5};
		
		// Swap first element with the last
		int temp = elements[(elements.length - 1)];
		elements[(elements.length - 1)] = elements[0];
		elements[0] = temp;
		
		for (int i = 0; i < elements.length; i++) {
			System.out.println(elements[i]);
		}
	}
}

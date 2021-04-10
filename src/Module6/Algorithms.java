/* Module 6
 * This module discussed Big-O and optimizing runtime
 * There was no code
 */
package Module6;

public class Algorithms {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		makePairs(array);
	}
	
	//Big O of n^2 
	//because it loops through a list of n size, n number of times
	public static void makePairs(int[] list) {
		for(int i=0; i<list.length; i++) {
			for (int j=0; j<list.length; j++) {
				System.out.println(list[i]*10 +list[j]);
			}
		}
	}
}

/*
 * Module 9
 * Exercises
 */

package Module9;

public class Exercises {
	public static void main(String[] args) {
		System.out.println(getPi());
		System.out.println(getAlphabetArray());
		System.out.println(square(1,2,3,4)[3]);
	}

	/*
	 * Create a method named getPi that returns the value of pi.
	 */
	public static double getPi() {
		double d = Math.PI;
		return d;
	}

	/*
	 * Write a method to return an array of characters that represent that letters
	 * from ‘a’ to ‘z’.
	 */
	public static char[] getAlphabetArray() {
		char[] array = new char[26];
		char start = 'a';
		for(int i=0; i<array.length; i++) {
			array[i] = start;
			start = (char)(start+1);
		}
		return array;
	}
	
	/*
	 * Create a method that declares four int parameters, 
	 * squares each, and places the results in a float array. 
	 * The method should return the float array result. 
	 */
	public static float[] square(int a, int b, int c, int d) {
		float[] f = new float[4];
		int[] n = {a,b,c,d};
		for(int i = 0; i<4; i++) {
			f[i] = n[i]*n[i];
		}
		return f;
	}
}

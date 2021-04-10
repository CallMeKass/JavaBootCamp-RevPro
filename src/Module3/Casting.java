/* Module 3
 * Examples for casting
 */
package Module3;

public class Casting {

	public static void main(String[] args) {
		long a = 10393L;
		int b = (int)a;
		System.out.println(b);
		
		int c = 200;
		
		short d = (short)c;
		System.out.println(d);
		
		double e = (short)c;
		System.out.println(e);
		
		//Downcasting Issue
		byte f = (byte)c;
		System.out.println(f);
	}
}

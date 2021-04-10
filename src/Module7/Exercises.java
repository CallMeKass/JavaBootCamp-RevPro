/**********
 * Module 7
 * Exercises for Loops
 */
package Module7;

public class Exercises {
	public static void main(String[] args) {
		whileLoop();
		doWhileLoop1();
		doWhileLoop2();
		forLoop();
	}
	
	//write a while loop that prints -100 to 100
	public static void whileLoop() {
		int i = -100;
		while(i<=100) {
			System.out.println(i);
			i++;
		}
	}
	
	//you need to write a do-while loop that prints the odd numbers 1 through 49, inclusively
	public static void doWhileLoop1() {
		int i = 1;
		do {
			System.out.println(i);
			i=i+2;
		} while (i <= 49);
	}
	
	//For this exercise, you must write a do-while loop that prints the letters of the alphabet. 
	public static void doWhileLoop2() {
		char chr = 'a';
		do {
			System.out.println(chr);
			chr = (char)(chr+1);
		} while(chr <= 'z');
	}
	
	//use a for-loop to iterate over the elements in the array and print them to the console. 
	public static void forLoop() {
		byte[] array = {1,2,3,4,5,6,7,8,9,0};
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
	}
}

package examples;

public class Arrays {
	public static void main(String[] args) {
		int[] arrayOne = new int[5]; 						//Empty area with 5 indexes 0 thru 4
		char[] arrayTwo = {'c', 'a', 's', 's', 'i', 'e'}; 	//Creates a populated array
		
		arrayOne[0] = -5123;
		System.out.println(arrayOne[0]);
		
		arrayTwo[0] = 'C';
		System.out.println(arrayTwo[0]);
		
		System.out.println(arrayTwo.length);
		
		for (int i = 0; i < arrayTwo.length; i++) {
			  System.out.println(arrayTwo[i]);
		}
	}
}

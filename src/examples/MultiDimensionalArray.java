package examples;

public class MultiDimensionalArray {
	public static void main(String[] args) {
		
		//Literal manner
		int[][] array2DA = { {1,2}, {3,4} };
		int[][][] array3DA = { {{1,2}, {3,4}}, {{5}}};
		
		//Using 'new'
		int[][] array2DB = new int[2][2];
		int[][][] array3DB = new int[2][2][2];
		
		System.out.println(array2DA[0][0]);
		System.out.println(array3DA[1][0][0]);
		
		array2DB[0][0] = 9;
		array3DB[1][1][1] = 7;
	}
}

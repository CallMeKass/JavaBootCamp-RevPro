/*
 * Module 10
 * Bubble Sort
 * Big-O: n^2
 */

package Module10;

public class BubbleSort {
	public static void main(String[] args) {
		int[] myArray = { 13, 2, 12, 4, 5, 6, 1, 8, 15, 10, 11, 3, 7, 14, 9, 16 };
		myArray = bubbleSort(myArray);
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}
	}

	public static int[] bubbleSort(int[] array) {
		int temp;

		if (array.length < 2) {
			return array;
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[j] > array[i]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}
}

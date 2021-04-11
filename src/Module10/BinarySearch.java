/*
 * Module 10
 * Binary Search
 */

package Module10;

import java.lang.reflect.Array;

public class BinarySearch {
	public static void main(String[] args) {
		int[] myArray = { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16 };
		System.out.println(binarySearch(myArray,14));
	}
	
	//BinarySearch - Cut number of possible locations in half on every iteration
	public static int binarySearch(int[] array, int target) {
		int minRange = 0;
		int maxRange = array.length-1;
		int midpoint = 0;
		
		while(minRange <= maxRange) {
			midpoint = (minRange + maxRange) / 2;
			
			if(array[midpoint] < target) {
				minRange = midpoint + 1;
			}
			else if(array[midpoint] > target) {
				maxRange = midpoint-1;
			}
			else {
				return midpoint;
			}
		}
		return -1;
	}
}


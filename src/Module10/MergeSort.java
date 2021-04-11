/*
 * Module 10
 * Merge Sort
 * This made me want to kms
 */

package Module10;

public class MergeSort {
	public static void main(String args[])
    {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
 
        mergeSort(arr);
 
        System.out.println("Sorted array");
		for (int i = 0; i < arr.length; ++i)
			System.out.print(arr[i] + " ");
    }
	
	// Sets up initial values for sort()
	public static void mergeSort(int[] arr) {
		sort(arr, 0, arr.length-1);
	}
		
	// Main function that sorts arr[l..r] using
	// merge()
	public static void sort(int arr[], int min, int max) {
		if (min < max) {
			// Find the middle point
			int mid = min + (max - min) / 2;

			// Sort first and second halves
			sort(arr, min, mid);
			sort(arr, mid + 1, max);

			// Merge the sorted halves
			merge(arr, min, mid, max);
		}
	}
	
	public static void merge(int[] arr, int min, int mid, int max) {
		// Find sizes of two subarrays to be merged
		int n1 = mid - min + 1;
		int n2 = max - mid;

		/* Create temp arrays */
		int[] L = new int[n1];
		int[] R = new int[n2];

		/* Copy data to temp arrays */
		for (int i = 0; i < n1; ++i)
			L[i] = arr[min + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[mid + 1 + j];

		/* Merge the temp arrays */

		// Initial indexes of first and second subarrays
		int i = 0, j = 0;

		// Initial index of merged subarry array
		int k = min;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		// Copy remaining elements of L[] 
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		// Copy remaining elements of R[]
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}
}

package sorting;
/*
 * Selection Sort requires two nested for loops to complete itself, 
 * one for loop is in the function selectionSort, and inside the first loop 
 * we are making a call to another function indexOfMinimum, which has the second(inner) for loop.
 * 	Worst Case Time Complexity [ Big-O ]: O(n2)
	Best Case Time Complexity [Big-omega]: O(n2)
	Average Time Complexity [Big-theta]: O(n2)
	Space Complexity: O(1)
*/

public class SelectionSorting {

	public static void main(String[] args) {
		Integer arr[] = SortingHelper.ARRAY;
		SortingHelper.printArray(arr);
		int n = arr.length;

		// One by one move boundary of unsorted subarray
		for (int i = 0; i < n - 1; i++) {
			// Find the minimum element in unsorted array
			int min_idx = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[min_idx])
					min_idx = j;
			}
			// Swap the found minimum element with the first
			// element
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}

		SortingHelper.printArray(arr);
	}

}

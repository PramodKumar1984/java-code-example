package sorting;

public class HeapSorting {

	static void heapify(Integer arr[], int n, int i) {
		int largest = i;
		int l = 2 * i + 1;
		int r = 2 * i + 2;

		// if left child is larger than root
		if (l < n && arr[l] > arr[largest])
			largest = l;

		// if right child is larger than largest so far
		if (r < n && arr[r] > arr[largest])
			largest = r;

		// if largest is not root
		if (largest != i) {
			// swap(arr[i], arr[largest]);

			// recursively heapify the affected sub-tree
			heapify(arr, n, largest);
		}
	}

	static void heapSort(Integer arr[]) {
		int n = arr.length;
		// build heap (rearrange array)
		for (int i = n / 2 - 1; i >= 0; i--) {
			heapify(arr, n, i);
		}
		// one by one extract an element from heap
		for (int i = n - 1; i >= 0; i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			// call max heapify on the reduced heap
			heapify(arr, i, 0);
		}
	}

	public static void main(String[] args) {
		Integer arr[] = SortingHelper.ARRAY;
		heapSort(arr);
		SortingHelper.printArray(arr);
	}

}

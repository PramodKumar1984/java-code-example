package sorting;

public class MergeSorting {

	public static void main(String [] args) {
		Integer arr[] = {14, 7, 3, 12, 9, 11, 6, 12} ; //SortingHelper.ARRAY;
		// SortingHelper.printArray(arr);
		//int n = arr.length;
		mergeSort(arr, 0, arr.length-1);
		SortingHelper.printArray(arr);
	}
	
	 private static void mergeSort(Integer a[], int p, int r) {
		int q;
		if (p < r) {
			q = (p + r) / 2;
			mergeSort(a, p, q);
			mergeSort(a, q + 1, r);
			merge(a, p, q, r);
		}
	}

	// function to merge the subarrays
	private static void merge(Integer a[], int p, int q, int r) {
		int b[] = new int[a.length]; // same size of a[]
		int i, j, k;
		k = 0;
		i = p;
		j = q + 1;
		while (i <= q && j <= r) {
			if (a[i] < a[j]) {
				b[k++] = a[i++]; // same as b[k]=a[i]; k++; i++;
			} else {
				b[k++] = a[j++];
			}
		}

		while (i <= q) {
			b[k++] = a[i++];
		}

		while (j <= r) {
			b[k++] = a[j++];
		}

		for (i = r; i >= p; i--) {
			a[i] = b[--k]; // copying back the sorted list to a[]
		}
	}

}

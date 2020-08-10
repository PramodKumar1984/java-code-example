package sorting;

public class InsertionSorting {

	public static void main(String[] args) {
		Integer arr[] = SortingHelper.ARRAY;
		//SortingHelper.printArray(arr);
		int n = arr.length;

		for (int i = 1; i < n; i++) {

			int j = i - 1;
			while (j > 0 && arr[j - 1] > arr[j]) {
				int key = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = key;
				j--;
			}
			System.out.println("value of i ---" + i);
			SortingHelper.printArray(arr);
		}
		//SortingHelper.printArray(arr);
	}

}

package sorting;

public class BubbleSorting {

	public static void main(String[] args) {
		Integer arr[] = SortingHelper.ARRAY;
		SortingHelper.printArray(arr);
		int n =  arr.length;
		for(int i = 0 ;i < n-1;i++) {
			for(int j = i ;j < n-i-1 ; j++) {
				if(arr[j] > arr[j+1]) {
					Integer temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			SortingHelper.printArray(arr);
		}
		SortingHelper.printArray(arr);
	}
	
	
}

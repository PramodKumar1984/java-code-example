package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import sorting.SortingHelper;

public class ArrayExp {

	public static void main(String [] args) {
		int arr[] = {10,4,5,10,1,2,5};
		List<Integer> check = new ArrayList<>();
		for (int i = 0; i <arr.length-1 ;i++) {
			if(!check.contains(arr[i])) {
				check.add(arr[i]);
			}
		}
		//Arrays.asList(arr).stream().forEach(e-> System.out.println(e));
		
		//Arrays.sort(arr);
		//Arrays.asList(arr).stream().distinct().forEach(e -> System.out.println(e));;
		//Arrays.asList(arr).stream().forEach(e-> System.out.println(e));
		//check.stream().forEach(e -> System.out.println(e));;
		removeDuplicateElements(arr);
		//System.out.println( "" + arr.length);
	}

	public static int removeDuplicateElements1(int arr[], int n){  
        if (n==0 || n==1){  
            return n;  
        }  
        int[] temp = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[n-1];     
        // Changing original array  
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }  
        return j;  
    } 
	
	
	public static void removeDuplicateElements(int arr[]){  
        int n = arr.length;
        for (int i=0; i<n-1; i++){  
        	for(int j = i+1 ; j<n;j++) {
            	if (arr[i] == arr[j]){  
                    
            		System.out.print("found match at " + i +"-"+ j );
            		for(int k = j ;k < n-1 ;k++) {
                    	arr[k] = arr[k++];
                    	 System.out.println("arr[j] -- " + j +"--"+ arr[j] + " a[k]" +  k + arr[k]);
                    }
                    for(Integer a : arr) {
            			System.out.print(a+"||");
            		}
                }
            	
            	
            	
            }
        	  
         } 
        
        for(Integer a : arr) {
			System.out.print(a+"--");
		}
    } 
	
	
	
	
}

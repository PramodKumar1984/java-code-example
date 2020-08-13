package stringAnalytics;

import java.util.Arrays;

import sorting.SortingHelper;

public class StringPermutation {

	public static void main(String[] args) {
		System.out.println(permutation("divya", "ivday"));
	}

	static boolean permutation(String a ,String b) {
		if(a.length() != b.length()) {
			return false;
		}
		return sort(a).equals(sort(b));
		
	}
	
	static String sort(String a) {
		char[] char_array = a.toCharArray();
		Arrays.sort(char_array);
		SortingHelper.printStringArray(char_array);
		return new String (char_array);
	}
}

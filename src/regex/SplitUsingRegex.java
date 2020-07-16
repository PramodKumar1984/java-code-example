package regex;

import java.util.Arrays;

public class SplitUsingRegex {
	public static void main(String [] args) {
		String regex = "[0-9|\\p{Punct}]";
		String [] orignials = {"Pramod!Kumar","fname@lname","Pramod1Kumar"};
		for (String orginal : orignials ) {
			String[] split = orginal.split(regex);
			Arrays.asList(split).stream().forEach(o -> System.out.println("Characters " + o));	
		}
	}
}

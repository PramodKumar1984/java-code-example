package stringAnalytics;

public class ReplaceSpaceWithChar {
	public static void main(String[] args) {
		
		String s = "My Jone ";
		 s = new String(replaceChar(s.toCharArray(), s.length()));
		System.out.println(s);
	}

	static char[] replaceChar(char[] str, int trueLength) {
		int spaceCount = 0, index, i = 0;
		for (i = 0; i < trueLength; i++) {
			if (str[i] == ' ') {
				spaceCount++;
			}
		}

		index = trueLength + spaceCount * 2;
		char[] newChar = new char[index];
		for (i = trueLength - 1; i >= 0; i--) {
			if (str[i] == ' ') {
				newChar[index - 1] = '0';
				newChar[index - 2] = '2';
				newChar[index - 3] = '%';
				index = index - 3;

			} else {
				newChar[index - 1] = str[i];
				index--;
			}
		}
		return newChar;
	}

}

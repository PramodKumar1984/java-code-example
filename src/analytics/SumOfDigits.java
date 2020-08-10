package analytics;

public class SumOfDigits {
	public static void main(String[] args) {

		System.out.println(returnsum(9999));

	}

	public static int returnsum(Integer a) {
		int sum = 0;
		while (a != 0 ) {
			sum = sum + a % 10;
			a = a / 10;
			if (sum >= 10 && a == 0) {
				a = sum;
				sum =0;
			}
		}

		return sum;
	}

}

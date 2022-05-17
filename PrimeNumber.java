package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// To find whether a number is a Prime number or not
		// Prime numbers are numbers that have only 2 factors: 1 and themselves
		int input = 0;
		boolean flag = false;
		for (int i = 2; i <= input / 2; i++) {
			if (input % i == 0) {
				System.out.println("Not a Prime");
				flag = true;
			}
			break;
		}

		if (flag == false) {

			System.out.println("It's is Prime number");
		}
	}

}

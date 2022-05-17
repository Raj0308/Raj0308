package week1.day1;

public class FibonacciSeries {
	
	//a series of numbers where a number is the addition of the last two numbers, starting with 0, and 1
	//output: 0, 1, 1, 2, 3, 5, 8, 13

	public static void main(String[] args) {
		
		int firstNum = 0, secNum = 1;
		int sum;
		int range = 6;
		System.out.println(firstNum + ",");
		System.out.println(secNum + ",");
		for (int i = 1; i<= range; i++) {
			
			sum = firstNum + secNum;
			System.out.println(sum + ",");
			firstNum = secNum;
			secNum = sum;
		
		}
		

	}

}

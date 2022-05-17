package week1.day1;

public class ArmstrongNumber {
	//if the sum of its own digits raised to the power number of digits gives the number itself
	// (1*1*1)+(5*5*5)+(3*3*3) = 153
	//armstrong 0, 1, 153, 370, 371 and 407

	public static void main(String[] args) {
		int inputs = 407;
		int calc=0;
		int org = inputs;


		while (inputs>0) {

			int rem=inputs%10; // 153%10 (3)
			
			calc= calc + (rem * rem* rem);

			inputs=inputs/10; // 153/10 (15)
			
			}
		System.out.println(calc);
		
		if (org == calc) 
		{
			System.out.println("Armstrong number");
		}

			else
				System.out.println("Not an Armstrong number");
		
	}

}

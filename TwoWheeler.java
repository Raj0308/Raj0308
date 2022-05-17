package week1.day1;

public class TwoWheeler {
	
			int noOfWheels = 4;
			short noOfMirror = 2;
			long chassisNumber = 1524514L;
			boolean isPunctured = true;
			String bikeName ="Apache";
			double runningKM = 52436.26;

	
	public static void main(String[] args) {
		
	TwoWheeler myBike = new TwoWheeler();
	System.out.println(myBike.noOfWheels);
	System.out.println(myBike.noOfMirror);
	System.out.println(myBike.chassisNumber);
	System.out.println(myBike.isPunctured);
	System.out.println(myBike.bikeName);
	System.out.println(myBike.runningKM);
	
	}

}

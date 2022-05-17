package week1.day1;


public class Car {

	public void applyBreak() {
		System.out.println("apply break to car");
	}
	
	public void applyGear() {
		
		System.out.println("apply gear to car");
	}
	
	public void switchonAc() {
		
		System.out.println("switchonAc");
	}
	
	public void applyAcclerate() {
		
		System.out.println("applyAcclerate");
	}
	
	public static void main(String[] args) {
		
		Car car = new Car();
		car.applyBreak();
		car.applyGear();
		car.switchonAc();
		car.applyAcclerate();
		

	}

}

package oopsConcepts;

public class CarTest {
	public static void main(String[] args) {
		Car car1 = new ManualCar();
		car1.turnOnCar();
		car1.turnOffCar();
		System.out.println(car1.getCarType());
		
		
		Car car2 = new AutomaticCar();
		car2.turnOnCar();
		car2.turnOffCar();
		System.out.println(car2.getCarType());

	}
}

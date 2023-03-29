package oopsConcepts;

public class Encapsulation_Animal_child {
	public static void main(String args[]) {
		
		// create an object of Encapsulation_Animal
		Encapsulation_Animal a1 = new Encapsulation_Animal();
		// change age using setter
		a1.setAge(45);
		// access age using getter
		System.out.println("animal age is " + a1.getage());
	}
}

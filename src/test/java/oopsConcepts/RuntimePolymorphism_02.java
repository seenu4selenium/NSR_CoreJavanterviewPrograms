package oopsConcepts;

//This is a perfect example of polymorphism(feature that allows us to perform 
//a single action in different ways).It would not make any sense to just call
//the generic sound()method as each Animal has a different sound.Thus we can
//say that the action this method performs is based on the type of object.

public class RuntimePolymorphism_02 extends RuntimePolymorphism_01 {
	@Override
	public void sound() {
		System.out.println("child");
		System.out.println("Neigh");
	}

	public static void main(String args[]) {
		RuntimePolymorphism_01 obj = new RuntimePolymorphism_02();
		obj.sound();
	}
}

package oopsConcepts;

public class ConstructorsSample {
	// Create a class attribute
	int x;

	// Create a class constructor for the Main class
	public ConstructorsSample() {
		// Set the initial value for the class attribute x
		x = 5;
	}

	public static void main(String[] args) {
		// Create an object of class Main (This will call the constructor)
		ConstructorsSample myObj = new ConstructorsSample();
		// Print the value of x
		System.out.println(myObj.x);
	}

}

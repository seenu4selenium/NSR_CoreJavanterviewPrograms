package oopsConcepts;

public class ConstructorsSampleNew {
	int modelYear;
	String modelName;

	// Constructor Parameters
	public ConstructorsSampleNew(int year, String name) {
		modelYear = year;
		modelName = name;
	}

	public static void main(String[] args) {
		ConstructorsSampleNew myCar = new ConstructorsSampleNew(2019, "Renault Triber");
		System.out.println(myCar.modelYear + " " + myCar.modelName);
	}
}

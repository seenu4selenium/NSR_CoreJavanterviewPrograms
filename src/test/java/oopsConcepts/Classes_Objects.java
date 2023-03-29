package oopsConcepts;

public class Classes_Objects {

	int x = 5;

	public static void main(String[] args) {
		Classes_Objects myObj = new Classes_Objects();
		System.out.println(myObj.x);
		
		//Modify Attributes
		myObj.x = 6;
		System.out.println(myObj.x);

		
		// Object creation for Classes_ObjectsNew
		Classes_ObjectsNew myObj1 = new Classes_ObjectsNew(); 		
		System.out.println(myObj1.a);
	
	}

}

package oopsConcepts;

public class Abstract_Child_Animal extends Abstract_Parent_Animal {

	public void sound() {
		System.out.println("roar");
	}

	public static void main(String args[]) {
		Abstract_Parent_Animal obj = new Abstract_Child_Animal();
		obj.sound();
	}

}

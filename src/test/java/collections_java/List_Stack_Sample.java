package collections_java;

import java.util.*;

public class List_Stack_Sample {
	public static void main(String args[]) {
		Stack<String> stack = new Stack<>();

		// push() method adds the element in the stack
		// and pop() method removes the element from the stack
		stack.push("Sreenivas"); // ["Sreenivas"]
		stack.push("Ajeet"); // ["Sreenivas", Ajeet]
		stack.push("Hari"); // ["Sreenivas", "Ajeet", "Hari"]
		stack.pop(); // removes the last element
		stack.push("Steve"); // ["Sreenivas", "Ajeet", "Steve"]
		stack.push("Carl"); // ["Sreenivas", "Ajeet", "Steve", "Carl"]
		stack.pop(); // removes the last element

		System.out.println("Stack elements: ");
		for (String str : stack) {
			System.out.println(str);
		}
	}
}

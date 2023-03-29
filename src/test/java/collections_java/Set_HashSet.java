package collections_java;

import java.util.HashSet;
import java.util.Iterator;

public class Set_HashSet {
	public static void main(String args[]) {

		HashSet<String> set = new HashSet<>();
		set.add("Sreeni");
		set.add("Ram");
		set.add("Dhruvan");
		set.add("Pallavi");
		set.add("Eekshita");

		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}

package collections_java;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Set_LinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<String> set = new LinkedHashSet<>();
		set.add("Paul");
		set.add("Ram");
		set.add("Aaron");
		set.add("Leo");
		set.add("Becky");

		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}
	}
}

package collections_java;

import java.util.Iterator;
import java.util.TreeSet;

public class Set_TreeSet {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();
		set.add("Paul");
		set.add("Ram");
		set.add("Aaron");
		set.add("Sreeni");
		set.add("Becky");

		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
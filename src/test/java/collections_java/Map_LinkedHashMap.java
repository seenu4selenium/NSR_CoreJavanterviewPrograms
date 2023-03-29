package collections_java;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Map_LinkedHashMap {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> hmap = new LinkedHashMap<>();

		// key and value pairs
		hmap.put(100, "Sreenivas");
		hmap.put(120, "Paul");
		hmap.put(105, "Derick");
		hmap.put(111, "Logan");

		// print LinkedHashMap elements
		Set set = hmap.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry m = (Map.Entry) iterator.next();
			System.out.print("key is: " + m.getKey() + " & Value is: ");
			System.out.println(m.getValue());
		}
	}
}
package coreJavaProgramsForInterview;
/***************************************
 * Program: Duplicate Char In String 
 * Written by: Sreenivas from www.h2otestingtools.com
 **************************************/

import java.util.HashMap;
import java.util.Map;

public class CoreJava_19_DuplicateCharInString {
	public static void main(String[] args) {
		String string1 = "SeleniumSi";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < string1.length(); i++) {
			char c = string1.charAt(i);
			if (map.containsKey(c)) {
				int cnt = map.get(c);
				map.put(c, ++cnt);
			} else {
				map.put(c, 1);
			}
		}
		System.out.println(map);

	}
}

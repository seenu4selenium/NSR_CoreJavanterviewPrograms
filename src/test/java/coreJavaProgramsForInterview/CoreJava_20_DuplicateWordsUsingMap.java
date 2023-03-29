package coreJavaProgramsForInterview;
/***************************************
 * Program: Password Generation
 * Written by: Sreenivas from www.h2otestingtools.com
 * *************************************/
import java.util.HashMap;
import java.util.Map;

public class CoreJava_20_DuplicateWordsUsingMap {
	public static void main(String[] args) {
		String str = "report Selenium is Automation Automation Framework . testNG is report tool for Selenium";

		String[] words = str.toLowerCase().trim().split(" ");

		Map<String, Integer> duplicateString = new HashMap<String, Integer>();
		int count = 1;

		for (String x : words) {
                                             
			if (duplicateString.containsKey(x)) {
				duplicateString.put(x, duplicateString.get(x) + 1);
			} else {
				duplicateString.put(x, count);
			}
		}
		System.out.println("Duplicate Words in a String : ");
		for (Map.Entry a : duplicateString.entrySet()) {
			int val = (Integer) a.getValue();
			if (val > 1) {
				System.out.println(a);
			}
		}
	}
}

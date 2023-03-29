package coreJavaProgramsForInterview;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/***************************************
 * Program: Reverse String Using String List 
 * Written by: Sreenivas from www.h2otestingtools.com
 * *************************************/

public class CoreJava_15_ReverseStringUsingList {
	public static void main(String[] args) {
		String str = "seenu4selenium";
		List<Character> charList = new ArrayList<>();
		for (char c : str.toCharArray()) {
			charList.add(c);
		}
		Collections.reverse(charList);
		System.out.println(str);
		for (Character ch : charList) {
			System.out.print(ch);
		}
	}
}

package coreJavaProgramsForInterview;

/***************************************
 * Program: Reverse String Using String Recursion 
 * Written by: Sreenivas
 * www.h2otestingtools.com
 * *************************************/

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CoreJava_14_ReverseStringUsingRecursion {
	private static String getReverseString(char[] chArr, int len, String revStr) {
		if (len < 0) {
			return revStr;
		}
		revStr = revStr + chArr[len];
		return getReverseString(chArr, --len, revStr);
	}

	public static void main(String[] args) {
		String str = "seenu4selenium";
		System.out.println(getReverseString(str.toCharArray(), str.length() - 1, ""));
	}
}

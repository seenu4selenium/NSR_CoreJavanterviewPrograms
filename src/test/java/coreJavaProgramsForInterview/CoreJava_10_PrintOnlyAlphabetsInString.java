package coreJavaProgramsForInterview;
/***************************************
 * Program: Print Only Alphabets In String
 * Written by: Sreenivas
 * www.h2otestingtools.com
 * *************************************/
import java.util.Iterator;

public class CoreJava_10_PrintOnlyAlphabetsInString {

	public static void main(String[] args) {
		// input: a2b3c1
		// output: aabbbc
		String abc = "a1b2c4T2";
		System.out.println(abc.length());
		
		for (int i = 0; i < abc.length(); i++) {
			if (Character.isAlphabetic(abc.charAt(i))) {
				System.out.print(abc.charAt(i));			
			} else {
				int x = Character.getNumericValue(abc.charAt(i));
				for (int j = 1; j < x; j++) {
					System.out.print(abc.charAt(i-1));					
				}
			}
		}
	}
	
}

package coreJavaProgramsForInterview;

/***************************************
 * Program: Reverse String Using String Swapping 
 * Written by: Sreenivas
 * www.h2otestingtools.com
 * *************************************/
public class CoreJava_13_ReverseStringUsingSwapping {
	public static void main(String[] args) {
		String word = "seenu4selenium";
		char chArr[] = word.toCharArray();

		for (int i = 0; i <= word.length() - 1; i++) {
			int revPos = word.length() - (i + 1);
			if (i < (revPos)) {
				char temp = chArr[i];
				chArr[i] = chArr[revPos];
				chArr[revPos] = temp;
			}
		}
		System.out.println("Actual String is: " + word);
		for (char c : chArr) {
			System.out.print(c);
		}
	}
}

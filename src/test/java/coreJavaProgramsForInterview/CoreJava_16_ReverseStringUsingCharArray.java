package coreJavaProgramsForInterview;
/***************************************
 * Program: Reverse String Using Array 
 * Written by: Sreenivas
 * www.h2otestingtools.com
 **************************************/
public class CoreJava_16_ReverseStringUsingCharArray {
	public static void main(String[] args) {
		String word = "seenu4selenium";
		String reversed = "";
		char ch[] = word.toCharArray();

		for (int i = word.length() - 1; i >= 0; i--) {
			reversed = reversed + ch[i];
		}
		System.out.println("Actual String is: "+ word);
		System.out.println( "Reversed String is : " + reversed);
	}
}

package coreJavaProgramsForInterview;

/***************************************
 * Program: Reverse String Using String Builder 
 * Written by: Sreenivas
 * www.h2otestingtools.com
 * *************************************/
public class CoreJava_12_ReverseStringUsingStringBuilder {
	public static void main(String[] args) {
		String word = "seenu4selenium";
		StringBuilder str = new StringBuilder(word);
		System.out.println(str.reverse());
	}
}

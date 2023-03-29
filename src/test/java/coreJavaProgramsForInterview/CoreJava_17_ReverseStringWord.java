package coreJavaProgramsForInterview;

/***************************************
 * Program: Reverse String Word 
 * Written by: Sreenivas 
 * www.h2otestingtools.com
 **************************************/
public class CoreJava_17_ReverseStringWord {
	public static void main(String[] args) {
		String abc = "Hi All how are you";
		String reverse = "";
		for (int i = 0; i < abc.length(); i++) {
			char a = abc.charAt(i);
			reverse = a + reverse;
		}
		System.out.println(reverse);//uoy era woh llA iH

	}
}

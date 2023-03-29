package coreJavaProgramsForInterview;

/***************************************
 * Program: Reverse String Using String Buffer 
 * Written by: Sreenivas 
 * www.h2otestingtools.com
 *************************************/
public class CoreJava_11_ReverseStringUsingStringBuffer {
	public static void main(String[] args) {
		String word = "seenu4selenium";
		
		StringBuffer str = new StringBuffer(word);
		System.out.println(str.reverse());
	}
}

package coreJavaProgramsForInterview;
/***************************************
 * Program: Remove All White Spaces In String
 * Written by: Sreenivas from www.h2otestingtools.com
 * *************************************/
public class CoreJava_22_RemoveAllWhiteSpacesInString {
	public static void main(String[] args) {
	    String str="Hi, Selenium is Automation tool ";
	    System.out.println("Original String:" + str);
	    //Using regex inside replaceAll() method to replace space with blank
	    str = str.replaceAll("\\s+", "");
	    System.out.println("String after white spaces are removed:" + str);
	  }
}

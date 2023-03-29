package coreJavaProgramsForInterview;

/***************************************
 * Program: String Split 
 * Written by: Sreenivas from www.h2otestingtools.com
 **************************************/
public class CoreJava_18_StringSplit {

	public static void main(String[] args) {
		String str = "one,two,three,325435,#$%$#5,adfadf324324";
		String[] temp;

		String regularexpression = ",";
		temp = str.split(regularexpression);
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}

		System.out.println("*************************");
		str = "one#two#three#eryreyre$dfgdfhdf";
		regularexpression = "#";
		temp = str.split(regularexpression);
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}

		System.out.println("**********************************");
		temp = str.split(regularexpression, 2);
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}
	}
}

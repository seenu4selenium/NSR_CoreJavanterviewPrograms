package coreJavaProgramsForInterview;

/***************************************
 * Program: Count Vowels And Consonants
 * Written by: Sreenivas
 * www.h2otestingtools.com
 **************************************/
public class CoreJava_06_CountVowelsAndConsonants {

	public static void main(String[] args) {
		String str = "Hi all welcome to Selenium";
		int vCount = 0;
		int cCount = 0;
		int whiteSpace = 0;
		/// Convert String to lower case
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vCount++;
			} else if (ch >= 'a' && ch <= 'z') {
				cCount++;
			} else {
				whiteSpace++;
			}

		}
		System.out.println("vCount is: " + vCount);
		System.out.println("cCount is: " + cCount);
		System.out.println("whiteSpace is: " + whiteSpace);

	}

}

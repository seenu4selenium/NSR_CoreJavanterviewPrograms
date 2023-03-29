package coreJavaProgramsForInterview;

//Write a program in Java to Toggle the case of every character of a string. 

//For instance, if the input string is “ApPLe”, the output should be “aPplE”.

public class ToggleCase {
	public static void main(String[] args) {
		String str = "ApPlE";
		StringBuilder res = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				res.append((char) (ch + 32));
			} else if (ch >= 'a' && ch <= 'z') {
				res.append((char) (ch - 32));
			} else {
				res.append(ch);
			}
		}

		String ans = res.toString();
		System.out.println("The string after toggling becomes: " + ans);
	}
}
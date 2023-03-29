package coreJavaProgramsForInterview;

/***************************************
 * Program: Duplicate Words Without Using Map Written by: Sreenivas from
 * www.h2otestingtools.com
 *************************************/

public class CoreJava_21_DuplicateWordsWithoutUsingMap {
	public static void main(String[] args) {
		String str = "Selenium is Automation Framework. Selenium testNG jUnit selenium is";
		String duplicate = "";
		int count;
		
		//String[] words = str.split(" ");
		//String spit the nstore it into Array[words]
		String[] words = str.toLowerCase().split(" ");

		System.out.println(str.length());//67
		System.out.println(words.length);//9
		
		
		for (int i = 0; i < str.length(); i++) {
			count = 1;
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					count++;
				}
			}
			if (count > 1) {
				if (duplicate.isEmpty()) {
					duplicate += " " + words[i] + " : " + count;
				} else if (!duplicate.matches("(.*) " + words[i] + " (.*)")) {
					duplicate += " " + words[i] + " : " + count;
				}
			}
		}
		System.out.println(duplicate);

	}
}

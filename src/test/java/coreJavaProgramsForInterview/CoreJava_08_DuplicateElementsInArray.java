package coreJavaProgramsForInterview;

/***************************************
 * Program: Duplicate Elements In Array 
 * Written by: Sreenivas 
 * www.h2otestingtools.com
 *************************************/
public class CoreJava_08_DuplicateElementsInArray {

	public static void main(String[] args) {
		int[] numbers = new int[] { 2, 4, 6, 8, 4, 6, 10, 10 };
		System.out.println("Duplicate elements in given array are: ");
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] == numbers[j]) {
					System.out.println("duplicate : " + numbers[j]);
				}
			}
		}
	}
}
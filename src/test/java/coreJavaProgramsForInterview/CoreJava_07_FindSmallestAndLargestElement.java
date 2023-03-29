package coreJavaProgramsForInterview;

/***************************************
 * Program: Find Smallest And Largest Element 
 * Written by: Sreenivas 
 * www.h2otestingtools.com
 *************************************/
public class CoreJava_07_FindSmallestAndLargestElement {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 3, 8, 1, 12, 7, 99, 847,1200 };
		
		int smallestElement = arr[0];// 1
		int largestElement = arr[0];// 8

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < smallestElement) {
				smallestElement = arr[i];
			}
			if (arr[i] > largestElement) {
				largestElement = arr[i];
			}
		}
		System.out.println("Smallest element of given array: " + smallestElement);
		System.out.println("Largest element of given array: " + largestElement);

	}

}

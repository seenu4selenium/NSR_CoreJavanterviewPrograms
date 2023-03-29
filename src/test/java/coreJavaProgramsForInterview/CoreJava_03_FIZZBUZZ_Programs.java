package coreJavaProgramsForInterview;
/***************************************
 * Program: FIZZBUZZ_Programs
 * Written by: Sreenivas from www.h2otestingtools.com
 * Print Fizz for 3 Divisible number
 * Print Buzz for 5 Divisible number
 * Print FizzBuzz for both 3&5 Divisible number
 * *************************************/
import java.util.Iterator;

public class CoreJava_03_FIZZBUZZ_Programs {
	public static void main(String[] args) {
		

		for (int i = 1; i <= 52; i++) {
			
			if (i % 5 == 0 || i % 3 == 0) {
				if (i % 5 == 0 && i % 3 == 0) {
					System.out.println("FizzBuzz");
				} else if (i % 3 == 0) {
					System.out.println("Fizz");
				} else if (i % 5 == 0) {
					System.out.println("Buzz");
				}
			} else {
				System.out.println(i);
			}

		}
	}

}

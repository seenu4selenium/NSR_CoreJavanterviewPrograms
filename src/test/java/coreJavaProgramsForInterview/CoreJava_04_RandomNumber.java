package coreJavaProgramsForInterview;

/***************************************
 * Program: RandomNumber with Minimum to Maximum based user inputs
 * Written by: Sreenivas from www.h2otestingtools.com
 * *************************************/
import java.util.Random;

import io.netty.util.internal.ThreadLocalRandom;

public class CoreJava_04_RandomNumber {
	public static void main(String[] args) {
		// Print an random number from 0 to 100
		Random r = new Random();
		int ranNum = r.nextInt(100);
		System.out.println(ranNum);

		// Print an random number from Minimum to Maximum based user inputs
		System.out.println("randomNumberBasedOnUserInputs: ");
		randomNumberBasedOnUserInputs(200, 4563);
	}

	public static int randomNumberBasedOnUserInputs(int minimum, int maximum) {
		int randomNum = ThreadLocalRandom.current().nextInt(minimum, maximum + 1);
		System.out.println(randomNum);
		return randomNum;
	}
}

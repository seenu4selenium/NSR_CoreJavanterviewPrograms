package coreJavaProgramsForInterview;
/***************************************
 * Program: Password Generation
 * Written by: Sreenivas
 * www.h2otestingtools.com
 * *************************************/
import java.util.Random;

public class CoreJava_09_PasswordGeneration {

// 'Password must have a minimum of 8 characters,
//	at least one digit (0-9),
//	one lowercase character (a-z)
//	and one uppercase character (A-Z),
//	one special character (!@#$%^&*)

	public static char[] generatePassword(int length) {
		String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
		String specialCharacters = "(!@#$%^&*)";
		String numbers = "1234567890";
		
		String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;

		Random random = new Random();
		char[] password = new char[length];//5pG#

		for (int i = 0; i < 4; i++) {
			password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
		}
		password[4] = numbers.charAt(random.nextInt(numbers.length()));
		password[5] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
		password[6] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
		password[7] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));

		return password;
	}

	public static void main(String[] args) {
		System.out.println(generatePassword(8));
	}


}

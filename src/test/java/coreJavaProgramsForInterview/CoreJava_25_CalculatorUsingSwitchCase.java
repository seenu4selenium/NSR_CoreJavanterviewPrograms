package coreJavaProgramsForInterview;

/************************************
 * Program: Calculator using switch case
 * Written by: Sreenivas from www.h2otestingtools.com
 * *************************************/
import java.util.Scanner;

public class CoreJava_25_CalculatorUsingSwitchCase {
	public static void main(String[] args) {

		double num1;
		double num2;
		char operatorSign;
		double output;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter first number: ");
		num1 = scanner.nextDouble();

		System.out.print("Enter second number: ");
		num2 = scanner.nextDouble();

		System.out.print("Enter an operator in bitween (+, -, *, /) : ");
		operatorSign = scanner.next().charAt(0);

		switch (operatorSign) {
		case '+':
			output = num1 + num2;
			break;

		case '-':
			output = num1 - num2;
			break;

		case '*':
			output = num1 * num2;
			break;

		case '/':
			output = num1 / num2;
			break;

		// If user enters any other operator or char apart from above,
		// then display an error message to user
		default:
			System.out.printf("You have entered wrong operator");
			return;
		}
		System.out.println("The Results is : ");
		System.out.println(num1 + " " + operatorSign + " " + num2 + ": " + output);
	}

}

import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Main {

	static Scanner scanner = new Scanner(System.in);

	public static String checkForOperationValidity(String check) {

		// Scanner scanner = new Scanner(System.in);

		while (check.toUpperCase().equals("A") == false && check.toUpperCase().equals("S") == false
				&& check.toUpperCase().equals("M") == false && check.toUpperCase().equals("D") == false
				&& check.toUpperCase().equals("P") == false && check.toUpperCase().equals("E") == false
				&& check.toUpperCase().equals("R") == false && check.toUpperCase().equals("Q") == false) {

			System.out.println();
			System.out.println("I am sorry, but your input is invalid. Please enter input in form described below:");
			System.out.println();
			System.out.println("Which operation would you like to perform:");
			System.out.println();
			System.out.println("A(Add), S(Subtract), M(Multipy), D(Divide),");
			System.out.println("P(Mod), E(Raise to Exponent), R(Find nth root)");
			System.out.print("Q(Quit): ");

			check = scanner.nextLine();

			check = check.toUpperCase();

		}

		// scanner.close();

		return check;
	}

	public static ArrayList<String> parseForOperation(Operations op) {

		ArrayList<String> converts = new ArrayList<String>();

		String firstinput;
		String secondinput;

		boolean isNumber = false;

		// Scanner scanner = new Scanner(System.in);

		if (op == Operations.ADD) {

			System.out.print("Please enter the first number you would like to Add: ");

			firstinput = scanner.nextLine();

			isNumber = checkDouble(firstinput);

			firstinput = ensureDouble(isNumber, firstinput);

			converts.add(firstinput);

			System.out.println();
			System.out.print("Please enter the second number you would like to Add: ");

			secondinput = scanner.nextLine();

			isNumber = checkDouble(secondinput);

			secondinput = ensureDouble(isNumber, secondinput);

			converts.add(secondinput);

		} else if (op == Operations.SUBTRACT) {

			System.out.print("Please enter the first number you would like to Subtract: ");

			firstinput = scanner.nextLine();

			isNumber = checkDouble(firstinput);

			firstinput = ensureDouble(isNumber, firstinput);

			converts.add(firstinput);
			System.out.println();
			System.out.print("Please enter the second number you would like to Subtract: ");

			secondinput = scanner.nextLine();

			isNumber = checkDouble(secondinput);

			secondinput = ensureDouble(isNumber, secondinput);

			converts.add(secondinput);
		} else if (op == Operations.MULIPY) {

			System.out.print("Please enter the first number you would like to Multipy: ");

			firstinput = scanner.nextLine();

			isNumber = checkDouble(firstinput);

			firstinput = ensureDouble(isNumber, firstinput);

			converts.add(firstinput);
			System.out.println();
			System.out.print("Please enter the second number you would like to Multipy: ");

			secondinput = scanner.nextLine();

			isNumber = checkDouble(secondinput);

			secondinput = ensureDouble(isNumber, secondinput);

			converts.add(secondinput);
		} else if (op == Operations.DIVIDE) {

			System.out.print("Please enter the numerator: ");

			firstinput = scanner.nextLine();

			isNumber = checkDouble(firstinput);

			firstinput = ensureDouble(isNumber, firstinput);

			converts.add(firstinput);
			System.out.println();
			System.out.print("Please enter the Denominator: ");

			secondinput = scanner.nextLine();

			isNumber = checkDouble(secondinput);

			secondinput = ensureDouble(isNumber, secondinput);

			while (secondinput.equals("0")) {

				System.out.print("Cannot divide by zero! Please change Denominator. : ");
				secondinput = scanner.nextLine();
				secondinput = ensureDouble(isNumber, secondinput);

			}

			converts.add(secondinput);
		} else if (op == Operations.MOD) {

			System.out.print("Please enter the first number you would like to perform modulo division for: ");

			firstinput = scanner.nextLine();

			isNumber = checkDouble(firstinput);

			firstinput = ensureDouble(isNumber, firstinput);

			converts.add(firstinput);
			System.out.println();
			System.out.print("Please enter the second number you would like to perform modulo division for:: ");

			secondinput = scanner.nextLine();

			isNumber = checkDouble(secondinput);

			secondinput = ensureDouble(isNumber, secondinput);

			converts.add(secondinput);
		} else if (op == Operations.EXPONANT) {

			System.out.print("Please enter the first number you would like to raise to an exponant: ");

			firstinput = scanner.nextLine();

			isNumber = checkDouble(firstinput);

			firstinput = ensureDouble(isNumber, firstinput);

			converts.add(firstinput);
			System.out.println();
			System.out.print("Please enter the number you would like to raise this to: ");

			secondinput = scanner.nextLine();

			isNumber = checkDouble(secondinput);

			secondinput = ensureDouble(isNumber, secondinput);

			converts.add(secondinput);
		} else if (op == Operations.ROOT) {

			System.out.print("Please enter the first number for which you would like to find the nth root: ");

			firstinput = scanner.nextLine();

			isNumber = checkDouble(firstinput);

			firstinput = ensureDouble(isNumber, firstinput);

			converts.add(firstinput);
			System.out.println();
			System.out.print("Please enter the root to which you would like this calculated: ");

			secondinput = scanner.nextLine();

			isNumber = checkDouble(secondinput);

			secondinput = ensureDouble(isNumber, secondinput);

			converts.add(secondinput);
		}

		// scanner.close();

		return converts;

	}

	public static boolean checkDouble(String str) {

		Double value = null;
		boolean isDouble = false;

		try {
			value = Double.parseDouble(str);

		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}

	public static String ensureDouble(boolean isNumber, String input) {

		while (isNumber == false) {
			System.out.print("Please try again: ");
			System.out.println();

			input = scanner.nextLine();

			isNumber = checkDouble(input);
		}

		return input;

	}

	public static Operations operationCheck(String check) {

		Operations op = null;

		if (check.equals("A")) {
			op = Operations.ADD;
		} else if (check.equals("S")) {
			op = Operations.SUBTRACT;
		} else if (check.equals("M")) {
			op = Operations.MULIPY;
		} else if (check.equals("D")) {
			op = Operations.DIVIDE;
		} else if (check.equals("P")) {
			op = Operations.MOD;
		} else if (check.equals("E")) {
			op = Operations.EXPONANT;
		} else if (check.equals("R")) {
			op = Operations.ROOT;
		} else {
			op = null;

		}

		return op;

	}

	public static ArrayList<String> homeMenu() {

		ArrayList<String> converts = new ArrayList<String>();

		String firstinput;
		String secondinput;

		String operation = "";

		Operations op;

		// Scanner scanner = new Scanner(System.in);

		System.out.println("Hello, welcome to the text calculator");
		System.out.println();
		System.out.println("Which operation would you like to perform:");
		System.out.println();
		System.out.println("A(Add), S(Subtract), M(Multipy), D(Divide),");
		System.out.println("P(Mod), E(Raise to Exponent), R(Find nth root)");
		System.out.print("Q(Quit) : ");

		operation = scanner.nextLine();

		System.out.println();

		operation = operation.toUpperCase();

		System.out.println();

		operation = checkForOperationValidity(operation);

		op = operationCheck(operation);

		// System.out.println("Check for Cap " + operation);

		converts = parseForOperation(op);

		converts.add(0, operation);

		// scanner.close();

		return converts;

	}

	public static void main(String[] args) {

		Calculator cal = new Calculator();

		double firstoperand = 0;
		double secondoperand = 0;

		double result = 0;

		String selection = "";

		ArrayList<String> converts = new ArrayList<String>();

		while (selection.equals("Q") == false) {

			converts = homeMenu();

			selection = converts.get(0);

			if (selection.equals("Q") == false) {

				// System.out.println("Final selection check: " + selection);

				firstoperand = Double.parseDouble(converts.get(1));
				secondoperand = Double.parseDouble(converts.get(2));

				if (selection.equals("A")) {
					result = cal.add(firstoperand, secondoperand);
				} else if (selection.equals("S")) {
					result = cal.subtract(firstoperand, secondoperand);
				} else if (selection.equals("M")) {
					result = cal.multiply(firstoperand, secondoperand);
				} else if (selection.equals("D")) {
					result = cal.divide(firstoperand, secondoperand);
				} else if (selection.equals("P")) {
					result = cal.mod(firstoperand, secondoperand);
				} else if (selection.equals("E")) {
					result = cal.expontent(firstoperand, secondoperand);
				} else if (selection.equals("R")) {
					result = cal.root(firstoperand, secondoperand);
				} else if (selection.equals("Q")) {

					selection = "Q";
					System.out.println("whtaaskjdkj");

				} else {
					System.out.println("Something has gone wrong");
					result = 0;
				}

				// result = cal.root(firstoperand, secondoperand);
				System.out.println();
				System.out.println("Your result is: " + result);
				System.out.println();
				System.out.println();
				System.out.println();
			}
		}
		/*
		 * String expression = "3 + 4"; String delims = "[ ]+"; String[] tokens =
		 * expression.split(delims);
		 * 
		 * for (int i = 0; i < tokens.length; i++) {
		 * 
		 * System.out.println(tokens[i]); }
		 * 
		 */

		System.out.println("Thank you for using the text calculator. Goodbye.");

		scanner.close();

	}

}

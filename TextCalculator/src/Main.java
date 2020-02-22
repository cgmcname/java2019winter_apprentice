
import java.util.Scanner;
import java.io.*;
import java.util.*;

/**
 * <h1>Main</h1> The Main program provides the validation and interface for the
 * user in the Text Calculator. It has six methods in addition to the main
 * driver. The purpose of each of the methods will be further elaborated on
 * below, but in general the purpose is to input a operation you would like to
 * perform in the form of string and then input in succession two other string
 * values that will be changed to a double and then calculated using the
 * Calculator class.
 * 
 * 
 * @author Christopher McNames
 * 
 */

public class Main {

	static Scanner scanner = new Scanner(System.in);

	/**
	 * checkForOperationValidity purpose is to ensure that the String input matches
	 * the selections laid out in the user prompt. If one of these values is not
	 * matched the user will be prompted again asking them to input a value until
	 * something acceptable is found.
	 *
	 * @param check input String value that must match certain values
	 * 
	 * @return check ensured String value
	 * 
	 * @author Christopher McNames
	 */

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

	/**
	 * parseForOperation purpose is to give the user the correct prompt
	 * corresponding to the operation they have chosen. The given enum value sorts
	 * the prompt and a message that reflects the chosen operation comes up. The
	 * value is here input and sent to two functions checkDouble and ensureDouble to
	 * error check. When the String values have been collected they are placed in an
	 * ArrayList for further processing.
	 *
	 * @param op enum corresponding to a given operation
	 * 
	 * @return converts an ArrayList that will be converted to a double
	 * 
	 * @author Christopher McNames
	 */

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

		return converts;

	}

	/**
	 * checkDouble purpose is to check the truth condition of a given string’s
	 * ability to be converted to a double. If the string can be converted it
	 * responds with a true Boolean false if not.
	 *
	 * @param str String value to be tested for conversion to a double
	 * 
	 * @return true if condition is met, false if not
	 * 
	 * @author Christopher McNames
	 */

	public static boolean checkDouble(String str) {

		Double value = null;
		boolean isDouble = false;

		try {
			if (str.toUpperCase().equals("PI") == false && str.toUpperCase().equals("E") == false) {
				value = Double.parseDouble(str);
			}

		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}

	/**
	 * ensureDouble purpose is to give the user a chance to reinput incorrect
	 * values. If a given operand does not match computable values the user is
	 * prompted to reenter until appropriate inputs are found.
	 *
	 * @param isNumber boolean check for conversion to a double
	 * 
	 * @param input    String input
	 * 
	 * @return input String ensured as computable value
	 * 
	 * @author Christopher McNames
	 */

	public static String ensureDouble(boolean isNumber, String input) {

		while (isNumber == false) {
			System.out.print("Please try again: ");
			System.out.println();

			input = scanner.nextLine();

			isNumber = checkDouble(input);
		}

		return input;

	}

	/**
	 * operationCheck purpose is to separate a given String into the different enum
	 * categories for the different operations.
	 *
	 * @param check String to be sorted into enum
	 * 
	 * @return op enum showing operation
	 * 
	 * @author Christopher McNames
	 */

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

	/**
	 * homeMenu purpose is the first prompt gathering the user input for the
	 * operation. It then makes the call to validate operation. After this is
	 * accomplished it takes all input from the calls to the operation prompts and
	 * returns it as an ArrayList of Strings.
	 *
	 * @param check String to be sorted into enum
	 * 
	 * @return op enum showing operation
	 * 
	 * @author Christopher McNames
	 */

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

		converts = parseForOperation(op);

		converts.add(0, operation);

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

				if (converts.get(1).toUpperCase().equals("PI")) {
					firstoperand = Math.PI;
				} else if (converts.get(1).toUpperCase().equals("E")) {
					firstoperand = Math.E;
				} else {
					firstoperand = Double.parseDouble(converts.get(1));
				}

				if (converts.get(2).toUpperCase().equals("PI")) {
					secondoperand = Math.PI;
				} else if (converts.get(2).toUpperCase().equals("E")) {
					secondoperand = Math.E;
				} else {
					secondoperand = Double.parseDouble(converts.get(2));
				}

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

				} else {
					System.out.println("Something has gone wrong");
					result = 0;
				}

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

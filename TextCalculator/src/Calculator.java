
import java.lang.Math;

/**
 * <h1>Calculator</h1> Calculator provides the different calculations necessary
 * for the operations of addition, subtraction, multiplication, division, modulo
 * division, raising to an exponent, nth root calculation.
 * 
 * @author Christopher McNames
 * 
 */

public class Calculator implements ArithmeticLogicUnit {
	
	/**
	 * add will take two numbers and add them together
	 *
	 * @param x double first number to be added
	 * 
	 * @param y double second number to be added
	 * 
	 * @return sum of x + y 
	 * 
	 * @author Christopher McNames
	 */

	public double add(double x, double y) {

		return x + y;
	}
	
	/**
	 * subtract will take two numbers subtract the second from the first
	 *
	 * @param x double The first number 
	 * 
	 * @param y double second number that is subtracted
	 * 
	 * @return y subtracted from x
	 * 
	 * @author Christopher McNames
	 */

	public double subtract(double x, double y) {

		return x - y;
	}
	
	/**
	 * multiply will take two numbers and multiply the first by the second 
	 *
	 * @param x double The first number 
	 * 
	 * @param y double  The second number 
	 * 
	 * @return x multiplied by y
	 * 
	 * @author Christopher McNames
	 */

	public double multiply(double x, double y) {

		return x * y;
	}
	
	/**
	 * divide will take two numbers and divide the first by the second 
	 *
	 * @param x double The numerator
	 * 
	 * @param y double  The denominator
	 * 
	 * @return x divided by y
	 * 
	 * @author Christopher McNames
	 */

	public double divide(double x, double y) {

		double attempt = 0;

		try {
			attempt = x / y;
		} catch (ArithmeticException e) {
			System.out.println("Exception caught:Division by zero");
		}

		return attempt;
	}
	
	/**
	 * mod will take two numbers and perform modulo division 
	 *
	 * @param x double The first number
	 * 
	 * @param y double  The second number 
	 * 
	 * @return remainder of x divided by y
	 * 
	 * @author Christopher McNames
	 */

	public double mod(double x, double y) {

		return x % y;
	}
	
	/**
	 * expontent will take a number and raise it to a given power
	 *
	 * @param x double The first number
	 * 
	 * @param power double  Power the first number is raised to
	 * 
	 * @return x raised to the value of power
	 * 
	 * @author Christopher McNames
	 */

	public double expontent(double x, double power) {

		return Math.pow(x, power);
	}
	
	/**
	 * root will take a number compute it's second number given root
	 *
	 * @param x double The first number
	 * 
	 * @param root double  nth root calculation
	 * 
	 * @return x's nth root calculation
	 * 
	 * @author Christopher McNames
	 */

	public double root(double x, double root) {

		double attempt = 0;

		try {
			attempt = 1.0 / root;
		} catch (ArithmeticException e) {
			System.out.println("Exception caught:Division by zero");
		}

		return Math.pow(x, 1.0 / root);
	}

}

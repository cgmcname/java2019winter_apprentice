/**
 * <h1>ArithmeticLogicUnit</h1> ArithmeticLogicUnit is the interface for the
 * Calculator class. It sets out the template for the various operations
 * implimented there.
 * 
 * @author Christopher McNames
 * 
 */

public interface ArithmeticLogicUnit {
	
	/**
	 * add will take two numbers and add them together
	 *
	 * @param x double first number to be added
	 * 
	 * @param y double second number to be added
	 * 
	 * @author Christopher McNames
	 */
	public double add(double x, double y);
	
	/**
	 * subtract will take two numbers subtract the second from the first
	 *
	 * @param x double The first number 
	 * 
	 * @param y double second number that is subtracted
	 * 
	 * @author Christopher McNames
	 */

	public double subtract(double x, double y);
	
	/**
	 * multiply will take two numbers and multiply the first by the second 
	 *
	 * @param x double The first number 
	 * 
	 * @param y double  The second number 
	 * 
	 * @author Christopher McNames
	 */

	public double multiply(double x, double y);
	
	/**
	 * divide will take two numbers and divide the first by the second 
	 *
	 * @param x double The numerator
	 * 
	 * @param y double  The denominator
	 * 
	 * @author Christopher McNames
	 */

	public double divide(double x, double y);
	
	/**
	 * mod will take two numbers and perform modulo division 
	 *
	 * @param x double The first number
	 * 
	 * @param y double  The second number 
	 * 
	 * @author Christopher McNames
	 */

	public double mod(double x, double y);
	
	/**
	 * expontent will take a number and raise it to a given power
	 *
	 * @param x double The first number
	 * 
	 * @param power double  Power the first number is raised to
	 * 
	 * @author Christopher McNames
	 */

	public double expontent(double x, double power);
	
	/**
	 * root will take a number compute it's second number given root
	 *
	 * @param x double The first number
	 * 
	 * @param root double  nth root calculation
	 * 
	 * @author Christopher McNames
	 */

	public double root(double x, double root);

}

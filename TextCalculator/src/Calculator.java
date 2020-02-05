import java.lang.Math;

public class Calculator implements ArithmeticLogicUnit {

	
	public double add(double x, double y) {
		
		
		return x + y;
	}

	
	public double subtract(double x, double y) {
		
		return x - y;
	}

	
	public double multiply(double x, double y) {
		
		return x * y;
	}

	
	public double divide(double x, double y) {
		
		double attempt = 0;
		
		try {
			attempt = x/y;
		} catch (ArithmeticException e) { 
            System.out.println("Exception caught:Division by zero"); 
        } 
		
		return attempt;
	}

	
	public double mod(double x, double y) {
		
		return x % y;
	}

	
	public double expontent(double x, double power) {
		
		return Math.pow(x, power);
	}

	
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

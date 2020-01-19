
public class SelectionStructure1 {

	public static void main(String[] args) {

		String languageName = " Java";

		// Single Selection
		/*if (languageName.equals("Java")) {

			System.out.println("The language equals Java. ");

		}

		// Dual Selection
		if (languageName.equals("Java")) {

			System.out.println("The language equals Java. ");

		} else {

			System.out.println("The language equals something other than Java. ");

		}
		
		// Dual Selection IgnoreCase
		if (languageName.equalsIgnoreCase("Java")) {

			System.out.println("The language equals Java. ");

		} else {

			System.out.println("The language equals something other than Java. ");   

		}*/
		
		// Dual Selection Trim
		if (languageName.trim().toUpperCase().equals("JAVA")) {

			System.out.println("The language equals Java. ");

		} else {

			System.out.println("The language equals something other than Java. ");

		}
		

	}

}

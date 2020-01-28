import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		
		String name = "";
		String inputAge = "";
		
		int age = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter your name: ");
		
		name = scanner.nextLine();
		
		System.out.print("Please enter your age: ");
		
		inputAge = scanner.nextLine();
		
		age = Integer.parseInt(inputAge);
		
		System.out.printf("Hello World! Hello %s! You are %d years old!", name, age);
		
		
		scanner.close();
		
		
	
	}

}

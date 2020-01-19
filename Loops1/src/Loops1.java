
public class Loops1 {

	public static void main(String[] args) {

		int i = 0;

		while (i <= 10) {
			System.out.println("The value of i is: " + i);
			++i;
		}

		i = 10;

		do {
			System.out.println("The value of i is: " + i);
			--i;

		} while (i >= 0);

		for (int j = 0; j <= 10; ++j) {

			System.out.printf("The value of %s is: %d\n", "j", j);

			for (int k = 0; k <= 5; ++k) {

				System.out.printf("\t The value of %s is: %d\n", "k", k);

			}

		}

		int[] myIntegers = { 7, 4, 3 };

		for (int count : myIntegers) {
			System.out.println("Count is: " + count);
		}
		
		String[] classNames = { "Chadwick", "Nathan", "Justice", "Jake", "Jacob", "Chris", "Clay"};
		
		for (int track = 0; track < classNames.length; ++track) {
			System.out.println("Class names are: " + classNames[track]);
		}
		
		for (String name: classNames) {
			System.out.println("The class names are: " + name);
		}

	}

}

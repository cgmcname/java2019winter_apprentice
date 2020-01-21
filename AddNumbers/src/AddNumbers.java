
public class AddNumbers {

	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		int c = 20;

		int d = addTogether(5, 10, 20);

		System.out.printf(
				"First parameter is: %s. Second parameter is: %s. Third parameter is: %s. The result is %s. \n", a, b,
				c, d);

		int i = addOptionalInts(10, 20, 30, 40, 50);

		System.out.printf("The result of addOptionalInts is %s. \n ", i);

	}

	public static int addTogether(int x, int y) {

		int z;
		z = x + y;
		x = 0;
		y = 0;
		return z;
	}

	public static int addTogether(int a, int b, int c) {

		return a + b + c;
	}

	public static int addOptionalInts(int... integers) {
		int total = 0;

		for (int i : integers) {
			total += i;

		}

		return total;
	}

}

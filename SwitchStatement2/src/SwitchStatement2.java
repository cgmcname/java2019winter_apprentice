
public class SwitchStatement2 {

	public static void main(String[] args) {
		int productCode = 5;
		String productName = "";
		String result = "";

		// Ternary rewrite
		if (productCode == 6) {
			result = "Is Six";
		} else {
			result = "Not Six";
		}

		System.out.println(result);

		// Switch rewrite
		if (productCode == 1) {
			productName = "Baby Yoda Pop!";
		} else if (productCode == 2) {
			productName = "Mariah Carey's \"All I Want for Christmas Is You\"";

		} else if (productCode == 3) {
			productName = "Kampus Pop!";

		} else if (productCode == 4) {
			productName = "WHAM!'s \"Last Christmas\"";

		} else if (productCode == 5) {
			productName = "Uncle Bob's _Clean Code_";

		} else {
			productName = "Not found";

		}

		System.out.println(productName);

	}

}

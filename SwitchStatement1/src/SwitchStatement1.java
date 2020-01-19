
public class SwitchStatement1 {

	public static void main(String[] args) {
		int productCode = 5;
		String productName = "";
		String result = "";
		
		result = (productCode == 6) ? "Is Six" : "Not Six";
		System.out.println(result);
		//System.out.println((productCode == 6) ? "Is Six" : "Not Six");

		switch (productCode) {

		case 1:
			productName = "Baby Yoda Pop!";
			break;
		case 2:
			productName = "Mariah Carey's \"All I Want for Christmas Is You\"";
			break;
		case 3:
			productName = "Kampus Pop!";
			break;
		case 4:
			productName = "WHAM!'s \"Last Christmas\"";
			break;
		case 5:
			productName = "Uncle Bob's _Clean Code_";
			break;
		default:
			productName = "Not found";
			break;
		}

		System.out.println(productName);

	}

}

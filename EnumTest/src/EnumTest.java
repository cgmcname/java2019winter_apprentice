
public class EnumTest {

	public static void main(String[] args) {
		
		ShippingTest test = ShippingTest.UPS_GROUND;
		
		System.out.println(test);
		
		System.out.println("Shipping Type: " + " " + test.ordinal());


	}

}

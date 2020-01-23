
public enum ShippingTest {

	UPS_NEXT_DAY, UPS_SECOND_DAY, UPS_GROUND;

	@Override
	public String toString() {

		String s = "";

		if (name().equals("UPS_NEXT_DAY")) {

			s = "UPS Next Day (1 Business Day)";

		} else if (name().equals("UPS_SECOND_DAY")) {
			s = "UPS Second Day (2 Business Days)";
		} else if (name().equals("UPS_GROUND")) {
			s = "UPS Ground (5-7 Business Days)";
		} else {
			s = "Shipping test type not found";
		}

		return s;
	}

}

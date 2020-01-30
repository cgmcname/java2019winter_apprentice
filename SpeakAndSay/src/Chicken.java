
public class Chicken extends Bird {

	@Override
	public String makeSound() {

		return "Boc Boc";
	}

	public String accessClassName() {

		return this.getClass().getName();
	}

}

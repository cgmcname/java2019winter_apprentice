
public class Bovine extends Mammal {

	@Override
	public String makeSound() {

		return "Moo";
	}

	public String accessClassName() {

		return this.getClass().getName();
	}
}

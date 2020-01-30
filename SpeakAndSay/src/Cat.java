
public class Cat extends Mammal {

	@Override
	public String makeSound() {

		return "Meow";
	}

	public String accessClassName() {

		return this.getClass().getName();
	}

}

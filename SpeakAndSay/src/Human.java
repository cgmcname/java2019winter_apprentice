
public class Human extends Mammal {

	@Override
	public String makeSound() {
		
		return "Hey There";
	}
	
	public String accessClassName() {

		return this.getClass().getName();
	}
}

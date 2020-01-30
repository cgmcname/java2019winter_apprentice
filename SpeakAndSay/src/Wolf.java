
public class Wolf extends Mammal {
	
	@Override
	public String makeSound() {
		
		return "Howl";
	}
	
	public String accessClassName() {

		return this.getClass().getName();
	}

}

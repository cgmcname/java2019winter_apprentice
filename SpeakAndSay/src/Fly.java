
public class Fly extends Insect {
	
	@Override
	public String makeSound() {
		
		return "Bzzzz";
	}
	
	public String accessClassName() {

		return this.getClass().getName();
	}

}

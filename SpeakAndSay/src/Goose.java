
public class Goose extends Bird {
	
	@Override
	public String makeSound() {
		
		return "Honk";
	}
	
	public String accessClassName() {

		return this.getClass().getName();
	}

}

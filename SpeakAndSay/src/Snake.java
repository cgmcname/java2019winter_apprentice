
public class Snake extends Reptile {
	
	@Override
	public String makeSound() {
		
		return "SSSSSsssss";
	}
	
	public String accessClassName() {

		return this.getClass().getName();
	}

}

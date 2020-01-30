
public class Duck extends Bird {
	
	@Override
	public String makeSound() {
		
		return "Quack";
	}
	
	public String accessClassName() {

		return this.getClass().getName();
	}

}

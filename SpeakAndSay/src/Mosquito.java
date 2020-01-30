
public class Mosquito extends Insect {
	
	@Override
	public String makeSound() {
		
		return "Irritation";
	}
	
	public String accessClassName() {

		return this.getClass().getName();
	}

}


public class Frog extends Amphian {
	
	@Override
	public String makeSound() {
		
		return "ribbit";
	}
	
	public String accessClassName() {

		return this.getClass().getName();
	}

}

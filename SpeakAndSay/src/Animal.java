
public abstract class Animal implements MakeSoundable {
	
	public String makeSound() {
		return "";
	}
		
	public String accessClassName() {
		
		return this.getClass().getName();
	}

}


public abstract class Electronic implements MakeSoundable {

	public String makeSound() {
		return "";
	}

	public String accessClassName() {

		return this.getClass().getName();
	}
}


public class SmartRefrigerator extends Electronic {

	@Override
	public String makeSound() {
		// TODO Auto-generated method stub
		return "I am watching you";
	}

	public String accessClassName() {

		return this.getClass().getName();
	}

}

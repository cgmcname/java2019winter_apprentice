import java.util.ArrayList;

public class SpeakAndSay {

	public static void main(String[] args) {

		ArrayList<Animal> animals = new ArrayList<Animal>();

		Dog fido = new Dog();

		animals.add(fido);

		animals.add(new Chicken());

		animals.add(new Human());

		animals.add(new Duck());

		animals.add(new Cat());

		animals.add(new Fly());

		animals.add(new Frog());

		animals.add(new Snake());

		animals.add(new Mosquito());

		animals.add(new Wolf());

		animals.add(new Goose());

		animals.add(new Bovine());

		for (int i = 0; i < animals.size(); i++) {

			System.out.printf("The %s goes %s!\n", animals.get(i).getClass().getName(), animals.get(i).makeSound());
		}

		System.out.println();
		System.out.println();

		for (Animal a : animals) {
			System.out.printf("The %s goes %s!\n", a.getClass().getName(), a.makeSound());
		}

		// animals.get(1).makeSound();

	}

}

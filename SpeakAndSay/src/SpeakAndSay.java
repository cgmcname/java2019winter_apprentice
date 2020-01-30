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

		System.out.println();
		System.out.println();

		ArrayList<MakeSoundable> petSounds = new ArrayList<MakeSoundable>();

		Dog fido2 = new Dog();

		petSounds.add(fido2);

		petSounds.add(new Chicken());

		petSounds.add(new Human());

		petSounds.add(new Duck());

		petSounds.add(new Cat());

		petSounds.add(new Fly());

		petSounds.add(new Frog());

		petSounds.add(new Snake());

		petSounds.add(new Mosquito());

		petSounds.add(new Wolf());

		petSounds.add(new Goose());

		petSounds.add(new Bovine());

		petSounds.add(new Toaster());

		petSounds.add(new Computer());

		petSounds.add(new SmartRefrigerator());

		for (MakeSoundable b : petSounds) {
			System.out.printf("The %s goes %s!\n", b.accessClassName(), b.makeSound());
		}

	}

}

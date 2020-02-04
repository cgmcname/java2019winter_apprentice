
public class ThreadInheiritance {

	public static void main(String[] args) {

		Thread t1 = Thread.currentThread();

		System.out.println(t1.getName() + " started");

		Thread t2 = new IOThread();

		t2.start();

		System.out.println(t1.getName() + " starts off " + t2.getName() + ".");
		System.out.println(t1.getName() + " finishes.");

	}

}

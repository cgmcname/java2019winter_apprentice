
public class ThreadInterface {

	public static void main(String[] args) {
		
		Thread t1 = Thread.currentThread();
		
		System.out.println(t1.getName() + " started.");
		
		Thread t2 = new Thread(new IOTask());
		
		t2.start();
		
		System.out.println(t1.getName() + " starts off " + t2.getName() + ".");
		System.out.println(t1.getName() + " finishes.");
	}

}

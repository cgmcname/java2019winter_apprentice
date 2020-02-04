
public class StringAlternatives {

	public static void main(String[] args) {
		
		//StringBuffer buffer = new StringBuffer("Hello, how are you?");
		
		StringBuilder builder = new StringBuilder("Hello, how are you?");
		
		System.out.printf("Buffer = %s%nlength = %d%ncapacity = %d%n%n", builder.toString(), builder.length(), builder.capacity());
		
		builder.ensureCapacity(75);
		
		System.out.printf("New capacity = %d%n%n", builder.capacity());
		
		builder.setLength(10);
		
		builder.reverse();
		
		System.out.printf("New length = %d%nbuffer = %s%n", builder.length(), builder.toString());
		
		builder.deleteCharAt(5);
		
		System.out.println(builder.toString());
		
		builder.insert(5, '!');
		
		System.out.println(builder.toString());
		

	}

}

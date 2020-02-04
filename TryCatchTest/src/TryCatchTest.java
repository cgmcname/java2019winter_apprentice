import java.io.*;

public class TryCatchTest {

	

	public static void main(String[] args) {

		
		String path = "Text.txt";

		try ( BufferedReader in = new BufferedReader(new FileReader(System.getProperty("user.dir") + "/" + path))) {

			String line = in.readLine();
			System.out.println(line);
		} catch (FileNotFoundException | EOFException e) {
			System.err.println(e.toString());
		} catch (IOException e) {
			System.err.println(e.toString());
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Unhandled Exception");
			System.err.println(e.toString());
		} finally {
			
			/*try {
				in.close();
			} catch (IOException e) {

				e.printStackTrace();
			}*/
			
		}
		
		

	}

}

import javax.swing.JOptionPane;
import javax.swing.JFrame;



public class Main {

	public static void main(String[] args) {
		
		String first;
		String second;
		
		boolean one = true;
		boolean two = true;
		
		//JOptionPane.showMessageDialog(null, "Hello, welcome to windowed Truth Table","", 
				//JOptionPane.PLAIN_MESSAGE);
		
		first = JOptionPane.showInputDialog(null, "Hello, welcome to windowed Truth Table. Please enter first Truth value (T or F)", 
				"Student name",JOptionPane.QUESTION_MESSAGE);
		
		second = JOptionPane.showInputDialog(null,  "Please enter second Truth value (T or F)", 
				"Student name",JOptionPane.QUESTION_MESSAGE);
		
		
		if(first.equals("T"))
		{
			one = true;
			
		}else if (first.equals("F")) {
			one = false;
		}
		
		if(second.equals("T"))
		{
			two = true;
			
		}else if (second.equals("F")) {
			two = false;
		}
		//Calculations cal = new Calculations();
		
		//show = cal.findOrShortCut(false, false);
		
		//.out.println(show);
		
		new GUI(one, two);
		
	}

}

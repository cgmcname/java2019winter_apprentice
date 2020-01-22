import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {

		String first;
		String second;

		boolean one = true;
		boolean two = true;

		first = JOptionPane.showInputDialog(null,
				"Hello, welcome to windowed Truth Table. Please enter first Truth value (T or F)", "Student name",
				JOptionPane.QUESTION_MESSAGE);

		second = JOptionPane.showInputDialog(null, "Please enter second Truth value (T or F)", "Student name",
				JOptionPane.QUESTION_MESSAGE);

		while ((first.toUpperCase().equals("T") == false && first.toUpperCase().equals("F") == false)
				|| (second.toUpperCase().equals("T") == false && second.toUpperCase().equals("F") == false)) {

			first = JOptionPane.showInputDialog(null, "Input was incorrect. Please enter first Truth value (T or F)",
					"Student name", JOptionPane.QUESTION_MESSAGE);

			second = JOptionPane.showInputDialog(null, "Please enter second Truth value (T or F)", "Student name",
					JOptionPane.QUESTION_MESSAGE);

			if (first.toUpperCase().equals("T")) {
				one = true;

			} else if (first.toUpperCase().equals("F")) {
				one = false;

			}

			if (second.toUpperCase().equals("T")) {
				two = true;

			} else if (second.toUpperCase().equals("F")) {
				two = false;
			}

			// Calculations cal = new Calculations();

		}

		if (first.toUpperCase().equals("T")) {
			one = true;

		} else if (first.toUpperCase().equals("F")) {
			one = false;

		}

		if (second.toUpperCase().equals("T")) {
			two = true;

		} else if (second.toUpperCase().equals("F")) {
			two = false;
		} // show = cal.findOrShortCut(false, false);

		// .out.println(show);

		new GUI(one, two);

	}

}

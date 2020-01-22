import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;

public class GUI {

	JFrame frame;
	// Table
	JTable table;

	

	// Constructor
	GUI(boolean alpha, boolean omega) {
		

		Calculations cal = new Calculations();

		

		frame = new JFrame();

		// Frame Title
		frame.setTitle("Truth Table");

		if (alpha == true && omega == true) {

			// Data to be displayed in the JTable
			String[][] data = {
					{ cal.modifyBool(alpha), cal.modifyBool(omega), cal.findAnd(alpha, omega), cal.findOr(alpha, omega),
							cal.findAndShortCut(alpha, omega), cal.findOrShortCut(alpha, omega),
							cal.findXor(alpha, omega) },
					{ cal.modifyBool(false), cal.modifyBool(true), cal.findAnd(false, true), cal.findOr(false, true),
							cal.findAndShortCut(false, true), cal.findOrShortCut(false, true),
							cal.findXor(false, true) },
					{ cal.modifyBool(true), cal.modifyBool(false), cal.findAnd(true, false), cal.findOr(true, false),
							cal.findAndShortCut(true, false), cal.findOrShortCut(true, false),
							cal.findXor(true, false) },
					{ cal.modifyBool(false), cal.modifyBool(false), cal.findAnd(false, false), cal.findOr(false, false),
							cal.findAndShortCut(false, false), cal.findOrShortCut(false, false),
							cal.findXor(false, false) } };

			// Column Names
			String[] columnNames = { "A", "B", "A & B", "A | B", "A && B", "A || B", "A ^ B" };
			table = new JTable(data, columnNames);
		} else if (alpha == true && omega == false) {

			// Data to be displayed in the JTable
			String[][] data = {
					{ cal.modifyBool(alpha), cal.modifyBool(omega), cal.findAnd(alpha, omega), cal.findOr(alpha, omega),
							cal.findAndShortCut(alpha, omega), cal.findOrShortCut(alpha, omega),
							cal.findXor(alpha, omega) },
					{ cal.modifyBool(false), cal.modifyBool(true), cal.findAnd(false, true), cal.findOr(false, true),
							cal.findAndShortCut(false, true), cal.findOrShortCut(false, true),
							cal.findXor(false, true) },
					{ cal.modifyBool(true), cal.modifyBool(true), cal.findAnd(true, true), cal.findOr(true, true),
							cal.findAndShortCut(true, true), cal.findOrShortCut(true, true), cal.findXor(true, true) },
					{ cal.modifyBool(false), cal.modifyBool(false), cal.findAnd(false, false), cal.findOr(false, false),
							cal.findAndShortCut(false, false), cal.findOrShortCut(false, false),
							cal.findXor(false, false) } };

			// Column Names
			String[] columnNames = { "A", "B", "A & B", "A | B", "A && B", "A || B", "A ^ B" };
			table = new JTable(data, columnNames);
		} else if (alpha == false && omega == true) {

			// Data to be displayed in the JTable
			String[][] data = {
					{ cal.modifyBool(alpha), cal.modifyBool(omega), cal.findAnd(alpha, omega), cal.findOr(alpha, omega),
							cal.findAndShortCut(alpha, omega), cal.findOrShortCut(alpha, omega),
							cal.findXor(alpha, omega) },
					{ cal.modifyBool(true), cal.modifyBool(false), cal.findAnd(true, false), cal.findOr(true, false),
							cal.findAndShortCut(true, false), cal.findOrShortCut(true, false),
							cal.findXor(true, false) },
					{ cal.modifyBool(true), cal.modifyBool(true), cal.findAnd(true, true), cal.findOr(true, true),
							cal.findAndShortCut(true, true), cal.findOrShortCut(true, true), cal.findXor(true, true) },
					{ cal.modifyBool(false), cal.modifyBool(false), cal.findAnd(false, false), cal.findOr(false, false),
							cal.findAndShortCut(false, false), cal.findOrShortCut(false, false),
							cal.findXor(false, false) } };

			// Column Names
			String[] columnNames = { "A", "B", "A & B", "A | B", "A && B", "A || B", "A ^ B" };
			table = new JTable(data, columnNames);
		} else if (alpha == false && omega == false) {

			// Data to be displayed in the JTable
			String[][] data = {
					{ cal.modifyBool(alpha), cal.modifyBool(omega), cal.findAnd(alpha, omega), cal.findOr(alpha, omega),
							cal.findAndShortCut(alpha, omega), cal.findOrShortCut(alpha, omega),
							cal.findXor(alpha, omega) },
					{ cal.modifyBool(true), cal.modifyBool(false), cal.findAnd(true, false), cal.findOr(true, false),
							cal.findAndShortCut(true, false), cal.findOrShortCut(true, false),
							cal.findXor(true, false) },
					{ cal.modifyBool(true), cal.modifyBool(true), cal.findAnd(true, true), cal.findOr(true, true),
							cal.findAndShortCut(true, true), cal.findOrShortCut(true, true), cal.findXor(true, true) },
					{ cal.modifyBool(false), cal.modifyBool(true), cal.findAnd(false, true), cal.findOr(false, true),
							cal.findAndShortCut(false, true), cal.findOrShortCut(false, true),
							cal.findXor(false, true) } };

			// Column Names
			String[] columnNames = { "A", "B", "A & B", "A | B", "A && B", "A || B", "A ^ B" };
			table = new JTable(data, columnNames);
		} else {
			String[][] data = { { "Invalid Input" }, { "Invalid Input" } };
			String[] columnNames = { "Invalid Input", "Invalid Input" };

			table = new JTable(data, columnNames);
		}

		// Initializing the JTable

		table.setShowGrid(true);
		// table.setShowVerticalLines(true);
		// table.setShowHorizontalLines(true);
		table.setGridColor(Color.black);
		// table.setBounds(30, 40, 200, 300);

		// adding it to JScrollPane
		JScrollPane pane = new JScrollPane(table);
		frame.add(pane);
		// Frame Size
		frame.setSize(500, 200);
		// Frame Visible = true
		frame.setVisible(true);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
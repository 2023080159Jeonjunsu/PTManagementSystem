package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PTMemberViewer extends JFrame{

	public PTMemberViewer() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("ID");
		model.addColumn("Name");
		model.addColumn("Height");
		model.addColumn("Weight");
		model.addColumn("Age");
		model.addColumn("Birthday");
		model.addColumn("Gender");
		model.addColumn("Address");
		model.addColumn("PhoneNumber");
		model.addColumn("Calories");
		model.addColumn("Contact Info.");
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		this.setSize(1000,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
}

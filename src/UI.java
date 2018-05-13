import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;
import org.jdatepicker.JDatePicker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class UI extends JFrame {//} implements ActionListener {
	private JTabbedPane tabbedPane1;
	private JComboBox combo_0_GrupesNr;
	private JTextField text_0_GrupesNr;
	private JButton button_0_PridetiNauja;
	private JButton button_0_Pervadinti;
	private JButton button_0_Istrinti;
	private JLabel label_0_Grupe;
	private JComboBox combo_1_Grupe;
	private JTable table_1;
	private JCheckBox check_2_Iki;
	private JCheckBox check_2_VisosGr;
	private JButton button_2_PDF;
	private JComboBox combo_2_Grupe;
	private JTable table_0;
	private JDatePicker date_1;
	private JLabel label_1_Data;
	private JLabel label_1_Grupe;
	private JDatePicker date_2_Data;
	private JLabel label_2_Data;
	private JTable table_2;
	private JDatePicker date_2_Iki;
	private JLabel label_2_Grupe;
	private DefaultComboBoxModel comboBoxModel;


	public UI() {
		// Set layout for main window
		setLayout(new BorderLayout(0, 0));

		// Create model for combo boxes
		comboBoxModel = new DefaultComboBoxModel();


		// ----- Create base objects -----
		// Create the tabbed panel
		tabbedPane1 = new JTabbedPane();
		add(tabbedPane1, BorderLayout.CENTER);

		// Add the tabs
		final JPanel pane0 = new JPanel();
		pane0.setLayout(new FormLayout("fill:60px:noGrow,left:4dlu:noGrow,fill:max(d;4px):grow,left:4dlu:noGrow,fill:max(d;4px):grow,left:4dlu:noGrow,fill:d:noGrow,left:4dlu:noGrow,fill:m:noGrow,left:4dlu:noGrow,fill:m:noGrow", "center:max(d;4px):noGrow,top:4dlu:noGrow,center:400px:noGrow"));
		tabbedPane1.addTab("Grupės", pane0);

		final JPanel pane1 = new JPanel();
		pane1.setLayout(new FormLayout("fill:60px:noGrow,left:4dlu:noGrow,fill:d:grow,left:4dlu:noGrow,fill:60px:noGrow,left:4dlu:noGrow,fill:max(d;4px):grow", "center:d:noGrow,top:4dlu:noGrow,center:400px:noGrow"));
		tabbedPane1.addTab("Lankomumo suvedimas", pane1);

		final JPanel pane2 = new JPanel();
		pane2.setLayout(new FormLayout("fill:60px:noGrow,left:4dlu:noGrow,fill:p:grow,left:4dlu:noGrow,fill:p:grow,left:4dlu:noGrow,fill:max(d;4px):noGrow,fill:60px:noGrow", "center:d:noGrow,top:4dlu:noGrow,center:max(d;4px):noGrow,top:4dlu:noGrow,center:365px:noGrow"));
		tabbedPane1.addTab("Lankomumo peržiūra", pane2);

		// ----- Add elements to the 1st tab -----
		// Group selection combo box
		combo_0_GrupesNr = new JComboBox(comboBoxModel);
		//defaultComboBoxModel1.addElement("1");
		CellConstraints cc = new CellConstraints();
		pane0.add(combo_0_GrupesNr, cc.xy(3, 1));
		
		// Group name entry field
		text_0_GrupesNr = new JTextField("1");
		pane0.add(text_0_GrupesNr, cc.xy(5, 1));

		// "Add new" button
		button_0_PridetiNauja = new JButton("Pridėti naują");
		pane0.add(button_0_PridetiNauja, cc.xy(7, 1));

		// "Rename" button
		button_0_Pervadinti = new JButton("Pervadinti");
		pane0.add(button_0_Pervadinti, cc.xy(9, 1));

		// "Remove" button
		button_0_Istrinti = new JButton("Ištrinti");
		pane0.add(button_0_Istrinti, cc.xy(11, 1));

		// "Grupė" label
		label_0_Grupe = new JLabel("Grupė");
		pane0.add(label_0_Grupe, cc.xy(1, 1));

		// Student table
		table_0 = new JTable();
		final JScrollPane scrollPane1 = new JScrollPane(table_0);
		pane0.add(scrollPane1, cc.xyw(1, 3, 11, CellConstraints.FILL, CellConstraints.FILL));


		// ----- Add elements to the 2nd tab -----
		// Date picker
		date_1 = new JDatePicker();
		pane1.add(date_1, cc.xy(3, 1));

		label_1_Data = new JLabel("Data");
		label_1_Data.setHorizontalAlignment(4);
		pane1.add(label_1_Data, cc.xy(1, 1));

		label_1_Grupe = new JLabel("Grupė");
		label_1_Grupe.setHorizontalAlignment(4);
		pane1.add(label_1_Grupe, cc.xy(5, 1));

		combo_1_Grupe = new JComboBox(comboBoxModel);
		pane1.add(combo_1_Grupe, cc.xy(7, 1));

		table_1 = new JTable();
		final JScrollPane scrollPane2 = new JScrollPane(table_1);
		pane1.add(scrollPane2, cc.xyw(1, 3, 7, CellConstraints.FILL, CellConstraints.FILL));

		date_2_Data = new JDatePicker();
		pane2.add(date_2_Data, cc.xy(3, 1));

		label_2_Data = new JLabel("Data");
		label_2_Data.setHorizontalAlignment(4);
		pane2.add(label_2_Data, cc.xy(1, 1));

		table_2 = new JTable();
		final JScrollPane scrollPane3 = new JScrollPane(table_2);
		pane2.add(scrollPane3, cc.xyw(1, 5, 8, CellConstraints.FILL, CellConstraints.FILL));

		date_2_Iki = new JDatePicker();
		pane2.add(date_2_Iki, cc.xy(3, 3));

		check_2_Iki = new JCheckBox("Iki");
		check_2_Iki.setHorizontalAlignment(4);
		pane2.add(check_2_Iki, cc.xy(1, 3));

		check_2_VisosGr = new JCheckBox("Visos");
		pane2.add(check_2_VisosGr, cc.xy(8, 1));

		button_2_PDF = new JButton("PDF");
		pane2.add(button_2_PDF, cc.xy(8, 3));

		label_2_Grupe = new JLabel("Grupė");
		pane2.add(label_2_Grupe, cc.xy(5, 1));

		combo_2_Grupe = new JComboBox(comboBoxModel);
		pane2.add(combo_2_Grupe, cc.xy(5, 3));


		// Finish setting up and display the UI
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(570, 470);
		setVisible(true);
	}
}
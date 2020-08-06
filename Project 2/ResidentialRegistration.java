import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

import java.io.*;

public class ResidentialRegistration extends JFrame {

	private JPanel contentPane;
	private JTextField textField_name;
	private JTextField textField_matric;
	private JTextField textField_date;
	private JTable table;
	private String output = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ResidentialRegistration frame = new ResidentialRegistration();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void close() {
		WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
		
	}
	/**
	 * Create the frame.
	 */
	public ResidentialRegistration() {
		setTitle("FKI Registration System");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1121, 508);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 248, 255));
		panel.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		panel.setBounds(12, 13, 1079, 68);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Residential College Registration");
		lblNewLabel.setBounds(354, 13, 395, 42);
		lblNewLabel.setFont(new Font("Georgia", Font.PLAIN, 27));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(240, 248, 255));
		panel_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		panel_1.setBounds(12, 91, 416, 357);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lbl_studentName1 = new JLabel("Full Name");
		lbl_studentName1.setFont(new Font("Georgia", Font.PLAIN, 15));
		lbl_studentName1.setBounds(32, 44, 97, 16);
		panel_1.add(lbl_studentName1);
		
		JLabel lbl_mtric = new JLabel("Matric No.");
		lbl_mtric.setFont(new Font("Georgia", Font.PLAIN, 15));
		lbl_mtric.setBounds(32, 74, 97, 16);
		panel_1.add(lbl_mtric);
		
		JLabel lblYear = new JLabel("Year");
		lblYear.setFont(new Font("Georgia", Font.PLAIN, 15));
		lblYear.setBounds(32, 103, 97, 16);
		panel_1.add(lblYear);
		
		JLabel lbl_SemSession = new JLabel("Sem-Session");
		lbl_SemSession.setFont(new Font("Georgia", Font.PLAIN, 15));
		lbl_SemSession.setBounds(32, 132, 97, 16);
		panel_1.add(lbl_SemSession);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Georgia", Font.PLAIN, 15));
		lblDate.setBounds(32, 161, 81, 16);
		panel_1.add(lblDate);
		
		textField_name = new JTextField();
		textField_name.setFont(new Font("Georgia", Font.PLAIN, 13));
		textField_name.setBounds(162, 42, 207, 22);
		panel_1.add(textField_name);
		textField_name.setColumns(10);
		
		textField_matric = new JTextField();
		textField_matric.setFont(new Font("Georgia", Font.PLAIN, 13));
		textField_matric.setColumns(10);
		textField_matric.setBounds(162, 72, 207, 22);
		panel_1.add(textField_matric);
		
		textField_date = new JTextField();
		textField_date.setFont(new Font("Georgia", Font.PLAIN, 13));
		textField_date.setColumns(10);
		textField_date.setBounds(162, 159, 207, 22);
		panel_1.add(textField_date);
		
		JComboBox comboBox_semsession = new JComboBox();
		comboBox_semsession.setModel(new DefaultComboBoxModel(new String[] {"[Select]", "1-2019/2020", "2-2020/2020", "1-2020/2021", "2-2020/2021"}));
		comboBox_semsession.setFont(new Font("Georgia", Font.PLAIN, 13));
		comboBox_semsession.setBounds(162, 129, 129, 22);
		panel_1.add(comboBox_semsession);
		
		JComboBox comboBox_year = new JComboBox();
		comboBox_year.setModel(new DefaultComboBoxModel(new String[] {"[Select]", "1", "2", "3", "4"}));
		comboBox_year.setFont(new Font("Georgia", Font.PLAIN, 13));
		comboBox_year.setBounds(162, 100, 103, 22);
		panel_1.add(comboBox_year);
		
		JButton btn_Add = new JButton("Add");
		btn_Add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n = textField_name.getText().toString();
				String m = textField_matric.getText().toString();
				String s = comboBox_semsession.getSelectedItem().toString();
				String y = comboBox_year.getSelectedItem().toString();
				String d = textField_date.getText().toString();
				
				if(n.equals("")) {
					JOptionPane.showMessageDialog(null, "Full Name is mandatory");
				}
				if(m.equals("")) {
					JOptionPane.showMessageDialog(null, "Matric No. is mandatory");
				}
				if(y.equals("[Select]")) {
					JOptionPane.showMessageDialog(null, "Year is mandatory");
				}
				if(s.equals("[Select]")) {
					JOptionPane.showMessageDialog(null, "Sem-Session is mandatory");
				}
				if(d.equals("")) {
					JOptionPane.showMessageDialog(null, "Date is mandatory");
				}
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
						textField_name.getText(),
						textField_matric.getText(),
						comboBox_semsession.getSelectedItem(),
						comboBox_year.getSelectedItem(),
						textField_date.getText(),
				});
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null, "Data has been added", "Course Registration System", JOptionPane.OK_OPTION);
					}
				}
		}
		});
		btn_Add.setFont(new Font("Georgia", Font.PLAIN, 15));
		btn_Add.setBounds(32, 237, 97, 25);
		panel_1.add(btn_Add);
		
		JButton btn_clear = new JButton("Clear");
		btn_clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_name.setText("");
				textField_matric.setText("");
				comboBox_semsession.setSelectedItem("[Select]");
				comboBox_year.setSelectedItem("[Select]");
				textField_date.setText("");
			}
		});
		btn_clear.setFont(new Font("Georgia", Font.PLAIN, 15));
		btn_clear.setBounds(162, 237, 97, 25);
		panel_1.add(btn_clear);
		
		JButton button = new JButton("Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				close();
				MainMenu mm = new MainMenu();
				mm.setVisible(true);
			}
		});
		button.setFont(new Font("Georgia", Font.PLAIN, 13));
		button.setBounds(287, 237, 97, 25);
		panel_1.add(button);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(240, 248, 255));
		panel_2.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		panel_2.setBounds(440, 94, 651, 354);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 13, 627, 290);
		panel_2.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Full Name", "Matric No.", "Year", "Sem-Session", "Date"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(147);
		table.getColumnModel().getColumn(1).setPreferredWidth(124);
		table.getColumnModel().getColumn(2).setPreferredWidth(67);
		table.getColumnModel().getColumn(3).setPreferredWidth(98);
		table.getColumnModel().getColumn(4).setPreferredWidth(108);
		scrollPane.setViewportView(table);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				//save to text file
		        try{
                 BufferedWriter bfw = new BufferedWriter(new FileWriter("residential data.txt"));
                    for (int i = 0 ; i < table.getRowCount(); i++){
                      for(int j = 0 ; j < table.getColumnCount();j++){
                        bfw.write((String)(table.getValueAt(i,j)));
                        bfw.write(",");;
                    }
                    bfw.newLine();
                  }
                       bfw.close();			               
                       JOptionPane.showMessageDialog(null, "Success");
		        }
		        catch(Exception e){
                 e.printStackTrace();
		            JOptionPane.showMessageDialog(null,"Error");
		        }               
			}
		});
		btnSave.setFont(new Font("Georgia", Font.PLAIN, 15));
		btnSave.setBounds(27, 316, 97, 25);
		panel_2.add(btnSave);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getSelectedColumn()==0) {
						JOptionPane.showMessageDialog(null, "No data to delete!", "Course Registration System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null, "Select a row to delete.", "Course Registration System", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setFont(new Font("Georgia", Font.PLAIN, 15));
		btnDelete.setBounds(136, 316, 97, 25);
		panel_2.add(btnDelete);
		
		JButton btnLoad = new JButton("Load");
		btnLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String filepath = "residential data.txt";
	            File file = new File(filepath);
	            BufferedReader reader = null;
	            try{
	           	     FileInputStream fis = new FileInputStream(file);
	                 reader = new BufferedReader(new FileReader(file));
	                  String line;
	                  DefaultTableModel model = (DefaultTableModel) table.getModel();

	           	     while((line = reader.readLine()) != null) {
				            model.addRow(line.split(",")); 
	           	     }
	           	    	        reader.close();                 
	            } catch (Exception ex){
	               ex.printStackTrace();
	           }
			}
		});
		btnLoad.setFont(new Font("Georgia", Font.PLAIN, 15));
		btnLoad.setBounds(245, 316, 97, 25);
		panel_2.add(btnLoad);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.setFont(new Font("Georgia", Font.PLAIN, 15));
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				try {
					table.print();
				} catch(java.awt.print.PrinterException e) {
					System.err.format("No Printer found!", e.getMessage());
				}
			}
		});
		btnPrint.setBounds(354, 316, 97, 25);
		panel_2.add(btnPrint);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int response = JOptionPane.showConfirmDialog(null, "Do you want to exit?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (response == JOptionPane.YES_OPTION){
			        System.exit(0);
			    }    
			}
		});
		btnExit.setFont(new Font("Georgia", Font.PLAIN, 15));
		btnExit.setBounds(463, 316, 97, 25);
		panel_2.add(btnExit);
	}
}

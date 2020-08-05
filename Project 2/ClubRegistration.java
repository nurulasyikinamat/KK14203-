import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.BevelBorder;
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
import java.awt.Color;

public class ClubRegistration extends JFrame {

	private JPanel contentPane;
	private JTextField textField_fn;
	private JTextField textField_mn;
	private JTextField textField_pn;
	private JTable table;
	private String output = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClubRegistration frame = new ClubRegistration();
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
	public ClubRegistration() {
		setTitle("FKI Registration System");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1114, 505);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 245, 245));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(230, 230, 250));
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(12, 13, 1072, 61);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Club Registration");
		lblNewLabel.setFont(new Font("Georgia", Font.PLAIN, 40));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(230, 230, 250));
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(12, 87, 408, 358);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel fullname = new JLabel("Name");
		fullname.setFont(new Font("Georgia", Font.PLAIN, 15));
		fullname.setBounds(42, 39, 100, 16);
		panel_1.add(fullname);
		
		JLabel lblMatricNo = new JLabel("Matric No.");
		lblMatricNo.setFont(new Font("Georgia", Font.PLAIN, 15));
		lblMatricNo.setBounds(42, 68, 100, 16);
		panel_1.add(lblMatricNo);
		
		JLabel lblPhoneNo = new JLabel("Phone No.");
		lblPhoneNo.setFont(new Font("Georgia", Font.PLAIN, 15));
		lblPhoneNo.setBounds(42, 97, 100, 16);
		panel_1.add(lblPhoneNo);
		
		JLabel lblFaculty = new JLabel("Faculty");
		lblFaculty.setFont(new Font("Georgia", Font.PLAIN, 15));
		lblFaculty.setBounds(42, 126, 100, 16);
		panel_1.add(lblFaculty);
		
		JLabel lblYear = new JLabel("Year");
		lblYear.setFont(new Font("Georgia", Font.PLAIN, 15));
		lblYear.setBounds(42, 155, 100, 16);
		panel_1.add(lblYear);
		
		JLabel lblSemsession = new JLabel("Sem-Session");
		lblSemsession.setFont(new Font("Georgia", Font.PLAIN, 15));
		lblSemsession.setBounds(42, 184, 100, 16);
		panel_1.add(lblSemsession);
		
		textField_fn = new JTextField();
		textField_fn.setFont(new Font("Georgia", Font.PLAIN, 15));
		textField_fn.setBounds(165, 36, 191, 22);
		panel_1.add(textField_fn);
		textField_fn.setColumns(10);
		
		textField_mn = new JTextField();
		textField_mn.setFont(new Font("Georgia", Font.PLAIN, 15));
		textField_mn.setColumns(10);
		textField_mn.setBounds(165, 65, 191, 22);
		panel_1.add(textField_mn);
		
		textField_pn = new JTextField();
		textField_pn.setFont(new Font("Georgia", Font.PLAIN, 15));
		textField_pn.setColumns(10);
		textField_pn.setBounds(165, 94, 191, 22);
		panel_1.add(textField_pn);
		
		JComboBox faculty = new JComboBox();
		faculty.setModel(new DefaultComboBoxModel(new String[] {"[Select]", "FKI"}));
		faculty.setFont(new Font("Georgia", Font.PLAIN, 15));
		faculty.setBounds(165, 123, 87, 22);
		panel_1.add(faculty);
		
		JComboBox yy = new JComboBox();
		yy.setModel(new DefaultComboBoxModel(new String[] {"[Select]", "1", "2", "3", "4"}));
		yy.setFont(new Font("Georgia", Font.PLAIN, 15));
		yy.setBounds(165, 152, 87, 22);
		panel_1.add(yy);
		
		JComboBox ss = new JComboBox();
		ss.setModel(new DefaultComboBoxModel(new String[] {"[Select]", "1-2019/2020", "2-2019/2020", "1-2020/2021", "2-2020/2021"}));
		ss.setFont(new Font("Georgia", Font.PLAIN, 15));
		ss.setBounds(165, 181, 116, 22);
		panel_1.add(ss);
		
		JLabel lblClub = new JLabel("Club");
		lblClub.setFont(new Font("Georgia", Font.PLAIN, 15));
		lblClub.setBounds(42, 213, 100, 16);
		panel_1.add(lblClub);
		
		JComboBox club = new JComboBox();
		club.setModel(new DefaultComboBoxModel(new String[] {"[Select]", "Badminton", "Dancing", "Gymnastic", "Handball", "Netball", "Rugby", "Soccer", "Volleyball"}));
		club.setFont(new Font("Georgia", Font.PLAIN, 15));
		club.setBounds(165, 210, 129, 22);
		panel_1.add(club);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n = textField_fn.getText().toString();
				String m = textField_mn.getText().toString();
				String p = textField_pn.getText().toString();
				String f = faculty.getSelectedItem().toString();
				String y = yy.getSelectedItem().toString();
				String s = ss.getSelectedItem().toString();
				String c = club.getSelectedItem().toString();
				
				if(n.equals("")) {
					JOptionPane.showMessageDialog(null, "Full Name is mandatory");
				}
				if(m.equals("")) {
					JOptionPane.showMessageDialog(null, "Matric No. is mandatory");
				}
				if(p.equals("")) {
					JOptionPane.showMessageDialog(null, "Phone No is mandatory");
				}
				if(f.equals("[Select]")) {
					JOptionPane.showMessageDialog(null, "Faculty is mandatory");
				}
				if(y.equals("[Select]")) {
					JOptionPane.showMessageDialog(null, "Year is mandatory");
				}
				if(s.equals("[Select]")) {
					JOptionPane.showMessageDialog(null, "Sem-Session is mandatory");
				}
				if(c.equals("[Select]")) {
					JOptionPane.showMessageDialog(null, "Club is mandatory");
				}
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
						textField_fn.getText(),
						textField_mn.getText(),
						textField_pn.getText(),
						faculty.getSelectedItem(),
						yy.getSelectedItem(),
						ss.getSelectedItem(),
						club.getSelectedItem(),
				});
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null, "Data has been added", "Course Registration System", JOptionPane.OK_OPTION);
					}
				}
			}
		});
		btnAdd.setFont(new Font("Georgia", Font.PLAIN, 15));
		btnAdd.setBounds(33, 270, 97, 25);
		panel_1.add(btnAdd);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_fn.setText("");
				textField_mn.setText("");
				textField_pn.setText("");
				faculty.setSelectedItem("[Select]");
				yy.setSelectedItem("[Select]");
				ss.setSelectedItem("[Select]");
				club.setSelectedItem("[Select]");
			}
		});
		btnClear.setFont(new Font("Georgia", Font.PLAIN, 15));
		btnClear.setBounds(153, 270, 97, 25);
		panel_1.add(btnClear);
		
		JButton button = new JButton("Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				close();
				MainMenu m = new MainMenu();
				m.setVisible(true);
			}
		});
		button.setFont(new Font("Georgia", Font.PLAIN, 13));
		button.setBounds(274, 270, 97, 25);
		panel_1.add(button);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(230, 230, 250));
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(432, 87, 652, 358);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 13, 628, 287);
		panel_2.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Full Name", "Matric No.", "Phone No.", "Faculty", "Year", "Sem-Session", "Club"
			}
		));
		table.getColumnModel().getColumn(4).setPreferredWidth(52);
		table.getColumnModel().getColumn(5).setPreferredWidth(90);
		table.getColumnModel().getColumn(6).setPreferredWidth(113);
		scrollPane.setViewportView(table);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				//save to text file
		        try{
                 BufferedWriter bfw = new BufferedWriter(new FileWriter("course data.txt"));
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
		btnSave.setBounds(22, 313, 97, 25);
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
		btnDelete.setBounds(131, 313, 97, 25);
		panel_2.add(btnDelete);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				try {
					table.print();
				} catch(java.awt.print.PrinterException e) {
					System.err.format("No Printer found!", e.getMessage());
				}
			}
		});
		btnPrint.setFont(new Font("Georgia", Font.PLAIN, 15));
		btnPrint.setBounds(349, 313, 97, 25);
		panel_2.add(btnPrint);
		
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
		btnLoad.setBounds(240, 313, 97, 25);
		panel_2.add(btnLoad);
		
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
		btnExit.setBounds(458, 313, 97, 25);
		panel_2.add(btnExit);
	}
}

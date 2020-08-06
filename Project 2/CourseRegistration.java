import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

import java.io.*;
import java.io.IOException;

public class CourseRegistration extends JFrame {

	private JPanel contentPane;
	private JTextField name_textField;
	private JTextField matricNo_textField;
	@SuppressWarnings("rawtypes")
	private JComboBox pg_comboBox;
	private JComboBox semSession_comboBox;
	private JComboBox year_comboBox;
	private JComboBox crses_comboBox;
	private JTable table;
	private String output = " ";
	
	/**
	 * Launch the application.
	 */
	public void close() {
		WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CourseRegistration frame = new CourseRegistration();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CourseRegistration() {
		setTitle("FKI Registration System");
		setBackground(new Color(248, 248, 255));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(0, 0, 1085, 457);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 255, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(245, 255, 250));
		panel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		panel.setBounds(12, 13, 1042, 42);
		contentPane.add(panel);
		
		JLabel lbl_CourseHeader = new JLabel("Course Registration");
		lbl_CourseHeader.setFont(new Font("Georgia", Font.BOLD, 20));
		panel.add(lbl_CourseHeader);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(245, 255, 250));
		panel_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		panel_1.setBounds(12, 68, 369, 329);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lbl_studentName = new JLabel("Full Name");
		lbl_studentName.setFont(new Font("Georgia", Font.PLAIN, 15));
		lbl_studentName.setBounds(34, 39, 84, 18);
		panel_1.add(lbl_studentName);
		
		JLabel lbl_Matric = new JLabel("Matric No.");
		lbl_Matric.setFont(new Font("Georgia", Font.PLAIN, 15));
		lbl_Matric.setBounds(34, 70, 84, 18);
		panel_1.add(lbl_Matric);
		
		JLabel lbl_semSession = new JLabel("Sem-Session");
		lbl_semSession.setFont(new Font("Georgia", Font.PLAIN, 15));
		lbl_semSession.setBounds(34, 132, 84, 18);
		panel_1.add(lbl_semSession);
		
		JLabel lbl_year = new JLabel("Year");
		lbl_year.setFont(new Font("Georgia", Font.PLAIN, 15));
		lbl_year.setBounds(34, 163, 84, 18);
		panel_1.add(lbl_year);
		
		JLabel lbl_programme = new JLabel("Programme");
		lbl_programme.setFont(new Font("Georgia", Font.PLAIN, 15));
		lbl_programme.setBounds(34, 101, 84, 18);
		panel_1.add(lbl_programme);
		
		JLabel lblCourse = new JLabel("Course");
		lblCourse.setFont(new Font("Georgia", Font.PLAIN, 15));
		lblCourse.setBounds(34, 194, 84, 18);
		panel_1.add(lblCourse);
		
		name_textField = new JTextField();
		name_textField.setFont(new Font("Georgia", Font.PLAIN, 13));
		name_textField.setBounds(130, 37, 205, 22);
		panel_1.add(name_textField);
		name_textField.setColumns(10);
		
		matricNo_textField = new JTextField();
		matricNo_textField.setFont(new Font("Georgia", Font.PLAIN, 13));
		matricNo_textField.setColumns(10);
		matricNo_textField.setBounds(130, 68, 205, 22);
		panel_1.add(matricNo_textField);
		
		JComboBox year_comboBox = new JComboBox();
		year_comboBox.setFont(new Font("Georgia", Font.PLAIN, 13));
		year_comboBox.setModel(new DefaultComboBoxModel(new String[] {"[Select]", "1", "2", "3", "4"}));
		year_comboBox.setBounds(130, 161, 103, 22);
		panel_1.add(year_comboBox);
		
		JComboBox semSession_comboBox = new JComboBox();
		semSession_comboBox.setFont(new Font("Georgia", Font.PLAIN, 13));
		semSession_comboBox.setModel(new DefaultComboBoxModel(new String[] {"[Select]", "1-2019/2020", "2-2019/2020", "1-2020/2021", "2-2020/2021"}));
		semSession_comboBox.setBounds(130, 130, 128, 22);
		panel_1.add(semSession_comboBox);
		
		JComboBox pg_comboBox = new JComboBox();
		pg_comboBox.setFont(new Font("Georgia", Font.PLAIN, 13));
		pg_comboBox.setModel(new DefaultComboBoxModel(new String[] {"[Select]", "HC00", "HC05", "HC14"}));
		pg_comboBox.setBounds(130, 101, 103, 22);
		panel_1.add(pg_comboBox);
		
		JComboBox crses_comboBox = new JComboBox();
		crses_comboBox.setModel(new DefaultComboBoxModel(new String[] {"[Select]", "KT14303", "KT14503", "KT14203", "KT14403", "KT24103", "KT24503", "KT24103", "KT24203", "KT24403", "KT24602", "KT24803", "KT34103", "KT34303", "KT34503", "KT34203", "KT44102", "KT44302", "KT44502"}));
		crses_comboBox.setFont(new Font("Georgia", Font.PLAIN, 13));
		crses_comboBox.setBounds(130, 192, 103, 22);
		panel_1.add(crses_comboBox);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(245, 255, 250));
		panel_2.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		panel_2.setBounds(393, 68, 661, 329);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 13, 637, 267);
		panel_2.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Full Name", "Matric No", "Programme", "Sem-Session", "Year", "Course"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(164);
		table.getColumnModel().getColumn(1).setPreferredWidth(115);
		table.getColumnModel().getColumn(2).setPreferredWidth(91);
		table.getColumnModel().getColumn(3).setPreferredWidth(89);
		table.setForeground(Color.BLACK);
		table.setBackground(Color.WHITE);
		scrollPane.setViewportView(table);
		
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
		btnDelete.setBounds(121, 293, 97, 25);
		panel_2.add(btnDelete);
		btnDelete.setFont(new Font("Georgia", Font.PLAIN, 13));
		
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
		btnSave.setBounds(12, 293, 97, 25);
		panel_2.add(btnSave);
		btnSave.setFont(new Font("Georgia", Font.PLAIN, 13));
		
		JButton btnPrint = new JButton("Print");
		btnPrint.setFont(new Font("Georgia", Font.PLAIN, 13));
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				try {
					table.print();
				} catch(java.awt.print.PrinterException e) {
					System.err.format("No Printer found!", e.getMessage());
				}
			}
		});
		btnPrint.setBounds(339, 293, 97, 25);
		panel_2.add(btnPrint);
		
		JButton button = new JButton("Load");
		button.addActionListener(new ActionListener() {
			@SuppressWarnings("unused")
			public void actionPerformed(ActionEvent e) {
				String filepath = "course data.txt";
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
		button.setFont(new Font("Georgia", Font.PLAIN, 15));
		button.setBounds(230, 293, 97, 25);
		panel_2.add(button);
		
		JButton buttonExit = new JButton("Exit");
		buttonExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int response = JOptionPane.showConfirmDialog(null, "Do you want to exit?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (response == JOptionPane.YES_OPTION){
			        System.exit(0);
			    }    
			}
		});
		buttonExit.setFont(new Font("Georgia", Font.PLAIN, 15));
		buttonExit.setBounds(448, 293, 97, 25);
		panel_2.add(buttonExit);
		
		JButton btn_Add = new JButton("Add");
		btn_Add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n = name_textField.getText().toString();
				String m = matricNo_textField.getText().toString();
				String p = pg_comboBox.getSelectedItem().toString();
				String s = semSession_comboBox.getSelectedItem().toString();
				String y = year_comboBox.getSelectedItem().toString();
				String c = crses_comboBox.getSelectedItem().toString();
				
				if(n.equals("")) {
					JOptionPane.showMessageDialog(null, "Full Name is mandatory");
				}
				if(m.equals("")) {
					JOptionPane.showMessageDialog(null, "Matric No. is mandatory");
				}
				if(p.equals("[Select]")) {
					JOptionPane.showMessageDialog(null, "Programme is mandatory");
				}
				if(s.equals("[Select]")) {
					JOptionPane.showMessageDialog(null, "Sem-Session is mandatory");
				}
				if(y.equals("[Select]")) {
					JOptionPane.showMessageDialog(null, "Year is mandatory");
				}
				if(c.equals("[Select]")) {
					JOptionPane.showMessageDialog(null, "Course is mandatory");
				}
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
						name_textField.getText(),
						matricNo_textField.getText(),
						pg_comboBox.getSelectedItem(),
						semSession_comboBox.getSelectedItem(),
						year_comboBox.getSelectedItem(),
						crses_comboBox.getSelectedItem(),
			});
				
			if(table.getSelectedRow()==-1) {
				if(table.getRowCount()==0) {
					JOptionPane.showMessageDialog(null, "Data has been added", "Course Registration System", JOptionPane.OK_OPTION);		
			}
		}	  
	}
});
		btn_Add.setBounds(21, 253, 97, 25);
		panel_1.add(btn_Add);
		
		JButton btn_Clear = new JButton("Clear");
		btn_Clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				name_textField.setText("");
				matricNo_textField.setText("");
				pg_comboBox.setSelectedItem("[Select]");
				semSession_comboBox.setSelectedItem("[Select]");
				year_comboBox.setSelectedItem("[Select]");
				crses_comboBox.setSelectedItem("[Select]");
			}
		});
		btn_Clear.setBounds(136, 253, 97, 25);
		panel_1.add(btn_Clear);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(252, 253, 97, 25);
		panel_1.add(btnBack);
		btnBack.setFont(new Font("Georgia", Font.PLAIN, 13));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				close();
				MainMenu mm = new MainMenu();
				mm.setVisible(true);
			}
		});
	}
}

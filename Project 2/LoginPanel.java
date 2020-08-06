import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.Toolkit;

//open this code using eclipse
public class LoginPanel extends JFrame {

	private JPanel contentPane;
	private JTextField username_textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPanel frame = new LoginPanel();
					frame.setTitle("FKI Registration System");
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
	public LoginPanel() {
		setBackground(new Color(0, 0, 0));
		setIconImage(Toolkit.getDefaultToolkit().getImage(LoginPanel.class.getResource("/javax/swing/plaf/basic/icons/JavaCup16.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 235, 205));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_Header = new JLabel("Login Form");
		lbl_Header.setBounds(152, 27, 138, 43);
		lbl_Header.setFont(new Font("Georgia", Font.BOLD, 20));
		contentPane.add(lbl_Header);
		
		JLabel lbl_username = new JLabel("Username");
		lbl_username.setBounds(51, 95, 84, 16);
		lbl_username.setFont(new Font("Georgia", Font.PLAIN, 15));
		contentPane.add(lbl_username);
		
		JLabel lbl_password = new JLabel("Password");
		lbl_password.setBounds(51, 134, 84, 16);
		lbl_password.setFont(new Font("Georgia", Font.PLAIN, 15));
		contentPane.add(lbl_password);
		
		username_textField = new JTextField();
		username_textField.setBounds(152, 92, 189, 22);
		contentPane.add(username_textField);
		username_textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(152, 131, 189, 22);
		contentPane.add(passwordField);
		
		JButton btn_Login = new JButton("Login");
		btn_Login.setForeground(new Color(0, 0, 0));
		btn_Login.setBackground(new Color(211, 211, 211));
		btn_Login.setBounds(90, 190, 97, 25);
		btn_Login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!username_textField.getText().equals("") && !passwordField.getText().equals("")) {
				close();
				MainMenu mm = new MainMenu();
				mm.setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "Username and password can't be blank!");
				}
			}
		});
		btn_Login.setFont(new Font("Georgia", Font.PLAIN, 15));
		contentPane.add(btn_Login);
		
		JButton btn_Cancel = new JButton("Cancel");
		btn_Cancel.setBackground(new Color(211, 211, 211));
		btn_Cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int response = JOptionPane.showConfirmDialog(null, "Do you want to exit?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				 if (response == JOptionPane.YES_OPTION)
			     {
			        System.exit(0);
			     } 

			}
		});
		btn_Cancel.setBounds(244, 190, 97, 25);
		btn_Cancel.setFont(new Font("Georgia", Font.PLAIN, 15));
		contentPane.add(btn_Cancel);
	}
}


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Toolkit;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;

public class MainMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
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
	public MainMenu() {
		setTitle("FKI Registration System");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 341);

		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 224));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_main = new JLabel("Welcome to the Main Menu");
		lbl_main.setFont(new Font("Georgia", Font.BOLD, 20));
		lbl_main.setBounds(74, 47, 300, 24);
		contentPane.add(lbl_main);
		
		JButton btnCourse = new JButton("Course");
		btnCourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				close();
				CourseRegistration cr = new CourseRegistration();
				cr.setVisible(true);
			}
		});
		btnCourse.setFont(new Font("Georgia", Font.PLAIN, 18));
		btnCourse.setBounds(158, 97, 114, 40);
		contentPane.add(btnCourse);
		
		JButton btnNewButton = new JButton("College");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				close();
				ResidentialRegistration rr = new ResidentialRegistration();
				rr.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Georgia", Font.PLAIN, 18));
		btnNewButton.setBounds(158, 150, 114, 40);
		contentPane.add(btnNewButton);
		
		JButton btnClub = new JButton("Club");
		btnClub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				close();
				ClubRegistration cr = new ClubRegistration();
				cr.setVisible(true);
			}
		});
		btnClub.setFont(new Font("Georgia", Font.PLAIN, 18));
		btnClub.setBounds(158, 203, 114, 40);
		contentPane.add(btnClub);
	}
}

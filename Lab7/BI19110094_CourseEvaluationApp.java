/* NAME: NURUL ASYIKIN BINTI AMAT
   MATRIC NO: BI19110094
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
//required for border
import javax.swing.BorderFactory;
import javax.swing.border.Border;
//required for file IO
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.BufferedReader;
//required for exception
import java.io.IOException;

//Header panel
class HeaderPanel extends JPanel{
   private JLabel header;
   public HeaderPanel(){
      	header = new JLabel("Course Evaluation Form");
      	add(header);
   }
}

//Form Panel
class FormPanel extends JPanel implements ActionListener, ItemListener{
   //list all UI components for the panel
   JLabel lbl_name;
   JTextField name;
   JLabel lbl_matric;
   JTextField matric;
   JLabel lbl_code;
   JComboBox<String> code;
   JLabel lbl_rating;
   JLabel lbl_outcome;
   JButton b_submit;
   JButton b_clear;
   JCheckBox c1;
   JCheckBox c2;
   JLabel lbl_output; 
   JScrollPane jsp;
   Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
   
   //global variable  
   String output="";
   String code_selection="";
   String rb_selection="";
   String cb_selection="";
   String filePath="evaluationform.txt"; //in the same directory
      
   public FormPanel(){   
      setLayout(new FlowLayout(FlowLayout.LEFT));     
      
      lbl_name = new JLabel("Name");
      lbl_name.setPreferredSize(new Dimension(150, 20));
      lbl_name.setBorder(border);
      
      add(lbl_name);
      name = new JTextField(20);
      add(name);
      
      //input name will not accept any number.
      name.addKeyListener(new KeyAdapter() {
         public void keyTyped(KeyEvent e) {
         char c=e.getKeyChar(); 
            if(Character.isAlphabetic(c) || (c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_DELETE) || (c==KeyEvent.VK_SPACE)) {
                e = e;
            }
           else{
                e.consume();
            }
        }
});
     
      lbl_matric = new JLabel("Matric No.");
      lbl_matric.setPreferredSize(new Dimension(150, 20));
      lbl_matric.setBorder(border);
      add(lbl_matric);
      matric = new JTextField(15);
      add(matric);   
      
      String[] courses={"[Select]", "KK14203 OOP", "KT14203 CAO", "KT14403 Discrete Structure"};
      
      lbl_code = new JLabel("Course Code");
      lbl_code.setPreferredSize(new Dimension(150, 20));
      lbl_code.setBorder(border);
      add(lbl_code);
      code = new JComboBox<String>(courses);
      add(code); 
      
      //JComboBox action listener
      code.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent ae){
            //get selected item
            code_selection = (String) code.getSelectedItem();
         }
      });  
      
      lbl_rating = new JLabel("Rating");
      lbl_rating.setPreferredSize(new Dimension(150, 20));
      lbl_rating.setBorder(border);
      add(lbl_rating);
      
      //Radio buttons and action listener
      JRadioButton rb1 = new JRadioButton("1");
      rb1.addActionListener(this);
      JRadioButton rb2 = new JRadioButton("2");
      rb2.addActionListener(this);
      JRadioButton rb3 = new JRadioButton("3");
      rb3.addActionListener(this);
      JRadioButton rb4 = new JRadioButton("4");
      rb4.addActionListener(this);
      JRadioButton rb5 = new JRadioButton("5");
      rb5.addActionListener(this);
      add(rb1);
      add(rb2);
      add(rb3);
      add(rb4);
      add(rb5);
      
      //define button group
      ButtonGroup bg = new ButtonGroup();
      bg.add(rb1);
      bg.add(rb2);
      bg.add(rb3);
      bg.add(rb4);
      bg.add(rb5);
      
      lbl_outcome = new JLabel("Outcome");
      lbl_outcome.setPreferredSize(new Dimension(150, 20));
      lbl_outcome.setBorder(border);
      add(lbl_outcome);
      
      //checkbox and  item listener
      c1 = new JCheckBox("Basic knowledge");
      c1.addItemListener(this);
      c2 = new JCheckBox("Advanced knowledge");
      c2.addItemListener(this);
      add(c1);
      add(c2);
      
      b_submit = new JButton("Submit");
      add(b_submit);
      b_clear = new JButton("Clear");
      add(b_clear);
      
      //handle button submit action listener
      //view the input to output label
      //and write to file
      b_submit.addActionListener(new ActionListener(){           
         public void actionPerformed(ActionEvent e){  
            //call method
            if(printOutput()){
               writeInput();  
               
               //show dialog message if input is succesfully saved
               JOptionPane.showMessageDialog(null, "You have successfully save the data");
            }   
         }  
      });
      
      //handle button clear action listener
      b_clear.addActionListener(new ActionListener(){  
         public void actionPerformed(ActionEvent e){  
            lbl_output.setText("Output");  
            name.setText("");
            matric.setText(""); 
            code.setSelectedIndex(0);
            bg.clearSelection();
            c1.setSelected(false);
            c2.setSelected(false);
         }  
      });
      
      lbl_output = new JLabel("Output");
      lbl_output.setBorder(border);
      lbl_output.setVerticalAlignment(JLabel.TOP);
      
      //add output label to scrollpane
      jsp = new JScrollPane(lbl_output);
      jsp.setPreferredSize(new Dimension(410,120));
      add(jsp);     
   }

   //handle radio button selection
   public void actionPerformed(ActionEvent ae) {
      rb_selection = ae.getActionCommand();    	   
   }
   
   //handle item listener for checkbox
   public void itemStateChanged(ItemEvent ie) {
      JCheckBox check = (JCheckBox)ie.getSource();
      cb_selection += check.getText() + " ";   
   }
   
   //method to print output to lbl_output
   public boolean printOutput(){
      output = "<html>";
      output += "Thank you for your evaluation<br><br>"; 
      output += "Name: " + name.getText() + "<br>";
      output += "Matric: " + matric.getText() + "<br>";
      
      if(code_selection.equals("[Select]") || code.getSelectedItem().equals("")  || name.getText().equals("") || matric.getText().equals("") || rb_selection.equals("") || cb_selection.equals("")){
         JOptionPane.showMessageDialog(null, "You haven't filled everything.");
         return false;
      }
      
      output += "Course: " + code_selection + "<br>";
      output += "Rating: " + rb_selection + "<br>";
      output += "Outcome: " + cb_selection + "<br>";
      output += "</html>";          
      lbl_output.setText(output);
      jsp.getViewport().revalidate();
      return true;
    }
    
    //write to file
    public void writeInput(){
      File file = new File(filePath);
		FileWriter fr = null;
		BufferedWriter br = null;
		PrintWriter pr = null;
      
      String input = name.getText() + ", " + matric.getText() + ", " + code_selection + ", " + rb_selection + ", " + cb_selection;
      
      //exception implementation
		try {
			// to append to file, you need to initialize FileWriter using below constructor
			fr = new FileWriter(file, true);
			br = new BufferedWriter(fr);
			pr = new PrintWriter(br);
			pr.println(input);
		} catch (IOException e) {			
         lbl_output.setText(e.toString());
		} finally {
			try {
				pr.close();
				br.close();
				fr.close();
			} catch (IOException e) {
				lbl_output.setText(e.toString());
			}
		}
    }
}

class MenuActionListener implements ActionListener {
   FormPanel fp;
   //receive FormPanel class to this constructor
   public MenuActionListener(FormPanel p){
      fp = p;
}
    
   public void actionPerformed(ActionEvent e) {      
      BufferedReader reader;
	   try {
			reader = new BufferedReader(new FileReader(fp.filePath));
			String line = reader.readLine();
         String output="<html>";
			while (line != null) {
				output += line + "<br>";
				// read next line
				line = reader.readLine();
			}
         output += "<br>";
         fp.lbl_output.setText(output);
			reader.close();
		} catch (IOException io) {
			fp.lbl_output.setText(io.toString());
		}
  }
}

class MenuActionListener2 implements ActionListener {
   FormPanel fp;
   //receive FormPanel class to this constructor
   public MenuActionListener2(FormPanel p){
      fp = p;
}
    
   public void actionPerformed(ActionEvent e) {   
      
      //show confirm dialog to exit application
      int response = JOptionPane.showConfirmDialog(null,"Do you want to Exit? ", 
     "Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);

     if (response == JOptionPane.YES_OPTION)
     {
        System.exit(0);
     } 
  }
}

//run the application using this main
public class BI19110094_CourseEvaluationApp {  
   public static void main(String[] 	args) {  
      JFrame f = new JFrame("Evaluation");
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
      //load panels
      HeaderPanel h = new 	HeaderPanel();
      FormPanel fp = new FormPanel();
      
      JMenuBar mb = new JMenuBar(); 
      // create a menu 
      JMenu x = new JMenu("Menu"); 
      
      // create menuitems 
      JMenuItem m1 = new JMenuItem("Load Data"); 
      // attach listener and send FormPanel class
      m1.addActionListener(new MenuActionListener(fp));
      
      JMenuItem m2 = new JMenuItem("Exit");
      m2.addActionListener(new MenuActionListener2(fp));
 
      // add menu items to menu 
      x.add(m1); 
      x.add(m2);
     
      // add menu to menu bar 
      mb.add(x); 
      // add menubar to frame 
      f.setJMenuBar(mb);  
               
      //add panels to frame       
      f.add(h,BorderLayout.NORTH);
      f.add(fp, BorderLayout.CENTER);
      f.setSize(460,400);
      f.setVisible(true);
   }  
}

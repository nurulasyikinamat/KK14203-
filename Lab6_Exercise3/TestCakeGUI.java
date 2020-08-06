/* NAME: NURUL ASYIKIN BINTI AMAT
   MATRIC NO: BI19110094
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.ArrayList;
import java.io.*;
import java.io.IOException;

class TestCakeGUI extends JPanel implements ActionListener{
    private JLabel jcomp1;
    private JLabel jcomp2;
    private JButton btnAdd;
    private JTextArea jt1;
    private JComboBox jcb;
    private JButton btnOrder;
    private static Cake cake;
    private static ArrayList<String> order;
    private JButton save;
    private String output = " ";
    private String Name = " ";
    private boolean ifChecked = false;
    
    public TestCakeGUI(Cake cake, String Name) {
        this.cake = cake;
        this.Name = Name;
        order = new ArrayList<String>();
        
        //construct preComponents
        String[] jcbItems = {"[Select]"};

        //construct components
        jcomp1 = new JLabel (Name);
        jcomp2 = new JLabel ("Toppings Selection");
        btnAdd = new JButton ("Add Topping");
        jt1 = new JTextArea (5, 5);
        JScrollPane jt1_sp = new JScrollPane(jt1);
        jcb = new JComboBox (jcbItems);
        btnOrder = new JButton ("Order");
        save = new JButton("Save");
        
        btnAdd.addActionListener(this);
        btnOrder.addActionListener(this);
        save.addActionListener(this);
        
        //adjust size and set layout
        setPreferredSize (new Dimension (514, 385));
        setLayout (null);

        //add components
        add (jcomp1);
        add (jcomp2);
        add (btnAdd);
        add (jt1_sp);
        add (jcb);
        add (btnOrder);
        add (save);

        //set component bounds (only needed by Absolute Positioning)
        jcomp1.setBounds (195, 10, 150, 25);
        jcomp2.setBounds (25, 55, 125, 25);
        btnAdd.setBounds (365, 55, 125, 25);
        jt1_sp.setBounds (25, 120, 465, 240);
        jcb.setBounds (180, 55, 180, 25);
        btnOrder.setBounds (365, 90, 125, 25);
        save.setBounds (230, 90, 125, 25);
    }

   public void Checking(){
      ifChecked = true;
   }   
   
   public boolean Checked(){
      return ifChecked;
   }
      
   public void actionPerformed(ActionEvent ae){
      String command = ae.getActionCommand(); 
      
      if(command.equals("Add Topping")){
         order.add(jcb.getSelectedItem().toString());      
         jt1.append(jcb.getSelectedItem().toString() + "\n");   
      }
      else if(command.equals("Order")){
         String str_order[] = new String[order.size()]; 
         Checking();
         
         // ArrayList to Array Conversion 
         for (int j = 0; j < order.size(); j++) { 
            // Assign each value to String array 
            str_order[j] = order.get(j); 
         }  
         cake.cakeOrder(str_order, 1, 2);
         String txt = cake.printOrder_GUI();
         jt1.append(txt);
      }     
      else if(command.equals("Save") && Checked()==false){ //message will be shown if user didn't click the button order first.
         JOptionPane.showMessageDialog(null, "Click the button Order fist. Thank you :)");
      }
      else if(command.equals("Save") && Checked()==true){
        output = cake.printOrder_GUI();
        
        //save to text file
        try{
            FileWriter writer = new FileWriter("cakedata.txt", true);
            writer.write(output);
            writer.close();
            JOptionPane.showMessageDialog(null, "Success");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error");
        }        
   }       
 }
        
   public void updateCB(String[] topping){
      for(int i=0; i<topping.length; i++){
         jcb.addItem(topping[i]);
      }      
   }   
}

class TestCake{
   private static Cake cake;
   public static void main (String[] args) {
      cake = new Cake("Generic");
      
      JFrame frame = new JFrame ("BI19110094 Cake System");
      String[] topping = {"Lava Chocolate", "Cream Cheese", "Candy Pop", "Fondant"};
      cake.setCake(topping, 45.00, 65.00, 80.00); 
      
      TestCakeGUI capp = new TestCakeGUI(cake, cake.name + " Cake Menu"); 
      capp.updateCB(topping);
      
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().add (capp);
      frame.pack();
      frame.setVisible (true);
   }
}

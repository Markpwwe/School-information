import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.util.ArrayList;
import java.awt.Color;

public class School implements ActionListener {
	
	private static ArrayList<String> accountList = new ArrayList<>();
	private static JTextField field;
	private static JTextField field1;
	private static JTextField field2;
	private static JLabel panel3;
	private static JLabel panel;
	private static JLabel panel1;
	private static JLabel panel2;
	private static JLabel label;
	private static JLabel label4;
	private static JLabel label5;
	private static JLabel label6;
	private static JLabel label7;
	private static JLabel label8;
	private static JLabel label9;
	private static JButton button;
	private static JButton button1;
	private static JButton button2;
	private static JButton button3;
	private static JPanel BGpanel;;
	private static JFrame frame;
	

    public static void main(String[] args) {    
       
    
    frame = new JFrame();
    field = new JTextField();    
    field.setBounds(100,100,250,25);
    field1 = new JTextField();
    field1.setBounds(100,150,250,25);
    field2 = new JTextField();
    field2.setBounds(100,200,250,25);
  
 	frame.setSize(500,700);
    frame.setVisible(true);
    frame.setLayout(null);
    frame.setTitle("School ");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
   
    BGpanel = new JPanel();
    BGpanel.setBounds(0,370,500,250);
    BGpanel.setBackground(Color.gray);
    BGpanel.setLayout(new BorderLayout());
    BGpanel.setLayout(null);
    frame.add(BGpanel);
    
    
    
    panel3 = new JLabel("School Information");
    panel3.setBounds(180,30,150,70);
    
    
    
    panel = new JLabel("Firstname     : ");  
   	panel.setBounds(10,100,80,25);
   	panel1 = new JLabel("Surename     : ");   	
   	panel1.setBounds(10,150,80,25);
    panel2 = new JLabel("LRN    :");
    panel2.setBounds(10,200,100,25);
    
    
    button = new JButton("READ");
    button.setBounds(150,250,80,25);
    frame.add(button);
    
    
    button1 = new JButton("EXIT");
    button1.setBounds(250,250,80,25);
    frame.add(button1);
    
    button2 = new JButton("CREATE");
    button2.setBounds(50,250,80,25);
    button2.addActionListener(new School());
    frame.add(button2);
    
    button3 = new JButton("DELETE");
    button3.setBounds(350,250,80,25);
    frame.add(button3);
    
    label = new JLabel("");
    label.setBounds(100,300,150,25);
   	frame.add(label);
   	
   	
   	label4 = new JLabel("");
    label4.setLayout(null);
    label4.setBounds(80,10,120,100);
    BGpanel.add(label4);
    
    label5 = new JLabel("");
    label5.setLayout(null);
    label5.setBounds(80,35,100,100);
    BGpanel.add(label5);
    
    label6 = new JLabel("");
    label6.setLayout(null);
    label6.setBounds(80,65,100,100);
    BGpanel.add(label6);
    
    label7 = new JLabel("First name : ");
    label7.setLayout(null);
    label7.setBounds(5,10,95,100);
    BGpanel.add(label7);
    
    label8 = new JLabel("Surname   : ");
    label8.setLayout(null);
    label8.setBounds(5,35,95,100);
    BGpanel.add(label8);
    
    label9 = new JLabel("LRN       : ");
    label9.setLayout(null);
    label9.setBounds(5,65,95,100);
    BGpanel.add(label9);
    
       
    
    frame.add(field);
    frame.add(field1);
    frame.add(field2);
    frame.add(panel);
    frame.add(panel1);
    frame.add(panel2);
    frame.add(panel3);
    
    
    }    
    @Override
    	public void actionPerformed(ActionEvent e)  {
    		
    		String user = field.getText();
    		String user1 = field1.getText();
    		String user2 = field2.getText();
    		  
          if(user.equals("Mark") && user1.equals("Sacendoncillo") && user2.equals("2000261026")){
    	label.setText("Create Successful!!");  
    	}
   
     button1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
    });
    

    
    try {
            FileWriter writer = new FileWriter("School Account.txt");
            writer.write("First name: " + user + ", Surname: " + user1 + ", LRN:  " + user2);
            writer.close();
        } catch (IOException a) {
            a.printStackTrace();
        }  

 
 	button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = field.getText();               
                String input1 = field1.getText();
                String input2 = field2.getText();
                label4.setText(input);
                label5.setText(input1);
                label6.setText(input2);
                
            }
        });
        
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                field.setText("");
                field1.setText("");
                field2.setText("");
            }
        });
 
 
 
    }
}
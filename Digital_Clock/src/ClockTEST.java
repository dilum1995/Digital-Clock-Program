
import java.util.*;
import java.text.*;

import java.awt.Font;

import java.awt.GridBagLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 
public class ClockTEST {
 
  public static void main(String[] args) {
 
	Clock1 dayLable = new Clock1("didsplay day");
	
	Clock1 timeLable = new Clock1("didsplay time");
	
	Clock1 dateLable = new Clock1("didsplay date");
	
	
	
 
    JFrame f = new JFrame("Programming Princpales 01 (CW)");
    f.setSize(550,300);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setLayout(new GridLayout(4, 1));
 
    f.add(dayLable);
    f.add(timeLable);
    f.add(dateLable);
   
    
    //create a button to display my details
    JButton b2 = new JButton("Greetings");
    JPanel p = new JPanel(new GridBagLayout());
    
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.getContentPane().setBackground(Color.black);
    f.setVisible(true);
    
   
    //JButton b2 = new JButton("Student Details");
	b2.addActionListener(new ActionListener() {
		
	//set an action to button 2, when i clicked button 2 it will display a message which contains my details.  
	public void actionPerformed(ActionEvent ev)
	{
		//set colors to the option pane
		UIManager.put("OptionPane.background",new ColorUIResource(245, 232, 252));
		    UIManager.put("Panel.background",new ColorUIResource(245, 232, 252));	
		    	JOptionPane.showMessageDialog(null,"\n~~~~ Have a nice day !! ~~~~~" + "\n\nCreated by - Dilum De Silva");}
	});
	

    //add button to the panel
	p.add(b2);

    //add panel to the frame
	f.add(p);
	
	//setting background color of panel to black
	p.setBackground(Color.black);
  }
}
 
class Clock1 extends JLabel implements ActionListener {
 
  String clock;
  //java date format 
  SimpleDateFormat dformat;
 
  public Clock1(String ctest)
  {
	  
    this.clock = ctest;

 
		  switch (clock) 
		
		  {
		    
		  case 
		    "didsplay day"  : dformat = new SimpleDateFormat("EEEE  ");
		       	setFont(new Font("serif", Font.ITALIC, 25));
		       	setForeground(Color.LIGHT_GRAY);
		       		setHorizontalAlignment(SwingConstants.CENTER);
		  break;
		                    			
		  case
		   	"didsplay time" : dformat = new SimpleDateFormat("hh:mm:ss a");
		       	setFont(new Font("Digital-7", Font.PLAIN, 70));
		       	setForeground(Color.GREEN);
		       		setHorizontalAlignment(SwingConstants.CENTER);		       		
		       		
		  break;
		      							
		  case
		    "didsplay date" : dformat = new SimpleDateFormat(" dd MMMM yyyy");
		        setFont(new Font("serif", Font.ITALIC, 17));
		        setForeground(Color.WHITE);
		        	setHorizontalAlignment(SwingConstants.CENTER);
		  break;
		                    	
		  default     : dformat = new SimpleDateFormat();
		  break;
		  
		  
		  }

    Timer t = new Timer(1000, this);
    t.start();
  
  }
  
 
  public void actionPerformed(ActionEvent ae)
  
  {
	  
    Date d= new Date();
    setText(dformat.format(d));
  }
  
}

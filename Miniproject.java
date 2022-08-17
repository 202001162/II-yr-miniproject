package calcu;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Miniproject extends JFrame implements ActionListener{
	JLabel l,l1,l2,login;
	TextField t1,t2;
	Miniproject()
	{	
		setSize(800,700);
		setTitle("      OOPS MINI PROJECT    ");
		setLocation(600,100);
		setLayout(null);
		getContentPane().setBackground(Color.orange);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		l=new JLabel("_________STUDENT LOGIN_________");
		l.setBounds(70,30,600,20);
		l1=new JLabel("USERNAME");
		l1.setBounds(50,100,100,20);
		
		l2=new JLabel("PASSWORD");
		l2.setBounds(50,140,100,20);
		
		t1=new TextField("");
		t1.setBounds(170,100,120,20);
		
		t2=new TextField("");
		t2.setBounds(170,140,120,20);
		JButton b1=new JButton("LOGIN");
		b1.setBounds(95,200,80,20);
		b1.setBackground(Color.cyan);
		b1.addActionListener(this);
		add(l);
		add(l1);
		add(l2);
		add(t1);
		add(t2);
		add(b1);
		setVisible(true);
	}
	public static void main(String args[]) 
	{
		Miniproject m=new Miniproject();
	}
	public void actionPerformed(ActionEvent e) {
		
		String user=t1.getText();
		String password=t2.getText();
		if(user.equals("vigneshkumar.s")&&password.equals("25-07-2003"))
		{
			TextArea a1=new TextArea("\n=========STUDENT DETAILS==========\n"
					+ "\n\tName: VIGNESHKUMAR.S\n"
					+ "\n\tDob: 25-07-2003\n"
					+"\n\tRollno: 202001162\n"
					+"\n\tCSE DEPT 2ND YEAR\n"
					+"\n=========LOGIN SUCCESSFUL!!!========\n");
			a1.setBounds(50,260,370,260);
			add(a1);
		}
		else if(user.equals("vignesh.u")&&password.equals("19-02-2002"))
		{			
			TextArea a1=new TextArea("\n=========STUDENT DETAILS==========\n"
					+ "\n\tName: VIGNESH.U\n"
					+ "\n\tDob: 19-02-2002\n"
					+"\n\tRollno: 202001163\n"
					+"\n\tCSE DEPT 2ND YEAR\n"
					+"\n=========LOGIN SUCCESSFUL!!!========\n");
			a1.setBounds(50,260,370,260);
			add(a1);
		}
		else if(user.equals("suryalakshmanan.s")&&password.equals("11-01-2001"))
		{
			TextArea a1=new TextArea("\n=========STUDENT DETAILS==========\n"
					+ "\n\tName: SURYALAKSHMANAN.S\n"
					+ "\n\tDob: 11-01-2001\n"
					+"\n\tRollno: 202001150\n"
					+"\n\tCSE DEPT 2ND YEAR\n"
					+"\n=========LOGIN SUCCESSFUL!!!========\n");
			a1.setBounds(50,260,370,260);
			add(a1);
		}
		else 
		{
			TextField a2=new TextField("\n\n\nXXXXXX Invalid user name and password XXXXXX");
			a2.setBounds(50,260,300,90);
			add(a2);
		}
	}
}

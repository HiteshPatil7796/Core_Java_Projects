package awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JdbcProjects extends JFrame implements ActionListener {

	JFrame jm=new JFrame();
	JTextField text1=new JTextField(10);
	JTextField text2=new JTextField(10);
	JTextField text3=new JTextField(10);
	JTextField text4=new JTextField(10);
	JTextField text5=new JTextField(10);
	
	JLabel l=new JLabel("Student Information ");
	JLabel l1=new JLabel("Student Roll No : ");
	JLabel l2=new JLabel("Student Name : ");
	JLabel l3=new JLabel("Student Age : ");
	JLabel l4=new JLabel("Student City : ");
	JLabel l5=new JLabel("Student Email Id : ");
	JButton btn1,btn2,btn3,btn4;
	
	JdbcProjects()
	{
		btn1=new JButton(" Show Records ");
		btn2=new JButton(" Insert Records ");
		btn2=new JButton(" Update Records ");
		btn3=new JButton(" Delete Records ");
		
		add(l);
		l.setBounds(200, 20, 300, 50);
		add(l1);
		l1.setBounds(30, 100, 200, 30);
		add(l2);
		l2.setBounds(30, 150, 200, 30);
		add(l3);
		l3.setBounds(30, 200, 200, 30);
		add(l4);
		l4.setBounds(30, 250, 200, 30);
		add(l5);
		l5.setBounds(30, 300, 200, 30);
		
		add(text1);
		text1.setBounds(200, 100, 200, 30);
		add(text2);
		text2.setBounds(200, 150, 200, 30);
		add(text3);
		text3.setBounds(200, 200, 200, 30);
		add(text4);
		text4.setBounds(200, 250, 200, 30);
		add(text5);
		text5.setBounds(200, 300, 200, 30);
		
		add(btn1);
		btn1.setBounds(30, 400, 200, 30);
		add(btn2);
		btn2.setBounds(200, 400, 200, 30);
		add(btn3);
		btn3.setBounds(30, 450, 200, 30);
		add(btn4);
		btn4.setBounds(200, 450, 200, 30);
		
		/*btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		*/
		setLayout(null);
		setVisible(true);
		setTitle("Student Information ");
		
		getContentPane().setBackground(Color.BLUE);
		setSize(500,600);
	}
public static void main(String args[]) {
		
		new JdbcProjects();

	}
	
	public void actionPerformed(ActionEvent e)
	{
		/*try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/spark","root","");
			
			Statement st;
			if(e.getSource()==btn1)
			{
				st=con.createStatement();
				int rollno=Integer.parseInt(text1.getText());
				ResultSet rs=st.executeQuery("select * from student where rollno="+rollno);
			}*/
		}


	}



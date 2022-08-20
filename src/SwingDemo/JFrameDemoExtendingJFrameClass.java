package SwingDemo;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFrameDemoExtendingJFrameClass extends JFrame {

	public JFrameDemoExtendingJFrameClass()
	{
		setTitle("MyWindow");
		JLabel lb=new JLabel("Welcome to my second demo ");
		add(lb);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,400);
		setVisible(true);
	}
	public static void main(String[] args) {
		
		new JFrameDemoExtendingJFrameClass();

	}

}

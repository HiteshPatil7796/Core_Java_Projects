package SwingDemo;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JFrameDemo1 
{
	JFrame jf;
	public JFrameDemo1()
	{
		jf=new JFrame("MyWIndow");
		JButton btn=new JButton("Say Hello");
		jf.add(btn);
		jf.setLayout(new FlowLayout());
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(400,400);
		jf.setVisible(true);
	}
	public static void main(String[] args) {
		
		new JFrameDemo1();

	}

}



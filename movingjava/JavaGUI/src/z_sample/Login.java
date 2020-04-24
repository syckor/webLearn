package z_sample;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;


public class Login extends JFrame {
	
	JTextField tf;
	JTextField tf2;
	JButton button;
	
	
	Login(){
		
		tf = new JTextField(20);
		tf2 = new JTextField(20);
		button = new JButton("Login");
	}
	
	
	public void display() {
		
		JLabel label = new JLabel("아이디");
		JLabel label2 = new JLabel("비밀번호");
		setLayout(new BorderLayout());
		
			JPanel labels = new JPanel();
			labels.setLayout(new GridLayout(2,2));
			labels.add(label);  labels.add(tf);
			labels.add(label2); labels.add(tf2);
			
		add(labels, BorderLayout.CENTER);	
		add(button, BorderLayout.EAST);
		
		setLocation(300,300);
		setSize(266,100);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
	
	

	public static void main(String[] args) {
		
		Login in = new Login();
		in.display();
	}

}

package x_coffee;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MakeOrder extends JPanel{
	JButton numUp;
	JButton numDown;
	JTextField num;
	int count =0;
	public MakeOrder() {
		numUp=new JButton("+");
		numDown =new JButton("-");
		num = new JTextField(String.valueOf(count));

		
		
		JPanel p1=new JPanel(new GridLayout(1,3));
		p1.add(numUp);
		p1.add(num);
		p1.add(numDown);
		add(p1);
	}
	public void setCount() {
		count++;
		num.setText(String.valueOf(count));
	}
	
}

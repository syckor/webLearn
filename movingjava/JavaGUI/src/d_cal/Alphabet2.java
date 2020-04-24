package d_cal;

import java.awt.*;
import javax.swing.*;

public class Alphabet2 extends JFrame{
	//멤버변수
	JButton []b = new JButton[26];
	
	//생성자
	Alphabet2(){
		
		char a = 'A';				
		for(int i = 0; i<26; i++,a++) {
			b[i] = new JButton(String.valueOf(a));
		}	
			//출력
			
		setSize(700,200);
		setVisible(true);	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
		setLayout(new BorderLayout());
		JPanel buttons = new JPanel();
		buttons.setLayout(new GridLayout(2,13));
		for(int i = 0; i <26 ; i++) {
			buttons.add(b[i]);
		}
		add(buttons, BorderLayout.CENTER);
		
	}


	public static void main(String[] args) {
		
		Alphabet2 al = new Alphabet2();
	

	}

}
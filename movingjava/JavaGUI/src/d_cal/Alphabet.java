package d_cal;

import java.awt.*;
import javax.swing.*;

public class Alphabet {
	//멤버변수
	JButton alp[] = new JButton[26];
	JFrame f;
	
	
	//생성자
	Alphabet(){
		
		f = new JFrame();
		char a = 'A';
		for(int i = 0; i < 26; i++,a++) {
			alp[i] = new JButton(String.valueOf(a));
		}
	
		
	}
	
	//출력
	
	public void display() {
		
		
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(500,400);
		f.setVisible(true);
		
		f.setLayout(new BorderLayout());
			JPanel buttons = new JPanel();
			buttons.setLayout(new GridLayout(2,13));
		for(int i = 0; i <26; i++) {
			buttons.add(alp[i]);
		}
		f.add(buttons, BorderLayout.CENTER);	
	}

	public static void main(String[] args) {
		
		Alphabet al = new Alphabet();
		al.display();

	}

}

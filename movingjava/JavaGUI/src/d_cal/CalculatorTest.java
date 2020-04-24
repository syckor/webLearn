package d_cal;

import java.awt.*;

import javax.swing.*;


public class CalculatorTest extends JFrame {
	//1. 멤버변수 선언
	JButton n[] = new JButton[10];
	JButton plus, subs, multi, devide, equal;
	TextField tf;
	
	//2. 객체선언
	public CalculatorTest() {
		super("유치원 계산기");
		
		for(int i = 0; i < 10; i++) {
			n[i] = new JButton(String.valueOf(i));
		}
		plus = new JButton("+");
		equal = new JButton("=");
		subs = new JButton("-");
		multi = new JButton("*");
		devide = new JButton("/");	
		
		tf = new TextField();
	}
	
	//3. 화면 구성 및 출력하기
	
	
	public void display() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,400);
		setVisible(true);
		
		
		
		
		
			JPanel buttons = new JPanel();
			buttons.setLayout(new GridLayout(5,3));
			for(int i = 1; i <10; i++) {
				buttons.add(n[i]);
			}			
			buttons.add(plus);buttons.add(n[0]);buttons.add(equal);
			buttons.add(subs);buttons.add(multi);buttons.add(devide);
		add(buttons, BorderLayout.CENTER);	
		add(tf, BorderLayout.NORTH);
		
		
	}

	public static void main(String[] args) {
		CalculatorTest t = new CalculatorTest();
		t.display();
		

	}

}

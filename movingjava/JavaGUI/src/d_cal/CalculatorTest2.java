package d_cal;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class CalculatorTest2 extends JFrame implements ActionListener{
	//1. 멤버변수 선언
	JButton n[] = new JButton[10];
	JButton plus, subs, multi, devide, equal;
	TextField tf;
	
	int prev;  //이전값
	String op;    //연산자
	int second;
	int result;
	double devideSecond;
	double devideResult;
	double devidePrev;
	//2. 객체선언
	public CalculatorTest2() {
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

	public void actionPerformed(ActionEvent e) {//이벤트를 e에 저장
		JButton evt = (JButton)e.getSource();//저장된 이벤트 e에서 소스를 가져와서 evt에 저장
		
		//숫자가 눌렸을 경우
		for (int i = 0; i < 10; i++) {
			if (evt == n[i]) {             //evt와 n[i] 가 같다면
				String su = tf.getText(); // su에 tf에 있는 값을 넣어줌
				su += n[i].getText();     //su는 기존의 su에 n[i]에 있는 텍스트를 더해준다
				tf.setText(su);
			}
		}
		//연산자가 눌렸을 때
		if(evt == plus) {
			prev = Integer.parseInt(tf.getText());
			tf.setText(null); //null로 화면을 지움
			op = evt.getText();
			
		}else if (evt == subs) {
			prev = Integer.parseInt(tf.getText());
			tf.setText(null); //null로 화면을 지움
			op = evt.getText();
			
		}else if (evt == multi) {
			prev = Integer.parseInt(tf.getText());
			tf.setText(null); //null로 화면을 지움
			op = evt.getText();
			
		}else if (evt == devide) {
			devidePrev = Double.parseDouble(tf.getText());
			tf.setText(null); //null로 화면을 지움
			op = evt.getText();
		}
		
		
		// '='이 눌렸을 때
		if (evt == equal) {
			switch(op) {
			case "+":
				this.second = Integer.parseInt(tf.getText());
				result = prev + second;
				tf.setText(String.valueOf(result)); break;
			case "-":
				this.second = Integer.parseInt(tf.getText());
				result = prev - second;
				tf.setText(String.valueOf(result)); break;
			case "*":
				this.second = Integer.parseInt(tf.getText());
				result = prev * second;
				tf.setText(String.valueOf(result)); break;
			case "/":
				devideSecond = Double.parseDouble(tf.getText());
				devideResult = devidePrev / devideSecond;
				tf.setText(String.valueOf(devideResult)); break;
			}
		}
		
	}
	
	public void eventProc() {
		for(int i = 0; i < n.length; i++) {
			n[i].addActionListener(this);
		}
		plus.addActionListener(this);
		equal.addActionListener(this);
		subs.addActionListener(this);
		multi.addActionListener(this);
		devide.addActionListener(this);
		
	}
	public static void main(String[] args) {
		CalculatorTest2 t = new CalculatorTest2();
		t.display();
		t.eventProc();
	}

	
	

}

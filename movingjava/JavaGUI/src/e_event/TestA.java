package e_event;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TestA extends JFrame{
	
	JButton b; 
	TextField tf;
	
	TestA(){
		b = new JButton("확인");
		tf = new TextField(10);
		
		setLayout(new FlowLayout());
		
		add(b);	
		add(tf);
		
		setSize(300,300);
		setLocation(200,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	

	}
	
	public void display() {
		
		setSize(300,300);
		setLocation(200,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
	
	public void eventProc() {
		//(2)이벤트 핸들러 객체생성
		MyEvent me = new MyEvent();
		
		//(3)이벤트 연결
		b.addActionListener(me);
		tf.addActionListener(me);
	}
	
	//(1) 이벤트 핸들러
	class MyEvent implements ActionListener{
		public void actionPerformed(ActionEvent e) { //사용자가 이벤트를 발생시킬때 JVM이 자동으로 불러준다
			Object evt = e.getSource();
			if ( evt == b) {
				String msg = b.getText();
				JOptionPane.showMessageDialog(null,msg + "이벤트발생1");
			}else if (evt == tf) {
				String msg = tf.getText();
				JOptionPane.showMessageDialog(null, msg + "입력했음");
			}						
		}	
	}
	

	
	public static void main(String[] args) {
		
		TestA test = new TestA();
		test.display();
		test.eventProc();
	}

}

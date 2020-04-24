package e_event;
/*
 * [이벤트 절차]
 * 1.이벤트 핸들러 (이벤트를 구현한 클래스)
 *  (1) Listner (interface)
 *  (2) 이벤트 메소드를 overriding
 * 2. 1번 객체 생성
 * 3. 이벤트 발생할 컴포넌트와 2번 객체와 연결
 * 
 * **ActionEvent  어지간하면 이거하나로 끝남
 * 1) Button Click
 * 2) Menu Click
 * 3) Text Field Enter
 * 4) list Double Click
 * 5) Checkbox, RadioButton Click
 * Etc...
 * 
 * 
 */
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

//(1)Event Handler
public class TestB extends JFrame implements ActionListener {
	
	JButton b; 
	TextField tf;
	
	TestB(){
		b = new JButton("확인");
		tf = new TextField(10);
		
		setLayout(new FlowLayout());
		
		add(b);	
		add(tf);
	}
	
	public void display() {
		
		setSize(300,300);
		setLocation(200,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	

	}
	
	public void eventProc() {
		//(3)이벤트 연결
		b.addActionListener(this);
		tf.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object evt = e.getSource();
		if ( evt == b) {
			String msg = b.getText();
			JOptionPane.showMessageDialog(null,msg + "이벤트발생1");
		}else if (evt == tf) {
			String msg = tf.getText();
			JOptionPane.showMessageDialog(null, msg + "입력했음");
		}	
		
	}
	
	public static void main(String[] args) {
		
		TestB test = new TestB();
		test.display();
		test.eventProc();
	}


}

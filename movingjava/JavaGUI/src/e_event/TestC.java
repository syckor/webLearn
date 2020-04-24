package e_event;
import javax.swing.*; //textA축약본
import java.awt.*;
import java.awt.event.*;
public class TestC extends JFrame{
	
	JButton b; 
	TextField tf;
	
	TestC(){
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
		//(3)이벤트 연결
		b.addActionListener(new ActionListener() //ActionListener를 구현한 이름모를 클래스를 new한것 
		{
			public void actionPerformed(ActionEvent e) { 
					String msg = b.getText();
					JOptionPane.showMessageDialog(null,msg + "벝은 이벤트발생");	
			}	
		});	
		tf.addActionListener(new ActionListener() //ActionListener를 구현한 이름모를 클래스를 new한것 
				{
					public void actionPerformed(ActionEvent e) { 
							String msg = tf.getText();
							JOptionPane.showMessageDialog(null,msg + "라고 입력");	
					}	
				});
	}
	
	//(1) 이벤트 핸들러
//	class MyEvent implements ActionListener{
//		public void actionPerformed(ActionEvent e) { 
//				String msg = b.getText();
//				JOptionPane.showMessageDialog(null,msg + "벝은 이벤트발생1");							
//		}	
//	}
	

	
	public static void main(String[] args) {
		
		TestC test = new TestC();
		test.display();
		test.eventProc();
	}

}

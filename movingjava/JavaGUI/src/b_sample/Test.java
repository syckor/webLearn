package b_sample;
// AWT -----> SWING
import java.awt.*;
import javax.swing.*;

public class Test {
	
	// 멤버변수 선언
	JFrame f;
	JButton b;
	JLabel l;
	JTextField t;
	JTextArea ta;
	JCheckBox cb;
	JCheckBox cb2;
	JList lis;
	
	public Test () {
		
		//객체 생성
		f = new JFrame("나의 창");
		b = new JButton("Ok");
		l = new JLabel("name");
		t = new JTextField("이름은 5자 미만", 40);
		ta = new JTextArea();
		cb = new JCheckBox("male",true);
		cb2 = new JCheckBox("female");
		String []data = {"beef", "chicken", "pork", "lamb"};
		lis = new JList(data);
		
		
		
		
		// 붙이기
		//Layout : 붙이는 방식
		//f.setLayout(new FlowLayout());
		//f.setLayout(new GridLayout(4,2));
		f.setLayout(new BorderLayout()); //한 영역에 하나밖에 못붙임
		f.add(b, BorderLayout.WEST);
		f.add(l, BorderLayout.EAST);
			JPanel list = new JPanel();
			list.setLayout(new GridLayout(1,2));
			list.add(lis);
			list.add(t);
		f.add(list, BorderLayout.NORTH);
		f.add(ta, BorderLayout.CENTER);
			JPanel p = new JPanel();
			p.setLayout(new GridLayout(2,1));
			p.add(cb);
			p.add(cb2);
		f.add(p, BorderLayout.SOUTH);
		//f.add(lis, BorderLayout.CENTER);
		
		//화면 출력
		f.setSize(500,400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		
		Test t = new Test();
		
		

	}

}

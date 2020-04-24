package a_sample;
import java.awt.*;
import javax.swing.*;

//-------------is-a 방식

public class Test2 extends JFrame{
	//멤버변수 선언
	//남자 래디오버튼  / 여자 래뒤오 버튼
	//"성인" 라디오 버튼/ "미성년"라디오 버튼
	
	
	public Test2() {
		super("나의 창2"); //제일 윗줄에 와야한다
		
		//객체 생성
		JRadioButton male = new JRadioButton("남자");
		JRadioButton female = new JRadioButton("여자",true);
		JRadioButton adult = new JRadioButton("성인");
		JRadioButton child = new JRadioButton("미성년",true);
		
		ButtonGroup bg1 = new ButtonGroup();
		bg1.add(male);
		bg1.add(female);
		
		ButtonGroup bg2 = new ButtonGroup();
		bg2.add(adult);
		bg2.add(child);
		
		//붙이기 
		setLayout(new FlowLayout());
		
		
		add(male);
		add(female);
		add(adult);
		add(child);
		
		//화면 출력
		setSize(500,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		
		Test2 t = new Test2();

	}

}

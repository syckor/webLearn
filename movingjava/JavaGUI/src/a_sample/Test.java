package a_sample;

import java.awt.*;
//----------------------has-a 방식
public class Test {
	
	// 멤버변수 선언
	Frame f;
	//버튼 선언
	Button b;
	Label l;
	TextField t;
	TextArea ta;
	Checkbox cb;
	Checkbox cb2;
	List lis;
	
	public Test () {
		
		//객체 생성
		f = new Frame("나의 창");
		b = new Button("Ok");
		l = new Label("name");
		t = new TextField("이름은 5자 미만", 40);
		ta = new TextArea("빈공간",11,15,10);
		cb = new Checkbox("male",true);
		cb2 = new Checkbox("female");
		lis = new List(4,false);
		lis.add("beef");
		lis.add("chicken");
		lis.add("pork");
		lis.add("lamb");
		
		
		
		// 붙이기
		//Layout : 붙이는 방식
		//f.setLayout(new FlowLayout());
		//f.setLayout(new GridLayout(4,2));
		f.setLayout(new BorderLayout()); //한 영역에 하나밖에 못붙임
		f.add(b, BorderLayout.WEST);
		f.add(l, BorderLayout.EAST);
		f.add(t, BorderLayout.NORTH);
		f.add(ta, BorderLayout.CENTER);
			Panel p = new Panel();
			p.setLayout(new GridLayout(2,1));
			p.add(cb);
			p.add(cb2);
		f.add(p, BorderLayout.SOUTH);
		//f.add(lis, BorderLayout.CENTER);
		
		//화면 출력
		f.setSize(500,400);
		f.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		Test t = new Test();
		
		

	}

}

package c_info;

import javax.swing.*;
import java.awt.*;

public class InfoTest extends JFrame{

	//1. 멤버변수 선언
	JTextArea ta;
	JButton bAdd, bShow, bSearch, bDelete, bCancel, bExit;
	JTextField tfName, tfId, tfTel, tfSex, tfAge, tfHome;
	JLabel lName, lId, lTel, lSex, lAge, lHome;
	InfoTest(){
		//2. 객체 생성
		ta = new JTextArea();
		
		bAdd = new JButton("Add", new ImageIcon("src/c_info/Imgs/15.png"));
		bAdd.setVerticalTextPosition(JButton.BOTTOM);
		bAdd.setHorizontalTextPosition(JButton.CENTER);
		bAdd.setPressedIcon(new ImageIcon("src/c_info/Imgs/17.png"));
		bAdd.setRolloverIcon(new ImageIcon("src/c_info/Imgs/18.png"));
		bAdd.setToolTipText("사용자 정보를 입력합니다");
		bAdd.setMnemonic('i'); //alt + i
		bAdd.setBackground((Color.magenta));	
	
		
		
		bShow = new JButton("Show", new ImageIcon("src/c_info/Imgs/16.png"));
		bShow.setVerticalTextPosition(JButton.BOTTOM);
		bShow.setHorizontalTextPosition(JButton.CENTER);
		
		bSearch = new JButton("Search", new ImageIcon("src/c_info/Imgs/17.png"));
		bDelete = new JButton("Delete", new ImageIcon("src/c_info/Imgs/18.png"));
		bCancel = new JButton("Cancel", new ImageIcon("src/c_info/Imgs/19.png"));
		bExit = new JButton("Exit", new ImageIcon("src/c_info/Imgs/20.png"));
		
		tfName = new JTextField(10);
		tfId = new JTextField(10);
		tfTel = new JTextField(10);
		tfSex = new JTextField(10);
		tfAge = new JTextField(10);
		tfHome = new JTextField(10);
		
		lName = new JLabel("Name",new ImageIcon("src/c_info/Imgs/15.png"),JLabel.CENTER);
		lId = new JLabel("Id",new ImageIcon("src/c_info/Imgs/25.png"),JLabel.CENTER);
		lTel = new JLabel("Tel",new ImageIcon("src/c_info/Imgs/24.png"),JLabel.CENTER);
		lSex = new JLabel("Sex",new ImageIcon("src/c_info/Imgs/23.png"),JLabel.CENTER);
		lAge = new JLabel("Age",new ImageIcon("src/c_info/Imgs/22.png"),JLabel.CENTER);
		lHome = new JLabel("Home",new ImageIcon("src/c_info/Imgs/21.png"),JLabel.CENTER);
		
	}
	
	void display() {
		//3. 화면 구성 및 출력
		setLocation(200, 200);
		setSize(700,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
			JPanel south = new JPanel();
			south.setLayout(new GridLayout(1,6));
			south.add(bAdd);
			south.add(bShow);
			south.add(bSearch);
			south.add(bDelete);
			south.add(bCancel);
			south.add(bExit);
		
		
			JPanel west = new JPanel();
			west.setLayout(new GridLayout(6,2));
		
			west.add(lName);
			west.add(tfName);
			
			west.add(lId);
			west.add(tfId);
			
			west.add(lTel);
			west.add(tfTel);
			
			west.add(lSex);
			west.add(tfSex);
			
			west.add(lAge);
			west.add(tfAge);
			
			west.add(lHome);
			west.add(tfHome);	
			
		add(west, BorderLayout.WEST);	
		add(south, BorderLayout.SOUTH);
		add(ta, BorderLayout.CENTER);
	}
	
	public static void main(String[] args) {
		InfoTest t = new InfoTest();
		t.display();
		
		

	}

}

package c_info;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class InfoView extends JFrame{

	//1. 멤버변수 선언
	JTextArea ta;
	JButton bAdd, bShow, bModify, bDelete, bCancel, bExit;
	JTextField tfName, tfId, tfTel, tfSex, tfAge, tfHome;
	JLabel lName, lId, lTel, lSex, lAge, lHome;
	////1. business logic을 실행하는 일반 클래수 변수선언
	InfoModel Model;
	
	
	InfoView(){
		//2. 객체 생성
		ta = new JTextArea();
		
		bAdd = new JButton("Add", new ImageIcon("src/c_info/Imgs/15.png"));
		
		
		
		
		
		bShow = new JButton("Show", new ImageIcon("src/c_info/Imgs/16.png"));
		bModify = new JButton("Modify", new ImageIcon("src/c_info/Imgs/17.png"));
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
		
		////2. 비지니스 로직 역할을 하는 클래스 객체 생성
		try {
			Model = new InfoModelImpl();
			System.out.println("db준비성공");
		} catch (Exception e) {
			System.out.println("드라이버 로딩 실패");
		}
		
	}
	
	void display() {
		//3. 화면 구성 및 출력
		setLocation(200, 200);
		setSize(900,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		setLayout(new BorderLayout());
			JPanel south = new JPanel();
			south.setLayout(new GridLayout(1,6));
			south.add(bAdd);
			south.add(bShow);
			south.add(bModify);
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
	
	public void eventProc() {
		MyEvent me = new MyEvent();
		
		bAdd.addActionListener(me);
		bShow.addActionListener(me);
		bModify.addActionListener(me);
		bDelete.addActionListener(me);
		bCancel.addActionListener(me);
		bExit.addActionListener(me);
		
		tfTel.addActionListener(me);
		//id를 엔터쳤을때 이벤트처리
		
		
		//윈도우에 x버튼 눌려졌을때의 이벤트처리
		addWindowListener(new WindowAdapter() { //Adapter를 썼을 때 주의할 점 : 오버라이딩할때 오타가 나면 망함. Listener를 쓴 다음에 확인 후 Adapter쓸것		
			public void windowClosing(WindowEvent e) {	
				int result = JOptionPane.showConfirmDialog(null, "Real EXIT?");
				if(result == JOptionPane.OK_OPTION) {
					System.exit(0);
				}	
			}			
		});				
	}
		
	
	class MyEvent implements ActionListener{
		public void actionPerformed(ActionEvent e) { //ActionListener 내부의 추상메쏘드
			Object evt = e.getSource();	//형변환
			
			//add벗은이 눌렸을 때
			if(evt == bAdd) {
				
				try {
					//각 테스트필드 값을 얻어옴
					String name = tfName.getText();
					String id = tfId.getText();
					String tel = tfTel.getText();
					String sex = tfSex.getText();
					int age = Integer.parseInt(tfAge.getText());					
					String home = tfHome.getText();
					
					//각각의 값들을 InfoVO의 값으로 지정
					InfoVO Vo = new InfoVO(name,id,tel,sex,age,home); 
					
					Model.insert(/*입력값 받아야함, 자료형도 다르고 많을 수도 있으니 클래스를 만들자*/Vo);
					
					//입력후 각 텍스트필드를 초기화
					tfName.setText("");
					tfId.setText("");
					tfTel.setText("");
					tfSex.setText("");
					tfAge.setText("");
					tfHome.setText("");
					
				} catch (SQLException e1) {
					System.out.println("실패");
				}
				
				
				
			}else if (evt == bShow ) {
				showRecord();
				
			}else if (evt == bModify ) {
				modifyRecord();
				
			}else if (evt == bDelete ) {
				deleteRecord();
				
			}else if (evt == bCancel ) {
				String msg = bAdd.getText();
				JOptionPane.showMessageDialog(null, "Cancel");
			}else if (evt == bExit ) {
				System.exit(0);
			}
			else if (evt == tfTel) {
				selectByTel();
			}
			
		}
		
	}
	void deleteRecord() {
		try {
			Model.delete(tfTel.getText());
		} catch (SQLException e) {
			ta.setText("삭제실패 :" + e.getMessage());
		}
		
		tfName.setText("");
		tfId.setText("");
		tfTel.setText("");
		tfSex.setText("");
		tfAge.setText("");
		tfHome.setText("");
	}
	
	void selectByTel() {
	
		//1. 사용자가 입력한 전화번호 얻어오기
		String tel = tfTel.getText();
		//2. 모델의 selectByTel()함수의 인자로 1번보냄
		InfoVO vo;
		try {
			vo = Model.selectByTel(tel);
			
			//3. 2번 객체의 각각의 값을 텍스트필드에 지정
			tfName.setText(vo.getName());
			tfId.setText(vo.getId());
			tfSex.setText(vo.getSex());
			tfAge.setText(String.valueOf(vo.getAge()));
			tfHome.setText(vo.getHome());
		} catch (SQLException e) {
			ta.setText("전번검색실패 :" + e.getMessage());
		}
		
		
		
	}
	void modifyRecord() {
		try {
			//각 테스트필드 값을 얻어옴
			String name = tfName.getText();
			String id = tfId.getText();
			String tel = tfTel.getText();
			String sex = tfSex.getText();
			int age = Integer.parseInt(tfAge.getText());					
			String home = tfHome.getText();
			
			//각각의 값들을 InfoVO의 값으로 지정
			InfoVO Vo = new InfoVO(name,id,tel,sex,age,home); 
			
			Model.modify(Vo);
			
			//입력후 각 텍스트필드를 초기화
			tfName.setText("");
			tfId.setText("");
			tfTel.setText("");
			tfSex.setText("");
			tfAge.setText("");
			tfHome.setText("");
			
		} catch (SQLException e1) {
			System.out.println("실패");
		}
	}
	
	void showRecord() {
		//1. Database 파일의 selectAll()호출하여 ArrayList로 받음
	
		try {
			ArrayList<InfoVO> list = Model.selectAll();
			ta.setText(" ");
			for(int i = 0; i < list.size(); i++) {
				InfoVO vo = list.get(i); //만약 제네릭스가 없으면 Object리턴하므로 (InfoVO)로 형변환 해야함
				ta.append(vo.toString());
			}
			
		} catch (SQLException e) {
			ta.setText("전체보기실패" + e.getMessage());
		}	
	}
	
	public static void main(String[] args) {
		InfoView t = new InfoView();
		t.display();
		t.eventProc();
		
	}
}

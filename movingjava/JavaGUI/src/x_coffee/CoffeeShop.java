package x_coffee;

import java.awt.*;
import java.awt.event.*;
import java.util.Vector;

import javax.swing.*;

public class CoffeeShop extends JFrame implements ActionListener{
	int menu = 5;		//메뉴 개수
	
	//메뉴 이름 및 가격 및 이미지파일 위치 배열화 (중복코딩을 제거하기 위함)
	String[] menuName = new String[] {"아메리카노","카페라떼","카페모카","카라멜 마끼아또","프라푸치노"}; 
	int[] menuPrice = new int[] {1000,1500,1500,2000,2000};											
	String[] iconSrc = new String[] {"src/x_coffee/img/1.png","src/x_coffee/img/2.png","src/x_coffee/img/3.png",
									"src/x_coffee/img/4.png","src/x_coffee/img/5.png",}; 
	
	//토탈 가격
	int result=0;		
	
	//메뉴 버튼 및 구매 버튼
	JButton[] jb= new JButton[menu];	
	JButton buyb;						
	
	//구매한 메뉴 표시를 위한 텍스트
	JList jl;
	JList jl2;
	JList jl3;
	Vector listData = new Vector(); // ArrayList 동일
	Vector listData2 = new Vector(); // ArrayList 동일
	Vector listData3 = new Vector(); // ArrayList 동일

	JTextField jtf;		
	JLabel la1;
	JLabel la1_1;
	JLabel la1_2;
	JLabel la2;
	
	//수량 더하고 빼는 클래스 생성
	
	MakeOrder []mo = new MakeOrder[menu];
	CoffeeShop() {
		// 모든 객체 초기화
		jtf= new JTextField();
		jl = new JList(listData);
		jl2 = new JList(listData2);
		jl3 = new JList(listData3);
		listData.setSize(5);
		listData2.setSize(5);
		listData3.setSize(5);
		la1 = new JLabel("상품 리스트");
		la1_1 = new JLabel("개수");
		la1_2 = new JLabel("가격");
		la2 = new JLabel("총 금액");
		for(int i=0; i<jb.length; i++) {
			jb[i]=new JButton(menuName[i],new ImageIcon(iconSrc[i]));
			jb[i].addActionListener(this);
		
		}
		
		buyb = new JButton("구매");
		buyb.addActionListener(this);
		
		//판넬 추가
		JPanel p1 = new JPanel(new GridLayout(2,menu));		
		for(int i=0; i<jb.length; i++) {
			p1.add(jb[i]);
		}// for i end
		for(int i=0; i<jb.length; i++) {
			mo[i] = new MakeOrder();
			mo[i].numDown.addActionListener(this);
			mo[i].numUp.addActionListener(this);
			p1.add(mo[i]);
		}// for i end
		add(p1,BorderLayout.CENTER);
		JPanel p2 = new JPanel(new GridLayout(4,1));
		JPanel p2_1 = new JPanel(new BorderLayout());
		JPanel p2_2 = new JPanel(new BorderLayout());
		JPanel p2_3 = new JPanel(new BorderLayout());
		JPanel p2_4 = new JPanel(new BorderLayout());
		JPanel p2_5 = new JPanel(new BorderLayout());
		
		p2_3.add(la1,BorderLayout.NORTH);
		p2_3.add(jl,BorderLayout.CENTER);
		
		p2_4.add(la1_1,BorderLayout.NORTH);
		p2_4.add(jl2,BorderLayout.CENTER);
		
		p2_5.add(la1_2,BorderLayout.NORTH);
		p2_5.add(jl3,BorderLayout.CENTER);
		
		p2_2.add(p2_3,BorderLayout.WEST);
		p2_2.add(p2_4,BorderLayout.CENTER);
		p2_2.add(p2_5,BorderLayout.EAST);
		
		p2_1.add(la2,BorderLayout.NORTH);
		p2_1.add(jtf,BorderLayout.CENTER);
		p2_1.add(buyb,BorderLayout.SOUTH);
		
		p2.add(p2_2);
		p2.add(p2_1);

		add(p2,BorderLayout.EAST);
		
	}
	void display() {
		setSize(1920,1080);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	//이벤트 메소드
	public void actionPerformed(ActionEvent e) { 
		Object ev = e.getSource();
		
		for(int i=0; i<menu; i++) {
			// 이미지를 직접 누른 경우
			if(ev==jb[i]) gatsuUp(i);
			// + 버튼을 누른 경우  ( 결과는 동일)
			if(ev==mo[i].numUp) gatsuUp(i);
			// -버튼을 누른 경우
			if(ev==mo[i].numDown) {
				if(mo[i].count!=0) {
					
					result-=menuPrice[i];
					jtf.setText(result+"원");
					mo[i].count--;
					mo[i].num.setText(""+mo[i].count);
					listData2.set(i, mo[i].count);
					jl2.setListData(listData2);
					listData3.set(i, mo[i].count*menuPrice[i]);
					jl3.setListData(listData3);
					
					if(mo[i].count==0) {
						listData.remove(menuName[i]);
						jl.setListData(listData);
						listData2.remove(i);
						jl2.setListData(listData2);
						listData3.set(i, null);
						jl3.setListData(listData3);
					}
				}
			}// if end
		}// for i end
		
		if(ev==buyb) {
			int ref = JOptionPane.showConfirmDialog(null, "전체 가격은"+ result +" 원 입니다.\n구매하시겠습니까?");
			if(ref == JOptionPane.OK_OPTION) {
				JOptionPane.showMessageDialog(null,"주문이 접수 되었습니다.");
				System.exit(0);
			}
		}// 구매버튼이 눌리면 최종구매의향을 물어본 후 메시지 출력
		
		
	}
	public void gatsuUp(int i) {
		
		boolean checkName = false;
		for(int j=0; j<listData.size();j++) {
			if(jb[i].getText().equals(listData.get(j))) {
				checkName=true;
			}
		}//for j end
		if(checkName) {
			mo[i].count++;
			mo[i].num.setText(""+mo[i].count);
			listData2.set(i, mo[i].count);
			jl2.setListData(listData2);
			
		}
		else {
			listData.set(i, menuName[i]);
			jl.setListData(listData);
			mo[i].count++;
			listData2.set(i, mo[i].count);
			jl2.setListData(listData2);
		}
		
		listData3.set(i, mo[i].count*menuPrice[i]);
		jl3.setListData(listData3);
		result+=menuPrice[i];
		jtf.setText(result+"원");
		mo[i].num.setText(""+mo[i].count);
		
	}
	
	
	
	public static void main(String[] args) {
		CoffeeShop cs = new CoffeeShop();
		cs.display();
	}
}
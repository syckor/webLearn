package sulbing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class SulBing extends JFrame implements ActionListener {
	// 변수선언
	BestAdmin best;
	BingsuAdmin bingsu;
	DesertAdmin desert;
	BeverageAdmin beverage;
	
	JLabel laname, lamany, laprice;
	JTextField tf;
	JList list_name, list_many, list_Price;
	JButton order, cancel, cancelAll;
	JButton[] menu = new JButton[12];
	String[] me = { "딸기초코러블리설빙", "한딸기치즈설빙", "불고기피자", "생딸기복숭아설빙", "민트초코설빙", "딸기마카롱설빙", "생딸기와플", "생딸기찹쌀떡", "달콤퐁당꿀떡",
			"흑당스노우밀크티", "초코밀크티", "딸기피치우롱블렌드티" };
	
	Vector listData = new Vector(); // ArrayList 동일
	Vector listData2 = new Vector(); // ArrayList 동일
	Vector listData3 = new Vector(); // ArrayList 동일

	int price[] = {3000,4000,5000};
	
	int totalPrice;
	int howMany[] = new int[12];
	
	SulBing() {
		// 객체 생성
		// 메뉴별로 그리드 생성
		tf = new JTextField(10);
		
		list_name = new JList(listData);
		list_many = new JList(listData2);
		list_Price = new JList(listData3);
		
		listData.setSize(5);
		listData2.setSize(5);
		listData3.setSize(5);
		
		list_name.setPreferredSize(new Dimension(120, 10));
		
		
		
		laname = new JLabel("메뉴");
		lamany = new JLabel("수량");
		laprice = new JLabel("가격");
		
		laname.setSize(120, 10);
		
		order = new JButton("주문");
		cancel = new JButton("개별취소");
		cancelAll = new JButton("전체취소");
		//각각 메뉴별로 사진출력
		for (int i = 0; i < 12; i++) {
			menu[i] = new JButton(new ImageIcon("src/sulbing/img/"+ i + ".PNG"));
		}
		//마우스를 올리면 사진이 바뀌며 메뉴에 대한 설명이 출력
		for (int i = 0; i < 12; i++) {
			menu[i].setRolloverIcon(new ImageIcon("src/sulbing/img/" + (i +30) +  ".PNG"));
		}

		for (int i = 0; i < 12; i++) {
			menu[i].setBackground(Color.WHITE);
		}

		// 메뉴별 레이아웃 지정
		best = new BestAdmin(menu[0], menu[1], menu[2]);
		bingsu = new BingsuAdmin(menu[3], menu[4], menu[5]);
		desert = new DesertAdmin(menu[6], menu[7], menu[8]);
		beverage = new BeverageAdmin(menu[9], menu[10], menu[11]);
	}

	void display() {
		setLayout(new BorderLayout());

		JTabbedPane pane = new JTabbedPane();

		pane.add("베스트메뉴", best);
		pane.add("빙수메뉴", bingsu);
		pane.add("디저트메뉴", desert);
		pane.add("음료메뉴", beverage);
		add(pane, BorderLayout.CENTER);

		//버튼과 화면이 있는 패널 p
		JPanel p = new JPanel();
		p.setLayout(new BorderLayout());
		
		JPanel p4 = new JPanel();
		p4.setLayout(new BorderLayout());
		p4.add(tf, BorderLayout.NORTH);
		
		//주문/취소 버튼패널 p1
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(1,3));
		p1.add(order);
		p1.add(cancel);
		p1.add(cancelAll);
		p4.add(p1, BorderLayout.SOUTH);
		
		//리스트 패널 p2
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(1,3));
		p2.add(list_name); 
		p2.add(list_many);
		p2.add(list_Price);
		
		//라벨 패널 p3
		JPanel p3 = new JPanel();
		p3.setLayout(new GridLayout(1,3));
		p3.add(laname);
		p3.add(lamany);
		p3.add(laprice);
		
		p.add(p3, BorderLayout.NORTH);
		p.add(p2, BorderLayout.CENTER);
		p.add(p4, BorderLayout.SOUTH);
		
		add(p, BorderLayout.EAST);

	
		setSize(1200, 800);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}


	
	public void actionPerformed(ActionEvent e) {
		JButton evt = (JButton) e.getSource();

		
		//JList에 글을 입력,삭제하기 위해 변수와 객체생성
				
				int clear = 0;
		
				
		//주문버튼과 취소버튼 기능
		if (evt == order) {		
			JOptionPane.showConfirmDialog(null, "주문하시겠습니까?");
		} else if (evt == cancel) {
			
			JOptionPane.showConfirmDialog(null, "취소하시겠습니까?");
			tf.setText(null); 
			DefaultListModel model = (DefaultListModel) list_name.getModel();
			int selectedIndex = list_name.getSelectedIndex();
			if (selectedIndex != -1) {
			     
			    
			}      
		} else if (evt == cancelAll) {
			DefaultListModel model = (DefaultListModel) list_name.getModel();
			int selectedIndex1 = list_name.getSelectedIndex();
			if (selectedIndex1 != -1) {
			
			}

		}
		
		
		//메뉴버튼 기능
//		Vector listData = new Vector(); // ArrayList 동일
//		Vector listData2 = new Vector(); // ArrayList 동일
//		Vector listData3 = new Vector(); // ArrayList 동일
			//list_name, list_many, list_Price
		for (int i = 0; i < 12; i++) {
			if (menu[i] == evt) {
				  //howMany초기설정값 없기 때문에 ++을 해주고 시작
				
				boolean checkName = false;
				
				for(int j = 0; j < listData.size(); j++) {
					if(me[j].equals(listData.get(j))) {
						checkName = true;
					}
				}
				if(checkName) {
					listData2.set(i, howMany[i]++);
					list_many.setListData(listData2);
				}
				else {
					
					listData.set(i, me[i]);
					list_name.setListData(listData);
					listData2.set(i, howMany[i]++);
					list_many.setListData(listData2);
				}
				
				listData3.set(i, howMany[i]*price[0]);
				list_Price.setListData(listData3);
				totalPrice += howMany[i]*price[0];
				
			}
		}
		//
		tf.setText(String.valueOf(totalPrice) + "원");
	}

	public void eventProc() {
		
		cancel.addActionListener(this);
		order.addActionListener(this);
		cancelAll.addActionListener(this);
		
		for (int i = 0; i < 12; i++) {
			menu[i].addActionListener(this);
		}
	}

	public static void main(String[] args) {
		SulBing s = new SulBing();

		s.display();
		s.eventProc();
	}
}
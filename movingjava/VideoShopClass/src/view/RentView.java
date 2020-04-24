package  view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.AbstractTableModel;

import model.dao.RentModel;



public class RentView extends JPanel 
{
	JTextField tfRentTel, tfRentCustName, tfRentVideoNum;
	JButton bRent;
	
	JTextField tfReturnVideoNum;
	JButton bReturn;
	
	JTable tableRecentList;
	
	RentTableModel rentTM;
	
	//모델단
	RentModel model;
	
	
	//==============================================
	//	 생성자 함수
	public RentView(){
		addLayout();	//화면구성
		eventProc();	
		connectDB(); 	//DB연결
		selectList(); //미납목록보기
	}
	
	// DB 연결
	void connectDB(){
		try {
			model = new RentModel();
		} catch (Exception e) {
			System.out.println("대여관리-오라클드라이버실패" + e.getMessage());
		}
	}
	
	
	// 이벤트 등록
	public void eventProc(){
		BtnHandler handler = new BtnHandler();
		
		tfRentTel.addActionListener(handler);
		bRent.addActionListener(handler);
		bReturn.addActionListener(handler);
		                         
	}
	
	//이벤트핸들러
	class BtnHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			Object evt = e.getSource();
			if(evt == tfRentTel) {
				selectByTel();
				selectList();
			}else if (evt == bRent) {
				rentVideo();
			}else if (evt == bReturn) {
				returnVideo();
			}
			
		}
		
	}
	
	void selectByTel() {	
		try {
			String tel = tfRentTel.getText();
			String name =  model.selectByTel(tel);
			tfRentCustName.setText(name);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	void selectList() {
		try {
			rentTM.data = model.selectList();
			tableRecentList.setModel(rentTM);
			rentTM.fireTableDataChanged();
		} catch (Exception e) {

			System.out.println("미납목록검색실패:" + e.getMessage());
		}
	}
	
	void rentVideo() {
		try {
			int vnum = Integer.parseInt(tfRentVideoNum.getText());
			String tel = tfRentTel.getText();
			model.rentVideo(tel, vnum);
			
			
		} catch (Exception e) {
			System.out.println(" 대여실패:" + e.getMessage());
		}
		
		tfRentCustName.setText("");
		tfRentVideoNum.setText("");
		tfRentTel.setText("");
	}
	
	void returnVideo() {
		int vnum = Integer.parseInt(tfReturnVideoNum.getText());
		
		try {
			model.returnVideo(vnum);
			
		} catch (Exception e) {
			System.out.println("반납실패 : " + e.getMessage());
		}
		
	}
	
	/*	객체 생성 및 화면 구성   */
	void addLayout(){
		tfRentTel = new JTextField();
		tfRentCustName = new JTextField();
		tfRentVideoNum = new JTextField();
		
		bRent = new JButton("대여");
		
		tfReturnVideoNum = new JTextField(15);
		bReturn = new JButton("반납");
		
		
		
		rentTM = new RentTableModel();
		tableRecentList = new JTable(rentTM);
		
		//center
		setLayout(new BorderLayout());
		add(new JScrollPane(tableRecentList), BorderLayout.CENTER);
		
		
		JPanel p_north = new JPanel();
		//North
		JPanel p_n_west = new JPanel();
		p_n_west.setBorder(new TitledBorder("대여"));
		p_n_west.setLayout(new GridLayout(4,2));
		
		p_n_west.add(new JLabel("전 화 번 호"));
		p_n_west.add(tfRentTel);
		
		p_n_west.add(new JLabel("고 객 명"));
		p_n_west.add(tfRentCustName);
		
		p_n_west.add(new JLabel("비디오 번호"));
		p_n_west.add(tfRentVideoNum);
		
		p_n_west.add(bRent);
		
		
		JPanel p_n_east = new JPanel();
		p_n_east.setBorder(new TitledBorder("반납"));
		
		p_n_east.add(new JLabel("비디오번호"));
		p_n_east.add(tfReturnVideoNum);
		p_n_east.add(bReturn);
		
		p_north.setLayout(new GridLayout(1,2));
		p_north.add(p_n_west);
		p_north.add(p_n_east);
		
		add(p_north, BorderLayout.NORTH);
		
		
	}

	class RentTableModel extends AbstractTableModel { 
		  
		ArrayList data = new ArrayList();
		String [] columnNames = {"비디오번호","제목","고객명","전화번호","반납예정일","반납여부"};

			public int getColumnCount() { 
		        return columnNames.length; 
		    } 
		     
		    public int getRowCount() { 
		        return data.size(); 
		    } 

		    public Object getValueAt(int row, int col) { 
				ArrayList temp = (ArrayList)data.get( row );
		        return temp.get( col ); 
		    }
		    
		    public String getColumnName(int col){
		    	return columnNames[col];
		    }
	}

	

	
}

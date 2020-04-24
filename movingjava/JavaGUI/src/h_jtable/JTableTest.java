package h_jtable;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

public class JTableTest extends JFrame{
	
	JTable table;
	JButton btn;
	MyTableModel myTM;
	
	public JTableTest() {
		//객체생성
		myTM = new MyTableModel(); //JTable의 데이타와 컬럼명(Model)
		table = new JTable(myTM); //JTable 의 view
		btn = new JButton("확인");
		
		//화면구성
		
		add(new JScrollPane(table), BorderLayout.CENTER);//table은 반드시 스크롤 pane과 붙여줘야함
		add(btn, BorderLayout.NORTH);
		
		
		
		//출력
		setBounds(300,200,500,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//event처리
		btn.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				change();		
			}
		});
		
		table.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e) {
				int row = table.getSelectedRow();
				int col = table.getSelectedColumn();
				System.out.println(row + ":" + col + "이벤트발생");
				
			}
		});
	}
	
	void change() {
		ArrayList data = new ArrayList();
		for(int i = 0; i < 5; i++) {//row
			ArrayList temp = new ArrayList();
			for(int j = 0; j < 4; j++) {//col
					
				if(j==0) temp.add(new Boolean(false));
				else temp.add(new Integer(j+1));//int -> Integer	
			}
			data.add(temp);
		}
		
		myTM.data = data;
		table.setModel(myTM);//신호줘야함 뷰는 모델이 바뀐것을 인지하지못함
		myTM.fireTableDataChanged();//신호줘야함 뷰는 모델이 바뀐것을 인지하지못함
	}
	
	class MyTableModel extends AbstractTableModel{//테이블모델은 추상
		String[] columnName = {"하나", "둘", "삼", "넷"};
		ArrayList data = new ArrayList();

		public int getColumnCount() {			
			return columnName.length;
		}


		public int getRowCount() {			
			return data.size();
		}


		public Object getValueAt(int rowIndex, int columnIndex) {//원하는 행과 열의 값을 ㄹ ㅣ턴
			ArrayList temp = (ArrayList)data.get(rowIndex);
			return temp.get(columnIndex); 
		}
		
		public String getColumnName(int c) {//이걸 꼭 오버라이딩해야 얘가 각각의 컬룸내임을 얻어다줌
			return columnName[c]; 			// JTable이 불러다줌
		}
		
		public Class getColumnClass(int c) {
			return getValueAt(0,c).getClass();
		}
		
		public boolean isCellEditable(int row, int col) {
			if(col < 2) return true;
			else return false;
		}
		
		
		public void setValueAt(Object value, int row, int col) {
	        ArrayList temp = (ArrayList)data.get(row);
	        temp.set(col, value);
	        // 데이터가 바뀌면 반드시 신호줘야함
	        fireTableCellUpdated(row, col);
	    }
	}

	public static void main(String[] args) {
	
		JTableTest jt = new JTableTest();
	}

}

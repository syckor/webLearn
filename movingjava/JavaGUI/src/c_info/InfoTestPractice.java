package c_info;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InfoTestPractice extends JFrame{
	
	JButton bAdd, bShow, bSearch, bDelete, bCancel, bExit;
	JTextField tfName, tfId, tfTel, tfSex, tfAge, tfHome;
	JLabel lName, lId, lTel, lSex, lAge, lHome;
	JTextArea ta;
	
	public InfoTestPractice() {
		super("DBtest");
		
		bAdd = new JButton("Add", new ImageIcon("src/c_info/Imgs/16.png")); //Image Icon을 가져오는 클래스
		bShow = new JButton("Show", new ImageIcon("src/c_info/Imgs/17.png"));
		bSearch = new JButton("Search", new ImageIcon("src/c_info/Imgs/18.png"));
		bDelete = new JButton("Delete", new ImageIcon("src/c_info/Imgs/19.png"));
		bCancel = new JButton("Cancel", new ImageIcon("src/c_info/Imgs/20.png"));
		bExit = new JButton("Exit", new ImageIcon("src/c_info/Imgs/21.png"));
		
		tfName = new JTextField(10);
		tfId = new JTextField(10);
		tfTel = new JTextField(10);
		tfSex = new JTextField(10);
		tfAge = new JTextField(10);
		tfHome = new JTextField(10);
		
		lName = new JLabel("Name", new ImageIcon("src/c_info/Imgs/23.png"),JLabel.CENTER);
		lId = new JLabel("Id", new ImageIcon("src/c_info/Imgs/22.png"),JLabel.CENTER);
		lTel = new JLabel("Tel", new ImageIcon("src/c_info/Imgs/24.png"),JLabel.CENTER);
		lSex = new JLabel("Sex", new ImageIcon("src/c_info/Imgs/25.png"),JLabel.CENTER);
		lAge = new JLabel("Age", new ImageIcon("src/c_info/Imgs/15.png"),JLabel.CENTER);
		lHome = new JLabel("Home", new ImageIcon("src/c_info/Imgs/16.png"),JLabel.CENTER);
		
		ta = new JTextArea();
		
	}
	
	public void display() {
		
		
		setLayout(new BorderLayout());
		JPanel las = new JPanel();
		las.setLayout(new GridLayout(6,2));
			las.add(lName);las.add(tfName);
			las.add(lId);las.add(tfId);
			las.add(lTel);las.add(tfTel);
			las.add(lSex);las.add(tfSex);
			las.add(lAge);las.add(tfAge);
			las.add(lHome);las.add(tfHome);
		add(las, BorderLayout.WEST);
		
		JPanel bs = new JPanel();
		bs.setLayout(new GridLayout(1,6));
			bs.add(bAdd);
			bs.add(bShow);
			bs.add(bSearch);
			bs.add(bCancel);
			bs.add(bDelete);
			bs.add(bExit);
		add(bs, BorderLayout.SOUTH);
		
		add(ta, BorderLayout.CENTER);
		
		setLocation(300,300);
		setSize(1100,500);
		setVisible(true);
	}
	
	public void eventProc() {
		MyEvent my = new MyEvent();
		
		bAdd.addActionListener(my);
		bShow.addActionListener(my);
		bSearch.addActionListener(my);
		bDelete.addActionListener(my);
		bCancel.addActionListener(my);
		bExit.addActionListener(my);
		
		tfId.addActionListener(new ActionListener()
		{	
			public void actionPerformed(ActionEvent e) {
			
				String id = tfId.getText();
				
			}
			
		});
		
	}
	class MyEvent implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JButton evt = (JButton)e.getSource();
			if (evt == bAdd) {
				String msg = bAdd.getText();
				JOptionPane.showMessageDialog(null, "Add"); //JOptionPane은 팝업해준다			
			}else if (evt == bShow) {
				String msg = bShow.getText();
				JOptionPane.showMessageDialog(null, "Show");
			}else if (evt == bSearch) {
				String msg = bShow.getText();
				JOptionPane.showMessageDialog(null, "Search");
			}else if (evt == bDelete) {
				String msg = bShow.getText();
				JOptionPane.showMessageDialog(null, "Delete");
			}else if (evt == bCancel) {
				String msg = bShow.getText();
				JOptionPane.showMessageDialog(null, "Cancel");
			}else if (evt == bExit) {
				System.exit(0);
			}			
		}	
	}
	
	public static void main(String[] args) {
		InfoTestPractice Info = new InfoTestPractice();
		Info.display();
		Info.eventProc();
	}

}

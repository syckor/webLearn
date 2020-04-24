package network3.chat;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class ChatClient implements ActionListener, Runnable { // interface는 다중상속 가능
	JFrame f;

	JTextField connTF, sendTF;
	JButton connB, sendB;
	JTextArea ta;

	Socket s;
	BufferedReader in;
	OutputStream out;

	// 추가0 : 대화명을 바꾸기
	JTextField changeNameTF;
	JButton changeNameB;

	// 추가2 : 방인원의 대명 보여주기
	// 변수 선언
	JList memberList;
	Vector list;

	public ChatClient() {
		f = new JFrame("Chat Client");

		connTF = new JTextField();
		sendTF = new JTextField();
		connB = new JButton("접 속");
		sendB = new JButton("확 인");
		ta = new JTextArea(15, 40);

		// 추가0: 대화명 바꾸기
		changeNameTF = new JTextField("guest", 10);
		changeNameB = new JButton("바꾸기");
		JPanel p_changeName = new JPanel();
		p_changeName.add(new JLabel("대화명 : "), "West");
		p_changeName.add(changeNameTF, "Center");
		p_changeName.add(changeNameB, "East");

		JPanel p_serverName = new JPanel();
		p_serverName.setLayout(new BorderLayout());
		p_serverName.add(new JLabel("서버입력 : "), "West");
		p_serverName.add(connTF, "Center");
		p_serverName.add(connB, "East");

		JPanel p_north = new JPanel();
		p_north.setLayout(new GridLayout(1, 2));
		p_north.add(p_changeName);
		p_north.add(p_serverName);

		JPanel p2 = new JPanel();
		p2.setLayout(new BorderLayout());
		p2.add(new JLabel("메세지입력 : "), "West");
		p2.add(sendTF, "Center");
		p2.add(sendB, "East");

		// 추가2 : 방인원의 대명 보여주기
		memberList = new JList();
		list = new Vector();
		JPanel p_east = new JPanel();
		p_east.setLayout(new BorderLayout());
		p_east.add("North", new JLabel("   우 리 방 멤 버   "));
		p_east.add("Center", memberList);

		f.getContentPane().add("North", p_north);
		f.getContentPane().add("Center", new JScrollPane(ta));
		f.getContentPane().add("South", p2);
		f.getContentPane().add("East", p_east);

		// f.setSize(500, 300);
		f.pack();
		f.setVisible(true);

		connTF.addActionListener(this);
		connB.addActionListener(this);
		sendTF.addActionListener(this);
		sendB.addActionListener(this);

		// 추가0: 대화명 바꾸기
		changeNameTF.addActionListener(this);
		changeNameB.addActionListener(this);
	}// 생성자 종료

	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();

		if (o == connTF || o == connB) {
			connProc();
		}

		else if (o == sendTF || o == sendB) {
			sendProc();
		}

		else if (o == changeNameTF || o == changeNameB) {
			changeNameProc();
		}
	} // actionPerformed ends

	void changeNameProc() {
		String nickname = "/name " + changeNameTF.getText() + "\n";

		try {
			out.write(nickname.getBytes());
		} catch (Exception e) {
			ta.append("이름변경 :" + e.toString());
			e.printStackTrace();

		}
		JOptionPane.showMessageDialog(null, nickname + "대화명");
	}

	void connProc() {
//		JOptionPane.showMessageDialog(null, "서버에 접속합니다");
		String ip = connTF.getText();

		try {
			s = new Socket(ip, 1234);
			out = s.getOutputStream();
			in = new BufferedReader(new InputStreamReader/* 얘가 해결해줌 */(s.getInputStream())); // Reader문자형, input byte형
																								// 그래서 오류남

			new Thread(this).start();// Runnable에는 이게 없음 , 쓰레드 객체 생성후 run메쏘드가 있는 클래스 불러와야함
		} catch (Exception e) {
			ta.setText("접속 실패 :" + e.toString());
		} // 클라이언트가 소켓을 생성할때 반드시 아이피주소를 알아야함
	} // connProc ends

	public void run() {
		while (s.isConnected()) {
			String msg = null;
			try {
				msg = in.readLine();
			} catch (IOException e) {
				ta.append("읽기 실패" + e.toString());

			}

			ta.append(msg + "\n");
		}

	}

	void sendProc() {
		// JOptionPane.showMessageDialog(null, "메세지를 전송합니다");
		String msg = sendTF.getText() + "\n";
		try {
			out.write(msg.getBytes());
		} catch (Exception e) {
			ta.append("쓰기실패:" + e.toString());
		}
		sendTF.setText(null);
	}// sendProc ends

	public static void main(String[] args) {
		new ChatClient();
	}

}// ChatClient ends

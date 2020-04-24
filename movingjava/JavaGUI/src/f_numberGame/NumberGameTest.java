package f_numberGame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class NumberGameTest {

	public static void main(String[] args) {
		
		NumberGame game = new NumberGame();
		game.initChar();
		game.showAnswer();

	}

}


class NumberGame extends JFrame implements ActionListener{
	int getsu = 4;
	
	//1.멤버변수 선언
	JButton b[][] = new JButton[getsu][getsu];
	
	//2. 버튼위에 지정할 문자 변수
	char [][]answer = new char[getsu][getsu]; //char defualt값 '\u0000'
	
	//5. 첫번째 버튼에 대한 저장
	JButton firstClick;
	int firstRow, firstCol;
	
	public NumberGame() {
		//2.객체생성
		
		//3.화면구성
		setLayout(new GridLayout(4,4));
		
		for(int j = 0; j < b.length; j++) {
			for(int k = 0; k < b[j].length; k++) {
				b[j][k] =  new JButton(j + ":" + k);
				add(b[j][k]);
				
				//문자배열을 0으로초기화
				answer[j][k] = '0';
				
				//이벤트연결
				b[j][k].addActionListener(this);
			}
		}
		
		//화면에 출력
		setSize(300,300);
		setLocation(200,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	} 
	
	//임의의 알파벳을 임의의 위치에 지정
	void initChar() {
		char alpha = '0';
		BACK:
		for(int i = 0; i < getsu*getsu;/*여기 i++해버리면 딱 16번만 하고 끝나므로 아래로 뺌 */ ) {
			//임의의 알파벳 만들기
			if(i%2==0) { //0번째 뽑은 알파벳을 alpha에 저장하면 1번째도 alpha이고 2번째에서 다시 알파벳을 뽑는다
				alpha = (char)('A' + (int)(Math.random()*26));
				//기존에 이 알파벳이 있는지 확인
				for(int j = 0; j < getsu; j++) {
					for(int c = 0; c < getsu; c++) {
						if(answer[j][c]==alpha) 
							continue BACK;											
					}
				}			
			}
			
			//임의의 위치 선정하기
			boolean ok = false;
			do {
				int row = (int)(Math.random()*getsu); //row 0~3의 임의의 숫자
				int col = (int)(Math.random()*getsu);
				
				if(answer[row][col] == '0') {
					answer[row][col] = alpha;
					i++;
					ok = true;
				}
			}while(!ok);			
		}
	}
		
	void showAnswer() {
		//답을 보여주기
		for(int j = 0; j < b.length; j++) {
			for(int k = 0; k < b[j].length ; k++) {
				b[j][k].setText(String.valueOf(answer[j][k]));
			}
		}	
		
		//1초 후에 답 가리기
		try {
			Thread.sleep(3000); //1000milli second 이후에 실행이 된다
		} catch (InterruptedException e) {
		}
		
		for(int j = 0; j < b.length; j++) {
			for(int k = 0; k < b[j].length ; k++) {
				b[j][k].setText(null); // " "를 해도 되고 null을 해도 된다
			}
		}
	}

	
	public void actionPerformed(ActionEvent e) {
		JButton evt = (JButton)e.getSource();
		for(int j = 0; j < b.length; j++) {
			for(int k = 0; k < b[j].length; k++) {
				if(b[j][k] == evt) {
					//첫번째 선택인지
					if(firstClick == null) {
						firstClick = evt;
						firstRow = j;
						firstCol = k;
						evt.setBackground(Color.cyan);
						evt.removeActionListener(this);
					}else { //두번째 선택
						
						if(answer[firstRow][firstCol] == answer[j][k]) {
							firstClick.setBackground(Color.red);
							evt.setBackground(Color.red);
						}else {
							firstClick.setBackground(null);
						}
						firstClick.addActionListener(this);
						firstClick = null;
					}															
				}
			}
		}		
	}	
}

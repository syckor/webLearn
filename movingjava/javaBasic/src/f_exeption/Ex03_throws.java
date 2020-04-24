package f_exeption;

import java.io.FileInputStream;

public class Ex03_throws {

	public static void main(String[] args) {
		try {
			readFile(); //메쏘드에서 예외가 넘어오기 때문에 예외처리를 해줘야함
			System.out.println("파일처리 성공");
		}catch(Exception ex) {
			System.out.println("실패");
		}
	}
	
	static void readFile() throws Exception{ //예외처리를 떠넘김
		FileInputStream fis = new FileInputStream("abc.text");   
		System.out.println("파일 연결");

	}

}

package f_exeption;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Ex02_TryCatch {

	public static void main(String[] args) {
		FileInputStream fis = null; //파일을 불러오는 통로를 열어놓은 후 초기화
		try { // 불러오는 파일이 없을때를 대비하여 트라이문 선언
			fis = new FileInputStream("data.txt");  // 열어놓은 통로를 통해서 data.txt 파일을 불러온다 
			System.out.println("파일 연결");           
			fis.read();                             // 1. 읽는다
			
			
		} catch (FileNotFoundException e) {                    // 파일이 없을때
			System.out.println("파일없음예외:" + e.getMessage());  // 파일이 없을때 나오는 문구
			
		} catch (IOException e) { // 파일을 열 수 없을때
			System.out.println("읽을 때 예외 발생"); 
			
		} catch	(Exception e) {  //모든 예외를 다 잡아버리겠다
			System.out.println("그 외 처리");
		
		}finally {
			try {
				fis.close();  // 통로를 닫아주는데 오류가 날 수 있으니 try문을 씌어줌
			} catch (IOException e) {}
		}
	}

}
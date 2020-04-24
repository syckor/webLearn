package io;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		
		File f = new File("a.txt"); //파일도 관리할 수 있고 디렉토리도 관리할 수 있다!
		
		if(f.isFile()) { //이게 파일인지 ?
			System.out.println("It is File");
		}else if(f.isDirectory()) { //이게 디렉토리인지?
			System.out.println("It is Directory");
			String []sub = f.list();
			for(String m:sub) { //  (자료형:배열)
		
				System.out.println(m);
			}
		}
		
		f.delete(); //지우고 아무리 쓰레기통을 뒤져도 없음 함부러 쓰면 안댐 ㅜ
		

	}

}

package network1.basic;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class SimpleClientPractice {
	
	public final static int PORT = 5000;
	public final static String HOST = null;
	
	public static void main(String[] args) {
	
		Socket client = null;
		DataInputStream in = null;
		DataOutputStream out = null;
		
		//콘솔입력
		Scanner stdin = new Scanner(System.in);
		
		//1. 서버에 입력을 위한 소켓 생성
		try {
			client = new Socket(HOST,PORT);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 2. 소켓의 입출력 스트림 얻기
		try {
			in = new DataInputStream(client.getInputStream());
			out = new DataOutputStream(client.getOutputStream());
		
		
		
		//3. 키보드 입력 받아 서버에 전송
		System.out.println(" ");
		out.writeUTF(stdin.nextLine());
		
		//4. 서버로부터 응답을 받음
		
		System.out.println(in.readUTF());
		
		//5. 입출력 스트림 닫기
		in.close();
		out.close();
		client.close(); //소켓도 닫아주기 
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

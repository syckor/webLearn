package network1.basic;

import java.io.*;
import java.net.*;

public class SimpleServerPractice {
	
	public final static int PORT = 5000;
	
	public static void main(String[] args) {
		
		ServerSocket server = null;
		DataInputStream in = null;
		DataOutputStream out = null;
		Socket clientSocket = null;
		
		//1. 서버소켓 생성
		try {
			server = new ServerSocket(PORT);
		
		System.out.println("서버 가동");
		
		//2.클라이언트 접속시 소켓 생성
		//3. 소켓의 입출력 스트림 얻기
		
		clientSocket = server.accept(); // 
		
		in = new DataInputStream(clientSocket.getInputStream());
		out = new DataOutputStream(clientSocket.getOutputStream());
		
		//4. 데이터전송
		String line = in.readUTF();
		System.out.println("we received :" + line);
		
		out.writeUTF("안녕");
		
		//5. 소켓닫기
		in.close();
		out.close();
		clientSocket.close();
		
		
		
		
		
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

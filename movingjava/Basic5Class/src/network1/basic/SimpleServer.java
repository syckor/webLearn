package network1.basic;

import java.io.*;
import java.net.*;

public class SimpleServer {
	
	public final static int PORT = 5000;	// PortNumer : 1024 ~
	
	public static void main( String args[] ) {
		
		ServerSocket 		server = null;
		DataInputStream 	in = null;
		DataOutputStream out = null;
		Socket clientSocket = null;
		
		try{
			// 1. 서버 소켓 생성
			server = new ServerSocket( PORT );//몇번포트 열어놓고 기다릴건지?
			System.out.println("SimpleServer started..");
		
			// 2. 클라이언트 접속시 소켓 생성
			// 3. 소켓의 입출력 스트림 얻기
			
			clientSocket = server.accept();  //클라이언트가 접속할때까지 대기 //혹시 이코드가 여러개면 여러명을 받을 수 있을까?
			
			in = new DataInputStream( clientSocket.getInputStream()); //필터링 한번 함
			out = new DataOutputStream( clientSocket.getOutputStream() );
		
			// 4. 데이터 전송
				String line = in.readUTF(); //상대방이 writing했기 때문에 읽을 수 있음
				System.out.println("we received : " + line );
				if( line.compareTo("안녕") == 0 ) { //equals써도 댐
					out.writeUTF("오오오오" );	
				} else {
					out.writeUTF("인사말이 아닙니다.");
				}
		
			// 5. 소켓닫기
			in.close();
			out.close();
			clientSocket.close();
		} catch ( Exception ex ) {
			System.out.println( ex.getMessage() );	
		}
	}	
}